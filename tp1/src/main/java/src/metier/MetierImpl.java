package src.metier;

import src.dao.IDao;

public class MetierImpl implements IMetier {
    IDao doa;

    @Override
    public double calcul() {
        double data = doa.getData();
        return data*10;
    }

    public void setDoa(IDao doa) {
        this.doa = doa;
    }
}
