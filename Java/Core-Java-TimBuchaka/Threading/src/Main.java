import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());

//        currentThread.setName("thread madhur");
//        currentThread.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(currentThread);
//        printThredInformation(currentThread);

        CustomThread myCustomThread = new CustomThread();
        myCustomThread.start();

        for(int i=0;i<=5;i++){
            System.out.print("0");
            try{
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        Runnable myRunnable = () ->{
            for(int i=0;i<=5;i++){
                System.out.print("2");
            }
            try{
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread myThread = new Thread(myRunnable);
        myThread.start();



    }

    public static void printThredInformation(Thread thread){
        System.out.println("===================================");
        System.out.println("thread id is:"+ thread.getId());
        System.out.println("thread name is:"+ thread.getName());
        System.out.println("thread priority is: "+ thread.getPriority());
        System.out.println("thread state is: "+thread.getState());
        System.out.println("thread group:"+thread.getThreadGroup());
        System.out.println("thread alive:"+ thread.isAlive());
        System.out.println("===================================");

    }

}