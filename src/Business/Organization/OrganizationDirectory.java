/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author suchita
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.FarmerOrganization.getValue())){
            organization = new FarmerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.LocalRestaurantsOrganization.getValue())){
            organization = new LocalRestaurantsOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FruitSupplierOrganization.getValue())){
            organization = new FruitSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.VegetableSupplierOrganization.getValue())){
            organization = new VegetableSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MilkSupplierOrganization.getValue())){
            organization = new MilkSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SubsidyManagerOrganization.getValue())){
            organization = new SubsidyManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SubsidyBackgroundCheckOrganization.getValue())){
            organization = new SubsidyBackgroundCheckOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BankManagerOrganization.getValue())){
            organization = new BankManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.BankBackgroundCheckOrganization.getValue())){
            organization = new BankBackgroundCheckOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MircofinanceManagerOrganization.getValue())){
            organization = new MircofinanceManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MircofinanceBackgroundCheckOrganization.getValue())){
            organization = new MircofinanceBackgroundCheckOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.FertlizerSupplierOrganization.getValue())){
            organization = new FertlizerSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.SeedSupplierOrganization.getValue())){
            organization = new SeedSupplierOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.EquipmentSupplierOrganization.getValue())){
            organization = new EquipmentSupplierOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    
}
