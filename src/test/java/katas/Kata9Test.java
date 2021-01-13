package katas;

import model.BoxArt;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata9Test {

    @Test
    public void testExecute() {
        List<Map<String, ?>> mapList = Kata9.execute();

        assertThat(mapList.size(), equalTo(4));
        assertThat(mapList.get(0).get("id"), equalTo(70111470));
        assertThat(mapList.get(0).get("title"), equalTo("Die Hard"));
        assertThat(((BoxArt) mapList.get(0).get("url")).getUrl(), equalTo("http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"));
        assertThat(mapList.get(1).get("id"), equalTo(654356453));
        assertThat(mapList.get(1).get("title"), equalTo("Bad Boys"));
        assertThat(((BoxArt) mapList.get(1).get("url")).getUrl(), equalTo("http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg"));
        assertThat(mapList.get(2).get("id"), equalTo(65432445));
        assertThat(mapList.get(2).get("title"), equalTo("The Chamber"));
        assertThat(((BoxArt) mapList.get(2).get("url")).getUrl(), equalTo("http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"));
        assertThat(mapList.get(3).get("id"), equalTo(675465));
        assertThat(mapList.get(3).get("title"), equalTo("Fracture"));
        assertThat(((BoxArt) mapList.get(3).get("url")).getUrl(), equalTo("http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"));
    }
}
