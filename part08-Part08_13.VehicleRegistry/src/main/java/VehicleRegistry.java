
import java.util.HashMap;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author be-krishna
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> licenses;

    public VehicleRegistry() {
        this.licenses = new HashMap();
    }

    public boolean add(LicensePlate license, String owner) {
        if (this.licenses.containsKey(license)) {
            return false;
        }
        this.licenses.put(license, owner);
        return true;
    }

    public String get(LicensePlate license) {
        return this.licenses.getOrDefault(license, null);
    }

    public boolean remove(LicensePlate license) {
        if (!this.licenses.containsKey(license)) {
            return false;
        }

        this.licenses.remove(license);

        if (!this.licenses.containsKey(license)) {
            return true;
        }

        return false;
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : this.licenses.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
            }
        }

        owners.forEach((owner) -> {
            System.out.println(owner);
        });

    }

    public void printLicensePlates() {
        for (LicensePlate license : this.licenses.keySet()) {
            System.out.println(license);
        }
    }
}
