import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Loader loader = new Loader();
        Breakpointer breakpointer = new Breakpointer();

        Thread loaderThread = new Thread(loader.load);
        Thread breakThread = new Thread(breakpointer.breaker);

        loaderThread.start();
        breakThread.start();
        loaderThread.join();
    }
}

