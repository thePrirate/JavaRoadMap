package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
    Animal dog1 = new Animal(1,1,1,1,"Milo");
    dog1.eat();
    Dog babyMilo = new Dog(1,1,1,1,"milo",2,4,1,100,"long silky");
    babyMilo.greeting();
    babyMilo.eat();
    babyMilo.move(100);
    Fish.swim();
    }

}
