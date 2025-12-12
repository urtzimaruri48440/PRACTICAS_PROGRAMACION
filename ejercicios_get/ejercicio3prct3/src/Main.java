import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Stack < String > pilaLibros = new Stack < > ();
    public static void main(String[] args) {
        pilaLibros.push("pila");

        System.out.println("MENU DE OPCIONES\n" +
                "a)Anadir un libro a la pila\n" +
                "b)Consultar el libro en la parte superior\n" +
                "c)Retirar el libro en la parte superior\n" +
                "d)Mostrar todos los libros de la pila\n" +
                "e)Verificar si la pila esta vacia\n" +
                "f)Salir");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 'a':
                añadirLibro();
                break;
            case 'b':
                consultarLibro();
                break;
            case 'c':
                retirarLibro();
                break;
            case 'd':
                mostrarLibros();
                break;
            case 'e':
                verificarPilaVacia();
                break;
            case 'f':
                System.out.println("Saliendo del programa......");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
    public static void añadirLibro() {
        System.out.println("Ingrese el nombre del libro: ");
        String libro = sc.nextLine();
        pilaLibros.push(libro);

    }
    public static void consultarLibro() {
    }
    public static void retirarLibro() {
    }
    public static void mostrarLibros() {
    }
    public static void verificarPilaVacia() {

    }


}