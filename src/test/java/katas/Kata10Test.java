package katas;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class Kata10Test {

    @Test
    public void testExecute() {
        List<Map<String, ?>> result = Kata10.execute();

        assertThat(result.get(0).get("name"), equalTo("New Releases"));
        List<Map<String, ?>> videos = (List<Map<String, ?>>) result.get(0).get("videos");
        assertThat(videos.size(), equalTo(2));
        assertThat(videos.get(0).size(), equalTo(2));
        assertThat(videos.get(0).get("id"), equalTo(65432445));
        assertThat(videos.get(0).get("title"), equalTo("The Chamber"));
        assertThat(videos.get(1).size(), equalTo(2));
        assertThat(videos.get(1).get("id"), equalTo(675465));
        assertThat(videos.get(1).get("title"), equalTo("Fracture"));

        assertThat(result.get(1).get("name"), equalTo("Thrillers"));
        videos = (List<Map<String, ?>>) result.get(1).get("videos");
        assertThat(videos.size(), equalTo(2));
        assertThat(videos.get(0).size(), equalTo(2));
        assertThat(videos.get(0).get("id"), equalTo(70111470));
        assertThat(videos.get(0).get("title"), equalTo("Die Hard"));
        assertThat(videos.get(1).size(), equalTo(2));
        assertThat(videos.get(1).get("id"), equalTo(654356453));
        assertThat(videos.get(1).get("title"), equalTo("Bad Boys"));
    }
}
