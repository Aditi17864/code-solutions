class Runnablethread1 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Thread coming");
        }
    }
}

class Runnablethread2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println("Bullet jaraha hai");
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        Runnablethread1 bullet1 = new Runnablethread1();
        Thread gun1 = new Thread(bullet1);

        Runnablethread2 bullet2 = new Runnablethread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
