package proyecto_concesionario;
import interfaz_Grafica.Ventana;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import proyecto_concesionario.inventario_Empleados;
import proyecto_concesionario.Vehiculos;


/**
 *
 * @author Jefferson Javier Avelar Arriazar
 */
public class administradorautos {

    public static void main(String[] args) 
            
    {  //llamar metodo del menu
        Ventana v1 = new Ventana();
        
        
        interfazmenu menuagregar=new interfazmenu ();
        
        // instanciar la clase inventario_Empleados
        inventario_Empleados infopersonal=new inventario_Empleados();
        
        menufinal menu = new menufinal();
        
        //instanciar la clase inventario_Cliente
        inventario_Cliente clientes= new inventario_Cliente();
        
        //instanciar la clase Vehiculos
        Vehiculos ventas = new Vehiculos();
       


     // Arreglo
     Scanner entrada = new Scanner(System.in);
     Scanner c = new Scanner(System.in);
     int nuevasventas;
     //creamos el arreglo
     double[] arreglo={10000,800,25000,50000,30000};
     //imprimimos el arreglo utilizando un for para que imprima todos los datos
     //este es el menu en el cual tiene funciones para agregar eliminar ordenar entre otras
     Scanner ent= new Scanner(System.in);
     // inicializamos terminar en false para que cuando sea true finalize el while
     
     boolean terminar=false;
     JOptionPane.showMessageDialog(null,"Bienvenidos Al Concesionario El buen Vehiculo");
     // creado por Jefferson Javier Avelar Arriaza 
     char respues=(JOptionPane.showInputDialog (null, "Ingresa A si quieres el menu En forma ventana \n Ingresa B si quieres el menu forma panel ")).charAt(0);
     switch(respues){
        case 'A':
        v1.setVisible(true);
        break;
       
        case 'B':
            
            try{
     while(!terminar)
     {  
         // Aplicamos el try catch finally para solucionar el error
         
         // Imprime las opciones que el usuario puede utilizar;
         
         char respuesta=(JOptionPane.showInputDialog (null,"--------------------------Menu------------------------"+"\n A)-Agregar ventas nuevas"+"\n B)-Eliminar alguna venta"+"\n C)-Crear Archivo para inventario personal"+"\n D)- Crear Archivo para inventario Cliente"+
                 "\n E)-Agregar información personal empleado "+"\n F)- menu agregar nuevas ventas"+"\n G)- Agregar datos Al inventario Vehiculos"+"\n H)-Agregar datos Al inventario Clientes "+"\n L Terminar"+"\n M)- crear archivo inventario vehiculos")).charAt(0);
         
             
         
        // el swich ocupara la respuesta que mando el usuario y va inicializar la opcion
        switch(respuesta){
            // en el caso A agregamos datos al arreglo
            case 'A':
               
                
                try{
                System.out.println("Cuantas ventas nuevas Agregara:$ ");
                nuevasventas= entrada.nextInt();
                for(int i=0;i < nuevasventas;i++){
                System.out.println("Digite la venta que desea Agregar: ");
                arreglo [i] = entrada.nextDouble();
                System.out.println("Arreglo nuevo: ");
                }
                for(double i: arreglo){
                 System.out.println(i);
                 System.out.println(" ");
                }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,"Dato Erroneo");
                    
                }
             break;
             //en el caso B eliminamos una venta elejida por el usuario
             case 'B':
                 
                System.out.println("Ventas Realizadas:$ "); 
                for(double i: arreglo){
                System.out.println(i);
                System.out.println(" ");
             }
             System.out.println("En que posicion se encuentra la nota que desea eliminar: ");
             int elim = entrada.nextInt();
             arreglo [elim] = 0;
             for(double i: arreglo){
                System.out.println(i);
                System.out.println(" ");
             }
             break;
             
             case 'C':
                 JOptionPane.showMessageDialog(null, "Esta a puto de crear un archivo tipo txt para inventario empleados Presione OK si esta seguro");
                // infopersonal.creararchivo_Inventario_personal();
                 
                
                break;
                
             case 'D':
                 JOptionPane.showMessageDialog(null, "Esta a puto de crear un archivo tipo txt para inventario Cliente Presione OK si esta seguro");
                 menu.creararchivo_inventario_cliente();
               
             break;
            
             case 'E':
                double Peso;
                      double estatura;
                      String domicilio;
                      double distancia_casa_trabajo;
                      String estados;
                      // utilizando el try catch para prevenir el error de que el usuario no ingresa un dato o ingresa un String en un numerico
                      try{
                        System.out.println("Ingrese el peso");
                        Peso= entrada.nextDouble();
                        System.out.println("Ingrese la estatura");
                        estatura= entrada.nextDouble();
                        System.out.println("Ingrese el domicilio");
                        domicilio= c.nextLine();
                        System.out.println("Ingrese el La distancia de la casa al trabajo");
                        distancia_casa_trabajo= entrada.nextDouble();
                        System.out.println("Ingrese el estado");
                        estados= entrada.nextLine();
                        //Informacion_personal_Empleado datosempleados[]=new Informacion_personal_Empleado[0];
                        
                        
                        //variable polimorfica
                        Informacion_personal_Empleado datosempleado[]= new Informacion_personal_Empleado[1];
                        datosempleado[0]=new Informacion_personal_Empleado (Peso,estatura,domicilio,distancia_casa_trabajo,estados) ;
                        //datosempleado[1].empleado();
                        //cast
                        System.out.println("Arreglo de un objeto= "+"[ "+"Peso: "+(int)datosempleado[0].getPeso()+", "+"Estatura: "+(int)datosempleado[0].getEstatura()+", "+"Domicilio: "+datosempleado[0].getDomicilio()+", "+"Distancia: "+(float)datosempleado[0].getDistancia_casa_trabajo()+", "+"Estado: "+datosempleado[0].getEstado()+" ]");
                      }catch(Exception e){
                          
                          JOptionPane.showMessageDialog(null,"Dato Erroneo");
                          terminar=true;
                      }finally{
                          String reiniciar;
                          reiniciar= JOptionPane.showInputDialog("Ingresa ---si---- si quieres volvel al menu o cualquier letra si quieres que finalize el programa");
                          if("si".equals(reiniciar)){
                              terminar=false;
                          }else{
                              terminar=true;
                          }
                      }
                      
                 
               break;
             // en el caso F inicializamos un menu para aser y agregar datos a un nuevo arreglo
             case 'F':
                //ventas.existencias(); 
                menuagregar.menu();
                break;
              // en el caso G Ingresamos los datos para guardarlos en el archivo txt.  
             case 'G':
                 
                 String nombre  , modelo,marca , color , km ,precio, estado,tipo,anho;
                 JOptionPane.showMessageDialog(null,"Accediste a la los datos de inventario Vehiculo");
                 nombre= JOptionPane.showInputDialog("Ingrese el nombre");
                 modelo= JOptionPane.showInputDialog("Ingrese el modelo");
                 marca= JOptionPane.showInputDialog("Ingrese el Marca");
                 color= JOptionPane.showInputDialog("Ingrese el color");
                 anho= JOptionPane.showInputDialog("Ingrese el año");
                 km= JOptionPane.showInputDialog("Ingrese el kilometros");
                 precio= JOptionPane.showInputDialog("Ingrese el precio");
                 estado= JOptionPane.showInputDialog("Ingrese el estado");
                 tipo= JOptionPane.showInputDialog("Ingrese el Tipo de vehiculo");


                 
                 break;
                 // metodo tipo cliente
                 case 'H':
                     int vehiculoscomprados;
                     System.out.println("Ingrese las nuevas ventas");
                     vehiculoscomprados= entrada.nextInt();
                     clientes.tipocliente(vehiculoscomprados);
                       
                     
                 break;
                  case 'I':
                      //variables polimorficas
                  Carros objcarros= new Carros();
                   Vehiculos objdatos[]=new Vehiculos[1];
                   objdatos[0]=objcarros;
                   objdatos[0].ventatotales();
                   //cast 
                    Vehiculos conver=(Vehiculos)objdatos[0];
                   // terminar el programa
                  case 'L':
                      
                      terminar=true;
                        break;
                        // crear archivo para el inventario vehiculo o validar si ya esta creado
                  case 'M':
                      ventas.creararchivovehiculo();
                      break;
                      
               
                                
        }
        
      
  
    }
    
   }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Dato no ingresado");
       
     }finally{
        
          JOptionPane.showMessageDialog(null,"Proceso terminado");
   
   }
            
      break;      
    }
     
    
    }
    
    
    // Creado por Jefferson Javier Avelar Arriaza
    public static double[] ordBurbuja(double[] arreglo)
    {
     int n = arreglo.length;
      for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n-i-1; j++) {
     //Verifica que el elemento de a[j] es mayor que a[j+1] para hacer un cambio
     if (arreglo[j] > arreglo[j+1])
     {
     // cambia a[j+1] y a[j]
     double temp = arreglo[j];
     arreglo[j] = arreglo[j+1];
     arreglo[j+1] = temp;
     }
              }
       }
   return arreglo;
    }
   
    // Creado por César Eduardo Silva Colocho
    public static int busquedaBinaria(double[]arreglo)
    {
        Scanner dato = new Scanner(System.in);
        System.out.print("Buscar Venta: ");
        double n = dato.nextDouble();
        int central, alto, bajo;
        int valorCentral;
        bajo = 0;
        alto = arreglo.length-1;
        while(bajo<=alto)
        { 
        central = (bajo + alto)/2;
        valorCentral = (int) arreglo[central];
        if(n == valorCentral) return central;
        else if(n< valorCentral) alto = central -1;
        else bajo = central +1;
        }
        return -1;
        }
     
  
}
