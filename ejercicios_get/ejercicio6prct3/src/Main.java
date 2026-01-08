import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static String [] animales = {"perro", "gato", "loro", "conejo", "tortuga"};
    private static ArrayList <String> listaAnimalesRescatados = new ArrayList<>();
    private static HashMap <String, String> cuidadorAnimal = new HashMap<>();
    private static Queue <String> colaEsperaAdopcion = new LinkedList();
    public static void main(String[] args) {
        menuOpciones();
    }

    public static void menuOpciones() {
        System.out.println("a) Ver especies aceptadas\n" +
                "    b) Agregar un nuevo animal al listado de rescatados.\n" +
                "    c) Asignar un cuidador a un animal.\n" +
                "    d) Pasar un animal a la cola de espera de adopcion. ´\n" +
                "    e) Adoptar un animal.\n" +
                "    f) Lista todos los animales y sus cuidadores actuales.\n" +
                "    g) Salir");

        char opcion = sc.nextLine().charAt(0);

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
                pasarAColaDeEspera();
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
        System.out.println("Especies aceptadas:");
        for (String animal : animales) {
            System.out.println("- " + animal);
        }
        System.out.println("Quieres realizar otra operacion? (s/n)");
        char respuesta = sc.nextLine().charAt(0);
        if (respuesta == 's' || respuesta == 'S'){
            menuOpciones();
        } else {
            System.out.println("Saliendo del programa...");
        }
    }
    public static void agregarAnimal(){
        System.out.println("Ingrese el animal a agregar:");
        String nuevoAnimal = sc.nextLine();
        listaAnimalesRescatados.add(nuevoAnimal);
        System.out.println("Animal agregado a la lista de animales rescatados: " + nuevoAnimal);
        System.out.println("Quieres realizar otra operacion? (s/n)");
        char respuesta = sc.nextLine().charAt(0);
        if (respuesta == 's' || respuesta == 'S'){
            menuOpciones();
        } else {
            System.out.println("Saliendo del programa...");
        }
    }
    public static void asignarCuidador(){
        System.out.println("Cuidador a asignar:");
        String cuidador = sc.nextLine();
        System.out.println("Animal a cuidar:");
        String animal = sc.nextLine();
        cuidadorAnimal.put(animal, cuidador);
        System.out.println("Quieres realizar otra operacion? (s/n)");
        char respuesta = sc.nextLine().charAt(0);
        if (respuesta == 's' || respuesta == 'S'){
            menuOpciones();
        } else {
            System.out.println("Saliendo del programa...");
        }
    }
    public static void pasarAColaDeEspera(){
        System.out.println("Ingrese la especie del animal a pasar a la cola de espera de adopcion:");
        String especie = sc.next();
        if(listaAnimalesRescatados.contains(especie)){
            colaEsperaAdopcion.add(especie);
            System.out.println("Animal pasado a la cola de espera de adopcion.");
        } else {
            System.out.println("El animal no se encuentra en el listado de rescatados.");
        }
        menuOpciones();
    }

    public static void adoptarAnimal(){
        System.out.println("Ingrese la especie del animal a adoptar:");
        String especie = sc.next();
        if(colaEsperaAdopcion.contains(animales)){
            colaEsperaAdopcion.remove(animales);
            listaAnimalesRescatados.remove(animales);
            cuidadorAnimal.remove(animales);
            System.out.println("Animal adoptado con exito.");
        } else {
            System.out.println("El animal no se encuentra en la cola de espera de adopcion.");
        }
        System.out.println("Quieres realizar otra operacion? (s/n)");
        char respuesta = sc.nextLine().charAt(0);
        if (respuesta == 's' || respuesta == 'S'){
            menuOpciones();
        } else {
            System.out.println("Saliendo del programa...");
        }
    }
    public static void listarAnimalesYCuidadores(){
        System.out.println("Animales y sus cuidadores actuales:");
        for (String animal : cuidadorAnimal.keySet()) {
            System.out.println("Animal: " + animal + ", Cuidador: " + cuidadorAnimal.get(animal));
        }
        System.out.println("Quieres realizar otra operacion? (s/n)");
        char respuesta = sc.nextLine().charAt(0);
        if (respuesta == 's' || respuesta == 'S'){
            menuOpciones();
        } else {
            System.out.println("Saliendo del programa...");
        }
    }
}