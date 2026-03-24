package polymorphism.classic_cinema_streaming;

public class ClassicHorror extends Movie {

    public ClassicHorror(String title) {
        super(title);
    }
    
    @Override
    public String play(){
        return "Playing" + title +" with a spooky black and white filter...";
    }

    @Override
    public String toString() {
        return "ClassicHorror []";
    }

    

}
