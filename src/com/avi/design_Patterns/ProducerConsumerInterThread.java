
class Utility {
    int num;
   boolean valueset;
    public void put(int num) throws InterruptedException {

        while(valueset){

            wait();
        }
        System.out.println("put" + num);
        valueset=true;
        this.num = num;
        notify();
    }

    public void get() throws InterruptedException {

        while(!valueset){

            wait();
        }

        System.out.println("Get" + num);
        valueset=false;
        notify();
    }

}


class Consumer implements Runnable {
    Utility utility;

    public Consumer(Utility u) {
        this.utility = u;
        Thread thread = new Thread(this, "Consumer");
        thread.start();

    }

    @Override
    public void run() {
        try {
            utility.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


class Producer implements Runnable {
    Utility utility;

    public Producer(Utility u) {
        this.utility = u;
        Thread thread = new Thread(this, "Producer");
        thread.start();

    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                utility.put(i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class ProducerConsumerInterThread {
    public static void main(String[] args) {
        Utility utility = new Utility();
        new Producer(utility);
        new Consumer(utility);
    }
}
