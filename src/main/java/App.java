public class App {
        public String getGreeting() {
            return "Application runs";
        }

        public static void main(String[] args) {
            System.out.println(new App().getGreeting());
        }
}
