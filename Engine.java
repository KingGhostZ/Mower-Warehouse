
public class Engine {
	private String manufacturer;
	private double horsePower;
	private int cylinders;
	
	public Engine() {
		this.manufacturer = "";
		this.horsePower = 0.0;
		this.cylinders = 0;
	}
	public Engine(String manufacturer, double horsePower, int cylinders) {
		this.manufacturer = manufacturer;
		this.horsePower = horsePower;
		this.cylinders = cylinders;
	}
	
	public int getCylinders() {
		return cylinders;
	}
	public void setCylinders(int cylinders) {
		this.cylinders = cylinders;
	}
	public double getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(double horsePower) {
		this.horsePower = horsePower;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
    public String toString(){
        return "Engine's Manufacturer: " + this.manufacturer + "\nEngine's Horse Power: " + this.horsePower + "\nEngine's Cylinders: " + this.cylinders;
    }

}