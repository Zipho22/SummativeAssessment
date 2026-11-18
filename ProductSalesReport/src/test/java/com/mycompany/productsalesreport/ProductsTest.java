/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productsalesreport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductsTest {

    // Test the total number of products sold.
    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] productSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Products product = new Products(productNames, productSales);

        assertEquals(153, product.GetTotalProductsSold());
    }

    // Test the average number of products sold.
    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] productSales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Products product = new Products(productNames, productSales);

        assertEquals(17.0, product.GetAverageProductSold(), 0.01);
    }
}
