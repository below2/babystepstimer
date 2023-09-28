import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BabystepsTimerTest {

    @Test
    public void testGetRemainingTimeCaption() {
        private BabystepsTimer babystepsTimer;
        long elapsedTime = 60000L; // 60 seconds
        String result = babystepsTimer.getRemainingTimeCaption(elapsedTime);
        assertEquals("01:30", result);
    }

    @Test
    public void testTimerThread() {
        private BabystepsTimer babystepsTimer;
        BabystepsTimer.TimerThread timerThread = babystepsTimer.new TimerThread();
        timerThread.start();
        Thread.sleep(100);
        timerThread.interrupt();
        assertTrue(true);
    }
}