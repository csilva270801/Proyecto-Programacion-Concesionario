package proyecto_concesionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class Vehiculos   {  

    
    
    //Atributos de la clase
    private String nombre;
    private String modelo;
    private String marca;
    private String color;  
    private int anho;
    private String anho1;
    private String cantidad1;
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

    public String getAnho1() {
        return this.anho1;
    }

    public void setAnho1(String _anho1) {
        this.anho1 =_anho1;
    }

    public String getCantidad1() {
        return this.cantidad1;
    }

    public void setCantidad1(String _cantidad1) {
        this.cantidad1 = _cantidad1;
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
    public static  String existencias (int cantidades)
    {
        String existencias="";
        String cantidadess;
        cantidadess= JOptionPane.showInputDialog("Ingrese la cantidad");
         cantidades=Integer.parseInt(cantidadess);
        try{
       if (cantidades>20){
            System.out.println("Hay bastantes existencias");
         return existencias="hay bastantes existencias";
        } else if (cantidades>=10 && cantidades<20){

            System.out.println("Hay buenas existencias");
        }else if (cantidades>=5 && cantidades<10){
          System.out.println("Hay pocas existencias");
        }else if(cantidades>=1 && cantidades<5){

           System.out.println("Las existencias estan al limite"); 
        }else if(cantidades==0){
            System.out.println("No hay existencias");
            return existencias= "No hay existencias";
            
        }
       } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio al ingresar los datos");
           }
       
        return existencias;
        
        
    }
   
    // metodo para ventas totales
    //Jefferson Javier Avelar Arriaza
    public void ventatotales (){
        
    }
    
    public Vehiculos()
    {
        
    }
     public static boolean  creararchivovehiculo()
       {
           boolean resultado = false;
          try{
            File objetoArchivo=new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt");
            //File objetoArchivo=new File("D:/Ciclo IV/Programacion Orientada a Objetos/Inventario_vehiculos.txt");
            if(objetoArchivo.createNewFile()){
                JOptionPane.showMessageDialog(null,"Archivo creado con nombre: "+ objetoArchivo.getName());
                resultado = false;
            }else{
                JOptionPane.showMessageDialog(null,"El archivo ya existe");
                resultado = true;
            }
         } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error Al crear el archivo");
            return resultado;
           }
          return resultado;

        
    
       }
    
    public void agregardatos_vehiculos(){
        
        try{
        FileWriter fw = new FileWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt",true);
        //FileWriter fw = new FileWriter("D:/Ciclo IV/Programacion Orientada a Objetos/Inventario_vehiculos.txt",true);
        fw.write(getNombre());
        fw.write(" | ");
        fw.write(getModelo());
        fw.write(" | ");
        fw.write(getMarca());
        fw.write(" | ");
        fw.write(getColor());
        fw.write(" | ");
        fw.write(getAnho1());
        fw.write(" | ");
        fw.write(getKilometraje());
        fw.write(" | ");
        fw.write(getPrecio());
        fw.write(" | ");
        fw.write(getEstado());
        fw.write(" | ");
        fw.write(getTipovehiculo());
        fw.write(" | ");
        fw.write(getCantidad1());
        fw.write("\n");
        fw.close();
        JOptionPane.showMessageDialog(null,"Se han guardado los datos Correctamente");
     } catch(Exception e){
         JOptionPane.showMessageDialog(null,"Ocurrio un Error al registrar");
         
     }
        
     
     }
    
    public DefaultTableModel TablaVehiculos(){
        Vector columnas = new Vector();
        columnas.addElement("NOMBRE");
        columnas.addElement("MODELO");
        columnas.addElement("MARCA");
        columnas.addElement("COLOR");
        columnas.addElement("AÑO");
        columnas.addElement("KILOMETRAJE");
        columnas.addElement("PRECIO $");
        columnas.addElement("ESTADO");
        columnas.addElement("TIPO VEHICULO");
        columnas.addElement(" CANTIDAD ");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(columnas, 0);
        
        try{
            FileReader fr = new FileReader("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while((d= br.readLine())!=null){
            StringTokenizer dato = new StringTokenizer(d,"|");
            Vector x = new Vector();
            while(dato.hasMoreTokens()){
                x.addElement(dato.nextToken());
            }
           mdlTabla.addRow(x);
        } 
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return mdlTabla;
    }
    public void seleccionar_datos(JTable TablaVehiculos){
        try {
            int fila = TablaVehiculos.getSelectedRow();
            if (fila>=0){
                setNombre(TablaVehiculos.getValueAt(fila, 0).toString());
                setModelo(TablaVehiculos.getValueAt(fila, 1).toString());
                setMarca(TablaVehiculos.getValueAt(fila, 2).toString());
                setColor(TablaVehiculos.getValueAt(fila, 3).toString());
                setAnho1(TablaVehiculos.getValueAt(fila, 4).toString());
                setKilometraje(TablaVehiculos.getValueAt(fila, 5).toString());
                setPrecio(TablaVehiculos.getValueAt(fila, 6).toString());
                setEstado(TablaVehiculos.getValueAt(fila, 7).toString());
                setTipovehiculo(TablaVehiculos.getValueAt(fila, 8).toString());
                setCantidad1(TablaVehiculos.getValueAt(fila, 9).toString());
            }
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Ocurrio un Error al seleccionar");
        }      
    }
    //Eliminacion visual de Tabla
    public void EliminarVehiculos (JTable TablaVehiculos, JTextField Nombre){
        
        DefaultTableModel model = (DefaultTableModel)TablaVehiculos.getModel();
        //Recorrer
        for (int i = 0; i < model.getRowCount(); i++){
            if(((String)model.getValueAt(i, 0)).equals(Nombre.getText())){
                
            model.removeRow(i);
            break;
            }       
        }
        //Limpieza .txt
        try{
            PrintWriter writer = new PrintWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt");
           writer.print("");
           writer.close();
           JOptionPane.showMessageDialog(null,"Se han eliminado los datos Correctamente");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema"+e.toString());
        }
        //Nuevos registros
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt")))){
 
            for (int row = 0; row < TablaVehiculos.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
                
                for(int col = 0; col < TablaVehiculos.getColumnCount(); col++){
                    
                    Object obj = TablaVehiculos.getValueAt(row, col);
                    String value = obj == null ? "null" :obj.toString();
                    joiner.add(value);
             }
                System.out.println(joiner.toString());
                bw.write(joiner.toString());
                bw.newLine();
                
            }
                  
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }
        
    }
    public void editartxtvehiculos(JTable TablaVehiculos)
    {
        try{
            PrintWriter writer = new PrintWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt");
           writer.print("");
           writer.close();
           JOptionPane.showMessageDialog(null,"Se han editado los datos Correctamente");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema"+e.toString());
        }
        //Editar
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_vehiculos.txt")))){
  
            for (int row = 0; row < TablaVehiculos.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
                
                for(int col = 0; col < TablaVehiculos.getColumnCount(); col++){
                    
                    Object obj = TablaVehiculos.getValueAt(row, col);
                    String value = obj == null ? "null" :obj.toString();
                    joiner.add(value);
             }
                System.out.println(joiner.toString());
                bw.write(joiner.toString());
                bw.newLine();      
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un error");
        }   
    }   
}

    

