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
        
    Client client0000001 = new Client(000001, "Richard", "Wells", 38, "richiebyker", "rich1979", "richwells@gmail.com", "none");
    Client client0000002 = new Client(000002, "Mariah", "Stevenson", 30, "marstve", "themarstve", "furiousprincess@gmail.com", "none");
    Client client0000003 = new Client(000003, "Lisa", "Mavericks", 23, "marvelous", "marvelous", "maverickslisa@gmail.com", "Evergreen Terrace 742");
    Client client0000004 = new Client(000004, "Peter", "Jackson", 56, "theringbyker", "porirua1961", "petejackproductions@prodarea.com", "none");
    Client client0000005 = new Client(000005, "Camila", "Gomez", 19, "marvelous", "marvelous", "maverickslisa@gmail.com", "none");
    
    Bike AB001 = new Bike(374823472, "A-bike", "New Electrify Spencer", 24, true);
    Bike BB018 = new Bike(567867877, "Battaglin", "Glory", 26, false);
    Bike XC009 = new Bike(987897774, "Xootr ", "Professional fly", 29, false);
    Bike WW201 = new Bike(335454555, "Wanderer", "Wonder Spectrum", 29, false);
    Bike AC200 = new Bike(876678671, "Alldays & Onions", "New 2018", 29, false);
    
    //Test method week for 1 bike
    Date dateImpress1 = new Date();
    Date rentStarts1 = new Date(118, 4, 24, 9, 30, 0);
    Date rentEnds1 = new Date(118, 5, 9, 15, 50, 14);
    RentTime rentTime1 = RentTime.calculatesRentTime(rentStarts1, rentEnds1);
    int cantBikes1 = 1;
    double finalprice1 = Ticket.calculatesFinalprice(rentTime1, cantBikes1);
    Ticket Bill000076597878 = new Ticket(76597878, dateImpress1, cantBikes1, rentEnds1, rentStarts1, rentTime1, finalprice1);
    
    
    //Test method day for 2 bikes
    Date DateImpress2 = new Date();
    Date rentStarts2 = new Date(118, 5, 4, 9, 18, 0);
    Date rentEnds2 = new Date(118, 5, 9, 15, 50, 14);
    RentTime rentTime2 = RentTime.calculatesRentTime(rentStarts2, rentEnds2);
    int cantBikes2 = 2;
    double finalprice2 = Ticket.calculatesFinalprice(rentTime2, cantBikes2);
    Ticket Bill000076597879 = new Ticket(76597879, DateImpress2, cantBikes2, rentStarts2, rentEnds2, rentTime2, finalprice2);
    
    //Test method hour for 3 bikes
    Date DateImpress3 = new Date();
    Date rentStarts3 = new Date(118, 5, 9, 9, 10, 0);
    Date rentEnds3 = new Date(118, 5, 9, 15, 50, 14);
    RentTime rentTime3 = RentTime.calculatesRentTime(rentStarts3, rentEnds3);
    int cantBikes3 = 3;
    double finalprice3 = Ticket.calculatesFinalprice(rentTime3, cantBikes3);
    Ticket Bill000076597880 = new Ticket(76597880, DateImpress3, cantBikes3, rentStarts3, rentEnds3, rentTime3, finalprice3);
    
    //Test method hours and applyDiscountForFamilyRental for 4 bikes 
    Date DateImpress4 = new Date();
    Date rentStarts4 = new Date(118, 5, 9, 9, 30, 0);
    Date rentEnds4 = new Date(118, 5, 9, 15, 50, 14);
    RentTime rentTime4 = RentTime.calculatesRentTime(rentStarts4, rentEnds4);
    int cantBikes4 = 4;
    double finalprice4 = Ticket.calculatesFinalprice(rentTime4, cantBikes4);
    Ticket Bill000076597881 = new Ticket(76597881, DateImpress4, cantBikes4, rentStarts4, rentEnds4, rentTime4, finalprice4);
    
    //Test method week without surcharge
    Date DateImpress5 = new Date();
    Date rentStarts5 = new Date(118, 5, 5, 9, 30, 0);
    Date rentEnds5 = new Date(118, 5, 12, 9, 40, 0);
    RentTime rentTime5 = RentTime.calculatesRentTime(rentStarts5, rentEnds5);
    int cantBikes5 = 1;
    double finalprice5 = Ticket.calculatesFinalprice(rentTime5, cantBikes5);
    Ticket Bill000076597882 = new Ticket(76597882, DateImpress5, cantBikes5, rentStarts5, rentEnds5, rentTime5, finalprice5);
    
    //Test method hour without surcharge
    Date DateImpress6 = new Date();
    Date rentStarts6 = new Date(118, 5, 9, 8, 0, 0);
    Date rentEnds6 = new Date(118, 5, 9, 15, 10, 0);
    RentTime rentTime6 = RentTime.calculatesRentTime(rentStarts6, rentEnds6);
    int cantBikes6 = 1;
    double finalprice6 = Ticket.calculatesFinalprice(rentTime6, cantBikes6);
    Ticket Bill000076597883 = new Ticket(76597883, DateImpress6, cantBikes6, rentStarts6, rentEnds6, rentTime6, finalprice6);
    
    //Test method day when renTime is empty
    Date DateImpress7 = new Date();
    Date rentStarts7 = new Date();
    Date rentEnds7 = new Date();
    RentTime rentTime7 = RentTime.calculatesRentTime(rentStarts7, rentEnds7);
    int cantBikes7 = 1;
    double finalprice7 = Ticket.calculatesFinalprice(rentTime7, cantBikes7);
    Ticket Bill000076597884 = new Ticket(76597884, DateImpress7, cantBikes7, rentStarts7, rentEnds7, rentTime7, finalprice7);
    
    //Test method if weeks, days, hours and minutes are 0
    Date DateImpress8 = new Date();
    Date rentStarts8 = new Date(118, 5, 12, 15, 50, 0);
    Date rentEnds8 = new Date(118, 5, 12, 15, 50, 0);
    RentTime rentTime8 = RentTime.calculatesRentTime(rentStarts8, rentEnds8);
    int cantBikes8 = 1;
    double finalprice8 = Ticket.calculatesFinalprice(rentTime8, cantBikes8);
    Ticket Bill000076597885 = new Ticket(76597885, DateImpress8, cantBikes8, rentStarts8, rentEnds8, rentTime8, finalprice8);
    
    //Test method when the client forgot to return the bicycle in one year, calculates per weeks(unreal)
    Date DateImpress9 = new Date();
    Date rentStarts9 = new Date(117, 5, 12, 9, 30, 0);
    Date rentEnds9 = new Date(118, 5, 12, 15, 0, 0);
    RentTime rentTime9 = RentTime.calculatesRentTime(rentStarts9, rentEnds9);
    int cantBikes9 = 1;
    double finalprice9 = Ticket.calculatesFinalprice(rentTime9, cantBikes9);
    Ticket Bill000076597886 = new Ticket(76597886, DateImpress9, cantBikes9, rentStarts9, rentEnds9, rentTime9, finalprice9);
    
    //Test method week with surcharge for 5 bikes
    Date DateImpress10 = new Date();
    Date rentStarts10 = new Date(118, 4, 3, 9, 30, 0);
    Date rentEnds10 = new Date(118, 5, 12, 15, 0, 0);
    RentTime rentTime10 = RentTime.calculatesRentTime(rentStarts10, rentEnds10);
    int cantBikes10 = 5;
    double finalprice10 = Ticket.calculatesFinalprice(rentTime10, cantBikes10);
    Ticket Bill000076597887 = new Ticket(76597887, DateImpress10, cantBikes10, rentStarts10, rentEnds10, rentTime10, finalprice10);
      
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 1 ///method week for 1 bike with surcharge per day---------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597878, client0000001, AB001));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 2 ///Test method day for 2 bikes---------------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597879, client0000002, BB018));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 3 ///Test method hour for 3 bikes with surcharge per minutes-----");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597880, client0000003, XC009));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 4 ///method hours and applyDiscountForFamilyRental for 4 bikes---");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597881, client0000004, WW201));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 5 ///method week for 1 bike without surcharge--------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597882, client0000005, AC200));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 6 ///method hour for 1 bike without surcharge--------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597883, client0000001, AB001));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 7 ///method day when renTime is empty----------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597884, client0000002, XC009));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 8 ///method if weeks, days, hours and minutes are 0--------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597885, client0000003, WW201));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 9 /method when the client forgot to return the bicycle in one year,"
                + '\n' + "calculates per weeks(unreal)");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597886, client0000004, BB018));
        System.out.println("");
        System.out.println("");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Test 10 ///Test method week with surcharge for 5 bikes----------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(Ticket.printTicket(Bill000076597887, client0000005, BB018));
       
    }
    
    
    
    
}

