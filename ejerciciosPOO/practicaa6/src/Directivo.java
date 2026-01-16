import java.util.List;

public class Directivo extends Empleado{

    private String categoria;

    private List<Empleado> subordinado;

    public Directivo(String nombre, int edad, int sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Empleado> getSubordinado() {
        return subordinado;
    }

    public void setSubordinado(List<Empleado> subordinado) {
        this.subordinado = subordinado;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                ", subordinado=" + subordinado +
                '}';
    }
}
