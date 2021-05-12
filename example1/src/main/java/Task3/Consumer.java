package Task3;

public class Consumer implements Runnable{
    private Gen gen;

    public Consumer(Gen gen) {
        this.gen = gen;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            gen.get();
        }
    }
}
