import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test public void testAppHasGreeting() throws Exception {
        App testApp = new App();
        System.out.print("Start testAppHasGreeting");
        assertTrue("Values must be the same as the retrieved values 2", (testApp.getGreeting() == "Application runs, now with automated building on Git push"));

    }
}