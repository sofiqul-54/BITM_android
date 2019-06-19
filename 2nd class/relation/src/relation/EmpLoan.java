/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relation;

/**
 *
 * @author Mobile App Develop
 */
public class EmpLoan {
    private String loan_amount;
    private String interest_rate;
    private String duration;

    public EmpLoan(String loan_amount, String interest_rate, String duration) {
        this.loan_amount = loan_amount;
        this.interest_rate = interest_rate;
        this.duration = duration;
    }

    public String getLoan_amount() {
        return loan_amount;
    }

    public void setLoan_amount(String loan_amount) {
        this.loan_amount = loan_amount;
    }

    public String getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(String interest_rate) {
        this.interest_rate = interest_rate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "EmpLoan{" + "loan_amount=" + loan_amount + ", interest_rate=" + interest_rate + ", duration=" + duration + '}';
    }
    
    
}
