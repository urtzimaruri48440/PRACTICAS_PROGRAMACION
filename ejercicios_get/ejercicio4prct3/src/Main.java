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

        menuOpciones();
    }

    public static void menuOpciones()  {
        int opcion;
        do {
            System.out.println("------MENU DE OPCIONES------");
            System.out.println("1. Agregar numero");
            System.out.println("2. Buscar numero");
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
    }
    public static void borraNumero() {}
    public static void buscarNumero() {}
    public static  void borrarPorNombre() {}
    public static void buscarPorNombre() {}

}