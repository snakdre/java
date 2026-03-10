package Classes;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel += tonerLevel;
        this.duplex = duplex;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }
    public int setTonerLevel(int tonerLevel) {
        this.tonerLevel += tonerLevel;
        return this.tonerLevel;
    }

    public int addToner(int tonerAmount){
        return (tonerAmount + getTonerLevel()) < 0 ? -1 : setTonerLevel(tonerAmount);
    }

    public void setPagesPrinted(int pagesPrinted) {
        if (pagesPrinted>0){
            this.pagesPrinted += pagesPrinted;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public int printPages(int pagesToBePrinted){
        if (pagesToBePrinted < 0){return -1;}
        else {
            if (isDuplex()) {
                setPagesPrinted(pagesToBePrinted / 2);
                return getPagesPrinted() / 2;
            } else {
                setPagesPrinted(pagesToBePrinted);
                return getPagesPrinted();
            }
        }
    }

    static void main() {
        Printer p1 = new Printer(1, true);
        Printer p2 = new Printer(10, false);
        Printer p3 = new Printer(100, true);
        Printer p4 = new Printer(1000, false);
        Printer p5 = new Printer(10000, true);
        Printer p6 = new Printer(100000, false);
        System.out.println("Toner level : " + p1.getTonerLevel() + " Pages Printed: " + p1.printPages(10000));
        System.out.println("Toner level : " + p2.getTonerLevel() + " Pages Printed: " + p2.printPages(10000));
        System.out.println("Toner level : " + p3.getTonerLevel() + " Pages Printed: " + p3.printPages(10000));
        System.out.println("Toner level : " + p4.getTonerLevel() + " Pages Printed: " + p4.printPages(10000));
        System.out.println("Toner level : " + p5.getTonerLevel() + " Pages Printed: " + p5.printPages(10000));
        System.out.println("Toner level : " + p6.getTonerLevel() + " Pages Printed: " + p6.printPages(10000));
        p1.addToner(10);
        p2.addToner(-100);
        p3.addToner(100);
        p4.addToner(-10);
        p5.addToner(-1000);
        p6.addToner(100000);
        System.out.println("------------------------");
        System.out.println("Toner level : " + p1.getTonerLevel() + " Pages Printed: " + p1.printPages(10000));
        System.out.println("Toner level : " + p2.getTonerLevel() + " Pages Printed: " + p2.printPages(10000));
        System.out.println("Toner level : " + p3.getTonerLevel() + " Pages Printed: " + p3.printPages(10000));
        System.out.println("Toner level : " + p4.getTonerLevel() + " Pages Printed: " + p4.printPages(10000));
        System.out.println("Toner level : " + p5.getTonerLevel() + " Pages Printed: " + p5.printPages(10000));
        System.out.println("Toner level : " + p6.getTonerLevel() + " Pages Printed: " + p6.printPages(10000));
        System.out.println("------------------------");
        p1.printPages(10);
        p2.printPages(-100);
        p3.printPages(100);
        p4.printPages(-10);
        p5.printPages(-1000);
        p6.printPages(100000);
        System.out.println("Toner level : " + p1.getTonerLevel() + " Pages Printed: " + p1.printPages(10000));
        System.out.println("Toner level : " + p2.getTonerLevel() + " Pages Printed: " + p2.printPages(10000));
        System.out.println("Toner level : " + p3.getTonerLevel() + " Pages Printed: " + p3.printPages(10000));
        System.out.println("Toner level : " + p4.getTonerLevel() + " Pages Printed: " + p4.printPages(10000));
        System.out.println("Toner level : " + p5.getTonerLevel() + " Pages Printed: " + p5.printPages(10000));
        System.out.println("Toner level : " + p6.getTonerLevel() + " Pages Printed: " + p6.printPages(10000));




    }
}
