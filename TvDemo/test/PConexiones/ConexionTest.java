/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package PConexiones;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DELL
 */
public class ConexionTest {
    
    public ConexionTest() {
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
     * Test of Conexion method, of class Conexion.
     */
    @Test
    public void testConexion() {
        System.out.println("Conexion");
        String SSID = "";
        String clave = "";
        String usuario = "";
        Conexion instance = new Conexion();
        Object expResult = null;
        Object result = instance.Conexion(SSID, clave, usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
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
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
