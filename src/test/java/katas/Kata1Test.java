package katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata1Test {

    @Test
    public void testExecute() {
        assertThat(Kata1.execute().size(), equalTo(4));
    }
}
