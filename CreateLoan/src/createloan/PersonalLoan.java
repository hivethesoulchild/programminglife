/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createloan;

/**
 *
 * @author Shower Flower
 */
public class PersonalLoan extends Loan {
    PersonalLoan(String loanNum, String lastName,
            double loanAmt, int term, double primeIntRate) {
        super(loanNum, lastName, loanAmt, term);
        super.interestRate = 0.02 / (primeIntRate / 100);
    }
}

