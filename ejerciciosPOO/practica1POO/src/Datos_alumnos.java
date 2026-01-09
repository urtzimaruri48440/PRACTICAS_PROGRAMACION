public class Datos_alumnos {
    private String nombre;
    private String codigo;
    private String domicilio;
    private int telefono;

    public Datos_alumnos(String nombre, int telefono, String domicilio, String codigo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
