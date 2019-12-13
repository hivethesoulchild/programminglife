/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecallarray;

public class OutgoingPhoneCall extends PhoneCall {
    double RATE = 0.04;
    int minutes;
    public OutgoingPhoneCall(String num, int min){
        super(num);
        minutes = min;
        callprice = min * RATE;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public double getCallprice() {
        return callprice;
    }
    
    public void display(){
        System.out.println("Outgoing phone call: "+getPhonenumber());
        System.out.println("Rate: "+"$"+ RATE);
        System.out.println("Minutes: "+minutes);
        System.out.println("Overall price: "+"$"+getCallprice());
    }
}
