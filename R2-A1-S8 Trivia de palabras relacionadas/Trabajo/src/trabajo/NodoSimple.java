package trabajo;

/**
 *
 * @author oscar
 */
//Este nodo ayudara a almacenar el cliente y referenciar al siguiente
public class NodoSimple {
    Cliente cliente;
    NodoSimple siguiente;
    //Utilizo el metodo constructor para crear el nodo con un cliente 
    public NodoSimple(Cliente cliente){
        this.cliente = cliente;
        this.siguiente = null;
    }
    
}
