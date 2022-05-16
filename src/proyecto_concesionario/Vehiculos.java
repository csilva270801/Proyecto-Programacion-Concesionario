package proyecto_concesionario;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Vehiculos   {  
    //Atributos de la clase
    private String nombre;
    private String modelo;
    private String marca;
    private String color;  
    private int anho;
    private String kilometraje;
    private String precio;
    private String estado;
    private String tipovehiculo;
    private int cantidad;

    //Metodo constructor
    public Vehiculos(String _modelo, String _marca, String _color, String _nombre, int _anho, String _kilometraje, String _precio, String _estado, String _tipovehiculo,int _cantidad) {
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
    
    public void setKilometraje (String _kilometraje) //Metodo "set" muestra kilometraje 
    {
     this.kilometraje = _kilometraje;
    }
    
    public String getKilometraje() //Metodo "get" muestra kilometraje 
    {
        return this.kilometraje;
    }
    
    public void setPrecio (String _precio) //Metodo "set" muestra precio
    {
     this.precio = _precio;
    }
    
    public String getPrecio() //Metodo "get" muestra precio
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
    public void existencias ()
    {  

        try{
         String cantidadess;
        cantidadess= JOptionPane.showInputDialog("Ingrese la cantidad");        
        int cantidades=Integer.parseInt(cantidadess);
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
        }catch(Exception e){
            System.out.println("Datos erroneos ");
        }
    }
    // metodo para ventas totales
    //Jefferson Javier Avelar Arriaza
    public void ventatotales (){
        
    }
    
    public Vehiculos()
    {
        
    }
     public void creararchivovehiculo()
       {
          try{
            File objetoArchivo=new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt");
            if(objetoArchivo.createNewFile()){
                JOptionPane.showMessageDialog(null,"Archivo creado con nombre: "+ objetoArchivo.getName());
                
            }else{
                JOptionPane.showMessageDialog(null,"El archivo ya existe");
            }
         } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error Al crear el archivo");
            
           }
    
       }
    
    public void agregardatos_vehiculos(String nombre, String modelo, String marca , String color , String anho , String kilometraje , String precio , String estado , String tipovehiculo){
     try{
        FileWriter fw = new FileWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt",true);
        fw.write("Nombre:");
        fw.write(nombre);
        fw.write(" , ");
        fw.write("Modelo:");
        fw.write(modelo);
        fw.write(" , ");
        fw.write("Marca:");
        fw.write(marca);
        fw.write(" , ");
        fw.write("Color:");
        fw.write(color);
        fw.write(" , ");
        fw.write("Año:");
        fw.write(anho);
        fw.write(" , ");
        fw.write("Kilometraje:");
        fw.write(kilometraje);
        fw.write(" , ");
        fw.write("Precio:");
        fw.write(precio);
        fw.write(" , ");
        fw.write("Estado:");
        fw.write(estado);
        fw.write(" , ");
        fw.write("Tipo Vehiculo:");
        fw.write(tipovehiculo);
        fw.write("\n");
        fw.close();
        JOptionPane.showMessageDialog(null,"Se han guardado los datos Correctamente");
     } catch(Exception e){
         JOptionPane.showMessageDialog(null,"Ocurrio un Error al registrar");
         
     }
        
     
     }

    
    
}

    

