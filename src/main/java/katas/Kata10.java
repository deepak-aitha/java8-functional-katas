package katas;

import com.google.common.collect.ImmutableMap;
import util.DataUtil;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
    Goal: Create a datastructure from the given data:

    We have 2 arrays each containing lists, and videos respectively.
    Each video has a listId field indicating its parent list.
    We want to build an array of list objects, each with a name and a videos array.
    The videos array will contain the video's id and title.
    In other words we want to build the following structure:

    [
        {
            "name": "New Releases",
            "videos": [
                {
                    "id": 65432445,
                    "title": "The Chamber"
                },
                {
                    "id": 675465,
                    "title": "Fracture"
                }
            ]
        },
        {
            "name": "Thrillers",
            "videos": [
                {
                    "id": 70111470,
                    "title": "Die Hard"
                },
                {
                    "id": 654356453,
                    "title": "Bad Boys"
                }
            ]
        }
    ]

    DataSource: DataUtil.getLists(), DataUtil.getVideos()
    Output: the given datastructure
*/
public class Kata10 {
    public static List<Map<String, ?>> execute() {
        List<Map<String, ?>> lists = DataUtil.getLists();
        List<Map<String, ?>> videos = DataUtil.getVideos();

        return Arrays.asList(
                ImmutableMap.of("name", "someName", "videos",
                        Arrays.asList(
                                ImmutableMap.of("id", 5, "title", "The Chamber"),
                                ImmutableMap.of("id", 3, "title", "Fracture")
                        )));
    }
}
