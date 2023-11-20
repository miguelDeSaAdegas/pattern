public class RobotImpl implements Robot {
    private final int canon, schield, freq;
    private int life;
    private final String name;

    public RobotImpl(Builder builder) {
        this.canon = builder.canon;
        this.schield = builder.schield;
        this.freq = builder.freq;
        this.life = builder.life;
        this.name = builder.name;
    }

    @Override
    public int getCanon() {
        return canon;
    }
    @Override
    public int getShield() {
        return schield;
    }
    @Override
    public int getFreq() {
        return freq;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int diffLife(int i) {
        life = life + i;
        return life;
    }

    public static class Builder {
        private int canon, schield, freq, life;
        private String name;

        public Builder() {}

        public Builder canon(int canon) {
            this.canon = canon;
            return this;
        }

        public Builder schield(int schield) {
            this.schield = schield;
            return this;
        }

        public Builder freq(int freq) {
            this.freq = freq;
            return this;
        }

        public Builder life(int life) {
            this.life = life;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public RobotImpl build() {
            return new RobotImpl(this);
        }
    }
}
