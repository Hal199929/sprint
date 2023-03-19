package Cfort;

public class Voiture {
    Batterie b;
    public void bouger(){
        b = new Batterie();
        b.demarrer();
        System.out.println("Vitess 10Km/h");
    }
}
