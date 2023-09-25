package Strategy;

import java.util.ArrayList;
import java.util.Collections;

public class EtStrategy implements Strategy{

    private ArrayList<Strategy> strategyArrayList;

    public EtStrategy(Strategy... strategies) {
        this.strategyArrayList = new ArrayList<>();

        Collections.addAll(strategyArrayList, strategies);
    }

    @Override
    public boolean strategyToExecute(String mot) {
        for (Strategy strategy : strategyArrayList) {
            if (!strategy.strategyToExecute(mot)) return false;
        }
        return true;
    }
}
