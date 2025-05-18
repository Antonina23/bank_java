package finishtask4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieService <T extends  Number>{
    private Map<Movie, List<Rating<T>>> ratings;

    public MovieService() {
        this.ratings = new HashMap<>();
    }

    public synchronized void addRating(Movie movie, Rating<T> rating) {
        if(rating.getValue().doubleValue() < 1 || rating.getValue().doubleValue() > 10) {
            throw new InvalidRatingException("Rating should be from 1 to 10");
        }

        ratings.putIfAbsent(movie, new ArrayList<>());
        ratings.get(movie).add(rating);
    }

    public double getAveragerating(Movie movie) {
        List<Rating<T>> movieRating = ratings.get(movie);
        if (movieRating == null || movieRating.isEmpty()) {
            return 0.0;
        }
        return movieRating.stream()
                .mapToDouble(r -> r.getValue().doubleValue())
                .average()
                .orElse(0.0);
    }

    public List<Movie> getMovieSortedByRating() {
        return ratings.keySet().stream()
                .sorted((m1, m2) -> Double.compare(
                        getAveragerating(m2),
                        getAveragerating(m1)
                ))
                .collect(Collectors.toList());
    }
}
