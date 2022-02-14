package proyecto_Concesionario;


public class inventario_Empleados {
    //Atributos de la clase 
    private String nombre;
    private String apellido;
    private String dui;
    private String fechaventa;
    private int edad;
    private int ventas;
    private double total_vendido;
    private double codigo;

    //Metodo constructor
    public inventario_Empleados(String nombre, String apellido, String dui, String fechaventa, int edad, int ventas, double total_Vendido,double codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dui = dui;
        this.fechaventa = fechaventa;
        this.edad = edad;
        this.ventas = ventas;
        this.total_vendido = total_Vendido;
        this.codigo=codigo;
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
    
    public void setTotal_vendido (double _total_vendido) //Metodo "set" muestra total vendido
    {
     this.total_vendido = _total_vendido;   
    }
    
    public double getTotal_vendido() //Metodo "get" total vendido
    {
     return this.total_vendido;
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
    
}
