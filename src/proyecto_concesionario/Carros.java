
package proyecto_concesionario;

/**
 *
 * @author Jefferson Javier Avelar Arriaza 
 */ 
// heredando de la clase padre Vehiculos
public class Carros extends Vehiculos
{    // atributos de la clase carros
    private double codigo;
    private double total_precio;
    private int cantidad_puertas;
    // metodo constructor 
    public Carros(double codigo, int cantidad_puertas) {
        this.codigo = 0111;
        this.cantidad_puertas = cantidad_puertas;
    }
    // Invoca al metodo constructor de la clase padre Vehiculos
    public Carros()
    {
        super("Sedan","Toyota","Gris","Corrolla",2019,100,45385,"Nuevo","Carro",25);
    }
    
    public int getCantidad_puertas() { //Metodo "get" muestra codigo
        return cantidad_puertas;
    }

    public void setCantidad_puertas(int cantidad_puertas) { //Metodo "set" muestra codigo 
        this.cantidad_puertas = cantidad_puertas;
    }
    
    public void setCodigo(double _codigo) //Metodo "set" muestra codigo 
    {
      this.codigo= _codigo;  
    }
    public double getCodigo(){ //Metodo "get" muestra codigo
        return this.codigo;
    }
    //Metodo para obtener el precio total
    public void preciototal()
    {
        double precio=this.getPrecio();
        int cantidad=this.getCantidad();
        total_precio=precio*cantidad;
        System.out.println("El precio total de los veiculos "+this.getNombre()+" es de "+total_precio+"con su codigo "+this.getCodigo());
    }
    //Metodo para obtener una oferta por comprar vehiculos tipo sedan
    public void oferta()
    {
        String modeloveiculo=this.getModelo();
        if("Sedan".equals(modeloveiculo))
        {
            double descuentototal;
            double precioveiculo =this.getPrecio();
            
           descuentototal=precioveiculo*0.05;
           System.out.println("El descuento por comprar un carro tipo sedan es $ "+descuentototal);
        }else{
            System.out.println("solo los veiculos tipo sedan tienen descuento");
        }
    }
 
}
