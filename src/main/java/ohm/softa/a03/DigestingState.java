package ohm.softa.a03;

public class DigestingState extends State{

    private final int remainingWakeTime;

    DigestingState(int duration, int remainingWakeTime) {
        super(duration);
        this.remainingWakeTime = remainingWakeTime;
    }

    @Override
    public State successor(Cat cat) {
        logger.info("Getting in a playful mood!");
        // Das ist die zeit, Wie lange die Katze noch wach ist, nachdem sie fertig verduat hat
        return new PlayfulState(remainingWakeTime - cat.getDigest());
    }
}
