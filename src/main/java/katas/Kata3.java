package katas;

import model.MovieList;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;

/**
 * Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids
 * (flatMap(c -> c.stream()))
 * DataSource: DataUtil.getMovieLists()
 * Output: List of Integers
 */
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return Arrays.asList(1, 2, 3);
    }
}
