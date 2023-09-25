package Strategy;

public class NotStrategy implements Strategy{

    private Strategy strategy;

    public NotStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public boolean strategyToExecute(String mot) {
        return !strategy.strategyToExecute(mot);
    }
}
