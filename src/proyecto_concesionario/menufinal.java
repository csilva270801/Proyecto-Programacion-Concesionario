
package proyecto_concesionario;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author petoa
 */
public class menufinal 
{
////    //este es el menu en el cual tiene funciones para agregar eliminar ordenar entre otras
////     Scanner ent= new Scanner(System.in);
////     Scanner entrada = new Scanner(System.in);
////     Scanner c = new Scanner(System.in);
////     // inicializamos terminar en false para que cuando sea true finalize el while
////     
////     // creado por Jefferson Javier Avelar Arriaza 
////     JOptionPane.showMessageDialog(null,"Bienvenidos Al Concesionario El buen Vehiculo");
////     boolean terminar=false;
////     opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n1)-Ingresar Vehiculos \n2)-Ingresar Motos\n3)-Ingresar Informacion Empleado \n4)- Ingresar datos cliente\n Presione Cualquier tecla para Salir"));
////     
////     switch(opcion)
////        {
////            case 1:
////                insertar(); // inicializa el metodo insertar
////                
////            break;
////            
////            case 2:
////                mostrar(); // inicializa el metodo mostrar
////            break;
////            
////            case 3:
////                modificar();// inicializa el metodo modificar
////            break;
////            
////            case 4:
////                Se crearam los archivos
////                creararchivomedicamento();
////                creararchivo_Inventario_personal()
////            break;
////            
////            case 5:
////                JOptionPane.showMessageDialog(null, "Adios gracias por\n usar el programa");
////            break;
////            
////            default:
////                JOptionPane.showMessageDialog(null, "No se eligio ninguna\n opcion anterior");
////            break;
////        }
             
             
         
                
       public void creararchivo_inventario_cliente()
       {
          
            
            try{
            File objetoArchivo=new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_cliente.txt");
            if(objetoArchivo.createNewFile()){
                JOptionPane.showMessageDialog(null,"Archivo creado con nombre: "+ objetoArchivo.getName());

            }else{
                JOptionPane.showMessageDialog(null,"El archivo ya existe");
            }
         } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error Al crear el archivo");

           }

           
            
           
    
       }
       public void creararchivo_Inventario_personal()
       {
          try{
            File objetoArchivos=new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt");
            if(objetoArchivos.createNewFile()){
                JOptionPane.showMessageDialog(null,"Archivo creado con nombre: "+ objetoArchivos.getName());
            }else{
                JOptionPane.showMessageDialog(null,"El archivo ya existe");
            }
         } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error Al crear el archivo");
            
           }
    
       }
      
}
