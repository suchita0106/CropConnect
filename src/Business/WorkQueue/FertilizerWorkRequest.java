/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author sakshee
 */
public class FertilizerWorkRequest extends WorkRequest{
    
     private String testResult;
    private String address;
    private String fertilzerName;
    private int quantity;
    private String name;

    public String getFertilzerName() {
        return fertilzerName;
    }

    public void setFertilzerName(String fertilzerName) {
        this.fertilzerName = fertilzerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFertilizerName() {
        return fertilzerName;
    }

    public void setFertilizerName(String fertilzerName) {
        this.fertilzerName = fertilzerName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
