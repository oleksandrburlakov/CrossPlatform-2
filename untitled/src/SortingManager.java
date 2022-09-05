import java.util.Arrays;
import java.util.Comparator;

public class SortingManager {
    private MechanizedVehicle[] vehicles;

    public SortingManager(MechanizedVehicle[] vehicles) {
        this.vehicles = Arrays.copyOf(vehicles, vehicles.length);
    }

    public MechanizedVehicle[] GetSortedByEquipmentNumberByDescending() {
        MechanizedVehicle[] localCopy = Arrays.copyOf(vehicles, vehicles.length);
        Comparator<MechanizedVehicle> anonymousComparator = (o1, o2) -> {
            return o2.getNumberOfEquipage() - o1.getNumberOfEquipage();
        };

        for (int i = 0; i < localCopy.length; ++i) {
            for (int j = 0; j < localCopy.length - 1 - i; ++j) {
                MechanizedVehicle first = localCopy[j];
                MechanizedVehicle second = localCopy[j + 1];
                int result = anonymousComparator.compare(first, second);
                if (result > 0) {
                    localCopy[j] = second;
                    localCopy[j + 1] = first;
                }
            }
        }
        return localCopy;
    }

    public MechanizedVehicle[] GetSortedByEquipmentNumberByAscending() {
        MechanizedVehicle[] localCopy = Arrays.copyOf(vehicles, vehicles.length);
        Comparator<MechanizedVehicle> anonymousComparator = new Comparator<MechanizedVehicle>() {
            @Override
            public int compare(MechanizedVehicle o1, MechanizedVehicle o2) {
                return o1.getNumberOfEquipage() - o2.getNumberOfEquipage();
            }
        };

        for (int i = 0; i < localCopy.length; ++i) {
            for (int j = 0; j < localCopy.length - 1 - i; ++j) {
                MechanizedVehicle first = localCopy[j];
                MechanizedVehicle second = localCopy[j + 1];
                int result = anonymousComparator.compare(first, second);
                if (result > 0) {
                    localCopy[j] = second;
                    localCopy[j + 1] = first;
                }
            }
        }
        return localCopy;
    }


    public MechanizedVehicle[] GetSortedByArmorTypeByDescending() {
        MechanizedVehicle[] localCopy = Arrays.copyOf(vehicles, vehicles.length);
        MechanizeVehicleArmorDescendingComparer comparer = new SortingManager.MechanizeVehicleArmorDescendingComparer();
        for (int i = 0; i < localCopy.length; ++i) {
            for (int j = 0; j < localCopy.length - 1 - i; ++j) {
                MechanizedVehicle first = localCopy[j];
                MechanizedVehicle second = localCopy[j + 1];
                int result = comparer.Compare(first, second);
                if (result > 0) {
                    localCopy[j] = second;
                    localCopy[j + 1] = first;
                }
            }
        }
        return localCopy;
    }

    public MechanizedVehicle[] GetSortedByArmorTypeByAscending() {
        MechanizedVehicle[] localCopy = Arrays.copyOf(vehicles, vehicles.length);
        MechanizeVehicleArmorAscendingStaticComparer comparer = new MechanizeVehicleArmorAscendingStaticComparer();
        for (int i = 0; i < localCopy.length; ++i) {
            for (int j = 0; j < localCopy.length - 1 - i; ++j) {
                MechanizedVehicle first = localCopy[j];
                MechanizedVehicle second = localCopy[j + 1];
                int result = comparer.Compare(first, second);
                if (result > 0) {
                    localCopy[j] = second;
                    localCopy[j + 1] = first;
                }
            }
        }
        return localCopy;
    }

    public class MechanizeVehicleArmorDescendingComparer {
        public int Compare(MechanizedVehicle first, MechanizedVehicle second) {
            return (-1) * first.armorType.compareTo(second.armorType);
        }
    }

    public static class MechanizeVehicleArmorAscendingStaticComparer {
        public int Compare(MechanizedVehicle first, MechanizedVehicle second) {
            return first.armorType.compareTo(second.armorType);
        }
    }
}
