package proyecto_Concesionario;


public class Vehiculos {
    
    //Atributos de la clase
    private String nombre;
    private String modelo;
    private String marca;
    private String color;
    private String placa;
    private int anho;
    private double kilometraje;
    private double precio;
    private char estado;
    private char tipovehiculo;
    private int cantidad;
    private double codigo;

    //Metodo constructor
    public Vehiculos(String modelo, String marca, String color, String placa, int anho, double kilometraje, double precio, char estado, char tipovehiculo,int cantidad,double codigo,String nombre) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.placa = placa;
        this.anho = anho;
        this.kilometraje = kilometraje;
        this.precio = precio;
        this.estado = estado;
        this.tipovehiculo = tipovehiculo;
        this.cantidad = cantidad;
        this.codigo = codigo;  
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
    public void setCodigo(double _codigo) //Metodo "set" muestra codigo 
    {
      this.codigo= _codigo;  
    }
    public double getCodigo(){ //Metodo "get" muestra codigo
        return this.codigo;
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
    
    public void setPlaca (String _placa) //Metodo "set" muestra placa
    {
     this.placa = _placa;
    }
    
    public String getPlaca() //Metodo "get" muestra placa
    {
        return this.placa;
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
    
    public void setEstado (char _estado) //Metodo "set" muestra estado
    {
     this.estado = _estado;
    }
    
    public char getEstado() //Metodo "get" muestra estado
    {
        return this.estado;
    }
    
    public void setTipovehiculo(char _tipovehiculo) //Metodo "set" muestra tipo vehiculo
    {
     this.tipovehiculo = _tipovehiculo;
    }
    
    public char getTipovehiculo() //Metodo "get" muestra tipo vehiculo
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
}
    

