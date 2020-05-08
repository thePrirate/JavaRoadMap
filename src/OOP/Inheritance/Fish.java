package OOP.Inheritance;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(int brain, int body, int size, int weight, String name, int gills, int eyes, int fins) {
        super(brain, body, size, weight, name);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    public static void swim(){
        System.out.println("im swimming");
    }
}
