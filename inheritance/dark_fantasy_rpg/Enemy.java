package inheritance.dark_fantasy_rpg;

public class Enemy {
    
    protected String name;
    protected int health;
    protected double baseDamage;

    public Enemy(String name, int health, double baseDamage) {
        this.name = name;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public void takeDamage(int damage){
        this.health = this.health - damage;
        System.out.println("Damage taken: "+damage+"\nCurrent health: "+this.health);
    }

    @Override
    public String toString() {
        return "Enemy [name=" + name + ", health=" + health + ", baseDamage=" + baseDamage + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(double baseDamage) {
        this.baseDamage = baseDamage;
    }

    

}
