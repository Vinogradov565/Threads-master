import java.util.concurrent.TimeUnit;

public class Loader {
    Runnable load = () -> {
        int procent = 0;
        while (procent <= 100) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
            System.out.println("loading data: " + (procent) + "%");
            procent = procent + 10;
        }
        result();
    };

    public void result() {
        System.out.println("Loading successful");
    }
}
