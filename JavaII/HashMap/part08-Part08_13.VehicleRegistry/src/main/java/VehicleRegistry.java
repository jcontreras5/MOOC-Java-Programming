
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jon
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
        this.vehicleRegistry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleRegistry.get(licensePlate) == null) {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        if (this.vehicleRegistry.containsKey(licensePlate)) {
            return this.vehicleRegistry.get(licensePlate);
        }
        return null;
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.vehicleRegistry.containsKey(licensePlate)) {
            this.vehicleRegistry.remove(licensePlate);
            return true;
        }

        return false;

    }

    public void printLicensePlates() {
        for (LicensePlate plate : this.vehicleRegistry.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner :this.vehicleRegistry.values()) {
            if(!(owners.contains(owner)))
                System.out.println(owner);
                owners.add(owner);
        }
    }

}
