
public class PushReelMower extends WalkBehindMower{
	private int numWheels;
	
	public PushReelMower(String manufacturer, int year, String serialNumber, double cutWidth, double wheelDiameter, int numWheels) {
		super(manufacturer, year, serialNumber, cutWidth, wheelDiameter);
		// TODO Auto-generated constructor stub
		this.setNumWheels(numWheels);
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}
	
	@Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public void setSerialNumber(String serialNumber) {
        super.setSerialNumber(serialNumber);
    }

    @Override
    public void setCutWidth(double cutWidth) {
        super.setCutWidth(cutWidth);
    }

    @Override
    public void setWheelDiameter(double wheelDiameter) {
        super.setWheelDiameter(wheelDiameter);
    }

	@Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public String getSerialNumber() {
        return super.getSerialNumber();
    }

    @Override
    public double getCutWidth() {
        return super.getCutWidth();
    }

    @Override
    public double getWheelDiameter() {
        return super.getWheelDiameter();
    }

    @Override
    public String toString(){
        return super.toString() + "\nNumber of Wheels: " + numWheels;
    }
}
