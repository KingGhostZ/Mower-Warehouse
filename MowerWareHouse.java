
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


import java.io.BufferedReader;

public class MowerWareHouse {
    private String storeName;
    private ArrayList<Mower> mowers;
    private String guiMessage;

    public MowerWareHouse(){
        storeName = "";
        mowers = new ArrayList<Mower>();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getNumMowers(){
        return mowers.size();
    }

    public Mower getMower(int index){
        return mowers.get(index);
    }

    public void setMower(int index, Mower mower){
        mowers.set(index, mower);
    }

    public void addMower(Mower mower){
        mowers.add(mower);
    }

    public void removeMower(int index){
        mowers.remove(index);
    }

    public void readMowerData(String inputFileName){
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(inputFileName));
            storeName = br.readLine();
            while(br.ready()){
                String manufacturer = br.readLine();
                int year = Integer.parseInt(br.readLine());
                String serialNumber = br.readLine();
                String type = br.readLine();
                switch (type){
                    case "L":
                        String engineManufacturer = br.readLine();
                        double horsePower = Double.parseDouble(br.readLine());
                        int cylinders = Integer.parseInt(br.readLine());
                        String model = br.readLine();
                        double deckWidth = Double.parseDouble(br.readLine());
                        LawnTractor lt = new LawnTractor(manufacturer, year, serialNumber, new Engine(engineManufacturer, horsePower, cylinders), model, deckWidth);
                        addMower(lt);
                        break;
                    case "C":
                        String cEngineManufacturer = br.readLine();
                        double cHorsePower = Double.parseDouble(br.readLine());
                        int cCylinders = Integer.parseInt(br.readLine());
                        String cModel = br.readLine();
                        double cDeckWidth = Double.parseDouble(br.readLine());
                        double operatingHours = Double.parseDouble(br.readLine());
                        boolean zeroTurnRadius = Boolean.parseBoolean(br.readLine());
                        CommercialMower cm = new CommercialMower(manufacturer, year, serialNumber, new Engine(cEngineManufacturer, cHorsePower, cCylinders), cModel, cDeckWidth, operatingHours, zeroTurnRadius);
                        addMower(cm);
                        break;
                    case "G":
                        double cutWidth = Double.parseDouble(br.readLine());
                        double wheelDiameter = Double.parseDouble(br.readLine());
                        String gEngineManufacturer = br.readLine();
                        double gHorsePower = Double.parseDouble(br.readLine());
                        int gCylinders = Integer.parseInt(br.readLine());
                        boolean selfPropelled = Boolean.parseBoolean(br.readLine());
                        GasPoweredMower gpm = new GasPoweredMower(manufacturer, year, serialNumber, cutWidth, wheelDiameter, new Engine(gEngineManufacturer, gHorsePower, gCylinders), selfPropelled);
                        addMower(gpm);
                        break;
                    case "P":
                        double pCutWidth = Double.parseDouble(br.readLine());
                        double pWheelDiameter = Double.parseDouble(br.readLine());
                        int numWheels = Integer.parseInt(br.readLine());
                        PushReelMower prm = new PushReelMower(manufacturer, year, serialNumber, pCutWidth, pWheelDiameter, numWheels);
                        addMower(prm);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
           } 
    }

    public void saveMowerData(String outputFileName){
        try {
            PrintWriter pw = new PrintWriter(outputFileName);
            pw.println(storeName+"\n");
            guiMessage = "";
            for (int i = 0; i < mowers.size(); i++){
                String data = mowers.get(i).toString();
                guiMessage += data+"\n";
                pw.println(data+"\n");
            }
            
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    @Override
    public String toString(){
        return "\nStore Name: " + storeName;
    }
}


