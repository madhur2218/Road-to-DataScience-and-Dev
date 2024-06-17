public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread starting");
        Thread th1 =new Thread1("firstThread");  //this user defined thread also runs with my main thread
        //thread1 is the child thread of main thread
       // th1.setDaemon(true);
        th1.start();

        Thread th2 = new Thread(new Thread2());
        th2.start();
        System.out.println("Main thread stopping");


    }
}