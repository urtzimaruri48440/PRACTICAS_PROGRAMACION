import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String [] animales = {"perro", "gato", "loro", "conejo", "tortuga"};
    public static void main(String[] args) {

    }

    public static void menuOpciones() {
        System.out.println("a) Ver especies aceptadas\n" +
                "    b) Agregar un nuevo animal al listado de rescatados.\n" +
                "    c) Asignar un cuidador a un animal.\n" +
                "    d) Pasar un animal a la cola de espera de adopcion. ´\n" +
                "    e) Adoptar un animal.\n" +
                "    f) Lista todos los animales y sus cuidadores actuales.\n" +
                "    g) Salir");

        int opcion = sc.nextInt();

        switch (opcion){
            case 'a':
                verEspecies();
                break;
            case 'b':
                agregarAnimal();
                break;
            case 'c':
                asignarCuidador();
                break;
            case 'd':
                pasarAColaEspera();
                break;
            case 'e':
                adoptarAnimal();
                break;
            case 'f':
                listarAnimalesYCuidadores();
                break;
            case 'g':
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }
    public static void verEspecies(){

    }
    public static void agregarAnimal(){

    }
    public static void asignarCuidador(){

    }
    public static void pasarAColaEspera(){

    }
    public static void adoptarAnimal(){

    }
    public static void listarAnimalesYCuidadores(){

    }
}