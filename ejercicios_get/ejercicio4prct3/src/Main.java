import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static HashMap <String, Integer> telefono = new HashMap<>();
    public static void main(String[] args) {

        telefono.put("Juan", 123456789);
        telefono.put("Maria", 987654321);
        telefono.put("Pedro", 123456799);
        telefono.put("Jose", 977654321);
        telefono.put("Pepe", 987654821);
        telefono.put("Miguel", 987664321);
        mostrarAgenda();
    }
    public static void mostrarAgenda() {
        System.out.println("------AGENDA TELEFÓNICA------");
        for (String key : telefono.keySet()) {
            System.out.println("Nombre: " + key + " - Número: " + telefono.get(key));
        }
        menuOpciones();
    }

    public static void menuOpciones()  {
        int opcion;
        do {
            System.out.println("------MENU DE OPCIONES------");
            System.out.println("1. Agregar numero");
            System.out.println("2. Borrar numero");
            System.out.println("3. Buscar numero");
            System.out.println("4. Borrar numero por el nombre");
            System.out.println("5. Buscar numero por el nombre");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    agregarNumero();
                    break;
                case 2:
                    borraNumero();
                    break;
                case 3:
                    buscarNumero();
                    break;
                case 4:
                    borrarPorNombre();
                    break;
                case 5:
                    buscarPorNombre();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);


    }
    public static void agregarNumero() {
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el número de teléfono: ");
        Pattern pattern = Pattern.compile("^[0-9]{9}$");
        String numero = sc.nextLine();
        Matcher matcher = pattern.matcher(numero);
        if (matcher.matches()) {
            System.out.println("Número de teléfono valido.");
        } else {
            System.out.println("Número de teléfono invalido. Debe contener 9 dígitos.");
            return;
        }
        int numeroTelefono = Integer.parseInt(numero);
        telefono.put(nombre, numeroTelefono);
        System.out.println("Número agregado correctamente.");
        System.out.println("Numero telefono: " + telefono.get(nombre));
        System.out.println("Quieres agregar otro numero? (s/n)");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            agregarNumero();
        }else {
            System.out.println("Volviendo al menú principal...");
            menuOpciones();
        }
    }
    public static void borraNumero() {
        System.out.print("¿Qué número desea borrar?: ");
        int numeroBorrar = Integer.parseInt(sc.nextLine());
        if (telefono.containsKey(numeroBorrar)) {
            telefono.remove(numeroBorrar);
            System.out.println("Número borrado correctamente.");
            System.out.println("El numero de " + numeroBorrar + " ha sido eliminado.");
        } else {
            System.out.println("El numero no existe en la agenda.");
        }
        System.out.println("Quieres eliminar otro numero? (s/n)");
        String respuesta = sc.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            borraNumero();
        }else {
            System.out.println("Volviendo al menú principal...");
            menuOpciones();
        }
    }
    public static void buscarNumero() {
        if (telefono.isEmpty()) {
            System.out.println("La agenda está vacía.");
            return;
        }
        System.out.print("¿Qué número desea buscar?: ");
        int numeroBuscar = Integer.parseInt(sc.nextLine());
        for (String key : telefono.keySet()) {
            if (telefono.get(key) == numeroBuscar) {
                System.out.println("Número encontrado: " + key + " - " + telefono.get(key));
                return;
            }
        }
    }
    public static  void borrarPorNombre() {
        System.out.println("El numero que desea borrar de quien es?");
        String nombreBorrar = sc.nextLine();
        if (telefono.containsKey(nombreBorrar)) {
            telefono.remove(nombreBorrar);
            System.out.println("Número borrado correctamente.");
            System.out.println("El numero de " + nombreBorrar + " ha sido eliminado.");
        } else {
            System.out.println("El nombre no existe en la agenda.");
        }
    }
    public static void buscarPorNombre() {
        System.out.println("El numero que desea buscar de quien es?");
        String nombreBuscar = sc.nextLine();
        if (telefono.containsKey(nombreBuscar)) {
            System.out.println("Número encontrado: " + nombreBuscar + " - " + telefono.get(nombreBuscar));
        } else {
            System.out.println("El nombre no existe en la agenda.");
        }
    }

}