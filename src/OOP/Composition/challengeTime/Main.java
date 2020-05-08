package OOP.Composition.challengeTime;

public class Main {
    public static void main(String[] args) {
        BedRoom bedRoom1 = new BedRoom("bed1","pilloow1", "blanket1");
        LivingRoom livingRoom1=new LivingRoom("red desk","4 chairs","TWG","a cup");

        House house1 = new House(bedRoom1,livingRoom1);
        house1.feelingSleepy();
    }
}
