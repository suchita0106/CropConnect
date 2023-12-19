/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author suchita
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        BankAdminRole("Bank Admin"),
        BankBackgroundCheckRole("Bank Background-Check"),
        BankManagerRole("Bank Manager"),
        EquipmentSupplierRole("Equipment Supplier"),
        FarmerAssoicationAdminRole("Farmer Assoication Admin"),
        LocalRestaurantAdminRole("Restaurant Assoication Admin"),
        LocalRestaurantRole("Restaurant Assoication Admin"),
        FarmerRole("Farmer Assoication Admin"),
        FertlizerSupplierRole("Fertlizer Supplier"),
        MircofinanceBackgroundCheckRole("Mircofinance Background-Check"),
        MircofinanceInstitutionAdminRole("Mircofinance Institution Admin"),
        MircofinanceManagerRole("Mircofinance Manager"),
        SeedSupplierRole("Seed Supplier"),
        VegetableSupplierRole("Vegetable Supplier"),
        FruitSupplierRole("Fruit Supplier"),
        MilkSupplierRole("Milk Supplier"),
        SubsidyAdminRole("Government Admin"),
        SubsidyBackgroundCheckRole("Subsidy Background-Check"),
        SubsidyManagerRole("Subsidy Manager"),
        SupplierAdminRole("Supplier Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
}
