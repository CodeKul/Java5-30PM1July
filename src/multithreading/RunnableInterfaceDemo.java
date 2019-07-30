package multithreading;

public class RunnableInterfaceDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        RunnableInterfaceDemo demo = new RunnableInterfaceDemo();
        Thread t1 = new Thread(demo);
        Thread t2 = new Thread(demo);
        t1.start();
        t2.start();


      /*  Runnable t2= () -> {

        };
        t2.run();*/
    }

}
