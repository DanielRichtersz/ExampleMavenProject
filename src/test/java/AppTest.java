import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test public void testAppHasGreeting() throws Exception {
        App testApp = new App();
        System.out.print("Start testAppHasGreeting");
        assertTrue("Values must be the same", (testApp.getGreeting() == "Application runs"));
    }
}
