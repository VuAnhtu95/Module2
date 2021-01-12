package OOP.StopWatch;

import java.util.Date;

public class StopWatch{
    private long startTime;
    private long endTime;
    public StopWatch(){}
    public StopWatch(long startTime , long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }

    public void startTime(){
        this.startTime = System.currentTimeMillis();
    }
    public void endTime(){
        this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}
