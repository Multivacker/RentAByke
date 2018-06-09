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
        
        System.out.println("La renta empezó el: " + rentStarts);
        
        System.out.println("La renta terminó el: " +rentEnds);
        
        System.out.println("El tiempo de la renta es: " + rentTime2);
        
        System.out.println("El costo de la renta es de: $ " + calculateCostPerHour(rentTime));
        
        System.out.println("El costo de la renta es de: $ " + calculateCostPerDay(rentTime));
        
        System.out.println("El costo de la renta es de: $ " + calculateCostPerWeek(rentTime));
        
        //System.out.println(calculatesDiscountForFamilyRental(rentCost));
    }
    
    
    /*Método que calcula el costo de la renta por hora, tiene una tolerancia
    de 15 minutos, pasado ese tiempo se le cobrará el recargo por minutos excedidos*/
    public static float calculateCostPerHour(Date rentTime){
        
        float rentCostPerHour = (rentTime.getHours())*5;
        
        float surchargePerMinute;
        
        if(rentTime.getMinutes()>15){
            
            surchargePerMinute = (float)(rentTime.getMinutes()*5)/60;
            
            rentCostPerHour = rentCostPerHour + surchargePerMinute;
            
        }
        
        return rentCostPerHour;
    }
    
    
    /*Método que calcula el costo de la renta por Día*/
    public static float calculateCostPerDay(Date rentTime){
        
        float rentCostPerDay = 0;
                
        if(rentTime.getDay()<7){
            
            rentCostPerDay = (rentTime.getDay())*20;
            
        }
       
        return rentCostPerDay; 
    }
    
    
    /*Método que calcula el costo de la renta por Semana*/
    public static float calculateCostPerWeek(Date rentTime){
        
       float rentCostPerWeek = (float)(rentTime.getDay()/7)*60;
            
       return rentCostPerWeek;
    }
    
    
    /*Método que aplica el descuento por plan familiar*/
    public float applyDiscountForFamilyRental(float rentCost){
        
        float discount = (float)((rentCost)*0.3);
        
        rentCost = rentCost-discount;
        
        return rentCost;
    }
    
    /*Método que calcula la diferencia entre dos Objetos de la clase Date*/
    public static Date calculatesRentTime(Date rentStarts, Date rentEnds){
        
        int timeDiference=(int)((rentEnds.getTime()-rentStarts.getTime())/1000);
 
        int days = 0;
        int hours = 0;
        int minutes = 0;
        if(timeDiference>86400) {
            days = (int)Math.floor(timeDiference/86400);
            timeDiference=timeDiference-(days*86400);
        }
        if(timeDiference>3600) {
            hours = (int)Math.floor(timeDiference/3600);
            timeDiference = timeDiference-(hours*3600);
        }
        if(timeDiference>60) {
            minutes = (int)Math.floor(timeDiference/60);
            timeDiference = timeDiference-(minutes*60);
        }
        
        System.out.println("Tiempo de renta: " + days + " dias, " + hours + " horas, " + minutes + " minutos y " + timeDiference + " segundos.");
        
        return rentTime;
    }
    
    
    private static Date rentStarts = new Date(118, 5,7, 9, 30, 0);
    private static Date rentTime = new Date(0, 0, 15, 2, 30, 0);//de prueba
    private static java.util.Date rentEnds = new java.util.Date();
    private static Date rentTime2 = new Date();

    
}
