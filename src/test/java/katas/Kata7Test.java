package katas;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata7Test {

    @Test
    public void testExecute() {
        List<Map<String, ?>> result = Kata7.execute();
        assertThat(result.size(), equalTo(4));
        assertThat(result.get(0).get("id"), equalTo(70111470));
        assertThat(result.get(0).get("title"), equalTo("Die Hard"));
        assertThat(result.get(0).get("boxart"), equalTo("http://cdn-0.nflximg.com/images/2891/DieHard150.jpg"));
        assertThat(result.get(1).get("id"), equalTo(654356453));
        assertThat(result.get(1).get("title"), equalTo("Bad Boys"));
        assertThat(result.get(1).get("boxart"), equalTo("http://cdn-0.nflximg.com/images/2891/BadBoys200.jpg"));
        assertThat(result.get(2).get("id"), equalTo(65432445));
        assertThat(result.get(2).get("title"), equalTo("The Chamber"));
        assertThat(result.get(2).get("boxart"), equalTo("http://cdn-0.nflximg.com/images/2891/TheChamber150.jpg"));
        assertThat(result.get(3).get("id"), equalTo(675465));
        assertThat(result.get(3).get("title"), equalTo("Fracture"));
        assertThat(result.get(3).get("boxart"), equalTo("http://cdn-0.nflximg.com/images/2891/Fracture200.jpg"));
    }
}
