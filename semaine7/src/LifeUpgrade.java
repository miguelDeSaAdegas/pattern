public class LifeUpgrade extends Upgrades {
    public LifeUpgrade(Robot robot) {
        super(robot);
    }

    @Override
    public int diffLife(int i) {
        if (i < 0) i = i / 2;

        return super.diffLife(i);
    }
}
