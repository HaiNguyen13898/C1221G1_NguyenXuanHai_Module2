package ss4_class_object.bai_tap.stopWatch;

import java.util.Date;

public class Stopwatch {
    private long startTime, endTime;
    public Stopwatch () {
        this.startTime = new Date().getTime();
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start () {
        startTime = new Date().getTime();
    }
    public void stop () {
        endTime = new Date().getTime();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}
