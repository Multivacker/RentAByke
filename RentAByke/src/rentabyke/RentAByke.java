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
public class RentAByke {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("La renta empezó el: " + rentStarts + " OK");
        System.out.println("");
        System.out.println("La renta terminó el: " + rentEnds  + " OK");
        System.out.println("");
        System.out.println("Semanas: " + calculatesRentTime(rentStarts, rentEnds).getWeeks());
        System.out.println("Días: " + calculatesRentTime(rentStarts, rentEnds).getDays());
        System.out.println("Horas: " + calculatesRentTime(rentStarts, rentEnds).getHours());
        System.out.println("Minutos: " + calculatesRentTime(rentStarts, rentEnds).getMinutes());
        System.out.println("Segundos: " + calculatesRentTime(rentStarts, rentEnds).getSeconds());
        System.out.println("");
        System.out.println("CalculaHora_ El costo de la renta es de: $ " + calculateCostPerHour(calculatesRentTime(rentStarts, rentEnds)) + " OK");
        System.out.println("");
        System.out.println("CalculaDia_ El costo de la renta es de: $ " + calculateCostPerDay(calculatesRentTime(rentStarts, rentEnds)) + " OK");
        System.out.println("");
        System.out.println("CalculaSemana_ El costo del alquiler es es de: $ " + calculateCostPerWeek(calculatesRentTime(rentStarts, rentEnds)) + " OK");
        System.out.println("");
        System.out.println("AplicaDescuentoPlanFamiliar_El costo final del alquiler es de: $ " + applyDiscountForFamilyRental(rentCost, cantBikes));
           
    }
    
    /*Método que calcula la diferencia entre dos Objetos de la clase Date*/
    public static RentTime calculatesRentTime(Date rentStarts, Date rentEnds){
        
        //Date rentTime = new Date();
        
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
    
    
    /*Método que calcula el costo de la renta por hora, tiene una tolerancia
    de 15 minutos, pasado ese tiempo se le cobrará el recargo por minutos excedidos*/
    public static float calculateCostPerHour(RentTime rentTime){
        
        float rentCostPerHour = (rentTime.getHours())*5;
        
        float surchargePerMinute;
        
        if(rentTime.getMinutes()>15){
            
            surchargePerMinute = (float)(rentTime.getMinutes()*5)/60;
            
            rentCostPerHour = rentCostPerHour + surchargePerMinute;
            
        }
        
        return rentCostPerHour;
    }
    
    
    /*Método que calcula el costo de la renta por Día*/
    public static float calculateCostPerDay(RentTime rentTime){
        
        float rentCostPerDay = 0;
                
        if(rentTime.getDays()<7){
            
            rentCostPerDay = (rentTime.getDays())*20;
            
        }
       
        return rentCostPerDay; 
    }
    
    
    /*Método que calcula el costo de la renta por Semana*/
    public static float calculateCostPerWeek(RentTime rentTime){
       
        float rentCostPerWeek = rentTime.getWeeks()*60;
        
        float surchargePerDay;
        
        if(rentTime.getDays()%7!=0){
            
            surchargePerDay = (rentTime.getDays()%7)*20;
            
            rentCostPerWeek = rentCostPerWeek + surchargePerDay;
            
        }
        
        return rentCostPerWeek;
    }
    
    
    /*Método que aplica el descuento por plan familiar*/
    public static double applyDiscountForFamilyRental(double rentCost, int cantBikes){
        
        if((cantBikes>=3)&&(cantBikes<=5)){
        
        double discount = rentCost*0.3;
        
        rentCost = rentCost - discount;
        
        }
        return rentCost;
    }

    public Date getRentStarts() {
        return rentStarts;
    }

    public void setRentStarts(Date rentStarts) {
        this.rentStarts = rentStarts;
    }

    public Date getRentEnds() {
        return rentEnds;
    }

    public void setRentEnds(Date rentEnds) {
        this.rentEnds = rentEnds;
    }
    //Test week
    //private static Date rentStarts = new Date(118, 4, 24, 9, 30, 0);
    //private static Date rentEnds = new Date(118, 5, 9, 15, 50, 14);
    
    //Test day
    //private static Date rentStarts = new Date(118, 5, 2, 9, 30, 0);
    //private static Date rentEnds = new Date(118, 5, 9, 15, 50, 14);
    
    //Test hour
    //private static Date rentStarts = new Date(118, 5, 9, 9, 30, 0);
    //private static Date rentEnds = new Date(118, 5, 9, 15, 50, 14);
    
    //Test real
    //Asigna el momento en el que se hace click tanto en botón para empezar el alquiler, como en el botón de devolver 
    private static Date rentStarts = new Date();
    private static Date rentEnds = new Date();
    private static int cantBikes = 4;
    private static double rentCost = calculateCostPerWeek(calculatesRentTime(rentStarts, rentEnds));
    
   
}
