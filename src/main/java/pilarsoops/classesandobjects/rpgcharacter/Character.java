package classesandobjects.rpgcharacter;

public class Character{

    public String name;
    public String rpgClass;
    public int level;

    public Character(String name, String rpgClass){
        this.name = name;
        this.rpgClass = rpgClass;
        this.level = 3;
    }

    public void levelUp( ){
        this.level = this.level + 1;
        System.out.println("Congrats!!!\n You got level "+this.level);
    }
    

}
