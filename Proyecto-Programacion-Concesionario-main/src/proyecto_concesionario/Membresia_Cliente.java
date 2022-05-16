package proyecto_concesionario;

/**
 *
 * @author cescl
 */
public class Membresia_Cliente extends inventario_Cliente {
    
    //Atributos de clase hija inventario_Cliente
    private String membresia_Gold;
    private String membresia_Platinum;
    private String membresia_Bronze;
    private int frecuencia_Compras;
    private int expiracion;
    
    //Metodo constructor 

    public Membresia_Cliente(String membresia_Gold, String membresia_Platinum, String membresia_Bronze, int frecuencia_Compras, int expiracion) {
        this.membresia_Gold = membresia_Gold;
        this.membresia_Platinum = membresia_Platinum;
        this.membresia_Bronze = membresia_Bronze;
        this.frecuencia_Compras = frecuencia_Compras;
        this.expiracion = 100;
    }
    
    //Metodo super
        public Membresia_Cliente()
    {
        super("Juan","Gomez","juangomez01@gmail.com","908769","22/02/2022",5,"Credito",23456782,100000);
    }
    
    //Metodos Get y Set

    public String getMembresia_Gold() {
        return membresia_Gold;
    }

    public void setMembresia_Gold(String membresia_Gold) {
        this.membresia_Gold = membresia_Gold;
    }

    public String getMembresia_Platinum() {
        return membresia_Platinum;
    }

    public void setMembresia_Platinum(String membresia_Platinum) {
        this.membresia_Platinum = membresia_Platinum;
    }

    public String getMembresia_Bronze() {
        return membresia_Bronze;
    }

    public void setMembresia_Bronze(String membresia_Bronze) {
        this.membresia_Bronze = membresia_Bronze;
    }

    public int getFrecuencia_Compras() {
        return frecuencia_Compras;
    }

    public void setFrecuencia_Compras(int frecuencia_Compras) {
        this.frecuencia_Compras = frecuencia_Compras;
    }

    public int getExpiracion() {
        return expiracion;
    }

    public void setExpiracion(int expiracion) {
        this.expiracion = expiracion;
    }
    
    
    
    public void membresia()    
            
    {
      int frecuencia_Compras = this.getFrecuencia_Compras();
      
      if(frecuencia_Compras >= 25000 && frecuencia_Compras <= 49999)
      {     
        System.out.println("Usted "+this.getNombres()+" "+this.getApellidos()+"con DUI"+this.getDui()+"y correo"+this.getCorreo()+"por sus compras de"+this.getFrecuencia_Compras()+"ah logrado obtener: "+this.membresia_Bronze+" la cual contiene muchos Benenficios!");
      }
      
      else if(frecuencia_Compras >= 50000 && frecuencia_Compras <= 74999)     
      {
        System.out.println("Usted "+this.getNombres()+" "+this.getApellidos()+"con DUI"+this.getDui()+"y correo"+this.getCorreo()+"por sus compras de"+this.getFrecuencia_Compras()+"ah logrado obtener: "+this.membresia_Platinum+" la cual contiene muchos Benenficios!");         
      }
      
      else if(frecuencia_Compras >= 75000)
      {
        System.out.println("Usted "+this.getNombres()+" "+this.getApellidos()+"con DUI"+this.getDui()+"y correo"+this.getCorreo()+"por sus compras de"+this.getFrecuencia_Compras()+"ah logrado obtener: "+this.membresia_Gold+" la cual contiene muchos Benenficios!");
      }
      
    } 
    
    public void perdida()
    {
        int expiracion = this.getExpiracion();
        
        if(frecuencia_Compras < expiracion){
            System.out.println("Usted "+this.getNombres()+" "+this.getApellidos()+"con DUI"+this.getDui()+"y correo"+this.getCorreo()+"por sus bajos ingresos, lastimosamente ah perdido su membresia");
        }
    }
    @Override
    public void tipocliente (int _vehivulos_Comprados)
    {
        int vehiculos= _vehivulos_Comprados;
        if(vehiculos <= 3 && vehiculos  > 4)
      {     
        System.out.println("por sus compras de"+this.getVehivulos_Comprados()+"ah logrado obtener: "+this.membresia_Gold+" la cual contiene muchos Benenficios!");
      }
      
      else if(vehiculos >= 2 && vehiculos <= 3)     
      {
        System.out.println("por sus compras de"+this.getVehivulos_Comprados()+"ah logrado obtener: "+this.membresia_Platinum+" la cual contiene muchos Benenficios!");         
      }
      
      else if(vehiculos == 1)
      {
        System.out.println("por sus compras de"+this.getVehivulos_Comprados()+"ah logrado obtener: "+this.membresia_Bronze+" la cual contiene muchos Benenficios!");
      }
        System.out.println("es un tipo de cliente ");
        
    }
    @Override
    public void imprimircliente()
    {
        
        System.out.println("Frecuencia de compras: "+frecuencia_Compras+"Expiracion: "+expiracion);
    }
}
