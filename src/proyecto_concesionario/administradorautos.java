package proyecto_concesionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import proyecto_Concesionario.inventario_Empleados;
import proyecto_Concesionario.Vehiculos;


/**
 *
 * @author Jefferson Javier Avelar Arriazar
 */
public class administradorautos {

    public static void main(String[] args) 
    {  //llamar metodo del menu
        interfazmenu menuagregar=new interfazmenu ();
       // llamar al metodo informacionEmpleado
      inventario_Empleados infopersonal=new inventario_Empleados();
      //inicializar el metodo
      infopersonal.empleado();
      System.out.println("--------------------------------------------------------------------------------------------");
      //llamar al metodo ventas totales el cual trae consigo la suma total y el promedio de las ventas
      Vehiculos ventas = new Vehiculos();
      //iniciarlizar el metodo ventatotales que nos da la suma de ventas y el promedio
      ventas.ventatotales();
      
     // Arreglo
     Scanner entrada = new Scanner(System.in);
     int nuevasventas;
     //creamos el arreglo
     double[] arreglo={10000,800,25000,50000,30000};
     //imprimimos el arreglo utilizando un for para que imprima todos los datos
     System.out.println("Ventas actuales:$ ");
     for (double i: arreglo ){
         System.out.print(i);
         System.out.println(" ");
         
     }
     //este es el menu en el cual tiene funciones para agregar eliminar ordenar entre otras
     Scanner ent= new Scanner(System.in);
     // inicializamos terminar en false para que cuando sea true finalize el while
     boolean terminar=false;
     //crear lista
     List<String> lista= new ArrayList<String>();
     lista.add("A");
     lista.add("B");
     lista.add("C");
     lista.add("D");
     lista.add("E");
     lista.add("F");
     lista.add("G");
     lista.add("H");
     // creado por Jefferson Javier Avelar Arriaza 
     while(!terminar)
     {  // Imprime las opciones que el usuario puede utilizar;
         char respuesta;
         System.out.println("Seleccione una opción");
         System.out.println("A- Agregar ventas nuevas");
         System.out.println("B- Eliminar alguna venta ");
         System.out.println("C- Ordenar las ventas");
         System.out.println("D- busqueda Binaria ");
         System.out.println("E- Busqueda Secuencial");
         System.out.println("F- Menu Agregar nuevas Ventas");
         System.out.println("G- Comparar Marcas");
         System.out.println("H- Salir");
         respuesta=ent.next().charAt(0);
        // el swich ocupara la respuesta que mando el usuario y va inicializar la opcion
        switch(respuesta){
            // en el caso A agregamos datos al arreglo
            case 'A':
                
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
             // en el caso C ordenamos el arreglo utilizando el metodo de la burbuja el cual lo ordenara de la venta menor a mayor
             case 'C':
                 ordBurbuja(arreglo);
                 System.out.println("Ventas menores a mayores: $");
                 for (double i : arreglo) {
                 System.out.print(i);
                 System.out.println(" ");
                }
                break;
                // en el caso D aremos una busqueda binaria del arreglo
             case 'D':
               busquedaBinaria(arreglo);
             break;
             // en el caso E asemos una busqueda secuencial del arreglo para que nos diga la posicion en cual esta la venta buscada
             case 'E':
               infopersonal.busquedaSecuencial();
               break;
             // en el caso F inicializamos un meno para aser y agregar datos a un nuevo arreglo
             case 'F':
                 menuagregar.menu();
                 break;
              // en el caso G lo que asemos es la variable terminar la ponemos en true para que finalice y el break para que para el while  
             case 'G':
                 ventas.compararCalidadMarcas();
                 break;
             case 'H':
               terminar=true;
               break;
               
                                
        }
  
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
