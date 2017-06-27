package be.vdab.FilmCollection;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class FindFilm {
    public static void main (String [] args){

        List<Film> film = readFilmsFromCSV("/Users/kathleendevos/Downloads/starters/films.txt");
        Scanner s = new Scanner(System.in);

        System.out.println(FindfilmbyID());
        }


        public static Film FindfilmbyID(){
        List<Film> films = readFilmsFromCSV("/Users/kathleendevos/Downloads/starters/films.txt");
        for (int i = 0; i < films.size(); i++) {
            Film film = films.get(i);
            int ID = 148;
            if (ID == film.film_id) {
                return film;
            }
            }

            return null;
        }

    private static List<Film> readFilmsFromCSV(String fileName) {
        List<Film> films = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Film film = createfilm(attributes);
                films.add(film);
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();

        }

        return films;
    }

    private static Film createfilm(String[] metadata) {
        int id = Integer.parseInt(metadata[0]);
        String title = metadata[1];
        String description = metadata[2];
        int releaseYear = Integer.parseInt(metadata[3]);
        int length = Integer.parseInt(metadata[4]);
        String genre = metadata[5];
        return new Film(id, title, description, releaseYear, length, genre);
    }

}
