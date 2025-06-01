public class MotherBoard extends Product{//IS-A ERLATIONSHIP WITH PRODUCT

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public MotherBoard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgramme(String programmeName){
        System.out.println("Programme "+ programmeName+" is now loading!!");
    }


}
