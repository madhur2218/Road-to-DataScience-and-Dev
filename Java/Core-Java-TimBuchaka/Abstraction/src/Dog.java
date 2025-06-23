public class Dog extends Mammal{

    public Dog(String type, String size, int weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed == "slow"){
            System.out.println(getExplicitType()+ " walking !");
        }
        else{
            System.out.println(getExplicitType()+" fast walking !");
        }
    }

    @Override
    public void makeNoise() {
        if (type =="Wolf"){
            System.out.println("Howling !!");
        }
        else{
            System.out.println("Woof!!");
        }
    }

    @Override
    public void shedHair() {
        System.out.println("Shed hair all the time "+ getExplicitType());
    }

//    @Override
//    public String getExplicitType(){   //abstract class providing a concrete method
//        return getClass().getTypeName()+" ("+ type+ " )";
 //   }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
