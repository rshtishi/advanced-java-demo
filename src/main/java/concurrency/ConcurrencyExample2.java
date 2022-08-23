package concurrency;

public class ConcurrencyExample2 {

    public static void main(String[] args){

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    if(i<5){
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Thread: "+Thread.currentThread().getName()+", count:"+i);
                }
            }
        });

        thread1.start();


    }
}
