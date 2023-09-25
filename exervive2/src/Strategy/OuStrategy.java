package Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class OuStrategy implements Strategy{

    private ArrayList<Strategy> strategyArrayList;

    public OuStrategy(Strategy... strategies) {
        this.strategyArrayList = new ArrayList<>();

        Collections.addAll(strategyArrayList, strategies);
    }

    @Override
    public boolean strategyToExecute(String mot) {
        boolean rep = false;
        for (Strategy strategy : strategyArrayList) {
            if (strategy.strategyToExecute(mot)) rep = true;
        }
        return rep;
    }
}
