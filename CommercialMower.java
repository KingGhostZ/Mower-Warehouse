
public class CommercialMower extends LawnTractor{
	private double operatingHours;
	private boolean zeroTurnRadius;
	
	public CommercialMower() {
		this.setOperatingHours(0.0);
		this.setZeroTurnRadius(false);
	}
	public CommercialMower(String manufacturer, int year, String serialNumber, Engine engine, String model, double deckWidth, double operatingHours, boolean zeroTurnRadius){
        super(manufacturer, year, serialNumber, engine, model, deckWidth);
        this.operatingHours = operatingHours;
        this.zeroTurnRadius = zeroTurnRadius;
    }

	public double getOperatingHours() {
		return operatingHours;
	}
	public void setOperatingHours(double operatingHours) {
		this.operatingHours = operatingHours;
	}
	public boolean getZeroTurnRadius() {
		return zeroTurnRadius;
	}
	public void setZeroTurnRadius(boolean zeroTurnRadius) {
		this.zeroTurnRadius = zeroTurnRadius;
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
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public double getDeckWidth() {
        return super.getDeckWidth();
    }
    @Override
    public String toString(){
        return super.toString() + "\nOperating Hours: " + operatingHours + "\nZero Turn Radius: " + zeroTurnRadius;
    }

}
