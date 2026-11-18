/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
    // Method to print the total number of products sold.
    public void PrintTotalProductSales(Products product) {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }

    // Method to print the average number of products sold.
    public void PrintAverageProductSales(Products product) {

        System.out.println("AVERAGE PRODUCT SALES: "
                + Math.round(product.GetAverageProductSold()));
    }

    // Method to print the most popular product.
    public void PrintMostPopularProduct(Products product) {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }

    // Method to display the complete sales report.
    public void PrintSalesReport(Products product) {

        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("***************************************");

        PrintTotalProductSales(product);
        PrintAverageProductSales(product);
        PrintMostPopularProduct(product);

        System.out.println("***************************************");
    }
}


