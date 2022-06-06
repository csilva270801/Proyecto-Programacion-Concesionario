/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.*;
import proyecto_concesionario.inventario_Cliente;

/**
 *
 * @author petoa
 */
public class inventario_ClienteTest {
    
    public inventario_ClienteTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //prueba positiva
    @Test
    public void testtipocliente()
    {
        System.out.println("Prueba para metodo tipo cliente");
        int numero =1 ;
        int expResult =1;
        int result =inventario_Cliente.tipocliente(numero);
        assertEquals(expResult, result);
        
    }
    
    //prueba negativa
    @Test
    public void testtipocliente1()
    {
        System.out.println("Prueba para metodo tipo cliente");
        int numero =0 ;
        int expResult =0;
        int result =inventario_Cliente.tipocliente(numero);
        assertEquals(expResult, result);
        
    }
}
