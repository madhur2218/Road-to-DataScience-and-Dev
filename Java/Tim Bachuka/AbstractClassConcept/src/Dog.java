 public class Dog extends Animal{
     public Dog(String type, String size, int weight) {
         super(type, size, weight);
     }

     @Override
    public void move(String speed) {

    }
    @Override
    public void makeNose() {
         if(type == "woof"){
             System.out.println("dog" + getClass().getTypeName()+type);
         }
         else{
             System.out.println("wolf" + getClass().getTypeName()+type);
         }
    }


}
