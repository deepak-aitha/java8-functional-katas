package katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata9Test {

    @Test
    public void testExecute() {
        assertThat(Kata9.execute().size(), equalTo(4));
    }
}
