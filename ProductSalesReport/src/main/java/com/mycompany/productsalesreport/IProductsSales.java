/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public interface IProductsSales {
    // Method to calculate the total number of products that are sold.
    int GetTotalProductsSold();
     // Method to calculate the average products that are sold per product.
    double GetAverageProductSold();
     // Method to identify the most popular product.
    String GetMostPopularProduct();

}
