import java.util.HashMap;
import java.util.Map;

public class FlyweightFactoryAvecAbstractFactory {
    private Map<String, AbstractFactory> map;

    public FlyweightFactoryAvecAbstractFactory() {
        map = new HashMap<>();
    }

    public void put(String name, AbstractFactory abstractFactory) {
        map.put(name, abstractFactory);
    }

    public Robot create(String name) {
        return map.get(name).createRobot();
    }
}
