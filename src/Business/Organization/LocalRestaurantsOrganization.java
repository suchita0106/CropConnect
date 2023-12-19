/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FarmerRole;
import Business.Role.LocalRestaurantAdminRole;
import Business.Role.LocalRestaurantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class LocalRestaurantsOrganization extends Organization{
    public LocalRestaurantsOrganization() {
        super(Organization.Type.LocalRestaurantsOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LocalRestaurantRole());
        return roles;
    }
}
