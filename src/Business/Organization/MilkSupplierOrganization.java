/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MilkSupplierRole;
import Business.Role.Role;
import Business.Role.SeedSupplierRole;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class MilkSupplierOrganization extends Organization{
    public MilkSupplierOrganization() {
        
        super(Organization.Type.MilkSupplierOrganization.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MilkSupplierRole());
        return roles;
    }
    
}
