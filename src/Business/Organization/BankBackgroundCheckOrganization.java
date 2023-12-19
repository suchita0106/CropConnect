/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.BankBackgroundCheckRole;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class BankBackgroundCheckOrganization extends Organization{
    
    public BankBackgroundCheckOrganization() {
        super(Organization.Type.BankBackgroundCheckOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BankBackgroundCheckRole());
        return roles;
    }
    
}
