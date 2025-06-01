public class PersonalComputer extends Product{

    private MotherBoard motherBoard;
    private ComputerCase computerCase;
    private Monitor monitor;

    public PersonalComputer(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, MotherBoard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public void setComputerCase(ComputerCase computerCase) {
        this.computerCase = computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void powerUp(){
        computerCase.pressPowerButton();
    }

    public void drawLogo(){
        monitor.drawPixelAt(10,20,"red");
    }

    public void loadProgramme(String programme){
        motherBoard.loadProgramme("Windows OS");
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "computerCase=" + computerCase +
                ", motherBoard=" + motherBoard +
                ", monitor=" + monitor +
                "} " + super.toString();
    }
}
