
package proyecto_concesionario;
/**
 *
 * @author Jefferson Javier Avelar Arriaza
 */
public class tipo_empleado extends  inventario_Empleados 
{   
    // atributos de la clase hija tipo_empleado
    private String departamento;
    private double ventas_totales;
    // metodo constructor
    public tipo_empleado(String departamento, double ventas_totales) {
        this.departamento = departamento;
        this.ventas_totales = ventas_totales;
    }

    public String getDepartamento() {
        return departamento;         // metodo get para mostrar el departamento
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;            //Metodo set para obtener el departamento
    }

    public double getVentas_totales() {
        return ventas_totales;          //Metodo get para mostrar las ventas totales
    }

    public void setVentas_totales(double ventas_totales) { //metodo set para obtener ventas totales
        this.ventas_totales = ventas_totales;
    }
    // Invoca al metodo constructor de la clase padre inventario_Empleados
    public tipo_empleado(){
        super();
    } 
    //Creado por Jefferson Javier Avelar
    // Metodo para saber que tipo de empleado es comforme a la ventas que a realizado
    public void tipos_empleados ()
    {  
        
       double total=this.getVentas_totales();
       if (total>=50000){
            System.out.println("Empleado "+this.getNombre()+" tiene un Exelente volumen de ventas totales");
            
        } else if (total>=25000 && total<50000){
            
            System.out.println("Empleado "+this.getNombre()+" tiene un buen volumen de ventas totales");
        }else if (total>=1000 && total <25000){
          System.out.println("Empleado "+this.getNombre()+" esta en los limites de  de ventas totales requeridas");
        }else if(total>1&&total<1000){
            
           System.out.println("Empleado "+this.getNombre()+" ventas totales muy bajas nesesita vender mas "); 
        }else{
            System.out.println("Empleado "+this.getNombre()+" no tiene ventas");
        } 
    }
    //Creado por Jefferson Javier Avelar
    //Metodo para el sueldo por el departamento el cual se encuentra el trabajador
    public void sueldo_por_departamento()
    {
        double Sueldo_A_Pagar=this.getSueldo();
        String departamentos=getDepartamento();

        double total=this.getVentas_totales();
     if("Ventas".equals(departamentos))
     {
        Sueldo_A_Pagar=600*(total*0.05) ;
        this.setSueldo(Sueldo_A_Pagar);
        System.out.println("El empleado "+this.getNombre()+"  "+this.getApellido()+" cobrara un sueldo de $"+this.getSueldo());
     }else if("Cobros".equals(departamentos))
     {
        Sueldo_A_Pagar=600 ;
        this.setSueldo(Sueldo_A_Pagar);
        System.out.println("El empleado "+this.getNombre()+"  "+this.getApellido()+" cobrara un sueldo de $"+this.getSueldo());
         
     }
        
    }
    
    
}
