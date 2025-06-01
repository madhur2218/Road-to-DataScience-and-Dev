public class MotherBoard extends Product {
    private int ramSlot;
    private int cardSlot;
    private String bios;

    public MotherBoard(String model, String manufacturer){
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlot, int cardSlot, String bios) {
        super(model, manufacturer);
        this.ramSlot = ramSlot;
        this.cardSlot = cardSlot;
        this.bios = bios;
    }

    public void loadProgramme(String programmeName){
        System.out.println("loading programme "+ programmeName);
    }

    @Override
    public String toString() {
        return "MotherBoard{" +
                "bios='" + bios + '\'' +
                ", ramSlot=" + ramSlot +
                ", cardSlot=" + cardSlot +
                "} " + super.toString();
    }
}
