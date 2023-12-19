/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.FarmersAssociation){
            enterprise=new GreenWorkerAssociation(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.LocalRestaurantsEnterprise){
            enterprise=new LocalRestaurantsEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Govenment){
            enterprise=new PublicServiceEnterprise(name); 
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Supplier){
            enterprise=new SupplierNetworkEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.Bank){
            enterprise=new BankEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if(type==Enterprise.EnterpriseType.MicrofinanceInstitution){
            enterprise=new MicrofinanceInstitutionEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
    
}
