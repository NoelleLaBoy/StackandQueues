package Challenge_1;
import java.util.*;
public class TruckFleet_LaBoy {
    private ArrayList<Truck_LaBoy> trucks;
    public TruckFleet_LaBoy() {
        this.trucks = new ArrayList<>();
    }
    public void addTruck(Truck_LaBoy truck) {
        trucks.add(truck);
    }
    public void addPackage(Package_LaBoy pack) {
        boolean loaded = false;
        for (Truck_LaBoy truck : trucks) {
            if (truck.getLocation().equals("Warehouse") && truck.getServingArea().equals(pack.getDestinationArea())) {
                if (truck.loadPackage(pack)) {
                    loaded = true;
                    break;
                }
            }
        }
        if (!loaded) {

        }
    }
    public Package_LaBoy searchPackage(String destinationAddress) {
        return null;
    }
    public Truck_LaBoy searchTruck(String servingArea) {
        return null;
    }
    public void declarePackageDelivered(Package_LaBoy pack) {

    }
    public void declareTruckReturned(Truck_LaBoy truck) {

    }

    public String test() {
        return null;
    }
}
