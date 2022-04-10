package proyecto_concesionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import proyecto_concesionario.inventario_Empleados;
import proyecto_concesionario.Vehiculos;


/**
 *
 * @author Jefferson Javier Avelar Arriazar
 */
public class administradorautos {

    public static void main(String[] args) 
    {  //llamar metodo del menu
        interfazmenu menuagregar=new interfazmenu ();
        // instanciar la clase inventario_Empleados
        inventario_Empleados infopersonal=new inventario_Empleados();
        //instanciar la clase inventario_Cliente
        inventario_Cliente clientes= new inventario_Cliente();
        //instanciar la clase Vehiculos
        Vehiculos ventas = new Vehiculos();
        //crear arreglo de tipo objeto 
        //inventario_Empleados datosempleados[]= new inventario_Empleados[0];
        //datosempleados[0]=  new Informacion_personal_Empleado();

       //Informacion_personal_Empleado Informacion_personal_Empleadosss = new Informacion_personal_Empleado();
       Motos objmotos= new Motos();
       //variables polimorficas
       Carros objcarros= new Carros();
       Vehiculos objdatos[]=new Vehiculos[1];
       objdatos[0]=objcarros;
       objdatos[1]=objmotos;
       objdatos[0].ventatotales();
       objdatos[1].ventatotales();
      // cast 
       Vehiculos conver=(Vehiculos)objdatos[0];
       
      //inicializar el metodo
      infopersonal.empleado();
      System.out.println("--------------------------------------------------------------------------------------------");
      //llamar al metodo ventas totales el cual trae consigo la suma total y el promedio de las ventas
     
      //iniciarlizar el metodo ventatotales que nos da la suma de ventas y el promedio
      ventas.ventatotales(); 
      

       
     // Arreglo
     Scanner entrada = new Scanner(System.in);
     Scanner c = new Scanner(System.in);
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
         System.out.println("H- Tipos de clientes");
         System.out.println("I-Ingresar informacion personal empleado");
         System.out.println("J- Salir");
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
                // ventas.compararCalidadMarcas();
                 break;
                 case 'H':
                     int vehiculoscomprados;
                     System.out.println("Ingrese las nuevas ventas");
                     vehiculoscomprados= entrada.nextInt();
                     clientes.tipocliente(vehiculoscomprados);
                     
                 break;
                  case 'I':
                      double Peso;
                      double estatura;
                      String domicilio;
                      double distancia_casa_trabajo;
                      String estado;
                        System.out.println("Ingrese el peso");
                        Peso= entrada.nextDouble();
                        System.out.println("Ingrese la estatura");
                        estatura= entrada.nextDouble();
                        System.out.println("Ingrese el domicilio");
                        domicilio= c.next();
                        System.out.println("Ingrese el La distancia de la casa al trabajo");
                        distancia_casa_trabajo= entrada.nextDouble();
                        System.out.println("Ingrese el estado");
                        estado= entrada.next();
                        //Informacion_personal_Empleado datosempleados[]=new Informacion_personal_Empleado[0];
                        
                        
                        //variable polimorfica
                        Informacion_personal_Empleado datosempleado[]= new Informacion_personal_Empleado[1];
                        datosempleado[0]=new Informacion_personal_Empleado (Peso,estatura,domicilio,distancia_casa_trabajo,estado) ;
                        //datosempleado[1].empleado();
                        //cast
                        System.out.println("Arreglo de un objeto= "+"[ "+"Peso: "+(int)datosempleado[0].getPeso()+", "+"Estatura: "+(int)datosempleado[0].getEstatura()+", "+"Domicilio: "+datosempleado[0].getDomicilio()+", "+"Distancia: "+(float)datosempleado[0].getDistancia_casa_trabajo()+", "+"Estado: "+datosempleado[0].getEstado()+" ]");
                      
                        break;
             case 'J':
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
