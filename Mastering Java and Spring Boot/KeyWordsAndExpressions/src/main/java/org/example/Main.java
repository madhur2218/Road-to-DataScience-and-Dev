package org.example;

public class Main {
    public static void main(String[] args) {
        double kilometers = (1231*100);

        int highscore=100;

        if(highscore>25){
            highscore= highscore+10;
        }

        int health=100;

        if(health<25 && highscore>100){
            highscore=highscore-50;
        }

    }
}