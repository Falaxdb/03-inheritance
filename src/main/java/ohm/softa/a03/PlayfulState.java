package ohm.softa.a03;

public class PlayfulState extends State{
    public PlayfulState(int duration) {
        super(duration);
    }

    @Override
    State successor(Cat cat) {
        if (super.getTime() >= super.getDuration()){
            logger.info("Yoan... getting tired!");
            return new SleepingState(cat.getSleep());
        }
        return this;
    }
}
