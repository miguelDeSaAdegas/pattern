package Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class Comparator implements Strategy{

    private ArrayList<Strategy> strategyArrayList;
    private int cpt;

    public Comparator(Strategy... strategies) {
        this.strategyArrayList = new ArrayList<>();
        this.cpt = 0;

        Collections.addAll(strategyArrayList, strategies);
    }

    @Override
    public boolean strategyToExecute(String mot) {
        for (Strategy strategy : strategyArrayList) {
            if (strategy.strategyToExecute(mot)) {
                cpt++;
            }
        }
        return true;
    }
}
