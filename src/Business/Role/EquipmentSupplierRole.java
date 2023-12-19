/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EquipmentSupplierOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EquipmentSupplierRole.EquipmentSupplierWorkAreaJPanel;

/**
 *
 * @author suchita
 */
public class EquipmentSupplierRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EquipmentSupplierWorkAreaJPanel(userProcessContainer, account, (EquipmentSupplierOrganization)organization, enterprise, business);
    }
    public String toString() {
        return Role.RoleType.EquipmentSupplierRole.getValue();
    }
}
