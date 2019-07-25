package multithreading;

public class ThreadClassDemo extends Thread {

    public void run(){
        System.out.println("Inside run");
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadClassDemo demo=new ThreadClassDemo();
        ThreadClassDemo demo1=new ThreadClassDemo();

        demo.setName("Demo thread");
        demo1.setName("Demo1 thread");


        demo.start();//execute by thread
        sleep(1000);
        demo.join();
        System.out.println(demo.getName());//main thread
        demo.run();//execute by main thread
        demo1.start();
        sleep(500);
        demo1.join();
        System.out.println(demo1.getName());

    }

}
