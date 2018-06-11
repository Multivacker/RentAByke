/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentabyke;

/**
 *
 * @author Nahuel E Correa
 * 
 */
public class RentTime {

        private int seconds = 0;
        private int minutes = 0;
        private int hours = 0;
        private int days = 0;
        private int weeks = 0;

    public RentTime(int weeks, int days, int hours, int minutes, int seconds) {
        
        this.weeks = weeks;
        this.days = days;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getWeeks() {
        return weeks;
    }

    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }
    
    @Override
    public String toString() {
        return "RentTime{" + "seconds = " + seconds + ", minutes = " + minutes + 
               ", hours = " + hours + ", days = " + days + ", weeks = " + weeks + '}';
    }
        
    }
