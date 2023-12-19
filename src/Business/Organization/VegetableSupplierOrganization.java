/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SeedSupplierRole;
import Business.Role.VegetableSupplierRole;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class VegetableSupplierOrganization extends Organization{
    public VegetableSupplierOrganization() {
        super(Organization.Type.VegetableSupplierOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new VegetableSupplierRole());
        return roles;
    }
    
}
