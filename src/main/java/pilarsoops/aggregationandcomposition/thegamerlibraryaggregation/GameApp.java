package aggregationandcomposition.thegamerlibraryaggregation;

public class GameApp {
    public static void main(String[] args) {
        
        Game gm1 = new Game("Cyberpunk 2077", "Action");
        Game gm2 = new Game("Red Dead Redemption 2,", "Adventure");
        Game gm3 = new Game("Dispatch", "Strategy");

        GameLibrary owner1 = new GameLibrary("Isaac");

        owner1.addGame(gm1);
        owner1.addGame(gm2);
        owner1.addGame(gm3);

        System.out.println(owner1);

        owner1 = null;

        if(owner1 == null){
            System.out.println("proving that aggregation is working, cause now the list is null: ");
            System.out.println(gm1);
            System.out.println(gm2);
            System.out.println(gm3);
        } //Without "else" because it will never fall here, since on line 18 the list was set as null.

    }
}
