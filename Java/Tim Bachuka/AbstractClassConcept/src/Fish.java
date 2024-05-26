 public class Fish extends Animal{
     public Fish(String type, String size, int weight) {
         super(type, size, weight);
     }

     @Override
    public void move(String speed) {
         if(speed == "slow"){
             System.out.println("i swim slow");
         }
         else{
             System.out.println("i swim fast");
         }

    }
    @Override
    public void makeNose() {
         if(type == "GoldFish"){
             System.out.println("swishhh");
         }
         else{
             System.out.println("woshh");
         }
    }
}
