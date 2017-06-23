package rechnungen;


import java.util.TreeMap;

/** Liest aus der Map herraus und fixiert Grenzen */
public class Modus{
      TreeMap<Operation,Grenzen> map = new TreeMap<>();

      Grenzen getForOperationen(Operation op){
            //Gibt die Grenzen, für den Key in der Map gespeichert sind zurück
          return map.get(op);
      }

    //Methode, die alle verwendeten Operationen als Array zurückgibt

}