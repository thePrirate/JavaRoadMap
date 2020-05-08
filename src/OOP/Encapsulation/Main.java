package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player1 = new Player();
//        player1.name = "Mario";
//        player1.weapon = "Punch";
//        player1.health = 3000;
//        player1.loseHealth(2000);
//        System.out.println("the remaining health is "+player1.healthRemaining());
////        player1.healthRemaining();
//        player1.loseHealth(20);
//        System.out.println("the damage health remaining is "+player1.healthRemaining());
    EnhancedPlayer player1 = new EnhancedPlayer("Tim",100,"gun");
        System.out.println("Initial Health is "+player1.getHitPoints());
    }
}
