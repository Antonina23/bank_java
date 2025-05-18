package finishtask4Test;

import finishtask4.Movie;
import finishtask4.Rating;
import finishtask4.InvalidRatingException;
import finishtask4.MovieService;

public class MovieServiceTest {
    public static void main(String[] args) {
        MovieService<Integer> movieService = new MovieService<>();

        Movie movie1 = new Movie("Hobbit", "Fairytail", 2000);
        Movie movie2 = new Movie("Minions", "Cartoon", 2005);

        try {
            movieService.addRating(movie1, new Rating<>(10));
            movieService.addRating(movie1, new Rating<>(8));
            movieService.addRating(movie2, new Rating<>(5));
            movieService.addRating(movie2, new Rating<>(9));

            movieService.addRating(movie2, new Rating<>(-9));
        } catch (InvalidRatingException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Average rating of Movie 1: " + movieService.getAveragerating(movie1));
        System.out.println("Average rating of Movie 2: " + movieService.getAveragerating(movie2));

        System.out.println("\nMovies by rating:");
        movieService.getMovieSortedByRating().forEach(
                movie -> System.out.println(movie + "-" + movieService.getAveragerating(movie)));
    }
}
