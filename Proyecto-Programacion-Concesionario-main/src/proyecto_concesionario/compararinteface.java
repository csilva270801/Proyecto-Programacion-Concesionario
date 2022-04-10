/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_concesionario;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Jefferson Javier Avelar Arriaza
 */
public class compararinteface implements comparar 
{
    
    //Metodo arreglo
    @Override
    public void arreglo() 
    {
        double[] arreglo1 = {500, 30000.75, 60000, 9600.66, 1500, 1250.99, 9000.99, 800000, 2300, };
        
        System.out.println("Arreglo antes de modificar");
        for (double i : arreglo1) {
        System.out.print(i);
        System.out.println(" ");
        }
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantas notas desea agregar: ");
        int lim = lector.nextInt();
        
        for(int i=0;i < lim;i++){
        System.out.println("Digite la nota que sea agregar: ");
        arreglo1 [i] = lector.nextDouble();
        }
        
        System.out.println("En que posicion se encuentra la nota que desea eliminar: ");
        int elim = lector.nextInt();
        arreglo1 [elim] = 0;

        System.out.println("Arreglo después de ordenar...");
        for (double i : arreglo1) {
        System.out.print(i);
        System.out.println(" ");
        }
        
        System.out.print("En que posicion se encuentra el primer dato que desea comparar: ");
        int primer = lector.nextInt();

        System.out.print("En que posicion se encuentra el segundo dato que desea comparar: ");
        int segundo = lector.nextInt();
       if(arreglo1[primer] > arreglo1[segundo]){
            menorQue();
        }else if(arreglo1[segundo] < arreglo1[primer]) {
            mayorQue();
        } else if(arreglo1[segundo] == arreglo1[primer]) 
        {
            igualQue();
        }{

        } 
    }
    // Metodo del comparador que es para saber que el arreglo es igual que el segundo
    @Override
    public void igualQue() 
    {
        System.out.println("los 2 arreglos de ventas son iguales");
        
    }
    // Metodo del comparador que es para saber que el arreglo es menor que el segundo
    @Override
    public void menorQue() {
        System.out.println("el primer arreglo de ventas son menores que las segundas");
    }
    // Metodo del comparador que es para saber que el arreglo es mayor que el segundo
    @Override
    public void mayorQue() 
    {
        System.out.println("el primer arreglo de ventas es mayor que las segundas");
    }


          
}

    
    
    

