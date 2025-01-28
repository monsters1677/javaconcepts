package IOStreams;

//import javafx.scene.transform.Scale;

import java.util.Scanner;

public class DynamicUsingScanner {
    public static void main(String[] args){
        try {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter the name of the farmer :");
            String fname= s.nextLine();
            System.out.print("Enter the adress :");
            String fAddr=s.nextLine();
            System.out.print("Enter aadhar id :");
            long fAdhaar=s.nextLong();
            System.out.print("Enter acres of land :");
            float fLand=s.nextFloat();
            System.out.print("Enter phone number:");
            long phoneNo=s.nextLong();
            System.out.println("Farmer details");
            System.out.println("-----------------");
            System.out.println("Name of the farmer    :"+fname);
            System.out.println("Aadhaar number        :"+fAdhaar);
            System.out.println("phone number          :"+phoneNo);
            System.out.println("total land of farmer  :"+fLand);
            System.out.println("Address of the farmer :"+fAddr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
