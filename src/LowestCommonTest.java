import static org.junit.Assert.*;

@org.junit.runner.RunWith(org.junit.runners.JUnit4.class)
public class LowestCommonTest {

    @org.junit.Test
    public void testLowestCommon1() {
        assertEquals(-1, LowestCommon.lowestCommon(1, 2));
    }

    @org.junit.Test
    public void testLowestCommon2() {
        assertEquals(0, LowestCommon.lowestCommon(1, 3));
    }

    @org.junit.Test
    public void testLowestCommon3() {
        assertEquals(4, LowestCommon.lowestCommon(21, 18));
    }

    @org.junit.Test
    public void testLowestCommonInvalid() {
        try {
            LowestCommon.lowestCommon(-1, 2);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // pass
        }
    }
}