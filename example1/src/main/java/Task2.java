import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Создать 2 потока, которые будут по очереди выводить свое имя в консоль.
 */


public class Task2 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Thread thread = new Thread(new ThreadName());

        try {
            for (int i = 0; i <10 ; i++) {
                executorService.submit(thread);
            }
        } finally {
            executorService.shutdown();
        }

    }
}

class ThreadName implements Runnable{

    public synchronized void outName(){
            System.out.println(Thread.currentThread().getName());
        try {
            Thread.currentThread().notify();
            Thread.currentThread().wait();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        outName();
    }
}



