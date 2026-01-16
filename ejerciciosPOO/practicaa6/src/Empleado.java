public class Empleado extends Persona {

    private int sueldoBruto;

    public Empleado(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "sueldoBruto=" + sueldoBruto +
                '}';
    }

    public void calcularSalario(){
        double sueldo_Neto = sueldoBruto - (sueldoBruto * 0.18);
        System.out.println("Sueldo Neto: " + sueldo_Neto);
    }
}
