package be.vdab.FilmCollection;

/**
 * Created by kathleendevos on 27/06/17.
 */
public class Film {
    public int film_id;
    private String title;
    private String description;
    private int releaseYear;
    private int length;
    private String genre;

    public Film(int id, String title, String description, int releaseYear, int length, String genre) {
        this.film_id = id;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.length = length;
        this.genre = genre;
    }

    public Film() {

    }

    public int getId() {
        return film_id;
    }

    public void setId(int id) {
        this.film_id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", releaseYear=" + releaseYear +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }


    }

