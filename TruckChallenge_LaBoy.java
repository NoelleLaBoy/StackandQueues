package Challenge_1;

public class TruckChallenge_LaBoy {
    public static void main(String [] args) {
        TruckFleet_LaBoy warehouse = new TruckFleet_LaBoy();
        Truck_LaBoy truck1 = new Truck_LaBoy(15, 200, "Freehold");
        Truck_LaBoy truck2 = new Truck_LaBoy(7, 100, "Manalapan");
        Truck_LaBoy truck3 = new Truck_LaBoy(2, 75, "Colts Neck");
        Truck_LaBoy truck4 = new Truck_LaBoy(25, 300, "Howell");
        Truck_LaBoy truck5 = new Truck_LaBoy(21, 250, "Marlboro");

        warehouse.addTruck(truck1);
        warehouse.addTruck(truck2);
        warehouse.addTruck(truck3);
        warehouse.addTruck(truck4);
        warehouse.addTruck(truck5);

        Package_LaBoy package1 = new Package_LaBoy(20, "Manalapan", "101 Road St");
        Package_LaBoy package2 = new Package_LaBoy(100, "Manalapan", "300 Street Rd");
        Package_LaBoy package3 = new Package_LaBoy(150, "Freehold", "32 Avenue Rd");
        Package_LaBoy package4 = new Package_LaBoy(10, "Freehold", "1 Main St");
        Package_LaBoy package5 = new Package_LaBoy(15, "Freehold", "15 Temple Rd");
        Package_LaBoy package6 = new Package_LaBoy(16, "Freehold", "3 My Rd");
        Package_LaBoy package7 = new Package_LaBoy(1, "Marlboro", "4 Goldstein Way");
        Package_LaBoy package8 = new Package_LaBoy(15, "Marlboro", "15 CompSci Ct");
        Package_LaBoy package9 = new Package_LaBoy(35, "Freehold", "53 CompSci Ct");
        Package_LaBoy package10 = new Package_LaBoy(54, "Marlboro", "32 ColtsNeck Rd");

        warehouse.addPackage(package1);
        warehouse.addPackage(package2);
        warehouse.addPackage(package3);
        warehouse.addPackage(package4);
        warehouse.addPackage(package5);
        warehouse.addPackage(package6);
        warehouse.addPackage(package7);
        warehouse.addPackage(package8);
        warehouse.addPackage(package9);
        warehouse.addPackage(package10);

        warehouse.test();

        System.out.println("Truck1's next location: " + truck1.getNextLocation());
        System.out.println("Truck2's next location: " + truck2.getNextLocation());
        System.out.println("Truck3's next location: " + truck3.getNextLocation());
        System.out.println("Truck4's next location: " + truck4.getNextLocation());
        System.out.println("Truck5's next location: " + truck5.getNextLocation());


    }
}
