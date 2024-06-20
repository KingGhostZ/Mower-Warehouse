
public abstract class Mower {
	private String manufacturer;
	private int year;
	private String serialNumber;
	
	public Mower() {
		this.setManufacturer("");
		this.setYear(0);
		this.setSerialNumber("");
	}
	public Mower(String manufacturer, int year, String serialNumber) {
		this.setManufacturer(manufacturer);
		this.setYear(year);
		this.setSerialNumber(serialNumber);
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
    public String toString(){
        return "Manufacturer: " + this.manufacturer + "\nYear: " + this.year + "\nSerial Number: " + this.serialNumber;
    }

	
}
