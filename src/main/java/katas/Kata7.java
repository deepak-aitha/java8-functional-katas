package katas;

import com.google.common.collect.ImmutableMap;
import model.MovieList;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Goal: Retrieve the id, title, and smallest box art url for every video
 * DataSource: DataUtil.getMovieLists()
 * Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": "url)
 */
public class Kata7 {
    public static List<Map<String, ?>> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return Arrays.asList(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", "url"));
    }
}
