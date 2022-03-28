
package proyecto_concesionario;


/**
 *
 * @author Jefferson Javier Avelar Arriza
 */
public class Motos extends Vehiculos 
{
    //atributos de la clase hija motos
    private double idmoto;
    private String tipocasco;
    private String tipomotor;
    private String CantidadHacientos;
    private double pesomaximo;
    
    // Metodo Constructor
    public Motos(double idmoto, String tipocasco, String tipomotor, String CantidadHacientos, double pesomaximo) {
        this.idmoto = idmoto;
        this.tipocasco = tipocasco;
        this.tipomotor = tipomotor;
        this.CantidadHacientos = CantidadHacientos;
        this.pesomaximo = 400;
    }
    // Invoca al metodo constructor de la clase padre Vehiculos
    public Motos(){
        super("Deportiva","Kawasaki","roja","300",2021,50,2500,"Nuevo","Moto",40); 
    }
  // metodo emcapsulador
    public double getIdmoto() { //Metodo get para mostrar el idmoto
        return idmoto;         
    }

    public void setIdmoto(double idmoto) {
        this.idmoto = idmoto;             //metodo set para obtener el idmoto
    }

    public String getTipocasco() {
        return tipocasco;          //metodo get para mostrar el tipo de casco
    }

    public void setTipocasco(String tipocasco) {
        this.tipocasco = tipocasco;           // metodo set para obtener el tipo casco
    } 

    public String getTipomotor() {
        return tipomotor;              // metodo get para mostrar el tipo de motor
    }

    public void setTipomotor(String tipomotor) {
        this.tipomotor = tipomotor;          // metodo set para obtener el tipo de motor
    }

    public String getCantidadHacientos() { // metodo get para mostrar cantidad de hacientos
        return CantidadHacientos;
    }

    public void setCantidadHacientos(String CantidadHacientos) {
        this.CantidadHacientos = CantidadHacientos;  //metodo set para obtener la cantidad de hacientos
    }

    public double getPesomaximo() {
        return pesomaximo;           // metodo para mostrar el peso maximo
    }

    public void setPesomaximo(double pesomaximo) {
        this.pesomaximo = pesomaximo;            //metodo para obtener el peso maximo
    }
    
    private double pesomaximo_moto;
    public void pesomaximo_moto()
    {
        double pesoporocupantes=140;
        double pesoequipaje=30;
        pesomaximo_moto=pesoporocupantes+pesoequipaje;
        if(pesomaximo_moto<=this.getPesomaximo())
        {
            System.out.println("El peso ejercido en la "+this.getTipovehiculo()+" esta el los limites establecidos");
            
        }else{
            System.out.println("El peso ejercido en la "+this.getTipovehiculo()+" No esta en los limites que son de "+this.getPesomaximo()+"KG");
        }
    }
    public void tipomoto()
    {
        if("Deportiva".equals(this.getModelo())){
            System.out.println("Este tipo "+this.getModelo()+" tiene funciones a mejor y más rápida aceleración, el mejor y más veloz paso por curva, la mayor estabilidad, la mejor frenada y la mayor agilidad y cuentan con un motor "+this.getTipomotor());
        }else if("Todo Terreno".equals(this.getModelo())){
          System.out.println("Este tipo "+this.getModelo()+"  tiene una mejor tracción y mejores amortiguadores para poder andar en la mas montañas y en cualquier tipo de terreno y cuenta con un motor de  "+this.getTipomotor());  
        }else if("Estandar".equals(this.getModelo())){
            System.out.println("Este tipo "+this.getModelo()+"  son las motos Normales y son para andar en la ciudad o en el pueblo se caracterisan por su bajo costo $ "+this.getPrecio()+" comparandose a las anteriores y cuenta con un motor de  "+this.getTipomotor());
        }

    }
     
    
}
