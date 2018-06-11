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
public class Bike {

    public Bike(long ID, String brand, String model, int wheelSize, boolean fondable) {
        
        this.brand = brand;
        this.model = model;
        this.wheelSize = wheelSize;
        this.fondable = fondable;
    }

    public long getID() {
        return ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public boolean isFondable() {
        return fondable;
    }

    public void setFondable(boolean fondable) {
        this.fondable = fondable;
    }

    @Override
    public String toString() {
        return "Bike{" + "ID = " + ID + ", brand = " + brand + ", model = " + 
                model + ", wheelSize = " + wheelSize + ", fondable = " + fondable + '}';
    }
    
private final long ID = 0; 
private String brand = "";
private String model = "";
private int wheelSize = 0;
private boolean fondable = false;
    
}

