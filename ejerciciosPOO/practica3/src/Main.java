import java.util.Scanner;

public class Main {
    private static Scanner leer = new Scanner(System.in);
 
    public static void main(String[] args) {
        System.out.println("Cuantas personas desea ingresar?");
        int cantidadPersonas = Integer.parseInt(leer.nextLine());
        Persona[] personas = new Persona[cantidadPersonas];
        try {
            for (int i = 0; i < cantidadPersonas; i++) {

                System.out.println("Ingrese el nombre de la persona " + (i + 1) + ":");
                String nombre = leer.nextLine();
                System.out.println("Ingrese la direccion de la persona " + (i + 1) + ":");
                String direccion = leer.nextLine();
                System.out.println("Ingrese el codigo postal de la persona " + (i + 1) + ":");
                String codigoPostal = leer.nextLine();
                System.out.println("Ingrese la ciudad de la persona " + (i + 1) + ":");
                String ciudad = leer.nextLine();
                System.out.println("Ingrese el dia de nacimiento de la persona " + (i + 1) + ":");
                int dNacimiento = Integer.parseInt(leer.nextLine());
                System.out.println("Ingrese el mes de nacimiento de la persona " + (i + 1) + ":");
                int mNacimiento = Integer.parseInt(leer.nextLine());
                System.out.println("Ingrese el año de nacimiento de la persona " + (i + 1) + ":");
                int aNacimiento = Integer.parseInt(leer.nextLine());

                personas[i] = new Persona(nombre, direccion, codigoPostal, ciudad, dNacimiento, aNacimiento, mNacimiento);

                if (nombre.isEmpty()) {
                    throw new Exception("El nombre no puede estar vacío.");
                }
                if (ciudad.isEmpty()) {
                    throw new Exception("La ciudad no puede estar vacía.");
                }
                if (codigoPostal.isEmpty()) {
                    throw new Exception("El código postal no puede estar vacío.");
                }
                if (direccion.isEmpty()) {
                    throw new Exception("La dirección no puede estar vacía.");
                }
                if (aNacimiento < 1900 || aNacimiento > 2026) {
                    throw new Exception("El año de nacimiento debe estar entre 1900 y 2026.");
                }
                if (mNacimiento > 1 || mNacimiento < 12) {
                    throw new Exception("El mes de nacimiento debe estar entre 1 y 12.");
                }
                if (dNacimiento > 1 || dNacimiento < 31) {
                    throw new Exception("El día de nacimiento debe estar entre 1 y 31.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        personaDeMayorEdad(personas);
        personaVivirenElche(personas, "Elche");
        personasMayoresDeEdad(personas);
    }


    public static void personaDeMayorEdad(Persona[] personas) {
        int mayorEdad = 0;
        String nombreMayorEdad = "";
        for (Persona persona : personas) {
            int edad = 2026 - persona.getaNacimiento();
            if (edad > mayorEdad) {
                mayorEdad = edad;
                nombreMayorEdad = persona.getNombre();
            }
        }
        System.out.println("La persona de mayor edad es " + nombreMayorEdad + " con " + mayorEdad + " años.");

    }

    public static void personaVivirenElche(Persona[] personas, String ciudad) {
        for (Persona persona : personas) {
            if (persona.getCiudad().equalsIgnoreCase("Elche")) {
                System.out.println(persona.getNombre() + " vive en " + ciudad + ".");
            }
        }
    }

    public static void personasMayoresDeEdad(Persona[] personas) {
        for (Persona persona : personas) {
            int edad = 2026 - persona.getaNacimiento();
            if (edad >= 18) {
                System.out.println(persona.getNombre() + " es mayor de edad con " + edad + " años.");
            }
        }
    }
}
