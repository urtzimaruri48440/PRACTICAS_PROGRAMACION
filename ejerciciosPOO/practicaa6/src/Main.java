import java.lang.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        ArrayList <Empleado> empleadoJefe = new ArrayList<>();

        Empleado emp1 = new Empleado("Buesa", 30, 2500);
        Empleado emp2 = new Empleado("Ana", 28, 3000);
        Empleado emp3 = new Empleado("Luis", 35, 2800);

        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleadoJefe.add(emp2);
        Directivo dir1 = new Directivo("Jorge", 45, 5000, "Gerente");
        dir1.setSubordinado(empleadoJefe);
        empleados.add(dir1);

        System.out.println("Empleados:");
        System.out.println("-----------------------");

        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Sueldo Bruto: " + empleado.getSueldoBruto());
            empleado.calcularSalario();
            if (empleado instanceof Directivo) {
                Directivo directivo = (Directivo) empleado;
                System.out.println("Categoria: " + directivo.getCategoria());
                System.out.println("Subordinados: ");
                for (Empleado sub : directivo.getSubordinado()) {
                    System.out.println(" - " + sub.getNombre());
                }
            }
            System.out.println("-----------------------");
        }



        ArrayList<Cliente> clientes = new ArrayList<>();

        Cliente cli1 = new Cliente("Carlos", 40, 123898945);
        Cliente cli2 = new Cliente("Marta", 32, 678998780);
        clientes.add(cli1);
        clientes.add(cli2);

        System.out.println("Clientes:");
        System.out.println("-----------------------");

        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Edad: " + cliente.getEdad());
            System.out.println("Telefono: " + cliente.getTelefono());
            System.out.println("-----------------------");
        }

        ArrayList<Empresa> empresas = new ArrayList<>();

        Empresa empEmpresa = new Empresa("Tech Solutions", empleados, clientes);
        empresas.add(empEmpresa);

        for (Empresa empresa : empresas) {
            System.out.println("Nombre de la Empresa: " + empresa.getNombre());
            System.out.println("Cantidad de Empleados: " + empresa.getEmpleados().size());
            System.out.println("Cantidad de Clientes: " + empresa.getClientes().size());
            System.out.println("-----------------------");
        }





    }
}