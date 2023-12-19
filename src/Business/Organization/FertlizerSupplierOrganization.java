/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FertlizerSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class FertlizerSupplierOrganization extends Organization{
    public FertlizerSupplierOrganization() {
        super(Organization.Type.FertlizerSupplierOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FertlizerSupplierRole());
        return roles;
    }
    
}
