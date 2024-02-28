package Challenge_1;
import java.util.*;
public class Truck_LaBoy {
    private int maxCapacity;
    private double maxWeight;
    private String servingArea;
    private String location;
    private Stack<Package_LaBoy> packages;
    private Queue<Package_LaBoy> storage;

    public Truck_LaBoy(int maxCapacity, double maxWeight, String servingArea) {
        this.maxCapacity = maxCapacity;
        this.maxWeight = maxWeight;
        this.servingArea = servingArea;
        this.location = "Warehouse";
        this.packages = new Stack<>();
        this.storage = new LinkedList<>();
    }

    public int getPackageCount() {
        return packages.size();
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public String getServingArea() {
        return servingArea;
    }

    public String getLocation() {
        return location;
    }


    public double getCurrentWeight() {
        double weight = 0;
        for (Package_LaBoy p : packages) {
            weight += p.getWeight();
        }
        return weight;
    }

    public String getNextLocation() {
        return location;
    }

    public boolean loadPackage(Package_LaBoy pack) {
        if (packages.size() < maxCapacity && getCurrentWeight() + pack.getWeight() <= maxWeight) {
            packages.push(pack);
            return true;
        }
        return false;
    }

    public Package_LaBoy unloadPackage() {
        if (!packages.isEmpty()) {
            return packages.pop();
        }
        return null;
    }

    public void deliverPackages() {

    }

    public void returnToWarehouse() {

    }
}

