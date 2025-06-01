public class ComputerCase extends Product{
    private String powerCase;

    public ComputerCase(String model, String manufacturer, String powerCase) {
        super(model, manufacturer);
        this.powerCase = powerCase;
    }

    public void pressPowerButton(){
        System.out.println("Power button is pressed !!");
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "powerCase='" + powerCase + '\'' +
                "} " + super.toString();
    }
}
