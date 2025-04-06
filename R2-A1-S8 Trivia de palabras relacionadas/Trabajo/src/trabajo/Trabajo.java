package trabajo;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Trabajo {
    //Esta sera la clase en la que se ejecutara todo el programa 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaSimple listaSimple = new ListaSimple();//lista simple para insertar
        ListaDoble listaDoble = new ListaDoble();//lista doble para mostrar

        int opcion;
        //menu de opciones 
        do {
            System.out.println("\nMENU");
            System.out.println("1. Insertar cliente");
            System.out.println("2. Listar clientes hacia la derecha");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    //Insertar un clientre 
                    System.out.print("Ingrese la cedula del cliente: ");
                    int cedula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    
                    //Crear la nuevo cliente e insertarlo en la lista doble y mostrarlo
                    Cliente nuevoCliente = new Cliente(cedula, nombre);
                    listaSimple.InsertarOrdenado(nuevoCliente);
                    System.out.println("Cliente insertado correctamente.");
                    break;

                case 2:
                    //Converitir la lista simple a doble para mostrarla
                    listaDoble = new ListaDoble(); // reinicia la lista doble
                    NodoSimple actual = listaSimple.getCabeza();
                    while (actual != null) {
                        listaDoble.agregarAlFinal(actual.cliente);
                        actual = actual.siguiente;
                    }
                    //Mostrar la lista doble de izquierda a derecha 
                    System.out.println("\nClientes en orden:");
                    listaDoble.mostrarHaciaDerecha();
                    break;

                case 3:
                    
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 3);

        scanner.close();//Cerrar el Scanner
    }
}   
