package proyecto_concesionario;

/**
 *
 * @author cescl
 */
public class descuento_Cliente extends inventario_Cliente {
    
    //Atributos de la clase hija decuento_Cliente
    private String tipo_pago;
    private int descuento;
    private int cupones;

    
    //Metodo Constructor
    public descuento_Cliente(String tipo_pago, int descuento, int cupones) {
        this.tipo_pago = tipo_pago;
        this.descuento = descuento;
        this.cupones = cupones;
    }
    //Metodo Super
    public descuento_Cliente()
    {
        super("Pedro","Gonzalez","pedrogonzalez@gmail.com","0123478","27/03/2022",2,"Credito",119500,50000);
    }
    
    //Metodos Get y Set
    public String getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(String tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getCupones() {
        return cupones;
    }

    public void setCupones(int cupones) {
        this.cupones = cupones;
    }
    
    
    
    //Metodos
    public void Cupon()
    {
        String pago = this.getPago();
        int cupon = this.getCupones();
        if("Efectivo".equals(pago))
        {
            System.out.println("La persona"+this.getNombres()+ "  " + this.getApellidos()+", con el correo "+this.getCorreo()+ "y numero de DUI: "+this.getDui()+"ah pagago por el Vehiculo este ah sido realizado en: "+this.tipo_pago+"por ende no hay descuento alguno.");
        }
        else
        {
            cupon = 1;
            this.setCupones(cupon);
            System.out.println("La persona"+this.getNombres()+ "  " + this.getApellidos()+", con el correo "+this.getCorreo()+ "y numero de DUI: "+this.getDui()+"ah pagago por el Vehiculo este ah sido realizado en: " + this.tipo_pago + "por ende has ganado un " + this.getCupones()+ "del 25% de descuento en tu proxima compra!");
        }
    }
    
    public void compras()
    {
        int cant_compras = 0;
        if(cant_compras >= 1 && cant_compras <= 100)
        {
            switch(descuento)
            {
                case 1 -> {
                    if (cant_compras >= 2 && cant_compras <=4){
                        System.out.println("Felicidades! Por tus compras, has ganado un cupon del 50% en compras de accsesorios para vehiculos!");
                    }
                }
                case 2 -> {
                    if(cant_compras >= 5 && cant_compras <=7){
                        System.out.println("Felicidades! por tus compras, has ganado un cambio de rines para cualquier vehiculo!");
                    }
                }
                case 3 -> {
                    if(cant_compras >= 10){
                        System.out.println("Felicidades! por tus compras, has ganado un canjeable de $500 dolares en nuestra tienda!");
                    }
                }
            } 
        }
    }
    @Override
    public void imprimircliente()
    {
        
        System.out.println("Tipo de pago: "+tipo_pago+" "+"con un descuento: "+descuento+"Con cupones"+cupones);
    }
    
}

