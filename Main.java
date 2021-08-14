public class Main {
        public static void main(String[] args) {
            // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
            System.getProperties().list(System.out);
            // https://stackoverflow.com/a/31547504
            System.out.println(System.getProperty("os.name"));
        }
}