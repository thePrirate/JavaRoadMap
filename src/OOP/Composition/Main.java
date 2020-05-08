package OOP.Composition;

public class Main {
    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2280","Dell","240",dimensions);
        Monitor monitor1 = new Monitor("Dell","Dell",27, new Resolution(2540,1440));
        MotherBoard theMotherBoard = new MotherBoard("Dell","Dell",4,4,"v2.44");
        PC pc1 = new PC(theCase,monitor1,theMotherBoard);
        pc1.powerUp();
        pc1.playHonkai();
    }
}
