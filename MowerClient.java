
import javax.swing.JFileChooser;
import java.util.*;
public class MowerClient {
    
    public static void main(String[] args) {
        MowerWareHouse wareHouse = new MowerWareHouse();
        Scanner scnr = new Scanner(System.in);
        
        if (args.length != 0){
           wareHouse.readMowerData(args[0]);
           wareHouse.saveMowerData(generateOutputFile(wareHouse));
        } else {
            JFileChooser j = new JFileChooser();
            int response = j.showOpenDialog(null);
            if (response == JFileChooser.APPROVE_OPTION){
                String file = j.getSelectedFile().toString();
                wareHouse.readMowerData(file);
                wareHouse.saveMowerData(generateOutputFile(wareHouse));
            }
        }
        
        System.out.println("Enter your choice of Mower to get information.");
        System.out.println("Type C for Commerical Mower, G for Gas Powered Mower, P for Push reel Mower, L for Lawn Tractor, and S to stop:");
        String s = scnr.nextLine();
        while(!s.equals("S")) {
        	switch (s) {
        	case "C": 
        		System.out.println(wareHouse.getMower(1));
        		break;
        	case "G":
        		System.out.println(wareHouse.getMower(2));
        		break;
        	case "P":
        		System.out.println(wareHouse.getMower(3));
        		break;
        	case "L":
        		System.out.println(wareHouse.getMower(0));
        		System.out.println();
        		System.out.println(wareHouse.getMower(4));
        	}
        	System.out.println();
        	System.out.println("Type C for Commerical Mower, G for Gas Powered Mower, P for Push reel Mower, L for Lawn Tractor, and S to stop:");
        	s = scnr.nextLine();
        }
    }


    private static String generateOutputFile(MowerWareHouse wareHouse){
        String storeName = wareHouse.getStoreName();
        storeName.trim();
        return wareHouse.getStoreName()+".txt";
    }
   
}


