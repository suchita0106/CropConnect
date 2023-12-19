/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author sakshee
 */
public class BankLoanWorkRequest extends WorkRequest{
    
    private String testResult;
    private int age;
    private String address;
    private String bankName;
    private int loanAmount;
    private String loanResaon;
    private int annualIncome;
    private String agricultureLandAdd;
    private String agricultureLandValue;
    private String emailId;
    private long phoneNo;
    private String pancardPath;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPancardPath() {
        return pancardPath;
    }

    public void setPancardPath(String pancardPath) {
        this.pancardPath = pancardPath;
    }

    public int getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(int annualIncome) {
        this.annualIncome = annualIncome;
    }

    public String getAgricultureLandAdd() {
        return agricultureLandAdd;
    }

    public void setAgricultureLandAdd(String agricultureLandAdd) {
        this.agricultureLandAdd = agricultureLandAdd;
    }

    public String getAgricultureLandValue() {
        return agricultureLandValue;
    }

    public void setAgricultureLandValue(String agricultureLandValue) {
        this.agricultureLandValue = agricultureLandValue;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanResaon() {
        return loanResaon;
    }

    public void setLoanResaon(String loanResaon) {
        this.loanResaon = loanResaon;
    }

    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
