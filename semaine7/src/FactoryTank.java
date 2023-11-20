public class FactoryTank implements  AbstractFactory {
    public FactoryTank() {}

    @Override
    public Robot createRobot() {
        return new RobotImpl.Builder().name("tank").life(150).schield(150).freq(50).canon(50).build();
    }
}
