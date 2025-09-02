import java.util.*;
import java.util.stream.*;

class Movie {
    private String title;
    private double rating;
    private int releaseYear;
    public Movie(String title, double rating, int releaseYear) {
        this.title = title; this.rating = rating; this.releaseYear = releaseYear;
    }
    public String getTitle() { return title; }
    public double getRating() { return rating; }
    public int getReleaseYear() { return releaseYear; }
    public String toString() { return title + " (" + releaseYear + ") - " + rating; }
}

public class TopMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.7, 2022),
            new Movie("Movie B", 9.0, 2023),
            new Movie("Movie C", 7.5, 2021),
            new Movie("Movie D", 9.2, 2023),
            new Movie("Movie E", 8.9, 2022),
            new Movie("Movie F", 9.1, 2023)
        );

        List<Movie> top5 = movies.stream()
            .sorted(Comparator.comparing(Movie::getRating).reversed()
                              .thenComparing(Movie::getReleaseYear).reversed())
            .limit(5)
            .collect(Collectors.toList());

        top5.forEach(System.out::println);
    }
}
