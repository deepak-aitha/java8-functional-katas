package katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata2Test {

    @Test
    public void testExecute() {
        assertThat(Kata2.execute().size(), equalTo(2));
    }
}
