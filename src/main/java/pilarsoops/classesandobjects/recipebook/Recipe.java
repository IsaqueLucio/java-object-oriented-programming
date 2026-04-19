package classesandobjects.recipebook;

public class Recipe{

    public String dishName;
    public int prepTimeMinutes;
    public String difficulty;

    public Recipe(String dishName, String difficulty, int prepMinutes){
        this.dishName = dishName;
        this.difficulty = difficulty;
        this.prepTimeMinutes = prepMinutes;
    }

    public void displayDetails(){
        System.out.println("\nRecipe name: "+dishName+
            "\nRecipe prepare time (minutes): "+prepTimeMinutes+
            "\nRecipe difficulty: "+difficulty);
    }
}
