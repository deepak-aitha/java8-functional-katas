package katas;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata8Test {

    @Test
    public void testExecute() {
        List<Map<String, ?>> maps = Kata8.execute();
        assertThat(maps.size(), equalTo(3));
        assertThat(maps.get(0).get("videoId"), equalTo(70111470));
        assertThat(maps.get(0).get("bookmarkId"), equalTo(470));
        assertThat(maps.get(1).get("videoId"), equalTo(654356453));
        assertThat(maps.get(1).get("bookmarkId"), equalTo(453));
        assertThat(maps.get(2).get("videoId"), equalTo(65432445));
        assertThat(maps.get(2).get("bookmarkId"), equalTo(445));
    }
}
