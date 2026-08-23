class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1 is running");
            System.out.println("I am Happy");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2 is running");
            System.out.println("I am happily happy");
        }
    }
}

public class ExampleThreads {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();  // IMPORTANT
        t2.start();  // IMPORTANT
    }
}
