package trabajo;

/**
 *
 * @author oscar
 */
public class Cliente {
    //Declaro el tipo de variables que se van a utilizar en la clase cliente 
    private int cedula;
    private String nombre;
    
    //Utilizo un metodo constructor para que inicialice un cliente 
    public Cliente (int cedula,String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    //Getter para la cedula 
    public int getCedula() {
        return cedula;
    }
    //Getter para el nombre
    public String getNombre() {
        return nombre;
    }
    //Metodo para imprimir los datos del cliente  
    public String toString() {
        return "Cedula: "+cedula+",Nombre"+nombre;
    }    
}
