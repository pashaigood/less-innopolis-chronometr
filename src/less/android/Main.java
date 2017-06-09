package less.android;

public class Main {
    private static boolean isStoped = false;

    public static void main(String[] args) {
        Timer timer = new Timer();

        new SecondMeter(timer, 5, "a");
        new SecondMeter(timer, 7, "b");
        timer.start();
    }
}