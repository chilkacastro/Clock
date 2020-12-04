package clock;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Class of a Clock
 * @author Chilka Castro
 */
public class Clock {
    private int hr;
    private int mi;
    private int se;
    
    /**
     * Default constructor
     */
    public Clock() {            // clock usually have only one constructor
        this.hr = 0;
        this.mi = 0;
        this.se = 0;
    }
    
    /**
     * Constructor with three parameters
     * @param hr the hour of the clock
     * @param mi the minute of the clock
     * @param se the second of the clock
     */
    public Clock(int hr, int mi, int se) {
        this.hr = hr;
        this.mi = mi;
        this.se = se;
    }
    
    /**
     * Copy constructor
     * @param clock the clock object to copy
     */
    public Clock (Clock clock) {
        this.hr = clock.hr;
        this.mi = clock.mi;
        this.se = clock.se;
    }
    
    /**
     * To increase the hour.
     */
    public void increaseHr() {
        // hr = (hr + 1) % 24;
        hr++;
       
        if (hr == 24)
           hr = 0;              
    }
    
    /**
     * To increase the minute by 1.
     * 
     */
    public void increaseMi() {
        // mi = (mi + 1) % 60;
        mi++;
        if (mi == 60) {
            mi = 0;
            increaseHr();       // reuse method
        }    
    }
    
    /**
     * To increase the seconds by 1.
     */
    public void increaseSe() {
        se++;
        if(se == 60) {
            se = 0;
            increaseMi();
        }
    }
    
    /**
     * To check if two clock objects are the same or not.
     * @param clock the clock object to be compared with.
     * @return True if the clocks are the same and False if not.
     */
    public boolean equals(Clock clock) {
        return this.hr == clock.hr &&
                this.mi == clock.mi &&
                this.se == clock.se; 
    }
 
    /**
     * A string that represents a clock.
     * @return the string that represents the clock.
     */
    @Override
    public String toString() {
        String str = "";
        
        str += String.format("%02d:%02d:%02d", hr, mi, se); 

        return str;
    }

    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return mi;
    }

    public void setMin(int mi) {
        this.mi = mi;
    }

    public int getSe() {
        return se;
    }

    public void setSe(int se) {
        this.se = se;
    }

}
