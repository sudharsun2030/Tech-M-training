public class Print {
    public static void print() {
        System.out.print("Initializing system setup...");
    }

    public void println() {
        System.out.println("Setup complete! Proceeding to the next phase.");
    }

    public void error() {
        System.err.print("Alert: Low disk space detected!");
    }