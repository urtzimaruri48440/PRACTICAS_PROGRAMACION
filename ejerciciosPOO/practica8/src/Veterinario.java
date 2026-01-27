import java.util.ArrayList;
import java.util.List;

public class Veterinario extends Persona {

    private String dni;
    private String numSeguridadSocial;
    private List<Mascota> mascotas;

    public Veterinario(String nombre, String direccion, String telefono, String dni, String numSeguridadSocial) {
        super(nombre, direccion, telefono);
        this.dni = dni;
        this.numSeguridadSocial = numSeguridadSocial;
        this.mascotas = new ArrayList<>();
    }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNumSeguridadSocial() { return numSeguridadSocial; }
    public void setNumSeguridadSocial(String numSeguridadSocial) { this.numSeguridadSocial = numSeguridadSocial; }

    public List<Mascota> getMascotas() { return mascotas; }
    public void setMascotas(List<Mascota> mascotas) { this.mascotas = mascotas; }

    public void añadirMascota(Mascota m) {
        mascotas.add(m);
        m.setVeterinario(this);
    }
}