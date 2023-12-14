package ohm.softa.a03;

public class Cat {

    private final int sleep;
    private final int awake;
    private final int digest;
    private final String name;

    private State currentState;

    public Cat(String name, int sleep, int awake, int digest){
        this.name = name;
        this.sleep = sleep;
        this.awake = awake;
        this.digest = digest;

        currentState = new SleepingState(sleep);
    }

    public void feed(){
        if (!isHungry())
            throw new IllegalStateException("Not every cat is Garfield...");

        if (currentState instanceof HungryState){
            currentState = ((HungryState) currentState).feed(this);
        }
    }

    public void tick(){
       currentState = currentState.tick(this);
    }

    public boolean isAsleep(){
        return currentState instanceof SleepingState;
    }
    public boolean isPlayful(){
        return currentState instanceof PlayfulState;
    }
    public boolean isHungry(){
        return currentState instanceof HungryState;
    }
    public boolean isDigesting(){
        return currentState instanceof DigestingState;
    }
    public boolean isDead(){
        return currentState instanceof DeathState;
    }

    public int getSleep(){
        return sleep;
    }
    public int getDigest(){
        return digest;
    }
    public int getAwake(){
        return awake;
    }
    public String getName(){
        return name;
    }

}
