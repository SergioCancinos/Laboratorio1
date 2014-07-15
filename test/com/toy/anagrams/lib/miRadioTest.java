/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toy.anagrams.lib;

import junit.framework.TestCase;

/**
 *
 * @author DatDell
 */
public class miRadioTest extends TestCase {
    
    public miRadioTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of encendidoApagado method, of class miRadio.
     */
    public void testEncendidoApagado() {
        System.out.println("encendidoApagado");
        miRadio instance = new miRadio();
        instance.encendidoApagado();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarFrecuencia method, of class miRadio.
     */
    /*public void testCambiarFrecuencia() {
        System.out.println("cambiarFrecuencia");
        miRadio instance = new miRadio();
        instance.cambiarFrecuencia();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of guardarEstacion method, of class miRadio.
     */
    /*public void testGuardarEstacion() {
        System.out.println("guardarEstacion");
        double estacion = 0.0;
        int boton = 0;
        miRadio instance = new miRadio();
        instance.guardarEstacion(estacion, boton);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarEstacion method, of class miRadio.
     */
    public void testCambiarEstacion() {
        System.out.println("cambiarEstacion");
        boolean direccion = false;
        miRadio instance = new miRadio();
        instance.cambiarEstacion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class miRadio.
     */
    /*public void testGetEstado() {
        System.out.println("getEstado");
        miRadio instance = new miRadio();
        boolean expResult = false;
        boolean result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class miRadio.
     */
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        miRadio instance = new miRadio();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFrecuencia method, of class miRadio.
     */
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        miRadio instance = new miRadio();
        boolean expResult = false;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFrecuencia method, of class miRadio.
     */
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        boolean amfm = false;
        miRadio instance = new miRadio();
        instance.setFrecuencia(amfm);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacionesFav method, of class miRadio.
     */
    /*public void testGetEstacionesFav() {
        System.out.println("getEstacionesFav");
        miRadio instance = new miRadio();
        String[] expResult = null;
        String[] result = instance.getEstacionesFav();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacionesFav method, of class miRadio.
     */
    public void testSetEstacionesFav() {
        System.out.println("setEstacionesFav");
        String[] estacionesFav = null;
        miRadio instance = new miRadio();
        instance.setEstacionesFav(estacionesFav);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstacion method, of class miRadio.
     */
   /* public void testGetEstacion() {
        System.out.println("getEstacion");
        miRadio instance = new miRadio();
        double expResult = 0.0;
        double result = instance.getEstacion();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstacion method, of class miRadio.
     */
    public void testSetEstacion() {
        System.out.println("setEstacion");
        double estacion = 0.0;
        miRadio instance = new miRadio();
        instance.setEstacion(estacion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
