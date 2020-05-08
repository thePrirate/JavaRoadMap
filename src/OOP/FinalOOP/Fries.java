package OOP.FinalOOP;

public class Fries extends Hamburger {
    private String friesName;
    private double friesNamePrice1;
    private String friesName2;
    private double friesNamePrice2;

    public Fries(String friesName, double price) {
        super("French Fries", "no sauce",price,"deep fried");
    }
    public void addFries1(String name, double price){
        this.friesName = name;
        this.friesNamePrice1 = price;
    }
    public void addFries2(String name, double price){
        this.friesName2 = name;
        this.friesNamePrice2 = price;
    }

    @Override
    public double itemizeHamberger() {
        double friesPrice = super.itemizeHamberger();
        if(friesName != null){
            friesPrice += friesNamePrice1;
        }
        if(friesName2 != null){
            friesPrice = friesNamePrice2;
        }
        return friesPrice;
    }
}
