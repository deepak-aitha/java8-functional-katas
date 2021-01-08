package katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata7Test {

    @Test
    public void testExecute() {
        assertThat(Kata7.execute(), equalTo(4));
    }
}
