package cct_fx.entities;
// Generated Feb 25, 2016 4:18:34 PM by Hibernate Tools 4.3.1



/**
 * LoanDetails generated by hbm2java
 */
public class LoanDetails  implements java.io.Serializable {


     private int clientId;
     private String product;
     private String amount;
     private String initialDeposit;
     private int term;
     private String outstandingAmount;
     private String monthlyAmount;

    public LoanDetails() {
    }

    public LoanDetails(int clientId, String product, String amount, String initialDeposit, int term, String outstandingAmount, String monthlyAmount) {
       this.clientId = clientId;
       this.product = product;
       this.amount = amount;
       this.initialDeposit = initialDeposit;
       this.term = term;
       this.outstandingAmount = outstandingAmount;
       this.monthlyAmount = monthlyAmount;
    }
   
    public int getClientId() {
        return this.clientId;
    }
    
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public String getProduct() {
        return this.product;
    }
    
    public void setProduct(String product) {
        this.product = product;
    }
    public String getAmount() {
        return this.amount;
    }
    
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getInitialDeposit() {
        return this.initialDeposit;
    }
    
    public void setInitialDeposit(String initialDeposit) {
        this.initialDeposit = initialDeposit;
    }
    public int getTerm() {
        return this.term;
    }
    
    public void setTerm(int term) {
        this.term = term;
    }
    public String getOutstandingAmount() {
        return this.outstandingAmount;
    }
    
    public void setOutstandingAmount(String outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }
    public String getMonthlyAmount() {
        return this.monthlyAmount;
    }
    
    public void setMonthlyAmount(String monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }




}


