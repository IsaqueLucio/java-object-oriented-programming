package inheritance.dark_fantasy_rpg;

public class Hollow extends Enemy {

    private String weaponType;

    public Hollow(String name, int health, double baseDamage, String weaponType) {
        super(name, health, baseDamage);
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return "Hollow [name=" + name + ", weaponType=" + weaponType + ", health=" + health + ", baseDamage="
                + baseDamage + "]";
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    

}