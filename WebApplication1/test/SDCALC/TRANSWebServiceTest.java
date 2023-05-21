/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package SDCALC;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jose Alfredo
 */
public class TRANSWebServiceTest {
    
    public TRANSWebServiceTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of Pagar method, of class TRANSWebService.
     */
    @Test
    public void testPagar() {
        System.out.println("CASO EXITOSO");
        String numero_tarjeta = "123456789";
        float monto = 1000.0F;
        String nombre = "Juan Perez";
        String código_CVV = "456";
        TRANSWebService instance = new TRANSWebService();
        Boolean expResult = null;
        Boolean result = instance.Pagar(numero_tarjeta, monto, nombre, código_CVV);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Comprar method, of class TRANSWebService.
     */
    @Test
    public void testComprar() {
        System.out.println("Comprar");
        String parameter = "0";
        float precio = 200.0F;
        int numero_productos = 0;
        float total = 0.0F;
        TRANSWebService instance = new TRANSWebService();
        Boolean expResult = null;
        Boolean result = instance.Comprar(parameter, precio, numero_productos, total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   
    
}
