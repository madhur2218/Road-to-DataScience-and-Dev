public class Dog extends Animal{

    public Dog(String type, String size, double weight){
        super(type,size,weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(getExpliciteType()  + " walking");
        }
        else{
            System.out.println(type + " running");
        }
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.println("howling !!");
        }
        else{
            System.out.println("Woof!");
        }

    }

    public String getExpliciteType(){
        return getClass().getSimpleName() + "(" + type + ")";
    }
}
