package proyecto_concesionario;

import java.util.ArrayList;
import java.util.Scanner;

public class inventario_Empleados {

    //Atributos de la clase 
    private String nombre;
    private String apellido;
    private String dui;
    private String fechaventa;
    private int edad;
    private int ventas;
    private double codigo;
    private double sueldo;

    //Metodo constructor
    public inventario_Empleados(String _nombre, String _apellido, String _dui, String _fechaventa, int _edad, int _ventas,double _codigo,double _sueldo) {
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.dui = _dui;
        this.fechaventa = _fechaventa;
        this.edad = _edad;
        this.ventas = _ventas;
        this.codigo= _codigo;
        this.sueldo= _sueldo;
    }

    public inventario_Empleados() {
        
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double _sueldo) {
        this.sueldo = _sueldo;
    }
    
    
    //Encapsulamiento
    public void setNombre (String _nombre) //Metodo "set" sirve para colocar el dato que manda el usuario.
    {
     this.nombre = _nombre;
    }
    
    public String getNombre() //Metodo "get" mostramos el dato ingresado.
    {
     return this.nombre;
    }
    
    public void setApellido (String _apellido) //Metodo "set" muestra apellido
    {
     this.apellido = _apellido;
    }
    
    public String getApellido() //Metodo "get" muestra apellido
    {
     return this.apellido;
    }
    public void setCodigo(double _codigo) //Metodo "set" muestra codigo
    {
       this.codigo= _codigo; 
    }
    public double getCodigo() //Metodo "get" muestra codigo
    {
       return this.codigo;
    }
    
    public void setDui (String _dui) //Metodo "set" muestra dui
    {
     this.dui = _dui;
    }
    
    public String getDui() //Metodo "get" muestra dui
    {
     return this.dui;
    }
    
    public void setEdad (int _edad) //Metodo "set" muestra edad
    {
     this.edad = _edad;
    }
    
    public int getEdad() //Metodo "get" muestra edad
    {
     return this.edad;
    }
    
    public void setFechaventa (String _fechaventa) //Metodo "set" muestra fecha venta
    {
     this.fechaventa = _fechaventa;
    }
    
    public String getFechaventa() //Metodo "get" muestra fecha venta
    {
     return this.fechaventa;
    }
    
    public void setVentas (int _ventas) //Metodo "set" muestra ventas
    {
     this.ventas = _ventas;
    }
    
    public int getVentas() //Metodo "get" muestra ventas
    {
     return this.ventas;
    }
    
    //Metodo ventas
    public void ventas (int _ventas)
    {
       int cantidades=_ventas;
       if (cantidades>=6){
            System.out.println("Exelente volumen de ventas");
            
        } else if (cantidades>=4 && cantidades<6){
            
            System.out.println("Buen volumen de ventas");
        }else if (cantidades>=2 && cantidades<4){
          System.out.println("Volumen promedio de ventas");
        }else if(cantidades==1){
            
           System.out.println("Bajo volumen de ventas"); 
        }else{
            System.out.println("No hay ventas"); 
        } 
    }
    //Arreglo para mostrar datos personales del empleado
    public void empleado(){
        ArrayList informacionEmpleado = new ArrayList();
        informacionEmpleado.add("Fernano");
        informacionEmpleado.add("Salguero");
        informacionEmpleado.add("17/07/2001");
        informacionEmpleado.add("20");
        informacionEmpleado.add("Empleado tiempo Completo"); 
        System.out.println("Informacion del empleado es: "+informacionEmpleado);
    }
    //metodo de busqueda secuencial
    //Jefferson Javier Avelar Arriaza
    public  void busquedaSecuencial(){
        ArrayList busqueda = new ArrayList();
        busqueda.add(800);
        busqueda.add(10000);
        busqueda.add(25000);
        busqueda.add(50000);
        busqueda.add(30000);
        Scanner dato = new Scanner(System.in);
        System.out.print("Buscar venta: ");
        Object lim = dato.nextInt();
        int posicion = 0;
        for(int i = 0; i < busqueda.size(); i++){//recorremos todo el arreglo
            if(busqueda.get(i) == lim){
                posicion = i;//Si es verdadero guardamos la posicion
                break;//Para el ciclo
            
            }//comparamos el elemento en el arreglo con el buscado         
            
        }
        System.out.println("El dato esta en la posicion: "+posicion);
    }

}
