package OOP.Inheritance;

public class Dog extends Animal {
//    distinct dogs characteristics
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public void chew(){
        System.out.println("the dog chew");
    }
    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println("The dog moves at" + speed);
    }

    public Dog(int brain, int body, int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(brain, body, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    public void greeting(){
        System.out.println("hello I am "+this.getName());
    }
}
