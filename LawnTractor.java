
public class LawnTractor extends Mower{
	private Engine engine;
	private String model;
	private double deckWidth;
	
	public LawnTractor() {
		this.setEngine(new Engine());
		this.setModel("");
		this.setDeckWidth(0.0);
	}
	public LawnTractor(String manufacturer, int year, String serialNumber, Engine engine, String model, double deckWidth) {
		super(manufacturer, year, serialNumber);
		this.setEngine(engine);
		this.setModel(model);
		this.setDeckWidth(deckWidth);
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

	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getDeckWidth() {
		return deckWidth;
	}
	public void setDeckWidth(double deckWidth) {
		this.deckWidth = deckWidth;
	}
	@Override
    public String toString(){
        return super.toString() + "\n" + engine + "\nModel: " + model + "\nDeck Width: " + deckWidth;
    }

}