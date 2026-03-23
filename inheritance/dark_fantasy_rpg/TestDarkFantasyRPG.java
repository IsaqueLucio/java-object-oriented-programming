package inheritance.dark_fantasy_rpg;

public class TestDarkFantasyRPG {
    
    public static void main(String[] args) {
        
        Hollow hollow = new Hollow("H1", 60, 10, "Broken Sword");
        Dragon dragon = new Dragon("Dragon01", 200, 40, 21.9);

        hollow.takeDamage(50);
        dragon.takeDamage(50);

    }

}
