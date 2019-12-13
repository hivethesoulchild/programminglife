/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecallarray;

public class PhoneCallArray {

    public static void main(String[] args) {
        PhoneCall nokdu[] = new PhoneCall[10];
        int x;
        nokdu[0] = new IncomingPhoneCall("456789123");
        nokdu[1] = new OutgoingPhoneCall("324567889",60);
        nokdu[2] = new IncomingPhoneCall("764387913");
        nokdu[3] = new OutgoingPhoneCall("445218965",250);
        nokdu[4] = new IncomingPhoneCall("145465675");
        nokdu[5] = new OutgoingPhoneCall("584123675",880);
        nokdu[6] = new IncomingPhoneCall("632145897");
        nokdu[7] = new IncomingPhoneCall("014528744");
        nokdu[8] = new IncomingPhoneCall("639854714");
        nokdu[9] = new OutgoingPhoneCall("543147558",300);

        for (x = 0; x < nokdu.length; ++x) {
            System.out.println("Phone Number: " + nokdu[x].getPhonenumber() + " costs $" + nokdu[x].getCallprice());
        }
    }
}
