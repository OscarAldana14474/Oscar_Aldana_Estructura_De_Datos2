package trabajo;
/**
 *
 * @author oscar
 */
//Nodo doble que permite morverse hacia adelante o atras 
public class NodoDoble {
    Cliente cliente;
    NodoDoble siguiente;
    NodoDoble anterior;
    //metodo constructor que crea un nodo con un cliente 
    public NodoDoble (Cliente cliente){
        this.cliente = cliente;
        this.siguiente = null;
        this.anterior = null;
    }  
}
