
public class Main {
    public static void main(String[] args) {

        Estudios [] estudios = new Estudios[3];
        estudios[0] = new Estudios("Estudio A", "Ciudad A", "Direccion A", "www.estudioa.com", "2000-01-01", "Pais A", 123456789);
        estudios[1] = new Estudios("Estudio B", "Ciudad B", "Direccion B", "www.estudiob.com", "2005-05-05", "Pais B", 987654321);
        estudios[2] = new Estudios("Estudio C", "Ciudad C", "Direccion C", "www.estudioc.com", "2010-10-10", "Pais C", 555555555);

        Peliculas [] peliculas = new Peliculas[5];
        peliculas[0] = new Peliculas("Estudio A", "Ciudad A", "Direccion A", "www.estudioa.com", "2000-01-01", "Pais A", 123456789, "Pelicula 1", 2010, 120, "Accion");
        peliculas[1] = new Peliculas("Estudio B", "Ciudad B", "Direccion B", "www.estudiob.com", "2005-05-05", "Pais B", 987654321, "Pelicula 2", 2012, 150, "Comedia");
        peliculas[2] = new Peliculas("Estudio A", "Ciudad A", "Direccion A", "www.estudioa.com", "2000-01-01", "Pais A", 123456789, "Pelicula 3", 2015, 90, "Drama");
        peliculas[3] = new Peliculas("Estudio C", "Ciudad C", "Direccion C", "www.estudioc.com", "2010-10-10", "Pais C", 555555555, "Pelicula 4", 2018, 180, "Ciencia Ficcion");
        peliculas[4] = new Peliculas("Estudio B", "Ciudad B", "Direccion B", "www.estudiob.com", "2005-05-05", "Pais B", 987654321, "Pelicula 5", 2020, 110, "Terror");


        Peliculas peliculaMasLarga = peliculas[0];
        for (Peliculas pelicula : peliculas) {
            if (pelicula.getDuracion() > peliculaMasLarga.getDuracion()) {
                peliculaMasLarga = pelicula;
            }
        }

        System.out.println("La pelicula mas larga es: " + peliculaMasLarga.getTitulo() + " con una duracion de " + peliculaMasLarga.getDuracion() + " minutos.");
        System.out.println("Producida en el estudio: " + peliculaMasLarga.getNombre());

        int [] conteoPeliculas = new int[estudios.length];
        for (Peliculas pelicula : peliculas) {
            for (int i = 0; i < estudios.length; i++) {
                if (pelicula.getNombre().equals(estudios[i].getNombre())) {
                    conteoPeliculas[i]++;
                }
            }
        }

        int maxPeliculas = conteoPeliculas[0];
        int indiceEstudioMax = 0;
        for (int i = 1; i < conteoPeliculas.length; i++) {
            if (conteoPeliculas[i] > maxPeliculas) {
                maxPeliculas = conteoPeliculas[i];
                indiceEstudioMax = i;
            }
        }
        System.out.println("El estudio que mas peliculas ha producido es: " + estudios[indiceEstudioMax].getNombre() + " con " + maxPeliculas + " peliculas.");









    }
}