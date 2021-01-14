package katas;

import model.Movie;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Goal: use map() to project an array of movies into an array of movie ids
 * DataSource: DataUtil.getMovies()
 * Output: List of Integers
 */
public class Kata0 {
    public static List<Integer> execute() {
        List<Movie> movies = DataUtil.getMovies();

        return Arrays.asList(123, 345, 567);
    }
}
