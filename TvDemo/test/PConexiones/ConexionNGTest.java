/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package PConexiones;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author DELL
 */
public class ConexionNGTest {
    
    public ConexionNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of setSSID method, of class Conexion.
     */
    @Test
    public void testSetSSID() {
        System.out.println("setSSID");
        String newVar = "";
        Conexion instance = new Conexion();
        instance.setSSID(newVar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSSID method, of class Conexion.
     */
    @Test
    public void testGetSSID() {
        System.out.println("getSSID");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getSSID();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setClave method, of class Conexion.
     */
    @Test
    public void testSetClave() {
        System.out.println("setClave");
        String newVar = "";
        Conexion instance = new Conexion();
        instance.setClave(newVar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getClave method, of class Conexion.
     */
    @Test
    public void testGetClave() {
        System.out.println("getClave");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getClave();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Conexion.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String newVar = "";
        Conexion instance = new Conexion();
        instance.setUsuario(newVar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Conexion.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Conexion instance = new Conexion();
        String expResult = "";
        String result = instance.getUsuario();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
