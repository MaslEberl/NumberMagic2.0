package rechnungen;

/**
 * Created by julian on 31.05.17.
 */
public class FestgelegteGrenzen {
    //Sämtliche Grenzen hardcodieren
    //In Modus hineinspeicherern

    Grenzen babyAddieren = new Grenzen(1,1,100,100,0,0);
    Grenzen babySubtrahieren = new Grenzen(1,1,100,100,0,0);
    Grenzen babyMultiplizieren = new Grenzen(1,1,9,9,0,0);
    Grenzen babyDividieren = new Grenzen(1,1,9,9,0,0);

    Grenzen unsicherAddieren = new Grenzen(10,10,1000,1000,2,2);
    Grenzen unsicherSubtrahieren = new Grenzen(10,10,1000,1000,2,2);
    Grenzen unsicherMultiplizieren = new Grenzen(5,5,100,100,1,1);
    Grenzen unsicherDividieren = new Grenzen(5,5,100,100,1,1);

    Grenzen rationalAddieren = new Grenzen(100,100,10000,10000,3,3);
    Grenzen rationalSubtrahieren= new Grenzen(100,100,10000,10000,3,3);
    Grenzen rationalMultiplizieren = new Grenzen(10,10,100,100,1,1);
    Grenzen rationalDividieren = new Grenzen();
    Grenzen rationalPotenzieren = new Grenzen();
    Grenzen rationalRadizieren = new Grenzen();


}
