package ohm.softa.a03;

public class SleepingState extends State{


    public SleepingState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {

        if (super.getTime() == cat.getSleep()){
            logger.info("Yoan... getting hungry!");
            return new HungryState(cat.getAwake());
        }

        return this;
    }
}
