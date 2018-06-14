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
public class Ticket {

    public Ticket(long ticketNumber, Date DateImpress, int cantBikes, Date rentStarts, Date rentEnds, RentTime rentTime, double finalprice) {
        
        this.ticketNumber=ticketNumber;
        this.DateImpress=DateImpress;
        this.cantBikes=cantBikes;
        this.rentStarts=rentStarts;
        this.rentEnds=rentEnds;
        this.rentTime=rentTime;
        this.finalprice=finalprice;
        
    }
    
    public long getTicketNumber() {
        return ticketNumber;
    }

    public Date getDateImpress() {
        return DateImpress;
    }

    public void setDateImpress(Date DateImpress) {
        this.DateImpress = DateImpress;
    }

    public int getCantBikes() {
        return cantBikes;
    }

    public void setCantBikes(int cantBikes) {
        this.cantBikes = cantBikes;
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
    
    public RentTime getRentTime() {
        return rentTime;
    }

    public void setRentTime(RentTime rentTime) {
        this.rentTime = rentTime;
    }

    public double getFinalprice() {
        return finalprice;
    }

    /*Método que calcula el costo de la renta por hora, tiene una tolerancia
    de 15 minutos, pasado ese tiempo se le cobrará el recargo por minutos excedidos*/
    public static double calculateCostPerHour(RentTime rentTime, int cantBikes){
        
        double rentCostPerHour = (rentTime.getHours())*5;
        
        double surchargePerMinute;
        
        if(rentTime.getMinutes()>15){
            
            surchargePerMinute = (double)(rentTime.getMinutes()*5)/60;
            
            rentCostPerHour = (rentCostPerHour + surchargePerMinute);
            
        }
        
        return rentCostPerHour*cantBikes;
    }
    
    /*Método que calcula el costo de la renta por Día*/
    public static double calculateCostPerDay(RentTime rentTime, int cantBikes){
        
        double rentCostPerDay = 0;
                
        if(rentTime.getDays()<7){
            
            rentCostPerDay = (rentTime.getDays())*20;
            
        }
       
        return (rentCostPerDay)*cantBikes; 
    }
    
    /*Método que calcula el costo de la renta por Semana*/
    public static double calculateCostPerWeek(RentTime rentTime, int cantBikes){
       
        double rentCostPerWeek = rentTime.getWeeks()*60;
        
        double surchargePerDay;
        
        if(rentTime.getDays()%7!=0){
            
            surchargePerDay = (rentTime.getDays()%7)*20;
            
            rentCostPerWeek = (rentCostPerWeek + surchargePerDay)*cantBikes;
            
        }
        
        return rentCostPerWeek;
    }
    
    //Método que elije la promoción que se va a aplicar segín el tiempo de alquiler
    //y la cantidad de bicicletas alquiladas.
    public static double calculatesFinalprice(RentTime rentTime, int cantBikes) {
        
        double finalprice = 0;
        
        
        if(rentTime.getDays()>=7){
            
            finalprice = calculateCostPerWeek(rentTime, cantBikes);
        
            }else if (rentTime.getDays()<7 && rentTime.getDays()>0){
        
                finalprice = calculateCostPerDay(rentTime, cantBikes);
            
                }else if(rentTime.getWeeks()<1 && rentTime.getDays()<1 ){
                    
                    finalprice = calculateCostPerHour(rentTime, cantBikes);
                 
                    }else{
                    
                    finalprice = 0;
                    
                }
        
        if((cantBikes>=3)&&(cantBikes<=5)){
            
            double discount = finalprice*0.3;
        
            finalprice = finalprice - discount;
        }
        
        return finalprice;
    }
    
    public static String printTicket(Ticket ticket, Client client, Bike bike){
        
        return "RentAByke - your bike shop!         St. Mankato Mississippi 96522, USA" 
        + '\n' + ticket.getDateImpress() 
        + "         Client:" + client.getUserName() + ", " + client.getLastName() 
        + " " + client.getName() + "." + '\n' + "You rent " + ticket.getCantBikes() 
        + " byke: " + bike.getBrand() + ", " + bike.getModel()
        + '\n' + "Your rental time was: " + ticket.getRentTime()
        + '\n' + "Final price: $ " + String.format("%.2f", ticket.getFinalprice());
    }

    @Override
    public String toString() {
        return "Ticket{" + "ticketNumber=" + ticketNumber + ", DateImpress=" + DateImpress + ", cantBikes=" + cantBikes + ", rentStarts=" + rentStarts + ", rentEnds=" + rentEnds + ", rentTime=" + rentTime + ", finalprice=" + finalprice + '}';
    }

    
    private final long ticketNumber;
    private Date DateImpress;
    private int cantBikes;
    private Date rentStarts;
    private Date rentEnds; 
    private RentTime rentTime;
    private final double finalprice;
    
}
