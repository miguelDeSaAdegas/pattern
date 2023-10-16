public class Bear {
    public enum State {
        NOTSLEEPING{
            @Override
            public void attaque(Bear b) {
                System.out.println("GroaaR");
            }

            @Override
            public void wakeUp(Bear b) {
                throw new RuntimeException("already not sleeping");
            }
        },SLEEPING{
            @Override
            public void attaque(Bear b) {
                System.out.println("Zzzzzz");
            }

            @Override
            public void sleep(Bear b) {
                throw new RuntimeException("already sleeping");
            }
        };
        public abstract void attaque(Bear b);

        void sleep(Bear b) {
            b.setState(State.SLEEPING);
        };

        void wakeUp(Bear b) {
            b.setState(State.NOTSLEEPING);
        }
    }

    private State state;

    public Bear() {
        setState(State.NOTSLEEPING);
    }
    public void attack() {
        this.state.attaque(this);
    }

    public void sleep() {
        state.sleep(this);
    }

    public void wakeup() {
        state.wakeUp(this);
    }

    public void setState(State state) {
        this.state= state;
    }

    public static void main(String[] args) {
        Bear b= new Bear();
        b.attack();
        b.sleep();
        b.attack();
    }
}
