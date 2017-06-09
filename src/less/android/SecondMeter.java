package less.android;

class SecondMeter extends Thread {
    private final Timer timer;
    private int timesCount = 0;
    private final int times;
    private String name;

    SecondMeter(Timer timer, int seconds, String name) {
        this.timer = timer;
        this.times = seconds;
        this.name=name;
        start();
    }

    @Override
    public void run() {
        synchronized (timer) {
            try {
                while (true) {
                    timer.wait();
                    if (++timesCount == times) {
                        timesCount = 0;
                        System.out.println(name+ " " + times + " second(s)");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}