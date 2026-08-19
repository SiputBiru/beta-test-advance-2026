import java.io.IOException;

public class Main {
    static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        ProcessBuilder pb;

        try {
            if (os.contains("win")) {
                // Windows: Launches Command Prompt in a separate window (/c start)
                pb = new ProcessBuilder("cmd", "/c", "start", "cmd.exe");
            } else if (os.contains("mac")) {
                // macOS: Opens the native Terminal application
                pb = new ProcessBuilder("open", "-a", "Terminal");
            } else if (os.contains("nix") || os.contains("nux")) {
                // Linux: Attempts to use the system's default terminal emulator
                pb = new ProcessBuilder("x-terminal-emulator");
            } else {
                System.out.println("Unsupported operating system.");
                return;
            }

            // Spawn the window
            pb.start();
            System.out.println("Terminal window spawned successfully.");

        } catch (IOException e) {
            System.err.println("Failed to open terminal: " + e.getMessage());
        }
    }
}
