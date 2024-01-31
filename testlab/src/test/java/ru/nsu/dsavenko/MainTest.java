package ru.nsu.dsavenko;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    @Test
    public void testSum() {
        Assert.assertEquals(5, Main.sum(3, 2));
    }
}
