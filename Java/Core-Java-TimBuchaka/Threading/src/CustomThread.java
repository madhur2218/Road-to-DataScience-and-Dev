public class CustomThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.print("1");
            try{
                Thread.sleep(1500    );  //adding 1 second delay between each count
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
