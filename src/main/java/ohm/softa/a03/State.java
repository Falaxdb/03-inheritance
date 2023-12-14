package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    protected Logger logger = LogManager.getLogger();

    private int t = 0;

    private final int duration;

    public State(int duration){
        this.duration = duration;
    }

    final State tick(Cat cat){
        logger.info("tick()");
        t = t + 1;

        return successor(cat);
    }

    abstract State successor(Cat cat);

    public int getTime(){
        return t;
    }

    public int getDuration(){
        return duration;
    }

}
