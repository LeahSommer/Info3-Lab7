package test;

import main.CodeStuff;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class BlackboxTest {

    @Test
    public void testAbsValue() {
        Assertions.assertEquals(2, CodeStuff.absoluteValueOf(-2));
        Assertions.assertEquals(1, CodeStuff.absoluteValueOf(-1));
        Assertions.assertEquals(0, CodeStuff.absoluteValueOf(0));
        Assertions.assertEquals(1, CodeStuff.absoluteValueOf(1));
        Assertions.assertEquals(2, CodeStuff.absoluteValueOf(2));
    }

    @Test
    public void test() {

    }

}