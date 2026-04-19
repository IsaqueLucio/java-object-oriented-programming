package polymorphism.classiccinemastreaming;

public class ActionBlockbuster extends Movie {

    public ActionBlockbuster(String title) {
        super(title);
    }

    @Override
    public String play(){
        return "Playing "+title+" with 7.1 surround sound explosions!";
    }

    @Override
    public String toString() {
        return "ActionBlockbuster []";
    }
    
    

}
