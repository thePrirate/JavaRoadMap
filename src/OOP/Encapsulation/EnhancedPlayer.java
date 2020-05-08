package OOP.Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int hitPoints, String weapon) {
        this.name = name;
        if (hitPoints >0 && hitPoints <=100){
        this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }
    public int getHitPoints(){
        return hitPoints;
    }

}
