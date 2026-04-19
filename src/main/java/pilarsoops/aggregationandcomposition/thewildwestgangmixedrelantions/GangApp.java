package aggregationandcomposition.thewildwestgangmixedrelantions;

public class GangApp {
    
    public static void main(String[] args) {
        
        Gang gang1 = new Gang("The Wild West Gang");
        Outlaw outlaw1 = new Outlaw("Billy the Kid", 5000);
        Outlaw outlaw2 = new Outlaw("Jesse James", 10000);
        Outlaw outlaw3 = new Outlaw("Butch Cassidy", 15000);

        gang1.recruitOutlaw(outlaw1);
        gang1.recruitOutlaw(outlaw2);
        gang1.recruitOutlaw(outlaw3);

        gang1.setupCamp("Desert Canyon", 5);

        System.out.println(gang1);

        gang1.removeOutlaw(outlaw2);
        
        System.out.println(gang1);

    }
}
