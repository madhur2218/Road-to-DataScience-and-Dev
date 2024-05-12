public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");

        ComputerCase cc1= new ComputerCase("2211", "dell", "2014");

        Monitor m1= new Monitor("27 INCH BEAST", "ACER",24, "1080PX");

        MotherBoard mb1 = new MotherBoard("BJ-200","Crucial", 3,4,5);

        PersonalComputer pc1 = new PersonalComputer("2211", "dell", cc1, m1, mb1);

//        pc1.getMonitor().drawPixelAt(2,2,"blue");
//
//        pc1.getMotherBoard().loadProgramme("mac os");
//
//        pc1.getComputerCase().pressPowerButton();

        pc1.powerUp();
    }
}