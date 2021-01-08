package katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata6Test {

    @Test
    public void testExecute() {
        assertThat(Kata6.execute(), equalTo("http://cdn-0.nflximg.com/images/2891/Fracture300.jpg"));
    }
}
