package fundementals.src.javaPrograms.PrimitiveDT;
import java.io.FileInputStream;
public class Char {
    public static void main(String[] args){
        char t=6;
        switch (t){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSUDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("PLEASE PROVIDE THE 1 TO 7 ONLY");
                break;
        }
    }
}