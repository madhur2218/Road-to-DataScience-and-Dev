public class Motherboard extends Product {

    private int ramSlot;
    private int cardSlot;
    private String bios;

    public Motherboard(String manufacturer, String model ){
        super(manufacturer,model);
    }

    public Motherboard(String manufacturer, String model, int cardSlot, int ramSlot,String bios) {
        super(manufacturer, model);
        this.cardSlot = cardSlot;
        this.ramSlot = ramSlot;
        this.bios = bios;
    }

    public void loadProgram(String programName){
        System.out.println("Programme "+ programName+ " startedf loadin...!");
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public int getCardSlot() {
        return cardSlot;
    }

    public void setCardSlot(int cardSlot) {
        this.cardSlot = cardSlot;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }
}
