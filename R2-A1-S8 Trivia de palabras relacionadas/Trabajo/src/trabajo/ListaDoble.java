package trabajo;
/**
 *
 * @author oscar
 */
//Lista doble que permite el recorrido en ambos sentidos 
public class ListaDoble {
    private NodoDoble cabeza;
    //metodo constructor 
    public ListaDoble() {
        cabeza = null;
    }
    //agregar a un cliente al final de la lista doble 
    public void agregarAlFinal(Cliente cliente) {
        NodoDoble nuevo = new NodoDoble(cliente);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoDoble actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
            nuevo.anterior = actual;
        }
    }
    //Muestra la lista desde el incio hasta el final 
    public void mostrarHaciaDerecha() {
        NodoDoble actual = cabeza;
        while (actual != null) {
            System.out.println(actual.cliente);
            actual = actual.siguiente;
        }
    }
}
