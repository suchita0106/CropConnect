/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.MircofinanceManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class MircofinanceManagerOrganization extends Organization{
    public MircofinanceManagerOrganization() {
        super(Organization.Type.MircofinanceManagerOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new MircofinanceManagerRole());
        return roles;
    }
    
}
