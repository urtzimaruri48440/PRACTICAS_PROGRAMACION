public class Peliculas  {
    String titulo;
    int año;
    int duracion; // duracion en minutos
    String tipoGenero;

    public Peliculas(String titulo, int año, int duracion, String tipoGenero) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipoGenero = tipoGenero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public void setTipoGenero(String tipoGenero) {
        this.tipoGenero = tipoGenero;
    }
}





