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

        currentState = new SleepingState();
    }

    public void feed(){

    }

    public void tick(){

    }

    public boolean isAsleep(){
        return false;
    }
    public boolean isPlayful(){
        return false;
    }
    public boolean isHungry(){
        return false;
    }
    public boolean isDigesting(){
        return false;
    }
    public boolean isDead(){
        return false;
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
