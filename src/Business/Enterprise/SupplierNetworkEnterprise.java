/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class SupplierNetworkEnterprise extends Enterprise{
    
    public SupplierNetworkEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Supplier);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
