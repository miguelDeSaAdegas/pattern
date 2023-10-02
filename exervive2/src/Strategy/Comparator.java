package Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator implements Strategy{

    private Strategy strategy;
    private int cpt;

    public Comparator(Strategy strategy) {
        this.strategy = strategy;
        this.cpt = 0;

    }

    @Override
    public boolean strategyToExecute(String mot) {
        boolean rep = strategy.strategyToExecute(mot);
        if (rep) {
            cpt++;
        }
        return rep;
    }

    public int getCpt() {
        return cpt;
    }
}
