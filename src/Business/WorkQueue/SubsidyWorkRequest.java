/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author sakshee
 */
public class SubsidyWorkRequest extends WorkRequest{
    
    private String testResult;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private int age;
    private String address;
    private String bankName;
    private int expectedIncome;
    private int actualIncome;
    private String emailId;
    private long phoneNo;
    private String proofPath;

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

    public String getProofPath() {
        return proofPath;
    }

    public void setProofPath(String proofPath) {
        this.proofPath = proofPath;
    }

    public int getExpectedIncome() {
        return expectedIncome;
    }

    public void setExpectedIncome(int expectedIncome) {
        this.expectedIncome = expectedIncome;
    }

    public int getActualIncome() {
        return actualIncome;
    }

    public void setActualIncome(int actualIncome) {
        this.actualIncome = actualIncome;
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
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
