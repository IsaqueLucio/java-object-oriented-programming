package aggregationandcomposition.thegamerlibraryaggregation;

import java.util.ArrayList;
import java.util.List;

public class GameLibrary {
    
    private String ownerName;
    private List <Game> gameList = new ArrayList<>();
    
    public GameLibrary(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "GameLibrary [ownerName=" + ownerName + ", gameList=" + gameList + "]";
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public List<Game> getGameList() {
        return gameList;
    }

   public void addGame(Game newGame){
        this.gameList.add(newGame);
   }

}
