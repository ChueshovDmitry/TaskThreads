package Task1;

/**
Необходимо создать новый поток и воспроизвести все его состояния, выведя их в консоль.
Необходимые состояния:
- NEW,
- RUNNABLE,
- BLOCKED,
- WAITING,
- TIMED_WAITING,
- TERMINATED;
 */

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Thr());
        Thread threadTwo = new Thread(new Thr());

        System.out.println(threadOne.getState());
        threadOne.start();
        threadTwo.start();
        System.out.println(threadOne.getState());
        threadOne.wait(20000);


        Thread.sleep(1000);
        System.out.println(threadTwo.getState());

    }

}
class Thr implements Runnable{
    @Override
    public  void run() {
        commonResource();
    }

    public static synchronized void commonResource() {
        while (true) {

        }
    }

}

