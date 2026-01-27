import java.util.ArrayList;
import java.util.List;

public class Clientes extends Persona {

    private List<Mascota> mascotas;

    public Clientes(String nombre, String direccion, String telefono) {
        super(nombre, direccion, telefono);
        this.mascotas = new ArrayList<>();
    }

    public List<Mascota> getMascotas() { return mascotas; }
    public void setMascotas(List<Mascota> mascotas) { this.mascotas = mascotas; }

    public void añadirMascota(Mascota m) {
        mascotas.add(m);
        m.setCliente(this);
    }
}
