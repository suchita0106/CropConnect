/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EquipmentSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class EquipmentSupplierOrganization extends Organization{
    
    public EquipmentSupplierOrganization() {
        super(Organization.Type.EquipmentSupplierOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EquipmentSupplierRole());
        return roles;
    }
    
}
