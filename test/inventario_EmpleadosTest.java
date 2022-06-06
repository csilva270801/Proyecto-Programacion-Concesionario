/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import org.junit.*;
import static org.junit.Assert.*;
import proyecto_concesionario.inventario_Empleados;
/**
 *
 * @author Jefferson Javier Avelar Arriaza
 */
public class inventario_EmpleadosTest {
    
    public inventario_EmpleadosTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    //prueva positiva
    @Test
    public void testVentas()
    {
        System.out.println("Prueba Positiva Metodo ventas");
        int numero =1 ;
        String expResult = "Bajo volumen de ventas";
        String result =inventario_Empleados.ventas(numero);
        assertEquals(expResult, result);
        
        
    }
    //prueba negativa
    @Test
    public void testVentas1()
    {
        System.out.println("Prueba Negativa Metodo ventas");
        int numero =0 ;
        String expResult = "";
        String result =inventario_Empleados.ventas(numero);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testcreararchivo_Inventario_personal()
    {
        System.out.println("Prueba positiva para Metodo crear archivo inventario personal");
        boolean expResult=true;
        boolean result=inventario_Empleados.creararchivo_Inventario_personal();
        assertEquals(expResult,result);
    }
}
