package OOP.Composition.challengeTime;

public class LivingRoom {
    private String desk;
    private String chairs;
    private String tea;
    private String cups;

    public LivingRoom(String desk, String chairs, String tea, String cups) {
        this.desk = desk;
        this.chairs = chairs;
        this.tea = tea;
        this.cups = cups;
    }
    public void drinkTea(String tea){
        System.out.println("Lets have some tea"+tea);
    }
}
