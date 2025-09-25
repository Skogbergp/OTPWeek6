import junit.framework.TestCase;

public class TimeCalTest extends TestCase {
    TimeCal tc = new TimeCal();

    public void testCalculateTime() {
        assertEquals(0.5,tc.calculateTime(1,2));
        assertEquals(1.0,tc.calculateTime(1,1));
    }
}