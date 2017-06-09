package rechnungen;

import java.util.Random;

/**
 * Created by julian on 31.05.17.
 */
public class RechnungenErzeugen {

    /*
    * Wie es funktionieren soll:
    *
    * Es wird unterteilt in einzelne Terme erzeugen.
    *
    * erzeugeTerm() wählt zuerst eine Operation und versucht, Zufallszahlen zu wählen,
    * die die übergebenen Grenzen für diese Operation einhalten. Nach ein paar
    * Versuchen soll es fehlschlagen.
    * Das soll so sein, damit man beim Erzeugen nicht in eine Sackgasse gerät.
    *
    * Wenn das erzeugen eines Terms fehlschlägt, sollen ein paar Terme davor
    * auch gelöscht werden. Rekursiv?, Jedes mal 5 Versuche?
    *
    *
    * */

    /* Der Modus ist eine Member-Variable,
    * Somit muss für jede Runde eine Instanz dieser Klasse erzeugt werden. */
    private Modus modus;
    private Terme terme;

    public RechnungenErzeugen(Modus modus) {
        this.modus = modus;
    }

    public Terme erzeuge()
    {
        return new Terme();
    }

    /** @return Gibt null zurück, wenn es fehlschlägt. */
    private Term erzeugeTerm(int position)
    {
        modus.getForOperationen();




        return new Term();
    }

    //TODO Am besten aus der Modus-Klasse alle Operationen herausholen als Array, dann spart man sich das switch
    private Operation wähleOperation() {
        Random randomGenerator = new Random();
        int rand = randomGenerator.nextInt(6);
        Operation op;

        switch (rand)
        {
            case 0: op = Operation.PLUS; break;
            case 1: op = Operation.MINUS; break;
            case 2: op = Operation.MAL; break;
            case 3: op = Operation.DURCH; break;
            case 4: op = Operation.HOCH; break;
            case 5: op = Operation.WURZEL; break;
            default: op = null;
        }

        return op;
    }
}
