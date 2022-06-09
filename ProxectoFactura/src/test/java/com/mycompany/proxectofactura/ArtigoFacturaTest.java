/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectofactura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class ArtigoFacturaTest {
    
    public ArtigoFacturaTest() {
    }

    @Test
    public void testObterPrezoTotal() {
        System.out.println("obterPrezoTotal");
        ArtigoFactura instance = new ArtigoFactura("1","pelota",5,3);
        double expResult = 15;
        double result = instance.obterPrezoTotal();
        assertEquals(expResult, result, 0.0);
    }
@Test
    public void testObterPrezoTotal1() {
        System.out.println("obterPrezoTotal");
        ArtigoFactura instance = new ArtigoFactura("1","pelota",3,2);
        double expResult = 6;
        double result = instance.obterPrezoTotal();
        assertEquals(expResult, result, 0.0);
    }
}
