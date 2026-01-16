public class Cliente extends Persona {

    private int telefono;

    public Cliente(String nombre, int edad, int telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "telefono=" + telefono +
                '}';
    }
}
