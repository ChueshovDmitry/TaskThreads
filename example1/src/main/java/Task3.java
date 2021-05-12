import java.util.ArrayList;
import java.util.Random;

/**
 * Написать программу, содержащую два потока – производитель и потребитель.
 * Производитель будет генерировать рандомные числа. Потребитель потреблять их.
 * Два потока разделяют общий буфер данных, размер которого ограничен. Если буфер пуст,
 * потребитель должен ждать, пока там появятся данные. Если буфер заполнен полностью,
 * производитель должен ждать, пока потребитель заберёт данные и место освободится.
 */
public class Task3 {
    public static void main(String[] args) {

    Thread thread = new Thread(new Buffer());
    thread.start();

    }
}


class Buffer implements Runnable {


    @Override
    public void run() {

    }
}

