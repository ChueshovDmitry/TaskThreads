package Task3;

import java.util.ArrayList;
import java.util.Random;



class Gen{

    private int capacityList;

    private ArrayList<Integer> arrayList;

    public Gen() {
        this.arrayList = new ArrayList<>();
    }

    public synchronized void put() {

        if (arrayList.size()>=10){
            try {
                System.out.println("producer ___________________________wait");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else if (arrayList.size() <= 0){
            System.out.println("producer ___________________________start");
            for (int i = 0; i < 10; i++) {
                arrayList.add(new Random().nextInt(100));
            }
            notify();
            System.out.println("producer______________________________end ");

        }
    }


    public synchronized void get(){
        if(arrayList.size()<=0){
            System.out.println("consumer ___________________________wait");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
                System.out.println("consumer ___________________________start");
                for (int i = 0; i < arrayList.size() ; i++) {
                    System.out.println(arrayList.get(i));
                }
                System.out.println("consumer___________________________ end");
                arrayList.clear();
                arrayList.trimToSize();
                notify();
        }

    }

}



