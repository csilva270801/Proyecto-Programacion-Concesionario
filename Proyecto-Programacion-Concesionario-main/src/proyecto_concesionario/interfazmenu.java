
package proyecto_concesionario;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jefferson Javier Avelar Arriaza 
 */
public class interfazmenu 
{    // asemos el vector el cual agarrara 6 datos
    int []vector = new int[6];
    // agarra la opción ingresada por el usuario
    int opcion;
    // Jefferson Javier Avelar Arriaza
    public void menu()
    {   
        JOptionPane.showMessageDialog(null,"Bienvenidos Al Concesionario El buen Vehiculo");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu\n\n1)-Ingresar\n2)-Mostrar\n3)-" + "Modificar\n4)-Eliminar\n5)-Salir"));
        
        switch(opcion)
        {
            case 1:
                insertar(); // inicializa el metodo insertar
            break;
            
            case 2:
                mostrar(); // inicializa el metodo mostrar
            break;
            
            case 3:
                modificar();// inicializa el metodo modificar
            break;
            
            case 4:
                
            break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "Adios gracias por\n usar el programa");
            break;
            
            default:
                JOptionPane.showMessageDialog(null, "No se eligio ninguna\n opcion anterior");
            break;
        }

    }
    // Creado por César Eduardo Silva Colocho
    // metodo para insertar datos 
    public void insertar(){
        for(int i=0; i < 6; i++){
            vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresar valor en venta["+i+"]"));
        }
        menu();
    }
    //metodo para mostrar los datos del vector
    public void mostrar(){
        JOptionPane.showMessageDialog(null, "El valor en venta[0] = " + vector[0] + ""
                + "\nEl valor en venta[1] = " + vector[1] + "\nEl valor en venta[2] = " + vector[2] 
                + "\nEl valor en venta[3] = " + vector[3]+ "\nEl valor en venta[4] = " + vector[4]+ "\nEl valor en venta[5] = " + vector[5]+ "\nEl valor en venta[6] = " + vector[6]);
                // se iran guardando los 6 datos ingresados por el usuario
        
        menu(); // iniciamos el menu
    }
    // metodo para modificar los datos del vector
    public void modificar(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Posicion a modificar: "));
        
        if(opcion > 6){
            JOptionPane.showMessageDialog(null, "Esa posicion no existe\n Ingrese una posicion correcta");
            modificar();
        }
        else{
            vector[opcion] = Integer.parseInt(JOptionPane.showInputDialog("Nuevo valor en venta["+opcion+"]"));
            menu();
        }
    }
    // metodo para eliminar los datos del vector
    public void eliminar(){
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Posicion a eliminar: "));
        
        if(opcion >= 4){
            JOptionPane.showMessageDialog(null, "Esa posicion no existe\n Ingrese una posicion correcta");
            eliminar();
        }
        else{
            vector[opcion] = 0;
            JOptionPane.showMessageDialog(null, "Se elimino el vector["+opcion+"]");
            menu();
        }
    }
   
}
