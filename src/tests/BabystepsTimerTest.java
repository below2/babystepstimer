import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class BabystepsTimerTest {

    @Test
    public void testGetRemainingTimeCaption() {
        // Create instances of BabystepsTimer and call the method, then assert the expected results.
        long elapsedTime = 60000L; // 60 seconds
        String result = BabystepsTimer.getRemainingTimeCaption(elapsedTime);
        assertEquals("01:00", result);
    }

    // Add more test methods to cover various parts of the BabystepsTimer class.
}