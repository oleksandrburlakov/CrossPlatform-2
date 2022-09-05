public class Main {
    public static void main(String[] args) {
        System.out.println("Standard array:");
        MechanizedVehicle[] vehicles = {
                new BTR70(),
                new T64(),
                new BRM1K()
        };
        SortingManager sortingManager = new SortingManager(vehicles);
        printVehicles(vehicles);
        System.out.println("Armor by ascending:");
        vehicles = sortingManager.GetSortedByArmorTypeByAscending();
        printVehicles(vehicles);
        System.out.println("Armor by descending:");
        vehicles = sortingManager.GetSortedByArmorTypeByDescending();
        printVehicles(vehicles);
        System.out.println("Equipment number by ascending:");
        vehicles = sortingManager.GetSortedByEquipmentNumberByAscending();
        printVehicles(vehicles);
        System.out.println("Equipment number by descending:");
        vehicles = sortingManager.GetSortedByEquipmentNumberByDescending();
        printVehicles(vehicles);
    }

    public static void printVehicles(MechanizedVehicle[] vehicles) {
        System.out.printf("| %-8s | Fuel per kilometer | Number of equipage | %-12s |\n", "Name", "Armor type");
        for(int i = 0; i < vehicles.length; ++i) {
            MechanizedVehicle vehicle = vehicles[i];
            System.out.printf("| %-8s | %-18f | %-18d | %-12s |\n" ,
                    vehicle.getName(),
                    vehicle.getFuelPerKilometer(),
                    vehicle.getNumberOfEquipage(),
                    vehicle.getArmorType().toString());
        }
    }
}