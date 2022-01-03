package concurrency;

import java.util.Random;

public class RandomGenerator extends Thread {

    private Random rand ;

    public RandomGenerator(){
        rand = new Random();
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" generate: "+rand.nextInt(100));
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
