import javax.swing.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Stack < String > pilaLibros = new Stack <> ();
    public static void main(String[] args) {
        mostrarMenu();
    }
    public static void mostrarMenu() {

        System.out.println("MENU DE OPCIONES\n" +
                "a)Anadir un libro a la pila\n" +
                "b)Consultar el libro en la parte superior\n" +
                "c)Retirar el libro en la parte superior\n" +
                "d)Mostrar todos los libros de la pila\n" +
                "e)Verificar si la pila esta vacia\n" +
                "f)Salir");

        switch (sc.next().charAt(0)) {
            case 'a':
                añadirLibro();
                break;
            case 'b':
                consultarLibroParteSuperior();
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
        try {
            System.out.println("Ingrese el nombre del libro: ");
            sc.nextLine();
            String nombreLibro = sc.nextLine();
            pilaLibros.push(nombreLibro);
            System.out.println("El libro " + nombreLibro + " ha sido añadido a la pila ");
            System.out.println("Quiere añadir otro libro? (s/n)");
            char respuesta = sc.next().charAt(0);
            if (respuesta == 's' || respuesta == 'S') {
                añadirLibro();
            } else {
                System.out.println("Regresando al menu principal...");
                mostrarMenu();
            }
            if (pilaLibros.isEmpty()) {
                throw new Exception("La pila esta vacia");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void consultarLibroParteSuperior() {

        if (pilaLibros.isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("El libro en la parte superior es: " + pilaLibros.peek());
        }
        System.out.println("Quiere continuar? (s/n)");
        char respuesta = sc.next().charAt(0);
        if (respuesta == 's' || respuesta == 'S') {
        mostrarMenu();
        } else {
            System.out.println("Regresando al menu principal...");
            System.out.println("Ingrese la opcion f para salir");
            mostrarMenu();
        }

    }
    public static void retirarLibro() {
        if (pilaLibros.isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("El libro " + pilaLibros.pop() + " ha sido retirado de la pila");
        }
        System.out.println("Quiere continuar? (s/n)");
        char respuesta = sc.next().charAt(0);
        if (respuesta == 's' || respuesta == 'S') {
            mostrarMenu();
        } else {
            System.out.println("Regresando al menu principal...");
            System.out.println("Ingrese la opcion f para salir");
            mostrarMenu();
        }
    }
    public static void mostrarLibros() {
        if (pilaLibros.isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("Los libros en la pila son: ");
            for (String libro: pilaLibros) {
                System.out.println(libro);
            }
        }
        System.out.println("Quiere continuar? (s/n)");
        char respuesta = sc.next().charAt(0);
        if (respuesta == 's' || respuesta == 'S') {
            mostrarMenu();
        } else {
            System.out.println("Regresando al menu principal...");
            System.out.println("Ingrese la opcion f para salir");
            mostrarMenu();
        }
        sc.nextLine();
    }
    public static void verificarPilaVacia() {
        if (pilaLibros.isEmpty()) {
            System.out.println("La pila esta vacia");
        } else {
            System.out.println("La pila no esta vacia");
        }
        System.out.println("Quiere continuar? (s/n)");
        char respuesta = sc.next().charAt(0);
        if (respuesta == 's' || respuesta == 'S') {
            mostrarMenu();
        } else {
            System.out.println("Regresando al menu principal...");
            System.out.println("Ingrese la opcion f para salir");
            mostrarMenu();
        }
    }


}