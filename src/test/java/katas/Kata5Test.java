package katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata5Test {

    @Test
    public void testExecute() {
        assertThat(Kata5.execute(), equalTo(5.0));
    }
}
