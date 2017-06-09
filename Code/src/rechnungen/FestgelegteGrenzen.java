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

    //Bei Potenzieren  ist Zahl 1 Basis, Zahl 2 Exponent
    //Bei Radizieren  ist Zahl 1 Radikant, Zahl 2 Radexexponent

    Grenzen rationalAddieren = new Grenzen(0,0,10000,10000,3,3);
    Grenzen rationalSubtrahieren= new Grenzen(0,0,10000,10000,3,3);
    Grenzen rationalMultiplizieren = new Grenzen(10,10,100,100,1,1);
    Grenzen rationalDividieren = new Grenzen(10,10,100,100,2,2);
    Grenzen rationalPotenzieren = new Grenzen(2,0,2,12,0,0);
    Grenzen rationalRadizieren = new Grenzen(2,0,2,12,0,0);

    Grenzen gemeinAddieren = new Grenzen(0,0,100000,100000,3,3);
    Grenzen gemeinSubtrahieren = new Grenzen();
    Grenzen gemeinMultiplzieren = new Grenzen();
    Grenzen gemeinDividieren = new Grenzen();
    Grenzen gemeinPotenzieren = new Grenzen();
    Grenzen gemeinRadizieren = new Grenzen();

}