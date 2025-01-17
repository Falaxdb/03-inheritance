package ohm.softa.a03;

public class HungryState extends State{

    public HungryState(int duration){
        super(duration);
    }

    @Override
    State successor(Cat cat) {
            logger.info("I've starved for a too long time...good bye...");
            return new DeathState(10);
    }

    public State feed(Cat cat){
        if(!cat.isHungry()){
            throw new IllegalStateException("Can't stuff a cat...");
        }

        logger.info("You feed the cat...");
        // Die katze ist nur maximal so lange wach. RemainingWakeTime ist die restliche wache zeit
        return new DigestingState(cat.getDigest(), getDuration() - getTime());
    }

}
