
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java
 */


package com.mycompany.productsalesreport;

// Product class implements the IProductsSales interface.
public class Products implements IProductsSales {

    // Single-dimensional array containing product names.
    private String[] productNames;

    // Two-dimensional array containing sales for three months.
    private int[][] productSales;

    // Constructor to receive product names and sales information.
    public Products(String[] productNames, int[][] productSales) {

        this.productNames = productNames;
        this.productSales = productSales;
    }

    // Method to calculate the total number of products sold.
    @Override
    public int GetTotalProductsSold() {

        int total = 0;

        // Loop through each product.
        for (int i = 0; i < productSales.length; i++) {

            // Loop through the three months.
            for (int j = 0; j < productSales[i].length; j++) {

                total = total + productSales[i][j];
            }
        }

        return total;
    }

    // Method to calculate the average products sold.
    @Override
    public double GetAverageProductSold() {

        int total = GetTotalProductsSold();
        int numberOfSales = 0;

        // Count the number of monthly sales entries.
        for (int i = 0; i < productSales.length; i++) {
            numberOfSales = numberOfSales + productSales[i].length;
        }

        // Calculate and return the average.
        return (double) total / numberOfSales;
    }

    // Method to identify the product with the highest total sales.
    @Override
    public String GetMostPopularProduct() {

        int highestSales = 0;
        String popularProduct = "";

        // Calculate the total sales for each product.
        for (int i = 0; i < productSales.length; i++) {

            int productTotal = 0;

            for (int j = 0; j < productSales[i].length; j++) {
                productTotal = productTotal + productSales[i][j];
            }

            // Check whether this product has the highest sales.
            if (productTotal > highestSales) {
                highestSales = productTotal;
                popularProduct = productNames[i];
            }
        }

        return popularProduct;
    }
}

    