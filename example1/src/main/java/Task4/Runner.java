package Task4;

import java.util.Date;
import java.util.concurrent.*;

/**
 * Создать служебный поток, который будет каждые n секунд выводить системное время. n
 * задается через конструктор потока.
 */

public class Runner {
    public static void main(String[] args) {

        ScheduledExecutorService executorService  = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                System.out.println(date.toString());
            }
        },0,2, TimeUnit.SECONDS);

    }

}
