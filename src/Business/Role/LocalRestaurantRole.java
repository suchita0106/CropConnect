/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LocalRestaurantsOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.FarmerRole.FarmerWorkAreaJPanel;
import userinterface.localrestaurants.LRestaurantsWorkAreaJPanel;

/**
 * 
 * @author suchita
 */
public class LocalRestaurantRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new LRestaurantsWorkAreaJPanel(userProcessContainer, account, (LocalRestaurantsOrganization)organization, enterprise, system);
    }
    public String toString() {
        return Role.RoleType.LocalRestaurantRole.getValue();
    }
}
