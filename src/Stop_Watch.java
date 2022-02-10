public class Stop_Watch {
    public double startTime = 0;
    public double stopTime = 0;
    boolean run = false;

    public void start(){
        this.startTime = System.currentTimeMillis();
        this.run = true;
    }

    public void stop(){
        this.stopTime = System.currentTimeMillis();
        this.run = false;
    }

    public double getElapsedTime(){
        double elapsed;
        if (run){
            elapsed = System.currentTimeMillis() - startTime;
        }
        else{
            elapsed = stopTime - startTime;
        }
        return elapsed;
    }



}
