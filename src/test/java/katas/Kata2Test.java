package katas;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;


public class Kata2Test {

    @Test
    public void testExecute() {
        List<Integer> ids = Kata2.execute();

        assertThat(ids.size(), equalTo(2));
        assertThat(ids, containsInAnyOrder(654356453, 675465));
    }
}
