public class MotherBoard extends Product {

    private int ramSlots;
    private int cardSlots;
    private int bios;
    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, int bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgramme(String programmeName){
        System.out.println("Pragramme" + programmeName + " is loading");
    }


}
