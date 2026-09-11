public class CheckOS {
    public static void main(String[] args) {
        System.out.println("Raw OS Name: " + System.getProperty("os.name"));
        System.out.println("OS Version: " + System.getProperty("os.version"));
        System.out.println("Architecture: " + System.getProperty("os.arch"));

    }
}
