
package proyecto_concesionario;

/**
 *
 * @author Jefferson Javier Avelar Arriaza
 */
public class Informacion_personal_Empleado extends inventario_Empleados
{ 
    //Atributos de la clase hija Informacion_personal_Empleado
    private double Peso;
    private double estatura;
    private String domicilio;
    private double distancia_casa_trabajo;
    private String estado;
    //Metodo constructor 
    public Informacion_personal_Empleado(double Peso, double estatura, String domicilio, double distancia_casa_trabajo, String estado) {
        this.Peso = Peso;
        this.estatura = estatura;
        this.domicilio = domicilio;
        this.distancia_casa_trabajo = distancia_casa_trabajo;
        this.estado = estado;
    }
    //Metodo emcapsulador
    public Informacion_personal_Empleado()
    {
        super();
    }
    
    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public double getDistancia_casa_trabajo() {
        return distancia_casa_trabajo;
    }

    public void setDistancia_casa_trabajo(double distancia_casa_trabajo) {
        this.distancia_casa_trabajo = distancia_casa_trabajo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // Metodo para saber la categoria de edad
    public void categoria_por_edad()
    {
        int edad=this.getEdad();
        String nombre=this.getNombre();
        String apellido=this.getApellido();
        
        if(edad>18&&edad<=26) {
            System.out.println("El trabajador "+nombre+" "+apellido+" Se encuentra en la Categoria de juventud");
        }else if(edad>26&&edad<=59){
            System.out.println("El trabajador "+nombre+" "+apellido+" Se encuentra en la Categoria de Adultez");
        }else if(edad>59&&edad<65){
            System.out.println("El trabajador "+nombre+" "+apellido+" Se encuentra en la Categoria de Persona Mayor de edad ");
        }
        
    }
    //Metodo para saber el peso optimo
    public void peso_optimo()
    {
        double altura=getEstatura();
        double peso=getPeso();
        double pesooptimo;
        pesooptimo=altura*(peso*peso);
    }
    
}
