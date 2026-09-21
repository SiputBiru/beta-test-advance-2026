public class Chart {

    private static int SPEED = 10000;

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void sleep() {
        try {
            Thread.sleep(SPEED);
        } catch (InterruptedException e) {
            System.out.println("The sleep was interrupted.");
        }
    }

    public static void render(int[] data, int maxBarWidth) {
        render(data, -1, null, maxBarWidth);
    }

    public static void render(int[] data, int pointTo, int maxBarWidth) {
        render(data, pointTo, null, maxBarWidth);
    }

    public static void render(int[] data, int pointTo, String message, int maxBarWidth) {
        if (data == null || data.length == 0) return;

        int maxVal = data[0];
        for (int val : data) {
            if (val > maxVal) maxVal = val;
        }

        clear();
        System.out.println();
        
        for (int i = 0; i < data.length; i++) {
            int val = data[i];

            int barLength = (maxVal == 0) ? 0 : (int) Math.round((double) val / maxVal * maxBarWidth);
            String bar = "█".repeat(Math.max(0, barLength));
            
            String pointer = "";
            if (i == pointTo) {
                pointer = (message != null && !message.isEmpty()) 
                        ? " <--- " + message 
                        : " <---";
            }

            System.out.printf("| %-" + maxBarWidth + "s (%d)%s%n", bar, val, pointer);
        }

        sleep();
    }
}