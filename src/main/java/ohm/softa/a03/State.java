package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {

    protected Logger logger = LogManager.getLogger();

    private int t;

    private final int duration = 0;

    final State tick(Cat_old cat){
        return null;
    }

    abstract State successor(Cat_old cat);

    public int getTime(){
        return t;
    }

    public int getDuration(){
        return duration;
    }

}
