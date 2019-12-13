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
import java.util.InputMismatchException;

public abstract class Loan implements LoanConstants {
    String loanNum;
    String lastName;
    double loanAmt;
    double interestRate;
    int term;
    
    Loan(String loanNum, String lastName, double loanAmt, int term) {
        this.loanNum = loanNum;
        this.lastName = lastName.toUpperCase();
        
        
        try {
            if (loanAmt > MAX_LOAN_AMOUNT) {
                throw (new InputMismatchException("Loan amount value is over $100,000.00"));
            } else {
                this.loanAmt = loanAmt;
            }
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        
        switch (term) {
            case MEDIUM_TERM:
            case LONG_TERM:
                this.term = term;
                break;
                
            case SHORT_TERM:
            default:
                this.term = 1;
                break;
        }
    }
    
    public String toString() {
        return String.format("%s\t\t%s\t\t$%,.2f\t%.2f%%\t\t%d\t\t$%,.2f",
               this.loanNum, this.lastName, this.loanAmt, this.interestRate * 100,
               this.term, this.loanAmt + (this.loanAmt * this.interestRate));
    }
}
