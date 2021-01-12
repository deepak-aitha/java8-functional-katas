package katas;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata7Test {

    @Test
    public void testExecute() {
        assertThat(Kata7.execute().size(), equalTo(4));
        assertThat(Kata7.execute().get(0).get("id"), equalTo(70111470));
        assertThat(Kata7.execute().get(1).get("id"), equalTo(654356453));
        assertThat(Kata7.execute().get(2).get("id"), equalTo(65432445));
        assertThat(Kata7.execute().get(3).get("id"), equalTo(675465));
    }
}
