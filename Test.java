class A extends Thread {
    public void run() {
        System.out.println("Thread A Running...");
    }
}

class B extends Thread {
    public void run() {
        System.out.println("Thread B Running...");
    }
}

class Test {
    public static void main(String args[]) {
        A t1 = new A();
        B t2 = new B();

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
