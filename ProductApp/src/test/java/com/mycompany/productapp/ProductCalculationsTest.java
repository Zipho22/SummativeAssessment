/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package com.mycompany.productapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCalculationsTest {

    @Test
    public void testGetVat() {
        ProductCalculations calculations =
                new ProductCalculations(100);

        assertEquals(15.0, calculations.GetVat(), 0.01);
    }

    @Test
    public void testGetCommission() {
        ProductCalculations calculations =
                new ProductCalculations(100);

        assertEquals(5.0, calculations.GetCommission(), 0.01);
    }

    @Test
    public void testGetTotal() {
        ProductCalculations calculations =
                new ProductCalculations(100);

        assertEquals(120.0, calculations.GetTotal(), 0.01);
    }
}