package proyecto_concesionario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public  class  inventario_Cliente {
    //Atributos de la clase
    private String nombres;
    private String apellidos;
    private String correo;
    private String dui;
    private String fechaCompra;
    private String pago;
    private int vehivulos_Comprados;
    private double codigo_producto;
    private double compras_totales;
    private String vehivulos_Comprados1;
    private String codigo_producto1;
    private String compras_totales1;
    
    //Metodo constructor
    public inventario_Cliente(String nombres, String apellidos, String correo, String dui, String fechaCompra, int vehivulos_Comprados, String pago,double codigo_producto, double compras_totales) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.dui = dui;
        this.fechaCompra = fechaCompra;
        this.pago = pago;
        this.vehivulos_Comprados = vehivulos_Comprados;
        this.codigo_producto= codigo_producto;
        this.compras_totales= compras_totales;
    }
    public inventario_Cliente()
    {
        
    }
    
    //Encapsulamiento
    public void setNombres (String _nombres) //Metodo "set" sirve para colocar el dato que manda el usuario.
    {
     this.nombres = _nombres;
    }

    public String getFechaCompra() { //Metodo "get" mostramos dato ingresado
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) { //Metodo "Set" mostramos fechaCompra
        this.fechaCompra = fechaCompra;
    }

    public double getCompras_totales() { //Metodo "get" moostramos el dato ingresado
        return compras_totales;
    }

    public void setCompras_totales(double compras_totales) { //Metodo "set" coloca las compras totales
        this.compras_totales = compras_totales;
    }
    
    public String getNombres() //Metodo "get" mostramos el dato ingresado.
    {
     return this.nombres;
    }
    public void setCodigo_producto(double _codigo_producto) //Metodo "set" muestra codigo producto
    {
       this.codigo_producto= _codigo_producto; 
    }
    public double getCodigo_producto() //Metodo "get" muestra codigo producto
    {
       return this.codigo_producto;
    }
    
    public void setApellidos (String _apellidos) //Metodo "set" coloca apellidos
    {
     this.apellidos = _apellidos;
    }
    
    public String getApellidos() //Metodo "get" muestra apellidos
    {
     return this.apellidos;
    }
    
    public void setCorreo (String _correo) //Metodo "set" coloca correo
    {
     this.correo = _correo;
    }
    
    public String getCorreo() //Metodo "get" muestra ccorreo
    {
     return this.correo;
    }
    
    public void setDui (String _dui) //Metodo "set" coloca dui
    {
     this.dui = _dui;
    }
    
    public String getDui() //Metodo "get" muestra dui
    {
     return this.dui;
    }
    
    public void setVehivulos_Comprados (int _vehivulos_Comprados) //Metodo "set" coloca vehiculos comprados
    {
     this.vehivulos_Comprados = _vehivulos_Comprados;
    }
    
    public int getVehivulos_Comprados() //Metodo "get" muestra vehiculos comprados
    {
     return this.vehivulos_Comprados;
    }
    
    public void setFecha_compra (String _fechaCompra) //Metodo "set" coloca fecha compra
    {
     this.fechaCompra = _fechaCompra;
    }
    
    public String getFecha_compra() //Metodo "get" muestra fecha de compra
    {
     return this.fechaCompra;
    }
    
    public void setPago (String _pago) //Metodo "set" coloca pago
    {
     this.pago = _pago;
    }
    
    public String getPago() //Metodo "get" muestra pago
    {
     return this.pago;
    }

    public String getVehivulos_Comprados1() {
        return vehivulos_Comprados1;
    }

    public void setVehivulos_Comprados1(String vehivulos_Comprados1) {
        this.vehivulos_Comprados1 = vehivulos_Comprados1;
    }

    public String getCodigo_producto1() {
        return codigo_producto1;
    }

    public void setCodigo_producto1(String codigo_producto1) {
        this.codigo_producto1 = codigo_producto1;
    }

    public String getCompras_totales1() {
        return compras_totales1;
    }

    public void setCompras_totales1(String compras_totales1) {
        this.compras_totales1 = compras_totales1;
    }
    
    //Metodo tipoCliente
    public static int tipocliente (int cantidad_vehiculos)
    {
        int cantidad=0;
        String cantidadess= JOptionPane.showInputDialog("Ingrese la cantidad");
        cantidad_vehiculos=Integer.parseInt(cantidadess);
       if (cantidad_vehiculos>=4){
            System.out.println("Cliente de altisimo volumen de compra ");
            
        } else if (cantidad_vehiculos>=2 && cantidad_vehiculos<4){
            
            System.out.println("");
            return cantidad=0;
        }else if (cantidad_vehiculos==1){
          System.out.println("Cliente con volumen de compra promedio");
          return cantidad=1;
        }
        return cantidad;
  
    }
    public void imprimircliente()
    {
        System.out.println("Nombre:"+nombres+" "+"Apellidos: "+apellidos);
        System.out.println("Correo:"+correo+" "+"Dui: "+dui+" "+"Fecha compra: "+fechaCompra+" "+"Pago:"+pago);
        System.out.println("Total vehiculos comprados: "+vehivulos_Comprados+"Codigo del producto: "+codigo_producto+"Compras totales "+compras_totales);
    }
    
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
    public void agregardatos_clientes(){
     try{
        FileWriter fw = new FileWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_cliente.txt",true);
        //FileWriter fw = new FileWriter("D:/Ciclo IV/Programacion Orientada a Objetos/Inventario_vehiculos.txt",true);
        fw.write(getNombres());
        fw.write(" | ");
        fw.write(getApellidos());
        fw.write(" | ");
        fw.write(getCorreo());
        fw.write(" | ");
        fw.write(getDui());
        fw.write(" | ");
        fw.write(getFechaCompra());
        fw.write(" | ");
        fw.write(getPago());
        fw.write(" | ");
        fw.write(getVehivulos_Comprados1());
        fw.write(" | ");
        fw.write(getCodigo_producto1());
        fw.write(" | ");
        fw.write(getCompras_totales1());
        fw.write("\n");
        fw.close();
        JOptionPane.showMessageDialog(null,"Se han guardado los datos Correctamente");
        } catch(Exception e){
         JOptionPane.showMessageDialog(null,"Ocurrio un Error al registrar");
        } 
    }
    
        public DefaultTableModel TablaClientes(){
        Vector columnas = new Vector();
        columnas.addElement("NOMBRE");
        columnas.addElement("APELLIDO");
        columnas.addElement("CORREO");
        columnas.addElement("DUI");
        columnas.addElement("FECHA COMPRA");
        columnas.addElement("PAGO");
        columnas.addElement("VEHICULOS COMPRADOS");
        columnas.addElement("CODIGO PRODUCTO");
        columnas.addElement("COMPRAS TOTALES");
        DefaultTableModel mdlTabla = new DefaultTableModel(columnas, 0);
        
        try{
            FileReader fr = new FileReader("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_cliente.txt");
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
        
    public void seleccionar_datos(JTable TablaClientes){
        try {
            int fila = TablaClientes.getSelectedRow();
            if (fila>=0){
                setNombres(TablaClientes.getValueAt(fila, 0).toString());
                setApellidos(TablaClientes.getValueAt(fila, 1).toString());
                setCorreo(TablaClientes.getValueAt(fila, 2).toString());
                setDui(TablaClientes.getValueAt(fila, 3).toString());
                setFechaCompra(TablaClientes.getValueAt(fila, 4).toString());
                setPago(TablaClientes.getValueAt(fila, 5).toString());
                setVehivulos_Comprados1(TablaClientes.getValueAt(fila, 6).toString());
                setCodigo_producto1(TablaClientes.getValueAt(fila, 7).toString());
                setCompras_totales1(TablaClientes.getValueAt(fila, 8).toString());
            }
        } catch(Exception e){
            
            JOptionPane.showMessageDialog(null,"Ocurrio un Error al seleccionar");
        }      
    }   
        //Eliminacion visual de Tabla
    public void EliminarClientes (JTable TablaClientes, JTextField Nombre){
        
        DefaultTableModel model = (DefaultTableModel)TablaClientes.getModel();
        //Recorrer
        for (int i = 0; i < model.getRowCount(); i++){
            if(((String)model.getValueAt(i, 0)).equals(Nombre.getText())){
                
            model.removeRow(i);
            break;
            }       
        }
        //Limpieza .txt
        try{
           PrintWriter writer = new PrintWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_cliente.txt");
           writer.print("");
           writer.close();
           JOptionPane.showMessageDialog(null,"Se han eliminado los datos Correctamente");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema"+e.toString());
        }
        //Nuevos registros
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_cliente.txt")))){
            
            for (int row = 0; row < TablaClientes.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
                
                for(int col = 0; col < TablaClientes.getColumnCount(); col++){
                    
                    Object obj = TablaClientes.getValueAt(row, col);
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
    public void editarClientes(JTable TablaClientes)
    {
        try{
           PrintWriter writer = new PrintWriter("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_cliente.txt");
           writer.print("");
           writer.close();
           JOptionPane.showMessageDialog(null,"Se han editado los datos Correctamente");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocurrio un problema"+e.toString());
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:/Users/petoa/carpetas/Pictures/archivo proyecto/Inventario_cliente.txt")))){
  
            for (int row = 0; row < TablaClientes.getRowCount(); row++) {
                StringJoiner joiner = new StringJoiner("|");
                
                for(int col = 0; col < TablaClientes.getColumnCount(); col++){
                    
                    Object obj = TablaClientes.getValueAt(row, col);
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
