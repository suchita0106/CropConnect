/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SubsidyBackgroundCheckRole;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class SubsidyBackgroundCheckOrganization extends Organization{
    public SubsidyBackgroundCheckOrganization() {
        super(Organization.Type.SubsidyBackgroundCheckOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SubsidyBackgroundCheckRole());
        return roles;
    }
    
}
