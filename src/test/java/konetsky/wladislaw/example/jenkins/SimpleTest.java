package konetsky.wladislaw.example.jenkins;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SimpleTest {

    @Test
    public void testCase1() {
        assertEquals(3, 3);
    }

    @Test
    public void testCase2() {
        assertEquals("abc", "abc");
    }


}
