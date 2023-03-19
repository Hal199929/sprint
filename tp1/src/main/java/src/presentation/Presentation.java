package src.presentation;
import src.dao.DaoImpl;
import src.dao.DaoNSQL;
import src.metier.MetierImpl;
public class Presentation {
    public static void main(String[] args){
        MetierImpl metier = new MetierImpl();
        DaoNSQL nosql = new DaoNSQL();
        metier.setDoa(nosql);
        double resultat = metier.calcul();
        System.out.println("Résultat est=>" + resultat);
    }
}
