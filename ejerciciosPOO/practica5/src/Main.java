/*
Ejercicio dos
Al igual que en el ejercicio anterior tenemos las clases Pel´ıcula y
Estudio.
Relacion: Una pel ´ ´ıcula es producida por uno o mas estudios. Un es- ´
tudio produce muchas pel´ıculas.
En este segundo ejercicio tambien hay que mostrar el nombre del o ´
de los estudios en los que se ha producido la pel´ıcula mas larga y el ´
nombre del estudio que mas pel ´ ´ıculas ha producido.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Peliculas> listaPeliculas = new ArrayList<>();
        ArrayList<Estudios> listaEstudios = new ArrayList<>();


        Estudios estudio1 = new Estudios("Estudio A", "Ciudad A", "Direccion A", "www.estudioa.com", "2000-01-01", "Pais A", 123456789, "Pelicula 1, Pelicula 3, Plicula 4");
        Estudios estudio2 = new Estudios("Estudio B", "Ciudad B", "Direccion B", "www.estudiob.com", "2005-05-05", "Pais B", 987654321, "Pelicula 2, Pelicula 5");
        Estudios estudio3 = new Estudios("Estudio C", "Ciudad C", "Direccion C", "www.estudioc.com", "2010-10-10", "Pais C", 555555555, "Pelicula 6");
        listaEstudios.add(estudio1);
        listaEstudios.add(estudio2);
        listaEstudios.add(estudio3);

        Peliculas pelicula1 = new Peliculas("Pelicula 1", 2010, 120, "Accion");
        Peliculas pelicula2 = new Peliculas("Pelicula 2", 2012, 150, "Comedia");
        Peliculas pelicula3 = new Peliculas("Pelicula 3", 2015, 90, "Drama");
        Peliculas pelicula4 = new Peliculas("Pelicula 4", 2018, 180, "Ciencia Ficcion");
        Peliculas pelicula5 = new Peliculas("Pelicula 5", 2020, 110, "Terror");
        listaPeliculas.add(pelicula1);
        listaPeliculas.add(pelicula2);
        listaPeliculas.add(pelicula3);
        listaPeliculas.add(pelicula4);
        listaPeliculas.add(pelicula5);

        Peliculas peliculaMasLarga = null;
        for (Peliculas pelicula : listaPeliculas) {
            if (peliculaMasLarga == null || pelicula.getDuracion() > peliculaMasLarga.getDuracion()) {
                peliculaMasLarga = pelicula;
            }
        }
        System.out.println("La pelicula mas larga es: " + peliculaMasLarga.getTitulo() + " con una duracion de " + peliculaMasLarga.getDuracion() + " minutos.");
        System.out.print("Producida en el/los estudio(s): ");
        for (Estudios estudio : listaEstudios) {
            if (estudio.peliculasProducidas.contains(peliculaMasLarga.getTitulo())) {
                System.out.print(estudio.getNombre() + " ");
            }
        }
        System.out.println();
        int maxPeliculas = 0;
        String estudioMaxPeliculas = "";
        for (Estudios estudio : listaEstudios) {
            String[] peliculasArray = estudio.peliculasProducidas.split(", ");
            if (peliculasArray.length > maxPeliculas) {
                maxPeliculas = peliculasArray.length;
                estudioMaxPeliculas = estudio.getNombre();
            }
        }
        System.out.println("El estudio que mas peliculas ha producido es: " + estudioMaxPeliculas + " con " + maxPeliculas + " peliculas.");



    }
}
