public class ComputerCase extends Product{//IS-A ERLATIONSHIP WITH PRODUCT

    private String powerCase;


    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerCase) {
        super(model, manufacturer);
        this.powerCase = powerCase;
    }

    public void pressPowerButton(){
        System.out.println("Power button pressed !");
    }


}
