public class App {
        public String getGreeting() {
            return "Application runs, now with automated building on Git push";
        }

        public static void main(String[] args) {
            System.out.println(new App().getGreeting());
        }
}
