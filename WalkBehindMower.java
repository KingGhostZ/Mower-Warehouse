
public abstract class WalkBehindMower extends Mower{
	private double cutWidth;
	private double wheelDiameter;
	
	public WalkBehindMower(String manufacturer, int year, String serialNumber, double cutWidth, double wheelDiameter) {
		super(manufacturer, year, serialNumber);
		this.cutWidth = cutWidth;
		this.wheelDiameter = wheelDiameter;
	}

	public double getCutWidth() {
		return cutWidth;
	}

	public void setCutWidth(double cutWidth) {
		this.cutWidth = cutWidth;
	}
	
	public void setWheelDiameter(double wheelDiameter) {
		this.wheelDiameter = wheelDiameter;
	}
	
	public double getWheelDiameter() {
		return this.wheelDiameter;
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
    public String toString(){
        return super.toString() + "\nCut Width: " + cutWidth + "\nWheel Diameter: " + wheelDiameter;
    }

}