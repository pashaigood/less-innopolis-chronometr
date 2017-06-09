package less.android;

class Timer extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                sleep(1000);
                tick();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized void tick() {
        notifyAll();
    }
}