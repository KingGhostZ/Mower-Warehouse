
public class GasPoweredMower extends WalkBehindMower{
	private Engine engine;
	private boolean selfPropelled;
	
	public GasPoweredMower(String manufacturer, int year, String serialNumber, double cutWidth, double wheelDiameter, Engine engine, boolean selfPropelled) {
		super(manufacturer, year, serialNumber, cutWidth, wheelDiameter);
		this.setEngine(new Engine());
		this.setSelfPropelled(selfPropelled);
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public boolean isSelfPropelled() {
		return selfPropelled;
	}

	public void setSelfPropelled(boolean selfPropelled) {
		this.selfPropelled = selfPropelled;
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
        return super.toString() + "\n" + engine + "\nSelf Propelled: " + selfPropelled;
    }
}
