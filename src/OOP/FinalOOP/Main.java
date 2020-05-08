package OOP.FinalOOP;

public class Main {
    public static void main(String[] args) {
        Hamburger ham1 = new Hamburger("Double cheese burger","extra meat",12.0,"roasted");
        double price = ham1.itemizeHamberger();
        System.out.println(price);
        ham1.addAddition1(" Tomato ", 20);
        ham1.addAddtion2(" Sauce ", 20);
        ham1.addAddition3(" Bread ", 20);
        ham1.itemizeHamberger();
        System.out.println(ham1.itemizeHamberger());

//      Healthy burger options
        HealthyBurger healthyBurger = new HealthyBurger("Beef", 5.0);
        healthyBurger.addHealthy1("Tomatoes",12.0);
        healthyBurger.addHealthy2("Lettuce", 10.0);
//        healthyBurger.itemizeHamberger();
        System.out.println(healthyBurger.itemizeHamberger());

//        Add fries
        Fries fries1 = new Fries("French Fries",10.0);
        fries1.addFries1("More fries",10.0);
        fries1.itemizeHamberger();
        System.out.println(fries1.itemizeHamberger());
    }
}

