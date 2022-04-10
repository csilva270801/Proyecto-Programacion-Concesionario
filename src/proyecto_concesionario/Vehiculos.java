package proyecto_concesionario;

import java.util.ArrayList;
import java.util.Scanner;


public class Vehiculos   {  
    //Atributos de la clase
    private String nombre;
    private String modelo;
    private String marca;
    private String color;  
    private int anho;
    private double kilometraje;
    private double precio;
    private String estado;
    private String tipovehiculo;
    private int cantidad;

    //Metodo constructor
    public Vehiculos(String _modelo, String _marca, String _color, String _nombre, int _anho, double _kilometraje, double _precio, String _estado, String _tipovehiculo,int _cantidad) {
        this.modelo = _modelo;
        this.marca = _marca;
        this.color = _color;
        this.anho = _anho;
        this.kilometraje = _kilometraje;
        this.precio = _precio;
        this.estado = _estado;
        this.tipovehiculo = _tipovehiculo;
        this.cantidad = _cantidad;
        this.nombre= _nombre;
    } 
    //Encapsulamiento
    public void setModelo (String _modelo) //Metodo "set" sirve para colocar el dato que manda el usuario.
    {
     this.modelo = _modelo;
    }
    
    public String getModelo() //Metodo "get" mostramos el dato ingresado.
    {
     return this.modelo;
    }
    public void setNombre (String _nombre){ //Metodo "set" muestra nombre
        this.nombre = _nombre;
    }
    public String getNombre(){ //Metodo "get" muestra nombre
        return this.nombre;
    }
    public void setCantidad(int _cantidad) //Metodo "set" muestra cantidad
    {
       this.cantidad= _cantidad;
    }
    public int getCantidad() //Metodo "get" muestra cantidad
    {
       return this.cantidad;
    }
    
    public void setMarca (String _marca) //Metodo "set" muestra marca
    {
     this.marca = _marca;
    }
    
    public String getMarca() //Metodo "get" muestra marca
    {
     return this.marca;
    }
    
    public void setColor (String _color) //Metodo "set" muestra color
    {
     this.color = _color;
    }
    
    public String getColor() //Metodo "get" muestra color
    {
        return this.color;
    }
    
    public void setAnho (int _anho) //Metodo "set" muestra año
    {
     this.anho = _anho;
    }
    
    public int getAnho() //Metodo "get" muestra año
    {
        return this.anho;
    }
    
    public void setKilometraje (double _kilometraje) //Metodo "set" muestra kilometraje 
    {
     this.kilometraje = _kilometraje;
    }
    
    public double getKilometraje() //Metodo "get" muestra kilometraje 
    {
        return this.kilometraje;
    }
    
    public void setPrecio (double _precio) //Metodo "set" muestra precio
    {
     this.precio = _precio;
    }
    
    public double getPrecio() //Metodo "get" muestra precio
    {
        return this.precio;
    }
    
    public void setEstado (String _estado) //Metodo "set" muestra estado
    {
     this.estado = _estado;
    }
    
    public String getEstado() //Metodo "get" muestra estado
    {
        return this.estado;
    }
    
    public void setTipovehiculo(String tipovehiculo) //Metodo "set" muestra tipo vehiculo
    {
     this.tipovehiculo = tipovehiculo;
    }
    
    public String getTipovehiculo() //Metodo "get" muestra tipo vehiculo
    {
        return this.tipovehiculo;
    }
    
    //Metodo existencias
    public void existencias (int _cantidad)
    {
        int cantidades=_cantidad;
       if (cantidades>20){
            System.out.println("Hay bastantes existencias");
            
        } else if (cantidades>=10 && cantidades<20){
            
            System.out.println("Hay buenas existencias");
        }else if (cantidades>=5 && cantidades<10){
          System.out.println("Hay pocas existencias");
        }else if(cantidades>=1 && cantidades<5){
            
           System.out.println("Las existencias estan al limite"); 
        }else{
            System.out.println("No hay existencias se nesesita producto"); 
        } 
    }
    // metodo para ventas totales
    //Jefferson Javier Avelar Arriaza
    public void ventatotales (){
        
    }
    
    public Vehiculos()
    {
        
    }
    

}
    

