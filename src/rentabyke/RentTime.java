/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentabyke;

import java.util.Date;

/**
 *
 * @author Nahuel E Correa
 * 
 */
public class RentTime {

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
    
    /*Método que calcula la diferencia entre dos Objetos de la clase Date*/
    public static RentTime calculatesRentTime(Date rentStarts, Date rentEnds){
        
        int seconds=(int)((rentEnds.getTime()-rentStarts.getTime())/1000);
        
        int weeks = 0;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        
        if(seconds>604800) {
            weeks = (int)Math.floor(seconds/604800);
            seconds=seconds-(days*604800);
        }
        if(seconds>86400) {
            days = (int)Math.floor(seconds/86400);
            seconds=seconds-(days*86400);
        }
        if(seconds>3600) {
            hours = (int)Math.floor(seconds/3600);
            seconds = seconds-(hours*3600);
        }
        if(seconds>60) {
            minutes = (int)Math.floor(seconds/60);
            seconds = seconds-(minutes*60);
        }
        
        RentTime rentTime = new RentTime(weeks, days, hours, minutes, seconds);
        
        return rentTime;
    }

    @Override
    public String toString() {
        return "weeks:" + weeks + " days:" + days + " hours:" + hours + " minutes:" + minutes;
    }
        private int seconds;
        private int minutes;
        private int hours;
        private int days;
        private int weeks;
        
    }

