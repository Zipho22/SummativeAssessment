/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class ProductSalesReport {
    public static void main(String[] args) {

        // Create a Scanner object to read user input.
        Scanner input = new Scanner(System.in);

        // Store the names of the three mattress products.
        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        // Store sales for each product over three months.
        int[][] productSales = new int[3][3];

        // Ask the user to enter sales for each product.
        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + productNames[i]
                        + " mattress: ");

                productSales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create a Products object using the product names and sales.
        Products product = new Products(productNames, productSales);

        // Create a PrintProduct object to display the report.
        PrintProduct report = new PrintProduct();

        // Print the completed product sales report.
        report.PrintSalesReport(product);

        // Close the Scanner.
        input.close();
    }
}
