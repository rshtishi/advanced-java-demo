package concurrency;

public class ProducerConsumerEx1 {

    public static void main(String[] args) throws InterruptedException {

        Runnable produceTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    Producer.produce();
                }
                System.out.println("Done producing...");
            }
        };

        Runnable consumeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    Consumer.consume();
                }
                System.out.println("Done consuming...");
            }
        };

        Thread produceThread = new Thread(produceTask);
        Thread consumeThread = new Thread(consumeTask);
        produceThread.start();
        consumeThread.start();
        produceThread.join();
        consumeThread.join();

        System.out.println("Custom Buffer Index: "+CustomBuffer.index);

        for(int i=0;i<CustomBuffer.SIZE;i++){
            System.out.print(CustomBuffer.value(i));
        }
    }
}
