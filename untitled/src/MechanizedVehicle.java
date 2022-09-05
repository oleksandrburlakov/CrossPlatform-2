public abstract class MechanizedVehicle {
    protected double fuelPerKilometer;
    protected int numberOfEquipage;
    protected ArmorType armorType;
    protected String name;

    public int getNumberOfEquipage() {
        return this.numberOfEquipage;
    }

    public double getFuelPerKilometer() {
        return this.fuelPerKilometer;
    }

    public String getName() {return this.name;}
    public ArmorType getArmorType() {
        return armorType;
    }
}
