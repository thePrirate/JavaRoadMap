package OOP.Polymorphism.PolymorphismChallenge;
class Car{
    private boolean engine;
    private String name; //dynamic value
    private int cylinders; //dynamic cylinders
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String startEngine(){
    return "Car -> StartEngine()";
    }
    public String accelerate(){
        return "Car -> accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }
}

class Mitsumishi extends Car{
    public Mitsumishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubitshi -> Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubitshi -> acceralerate";
    }

    @Override
    public String brake() {
        return "Mitsubitshi -> brake()";
    }
}

class Ford extends Car{
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }
}

class Holden extends Car{
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Holden -> Start Engine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> acceralerate";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}

public class Main {
public static void main(String[] args) {
Mitsumishi car1 = new Mitsumishi("Maimu",4);
    System.out.println(
car1.accelerate()

    );
    System.out.println(
car1.brake()

    );
    System.out.println(
car1.startEngine()

    );
Holden holden = new Holden("Holden",10);
    System.out.println(holden.accelerate());
    System.out.println(holden.brake());
    System.out.println(holden.startEngine());

Ford car2 = new Ford("Ford",10){
    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ "Ford-> Starting engine";
    }

    @Override
    public String accelerate() {
        return "Ford-> Accelerateing";
    }

    @Override
    public String brake() {
        return "Ford -> braking";
    }};
}
}
