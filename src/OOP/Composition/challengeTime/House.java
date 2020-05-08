package OOP.Composition.challengeTime;

public class House {
    private BedRoom bedRoom;
    private LivingRoom livingRoom;

    public House(BedRoom bedRoom, LivingRoom livingRoom) {
        this.bedRoom = bedRoom;
        this.livingRoom = livingRoom;
    }
    public void feelingSleepy(){
        bedRoom.getRest("sofa");
    }
}
