/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Rentals;

/**
 *
 * @author HP
 */
public class cCustomer extends Abstract{
    void display(){
        System.out.println("Display");
    }
    void run(){
        
    }
     //Data members
    private String CustomerID;
    private String Firstname;
    private String Surname;
    private String Address;
    private String Postcode;
    private String Town;
    private String ProveofID;
    private double Deposit;
    private double DownPayment;
    
//Accessor functions
    public String getCustomerID(){
        return CustomerID;
    }
    public void setCustomerID(String CustomerID){
        this.CustomerID = CustomerID;
    }
    
    public String getFirstname(){
        return Firstname;
    }
    public void setFirstname(String Firstname){
        this.Firstname = Firstname;
    }
    
    public String getSurname(){
        return Surname;
    }
    public void setSurname(String Surname){
        this.Surname = Surname;
    }
    
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    
    public String getPostcode(){
        return Postcode;
    }
    public void setPostcode(String Postcode){
        this.Postcode = Postcode;
    }
    
    public String getTown(){
        return Town;
    }
    public void setTown(String Town){
        this.Town = Town;
    }
    public String getProveofID(){
        return ProveofID;
    }
    public void setProveofID(String ProveofID){
        this.ProveofID = ProveofID;
    }
    
    public double getDeposit(){
        return Deposit;
    }
    public void setDeposit(double Deposit){
        this.Deposit = Deposit;
    }
    
    public double getDownPayment(){
        return DownPayment;
    }
    public void setDownPayment(double DownPayment){
        this.DownPayment = DownPayment;
    }

    void getDownPayment(double iCustPayment) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}




