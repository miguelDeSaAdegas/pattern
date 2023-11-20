public class SchieldUpgrade extends Upgrades {
    public SchieldUpgrade(Robot robot) {
        super(robot);
    }

    @Override
    public int getShield() {
        return super.getShield() * 2;
    }
}
