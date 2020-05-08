package OOP.Composition.challengeTime;

public class BedRoom {
    private String bed;
    private String pillow;
    private String blanket;

    public BedRoom(String bed, String pillow, String blanket) {
        this.bed = bed;
        this.pillow = pillow;
        this.blanket = blanket;
    }
    public void getRest(String bed){
        System.out.println("lying on the" + bed);
    }
}
