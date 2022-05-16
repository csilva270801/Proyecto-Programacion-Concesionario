 
package proyecto_concesionario;

import java.util.ArrayList;

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
        super("Sedan","Toyota","Gris","Corrolla",2019,"100","45385","Nuevo","Carro",25);
    }

    Carros(String honda, int i, double d) {
        
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
    public void precio_total()
    {
        String precio=this.getPrecio();
        int cantidad=this.getCantidad();
        total_precio=cantidad;
        System.out.println("El precio total de los veiculos "+this.getNombre()+" es de "+total_precio+"con su codigo "+this.getCodigo());
    }
    //Metodo para obtener una oferta por comprar vehiculos tipo sedan
    public void oferta()
    {
        String modeloveiculo=this.getModelo();
        if("Sedan".equals(modeloveiculo))
        {
            double descuentototal;
            String precioveiculo =this.getPrecio();
            
           descuentototal=300*0.05;
           System.out.println("El descuento por comprar un carro tipo sedan es $ "+descuentototal);
        }else{
            System.out.println("solo los veiculos tipo sedan tienen descuento");
        }
    }
    @Override
    public void ventatotales()
    {
        ArrayList ventas = new ArrayList();
        ventas.add(30000);
        ventas.add(50000);
        ventas.add(25000);
        ventas.add(10000);
        ventas.add(800);
        ventas.add(400000);
        int promedio = 0;
        int suma=0;
        System.out.println("Sus Ventas son: $"+ventas.toString());
        for (Object num:ventas)suma+=(int)num;
        System.out.println("Las ventas totales son: $"+suma);
        for(Object num : ventas)promedio+=(int)num;
        promedio/=ventas.size();
        System.out.println("El promedio de sus ventas carros son: $"+promedio); 
 
    }
 
}
