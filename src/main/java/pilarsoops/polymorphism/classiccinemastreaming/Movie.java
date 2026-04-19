package polymorphism.classiccinemastreaming;

public class Movie{

    protected String title;

    public Movie(String title) {
        this.title = title;
    }

    public String play(){
        return "Playing movie: "+title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    

}
