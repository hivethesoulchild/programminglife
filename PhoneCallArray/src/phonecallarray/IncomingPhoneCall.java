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
public class IncomingPhoneCall extends PhoneCall{
    double RATE = 0.02; 
    public IncomingPhoneCall(String pn){
        super(pn);
        callprice = RATE;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public double getCallprice() {
        return callprice;
    }
    
    public void display(){
        super.display();
        System.out.println("Incoming phone call: "+getPhonenumber());
        System.out.println("rate: "+"$"+RATE);
        System.out.println("Price: "+"$"+getCallprice());
    }
}
