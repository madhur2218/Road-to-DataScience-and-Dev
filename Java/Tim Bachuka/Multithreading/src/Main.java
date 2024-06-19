class Mythread implements Runnable{

    @Override
    public void run() {
        //Task
        for(int i=0;i<=10;i++){
            System.out.println("First thread " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class MyThread2 extends Thread{
    public void run(){
        for(int i=10;i>=0;i--){
            System.out.println("Another thread" +i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class UserThread extends Thread{
    public void run(){
        System.out.println("this is my user defined thread !");

    }
}



class Company{

    int n;
    synchronized public void produce_item(int n){
        this.n  = n;
        System.out.println("Produced " + this.n);

    }

    synchronized public int consume_item(){
        System.out.println("Consumed " + this.n);
        return this.n;
    }

}


class Producer extends Thread{
    Company c;
    Producer(Company c ){
        this.c = c;
    }

    public void run(){
        int i = 1;
        while(true){
            this.c.produce_item(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}

class Consumer extends Thread{

    Company c;
    Consumer(Company c ){
        this.c = c;
    }

    public void run(){
        while(true){
            this.c.consume_item();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //create object of above class
        Mythread t1 = new Mythread();
        Thread t = new Thread(t1);

        //creating object of Thread2
        MyThread2 t2 = new MyThread2();

//        t.start();
//        t2.start();


        System.out.println("Thread started");
        int x = 23+23;
        System.out.println("sum is " + x);
        //Thread name
        Thread th = Thread.currentThread();
        String threadName = th.getName();
        System.out.println("Current thread name is" + threadName);
        th.setName("Madhurs thread");
        System.out.println(th.getName());
        Thread.sleep(2000);
        System.out.println(th.getId());
        System.out.println("Thread ended");

        UserThread userThread= new UserThread();
        userThread.start();

        //Producer-Consumer Problem

        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();



    }
}