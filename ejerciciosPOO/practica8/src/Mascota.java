public class Mascota {

    private String nombre;
    private String tipo;
    private String raza;
    private int peso;
    private String fechaNacimiento;
    private String sexo;
    private int longitud;
    private String tipoPelo;

    private Clientes cliente;
    private Veterinario veterinario;

    public Mascota(String nombre, String tipo, String raza, int peso,
                   String fechaNacimiento, String sexo, int longitud, String tipoPelo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.longitud = longitud;
        this.tipoPelo = tipoPelo;
    }

    // ---------- GETTERS Y SETTERS ----------
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getRaza() { return raza; }
    public void setRaza(String raza) { this.raza = raza; }

    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }

    public int getLongitud() { return longitud; }
    public void setLongitud(int longitud) { this.longitud = longitud; }

    public String getTipoPelo() { return tipoPelo; }
    public void setTipoPelo(String tipoPelo) { this.tipoPelo = tipoPelo; }

    public Clientes getCliente() { return cliente; }
    public void setCliente(Clientes cliente) { this.cliente = cliente; }

    public Veterinario getVeterinario() { return veterinario; }
    public void setVeterinario(Veterinario veterinario) { this.veterinario = veterinario; }
}
