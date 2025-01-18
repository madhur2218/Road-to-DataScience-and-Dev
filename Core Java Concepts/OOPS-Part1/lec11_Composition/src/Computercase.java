public class Computercase extends Product {

    private String powerSupply;

    public Computercase(String manufacturer, String model ){
        super(manufacturer,model);
    }

    public Computercase(String manufacturer, String model,String powerSupply ){
        super(manufacturer,model);
        this.powerSupply=powerSupply;
    }

    public void printPowerButton(){
        System.out.println("Power button pressed !");
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }
}