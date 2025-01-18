public class PersonalComputer extends Product{

    private Computercase computercase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String manufacturer, String model, Computercase computercase, Monitor monitor, Motherboard motherboard) {
        super(manufacturer, model);
        this.computercase = computercase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Computercase getComputercase() {
        return computercase;
    }

    public void setComputercase(Computercase computercase) {
        this.computercase = computercase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
