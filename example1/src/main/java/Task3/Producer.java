package Task3;

public class Producer implements Runnable{
    private Gen gen;

    public Producer(Gen gen) {
        this.gen = gen;
    }

    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            gen.put();
        }
    }
}
