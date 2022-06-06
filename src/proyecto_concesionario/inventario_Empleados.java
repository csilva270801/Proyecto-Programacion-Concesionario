package proyecto_concesionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class inventario_Empleados {

    //Atributos de la clase 
    private String nombre;
    private String apellido;
    private String dui;
    private String fechaventa;
    private int edad;
    private String edad1;
    private int ventas;
    private String ventas1;
    private double codigo;
    private double sueldo;
    private String codigo1;
    private String sueldo1;

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

    public String getEdad1() {
        return edad1;
    }

    public void setEdad1(String edad1) {
        this.edad1 = edad1;
    }

    public String getVentas1() {
        return ventas1;
    }

    public void setVentas1(String ventas1) {
        this.ventas1 = ventas1;
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

    public String getCodigo1() {
        return codigo1;
    }

    public void setCodigo1(String codigo1) {
        this.codigo1 = codigo1;
    }

    public String getSueldo1() {
        return sueldo1;
    }

    public void setSueldo1(String sueldo1) {
        this.sueldo1 = sueldo1;
    }
    
    
    
    //Metodo ventas
    public static String  ventas (int cantidades)
    {
        String cantidadexistencias="";
        String cantidadess;
        cantidadess= JOptionPane.showInputDialog("Ingrese la cantidad de ventas");
        cantidades = Integer.parseInt(cantidadess);
       if (cantidades>=6){
            System.out.println("Exelente volumen de ventas");
            
        } else if (cantidades>=4 && cantidades<6){
            
            System.out.println("Buen volumen de ventas");
        }else if (cantidades>=2 && cantidades<4){
          System.out.println("Volumen promedio de ventas");
        }else if(cantidades==1){
            
           System.out.println("Bajo volumen de ventas");
           return cantidadexistencias="Bajo volumen de ventas";
        }else if(cantidades==0){
            System.out.println("No hay ventas");
            
        } 
        return cantidadexistencias;
    }
    //Arreglo para mostrar datos personales del empleado
    public void empleado(){
        ArrayList informacionEmpleado = new ArrayList();
        informacionEmpleado.add("Fernano");
        informacionEmpleado.add("Salguero");
        informacionEmpleado.add("17/07/2001");
        informacionEmpleado.add(20);
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
    
    public static boolean  creararchivo_Inventario_personal()
       {
          boolean valor=false;
          try{
            File objetoArchivos=new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt");
            if(objetoArchivos.createNewFile()){
                JOptionPane.showMessageDialog(null,"Archivo creado con nombre: "+ objetoArchivos.getName());
                return valor=false;
            }else{
                JOptionPane.showMessageDialog(null,"El archivo ya existe");
                return valor=true;
            }
         } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ocurrio un Error Al crear el archivo");
            
           }
        return valor;
        
    
       }
    public void agregardatos_empleados(){
     try{
        FileWriter fw = new FileWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt",true);
        //FileWriter fw = new FileWriter("D:/Ciclo IV/Programacion Orientada a Objetos/Inventario_vehiculos.txt",true);
        fw.write(getNombre());
        fw.write(" | ");
        fw.write(getApellido());
        fw.write(" | ");
        fw.write(getDui());
        fw.write(" | ");
        fw.write(getFechaventa());
        fw.write(" | ");
        fw.write(getEdad1());
        fw.write(" | ");
        fw.write(getVentas1());
        fw.write(" | ");
        fw.write(getCodigo1());
        fw.write(" | ");
        fw.write(getSueldo1());
        fw.write("\n");
        fw.close();
        JOptionPane.showMessageDialog(null,"Se han guardado los datos Correctamente");
        } catch(Exception e){
         JOptionPane.showMessageDialog(null,"Ocurrio un Error al registrar");
        } 
    }
    
    public DefaultTableModel TablaEmpleados(){
        Vector columnas = new Vector();
        columnas.addElement("NOMBRE");
        columnas.addElement("APELLIDO");
        columnas.addElement("DUI");
        columnas.addElement("FECHA VENTA");
        columnas.addElement("EDAD");
        columnas.addElement("VENTAS");
        columnas.addElement("CODIGO");
        columnas.addElement("SUELDO");
        
        DefaultTableModel mdlTabla = new DefaultTableModel(columnas, 0);
        
        try{
            FileReader fr = new FileReader("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt");
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
    public void seleccionar_datos(JTable TablaEmpleados){
        try {
            int fila = TablaEmpleados.getSelectedRow();
            if (fila>=0){
                setNombre(TablaEmpleados.getValueAt(fila, 0).toString());
                setApellido(TablaEmpleados.getValueAt(fila, 1).toString());
                setDui(TablaEmpleados.getValueAt(fila, 2).toString());
                setFechaventa(TablaEmpleados.getValueAt(fila, 3).toString());
                setEdad1(TablaEmpleados.getValueAt(fila, 4).toString());
                setVentas1(TablaEmpleados.getValueAt(fila, 5).toString());
                setCodigo1(TablaEmpleados.getValueAt(fila, 6).toString());
                setSueldo1(TablaEmpleados.getValueAt(fila, 7).toString());
            }
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Ocurrio un Error al seleccionar");
        }      
    }    
    //Eliminacion visual de Tabla
    public void EliminarEmpleados (JTable TablaEmpleados, JTextField Nombre){
        
        DefaultTableModel model = (DefaultTableModel)TablaEmpleados.getModel();
        //Recorrer
        for (int i = 0; i < model.getRowCount(); i++){
            if(((String)model.getValueAt(i, 0)).equals(Nombre.getText())){
                
            model.removeRow(i);
            break;
            }       
        }
        //Limpieza .txt
        try{
           PrintWriter writer = new PrintWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt");
           writer.print("");
           writer.close();
           JOptionPane.showMessageDialog(null,"Se han eliminado los datos Correctamente");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema"+e.toString());
        }
        //Nuevos registros
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt")))){
            
            for (int row = 0; row < TablaEmpleados.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
                
                for(int col = 0; col < TablaEmpleados.getColumnCount(); col++){
                    
                    Object obj = TablaEmpleados.getValueAt(row, col);
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
    //Editar   
    public void editarEmpleados(JTable TablaEmpleados)
    {
        try{
           PrintWriter writer = new PrintWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt");
           writer.print("");
           writer.close();
           JOptionPane.showMessageDialog(null,"Se han editado los datos Correctamente");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema"+e.toString());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_personal.txt")))){
  
            for (int row = 0; row < TablaEmpleados.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
                
                for(int col = 0; col < TablaEmpleados.getColumnCount(); col++){
                    
                    Object obj = TablaEmpleados.getValueAt(row, col);
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
