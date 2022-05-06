package concurrency;

public class ProducerConsumerEx3 {

    public static void main(String[] args) throws InterruptedException {

        Producer producer = new Producer();
        Consumer consumer = new Consumer();

        Runnable produceTask = () -> {
            for (int i = 0; i < 50; i++) {
                try {
                    producer.safeProduce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Done producing...");
        };

        Runnable consumeTask = () -> {
            for (int i = 0; i < 50; i++) {
                try {
                    consumer.safeConsume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Done consuming...");
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
