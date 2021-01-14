package katas;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

public class Kata3Test {

    @Test
    public void testExecute() {
        List<Integer> ids = Kata3.execute();

        assertThat(ids.size(), equalTo(4));
        assertThat(ids, containsInAnyOrder(70111470, 654356453, 65432445, 675465));
    }
}
