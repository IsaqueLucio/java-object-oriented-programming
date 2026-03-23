package inheritance.dark_fantasy_rpg;

public class Dragon extends Enemy{
    
    private double fireBreathRange;

    public Dragon(String name, int health, double baseDamage, double fireBreathRange) {
        super(name, health, baseDamage);
        this.fireBreathRange = fireBreathRange;
    }

    @Override
    public String toString() {
        return "Dragon [name=" + name + ", fireBreathRange=" + fireBreathRange + ", health=" + health + ", baseDamage="
                + baseDamage + "]";
    }

    public double getFireBreathRange() {
        return fireBreathRange;
    }

    public void setFireBreathRange(double fireBreathRange) {
        this.fireBreathRange = fireBreathRange;
    }

}
