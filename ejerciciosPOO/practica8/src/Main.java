import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Mascota> mascotas = new ArrayList<>();
    private static ArrayList<Clientes> clientes = new ArrayList<>();
    private static ArrayList<Veterinario> veterinarios = new ArrayList<>();

    public static void main(String[] args) {

        añadirCliente();
        añadirVeterinario();

        boolean salir = false;
        while (!salir) {
            salir = menuOpciones();
        }
    }

    public static boolean menuOpciones() {
        System.out.println("\n--- MENU ---");
        System.out.println("1. Añadir Mascota");
        System.out.println("2. Mostrar número de clientes por tipo de animal");
        System.out.println("3. Datos del cliente por nombre de mascota");
        System.out.println("4. Datos del veterinario por mascota");
        System.out.println("5. Mascotas de un cliente");
        System.out.println("6. Mascotas de un veterinario");
        System.out.println("7. Salir");

        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1 -> añadirMascota();
            case 2 -> mostrarNumeroClientesTipoAnimal();
            case 3 -> mostrarDatosClientePorNombreMascota();
            case 4 -> mostrarDatosVeterinarioPorDatosMascota();
            case 5 -> datosMascotasCliente();
            case 6 -> datosMascotasVeterinario();
            case 7 -> {
                System.out.println("Saliendo...");
                return true;
            }
            default -> System.out.println("Opción no válida.");
        }

        return false;
    }

    public static void añadirCliente() {
        System.out.println("Nombre del cliente:");
        String nombre = sc.nextLine();
        System.out.println("Dirección del cliente:");
        String direccion = sc.nextLine();
        System.out.println("Teléfono del cliente:");
        String telefono = sc.nextLine();

        Clientes cliente = new Clientes(nombre, direccion, telefono);
        clientes.add(cliente);
        System.out.println("Cliente añadido correctamente.");
    }

    public static void añadirVeterinario() {
        System.out.println("Nombre del veterinario:");
        String nombre = sc.nextLine();
        System.out.println("Dirección del veterinario:");
        String direccion = sc.nextLine();
        System.out.println("Teléfono del veterinario:");
        String telefono = sc.nextLine();
        System.out.println("DNI del veterinario:");
        String dni = sc.nextLine();
        System.out.println("Número de Seguridad Social:");
        String nss = sc.nextLine();

        Veterinario vet = new Veterinario(nombre, direccion, telefono, dni, nss);
        veterinarios.add(vet);
        System.out.println("Veterinario añadido correctamente.");
    }

    public static void añadirMascota() {
        System.out.println("Nombre de la mascota:");
        String nombre = sc.nextLine();
        System.out.println("Tipo (perro/gato):");
        String tipo = sc.nextLine();
        System.out.println("Raza:");
        String raza = sc.nextLine();
        System.out.println("Peso:");
        int peso = sc.nextInt();
        sc.nextLine();
        System.out.println("Fecha de nacimiento (dd/mm/aaaa):");
        String fecha = sc.nextLine();
        System.out.println("Sexo:");
        String sexo = sc.nextLine();
        System.out.println("Longitud (cm):");
        int longitud = sc.nextInt();
        sc.nextLine();
        System.out.println("Tipo de pelo:");
        String tipoPelo = sc.nextLine();

        System.out.println("Selecciona el cliente:");
        for (int i = 0; i < clientes.size(); i++)
            System.out.println(i + " - " + clientes.get(i).getNombre());
        int posCli = sc.nextInt();
        sc.nextLine();
        Clientes cliente = clientes.get(posCli);


        System.out.println("Selecciona el veterinario:");
        for (int i = 0; i < veterinarios.size(); i++)
            System.out.println(i + " - " + veterinarios.get(i).getNombre());
        int posVet = sc.nextInt();
        sc.nextLine();
        Veterinario vet = veterinarios.get(posVet);

        Mascota mascota = new Mascota(nombre, tipo, raza, peso, fecha, sexo, longitud, tipoPelo);

        cliente.añadirMascota(mascota);
        vet.añadirMascota(mascota);
        mascotas.add(mascota);

        System.out.println("Mascota añadida correctamente.");
    }

    public static void mostrarNumeroClientesTipoAnimal() {
        System.out.println("Introduce el tipo de animal:");
        String tipo = sc.nextLine();
        int contador = 0;
        for (Clientes c : clientes) {
            for (Mascota m : c.getMascotas()) {
                if (m.getTipo().equalsIgnoreCase(tipo)) {
                    contador++;
                    break;
                }
            }
        }
        System.out.println("Número de clientes con " + tipo + ": " + contador);
    }

    public static void mostrarDatosClientePorNombreMascota() {
        System.out.println("Introduce el nombre de la mascota:");
        String nombreMascota = sc.nextLine();
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(nombreMascota)) {
                Clientes c = m.getCliente();
                System.out.println("Cliente:");
                System.out.println("Nombre: " + c.getNombre());
                System.out.println("Dirección: " + c.getDireccion());
                System.out.println("Teléfono: " + c.getTelefono());
                return;
            }
        }
        System.out.println("Mascota no encontrada.");
    }

    public static void mostrarDatosVeterinarioPorDatosMascota() {
        System.out.println("Introduce el nombre de la mascota:");
        String nombreMascota = sc.nextLine();
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(nombreMascota)) {
                Veterinario v = m.getVeterinario();
                System.out.println("Veterinario:");
                System.out.println("Nombre: " + v.getNombre());
                System.out.println("Dirección: " + v.getDireccion());
                System.out.println("Teléfono: " + v.getTelefono());
                System.out.println("DNI: " + v.getDni());
                System.out.println("Nº Seguridad Social: " + v.getNumSeguridadSocial());
                return;
            }
        }
        System.out.println("Mascota no encontrada.");
    }

    public static void datosMascotasCliente() {
        System.out.println("Introduce el nombre del cliente:");
        String nombreCliente = sc.nextLine();
        for (Clientes c : clientes) {
            if (c.getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println("Mascotas de " + c.getNombre() + ":");
                for (Mascota m : c.getMascotas())
                    System.out.println("- " + m.getNombre() + " (" + m.getTipo() + ")");
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public static void datosMascotasVeterinario() {
        System.out.println("Introduce el nombre del veterinario:");
        String nombreVet = sc.nextLine();
        for (Veterinario v : veterinarios) {
            if (v.getNombre().equalsIgnoreCase(nombreVet)) {
                System.out.println("Mascotas atendidas por " + v.getNombre() + ":");
                for (Mascota m : v.getMascotas())
                    System.out.println("- " + m.getNombre() + " (" + m.getTipo() + ")");
                return;
            }
        }
        System.out.println("Veterinario no encontrado.");
    }
}