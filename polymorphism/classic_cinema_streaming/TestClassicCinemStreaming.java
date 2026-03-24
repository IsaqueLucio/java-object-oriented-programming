package polymorphism.classic_cinema_streaming;

import java.util.ArrayList;
import java.util.List;

public class TestClassicCinemStreaming {
    
    public static void main(String[] args) {
        
        List <Movie> listMovies = new ArrayList<>();

        Movie movie = new Movie("La La Land");
        ClassicHorror classicHorror = new ClassicHorror("Nosferatu");
        ActionBlockbuster actionBlockbuster = new ActionBlockbuster("Spider-Man: No Way Home");


        listMovies.add(movie);
        listMovies.add(classicHorror);
        listMovies.add(actionBlockbuster);

        for(Movie f: listMovies){
            System.out.println("\n"+f.getTitle()+"\n"+f.play());
        }

    }

}
