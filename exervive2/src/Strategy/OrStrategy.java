package Strategy;

public class OrStrategy implements Strategy{
    private Strategy strategy1;
    private Strategy strategy2;

    public OrStrategy(Strategy strategy1, Strategy strategy2) {
        this.strategy1 = strategy1;
        this.strategy2 = strategy2;
    }

    @Override
    public boolean strategyToExecute(String mot) {
        return strategy1.strategyToExecute(mot) || strategy2.strategyToExecute(mot);
    }
}
