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
public class Client {
    
    public Client(long ID, String Name, String LastName, int age, String UserName, String ClientPass, String mail, String homeAdress) {
        
        this.ID = ID;
        this.Name = Name;
        this.LastName = LastName;
        this.age = age;
        this.UserName = UserName;
        this.ClientPass = ClientPass;
        this.mail = mail;
        this.homeAdress = homeAdress;
        
    }
    
    public long getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getClientPass() {
        return ClientPass;
    }

    public void setClientPass(String UserPass) {
        this.ClientPass = UserPass;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getHome() {
        return homeAdress;
    }

    public void setHome(String home) {
        this.homeAdress = home;
    }

    @Override
    public String toString() {
        return "Client{" + "ID = " + ID + ", Name = " + Name + ", LastName = " + 
                LastName + ", age = " + age + ", UserName = " + UserName + 
                ", ClientPass = " + ClientPass + ", mail = " + mail + ", home = " 
                + homeAdress + '}';
    }
    
    private long ID;
    private String Name;
    private String LastName;
    private int age;
    private String UserName;
    private String ClientPass;
    private String mail;
    private String homeAdress;

}
