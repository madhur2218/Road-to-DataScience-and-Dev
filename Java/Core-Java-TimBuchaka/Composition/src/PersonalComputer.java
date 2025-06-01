public class PersonalComputer extends Product{

    private ComputerCase computerCase;
    private MotherBoard motherBoard;
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


    private void drawLogo(){
        monitor.drawPixelAt(1200,50,"red");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();


    }    public ComputerCase getComputerCase() {
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
}
