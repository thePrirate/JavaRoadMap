package OOP.FinalOOP;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }
    public void addHealthy1(String name, double price){
    this.healthyExtra1Name = name;
    this.healthyExtra1Price = price;
    }
    public void addHealthy2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price=price;
    }

    @Override
    public double itemizeHamberger() {
        double price = super.itemizeHamberger();
        if (healthyExtra1Name != null){
            price+= healthyExtra1Price;
            System.out.println("Added "+healthyExtra1Name+" for an extra "+ healthyExtra1Price);
        }
        if(healthyExtra2Name!=null){
            price+=healthyExtra2Price;
            System.out.println("Added "+healthyExtra2Name+" for an extra "+ healthyExtra2Price);
        }
        return price;
    }
}
