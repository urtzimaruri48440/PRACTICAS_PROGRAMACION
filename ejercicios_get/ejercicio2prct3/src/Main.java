import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Queue <String> fecha =  new LinkedList<>();
    private static Queue <String> nombre =  new LinkedList<>();
    public static void main(String[] args) {
        guardarFechaCaducidad();

    }
    public static void guardarFechaYNombreProducto(){
        System.out.println("Introduce la fecha de caducidad del producto (dd/mm/aaaa): ");
        String fechaCaducidad = sc.nextLine();
        fecha.add(fechaCaducidad);
        System.out.println("Introduce el nombre del producto: ");
        String nombreProducto = sc.nextLine();
        nombre.add(nombreProducto);

    }
    public static void guardarFechaCaducidad(){
        for (int i = 0; i < 4; i++) {
            guardarFechaYNombreProducto();
        }
        mostrarFechasYCaducidades();
    }
    public static void mostrarFechasYCaducidades() {
        try {
            System.out.println("Productos y sus fechas de caducidad:");
            while (!fecha.isEmpty() && !nombre.isEmpty()) {
                System.out.println("Producto: " + nombre.poll() + " - Fecha de caducidad: " + fecha.poll());
            }
            if(!fecha.isEmpty()){
                throw new Exception("No se puede mostrar fechas del producto");
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        solicitarFechaYEliminar();
    }
    public static void solicitarFechaYEliminar(){
        System.out.println("Introduce la fecha maxima de caducidad para eliminar productos (dd/mm/aaaa): ");
        String fechaMaxima = sc.nextLine();
        while (!fecha.isEmpty() && !nombre.isEmpty()) {
            String fechaProducto = fecha.peek();
            if (fechaProducto.compareTo(fechaMaxima) <= 0) {
                System.out.println("Eliminando producto: " + nombre.poll() + " con fecha de caducidad: " + fecha.poll());
            } else {
                break;
            }
        }
    }
}