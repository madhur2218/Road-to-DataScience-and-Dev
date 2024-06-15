package org.example;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {

        if(speed == "slow"){
            System.out.println(getExplicitType()+ " walking");
        }
        else
            System.out.println(getExplicitType() + " running");
    }

    @Override
    public void makeNoise() {

        if(type == "wolf"){   // we can directly use type here as it is protected
            System.out.println("howling");
        }
        else{
            System.out.println("woof");
        }
    }
}
