package trabajo;

/**
 *
 * @author oscar
 */
//Lista enlazada donde se insertan los clientes en orden por la cedula 
public class ListaSimple {
    private NodoSimple cabeza;
    //Metodo constructor que inicializa la cabeza en null
    public ListaSimple(){
        cabeza = null;
    }
    //Inserta un cliente en orden ascendente por su cedula 
    public void InsertarOrdenado (Cliente cliente){
        NodoSimple nuevo = new NodoSimple(cliente);
        //Si la lista esta vacia o el cliente va al inicio de la lista 
        if (cabeza == null || cliente.getCedula()<cabeza.cliente.getCedula()){
           nuevo.siguiente = cabeza;
           cabeza = nuevo;
        } else {
            //Buscar la posicion correcta en la lista 
            NodoSimple actual = cabeza;
            while (actual.siguiente != null && actual.siguiente.cliente.getCedula()<cliente.getCedula()){
                actual = actual.siguiente;
            }
            //insertar un nuevo nodo
            nuevo.siguiente=actual.siguiente;
            actual.siguiente=nuevo;
        }
    }
    //Vuelve al incio (la cabeza) de la lista para recorrerla 
public NodoSimple getCabeza(){
    return cabeza;
}   
}
