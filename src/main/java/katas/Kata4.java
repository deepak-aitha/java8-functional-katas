package katas;

import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.MovieList;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Goal: Retrieve id, title, and a 150x200 box art url for every video
 * DataSource: DataUtil.getMovieLists()
 * Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
 */
public class Kata4 {

    public static List<Map<String, ?>> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return Arrays.asList(ImmutableMap.of("id", 5, "title", "Bad Boys", "boxart", new BoxArt(150, 200, "url")));
    }
}
