/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.*;
import proyecto_concesionario.Vehiculos;

/**
 *
 * @author petoa
 */
public class VehiculosTest {
    
    public VehiculosTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    

    //prueba positiva
    @Test    
    public void testExistencias() {
        System.out.println("prueba para Metodo existencia");
        int error =0 ;
        String expResult = "No hay existencias";
        String result = Vehiculos.existencias(error);
        assertEquals(expResult, result);
    }
    //prueva negativa
     
     @Test
    public void testExistenciass(){
        System.out.println("prueba para Metodo existencias Negativa");
        int error =1 ;
        String expResult ="";
        String result = Vehiculos.existencias(error);
        assertEquals(expResult, result);
        
    }
   @Test
    public void testCreararchivovehiculo() {
        System.out.println("prueba para Metodo crear archivo vehiculo");
        boolean expResult = true;
        boolean result = Vehiculos.creararchivovehiculo();
        assertEquals(expResult, result);
    }
  
}

