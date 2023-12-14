package ohm.softa.a03;

public class DigestingState extends State{

    public DigestingState(int duration){super(duration);}

    @Override
    State successor(Cat cat) {
        if (super.getTime() == super.getDuration()){
            logger.info("Getting in a playful mood!");
            return new PlayfulState(cat.getAwake()-super.getTime());
        }
        return this;
    }
}
