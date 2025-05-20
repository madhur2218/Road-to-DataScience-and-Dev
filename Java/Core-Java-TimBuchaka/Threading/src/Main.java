//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var currentThread = Thread.currentThread();
        System.out.println(currentThread.getClass().getName());
        System.out.println(currentThread);
        getThreadInformation(currentThread);
    }

    public static void getThreadInformation(Thread thread){
        System.out.println("===================================");
        System.out.println(thread.threadId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.isAlive());
        System.out.println("===================================");

    }
}