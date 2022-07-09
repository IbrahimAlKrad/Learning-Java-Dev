public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel:0;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (0 <= tonerAmount && tonerAmount <= 100) {
            tonerLevel = (tonerAmount + tonerLevel > 100) ? -1 : tonerLevel + tonerAmount;
        }
        return tonerLevel;
    }

    //ToDo
    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.duplex) {

            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public boolean getPagesPrinted() {
        return pagesPrinted;
    }
}
