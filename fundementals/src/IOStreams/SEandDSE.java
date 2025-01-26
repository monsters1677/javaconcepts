package IOStreams;
import java.io.*;
class CM implements Serializable {
    int id;
    String name;
    String state;
    long assetsInCrores;
    long phone;
    public CM(int id, String name, String state, long assetsInCrores, long phone){
        this.id=id;
        this.name=name;
        this.state=state;
        this.assetsInCrores=assetsInCrores;
        this.phone=phone;
    }
    public void displayDetails(){
        System.out.println("total CM's details");
        System.out.println("-------------------");
        System.out.println("CM id     :"+id);
        System.out.println("CM name   :"+name);
        System.out.println("CM state  :"+state);
        System.out.println("CM assets :"+assetsInCrores);
        System.out.println("CM phone  :"+phone);
    }
}
public class SEandDSE {
    public static void main(String[] args)throws Exception{
        CM c=new CM(254,"CBN","Andhra Pradesh",500,9177858342l);
        System.out.println("Before Serialization");
        c.displayDetails();
        System.out.println();
        FileOutputStream fos=new FileOutputStream("C:\\work space\\Creativity\\cm.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        FileInputStream fis=new FileInputStream("C:\\work space\\Creativity\\cm.txt");
        ObjectInputStream oi=new ObjectInputStream(fis);
        CM c2=(CM)
        oi.readObject();
        System.out.println("After Deserialization");
        c2.displayDetails();
    }
}