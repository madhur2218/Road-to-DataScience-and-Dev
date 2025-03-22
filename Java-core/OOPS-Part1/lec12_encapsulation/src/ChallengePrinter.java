public class ChallengePrinter {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public ChallengePrinter(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel>=0 && tonerLevel <= 100 ? tonerLevel : -1 );
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        int tempAmount = tonerLevel+tonerAmount;
        if(tempAmount>100 || tempAmount<100){
            return -1;
        }

        tonerLevel = tonerLevel+tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages){
        int jobPages = ((duplex) ? (pages/2) + (pages%2) : pages);
        pagesPrinted = pagesPrinted + jobPages;
        return jobPages;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }
}
