package proyecto_Concesionario;

import javax.swing.JOptionPane;


public class inventario_Cliente {
    //Atributos de la clase
    private String nombres;
    private String apellidos;
    private String correo;
    private String dui;
    private String fechaCompra;
    private char pago;
    private int vehivulos_Comprados;
    private double codigo_producto;
    
    //Metodo constructor
    public inventario_Cliente(String nombres, String apellidos, String correo, String dui, String fechaCompra, int vehivulos_Comprados, char pago,double codigo_producto) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.dui = dui;
        this.fechaCompra = fechaCompra;
        this.pago = pago;
        this.vehivulos_Comprados = vehivulos_Comprados;
        this.codigo_producto= codigo_producto;
    }
    
    //Encapsulamiento
    public void setNombres (String _nombres) //Metodo "set" sirve para colocar el dato que manda el usuario.
    {
     this.nombres = _nombres;
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
    
    public void setPago (char _pago) //Metodo "set" coloca pago
    {
     this.pago = _pago;
    }
    
    public char getPago() //Metodo "get" muestra pago
    {
     return this.pago;
    }
    
    //Metodo tipoCliente
    public void tipocliente (int _vehivulos_Comprados)
    {
        double cantidad_veiculos=_vehivulos_Comprados;
       if (cantidad_veiculos>=4){
            System.out.println("Cliente de altisimo volumen de compra ");
            
        } else if (cantidad_veiculos>=2 && cantidad_veiculos<4){
            
            System.out.println("Cliente con buen volumen de compra");
        }else if (cantidad_veiculos==1){
          System.out.println("Cliente con volumen de compra promedio");
        }
  
    }
    
}
