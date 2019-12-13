/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecallarray;

/**
 *
 * @author Shower Flower
 */
public abstract class PhoneCall {
    public String phonenumber;
    public double callprice;

    public PhoneCall(String pn) {
        phonenumber = pn;
        callprice = 0.0;
    }

    public void setCallprice(double callprice) {
        this.callprice = callprice;
    }
    
    public abstract String getPhonenumber();
    public abstract double getCallprice() ;
    public void display(){
        System.out.println("Phone number: "+phonenumber);
        System.out.println("Price of the call: "+callprice);
    }
}
