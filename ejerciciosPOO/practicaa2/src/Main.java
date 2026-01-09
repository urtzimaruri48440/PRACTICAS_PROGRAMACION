

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Cuantos alumnos desea ingresar?");
        int cantidadAlumnos = Integer.parseInt(sc.nextLine());
        Datos_alumnos[] alumnos = new Datos_alumnos[cantidadAlumnos];

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Ingrese el nombre del alumno " + (i + 1) + ":");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el telefono del alumno " + (i + 1) + ":");
            int telefono = sc.nextInt();
            System.out.println("Ingrese el domicilio del alumno " + (i + 1) + ":");
            String domicilio = sc.nextLine();
            System.out.println("Ingrese el codigo del alumno " + (i + 1) + ":");
            String codigo = sc.nextLine();

            alumnos[i] = new Datos_alumnos(nombre, codigo, domicilio, telefono);
        }

        System.out.println("Ingrese el codigo del alumno a buscar:");
        String codigoBuscar = sc.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < cantidadAlumnos; i++) {
            if (alumnos[i].getCodigo().equals(codigoBuscar)) {
                System.out.println("Alumno encontrado:");
                System.out.println("Nombre: " + alumnos[i].getNombre());
                System.out.println("Telefono: " + alumnos[i].getTelefono());
                System.out.println("Domicilio: " + alumnos[i].getDomicilio());
                System.out.println("Codigo: " + alumnos[i].getCodigo());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Alumno no encontrado.");
        }
    }
}


