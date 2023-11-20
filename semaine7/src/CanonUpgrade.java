public class CanonUpgrade extends Upgrades {

    public CanonUpgrade(Robot robot) {
        super(robot);
    }

    @Override
    public int getCanon() {
        return super.getCanon() * 2;
    }
}
