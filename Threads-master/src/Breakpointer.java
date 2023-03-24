import java.util.concurrent.TimeUnit;

public class Breakpointer {
    int i = 0;
    Runnable breaker = () -> {
      while (i < 4) {
          try {
              TimeUnit.SECONDS.sleep(10);
          } catch (Exception e) {
              System.out.println("Interrupted");
          }
          System.out.println("BreakPoint Created");
          i++;
      }
    };
}
