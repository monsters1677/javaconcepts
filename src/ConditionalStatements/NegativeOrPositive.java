package ConditionalStatements;
public class NegativeOrPositive {
    public static void main(String[] args){
        int num=9;
        if(num>0){
            System.out.println(num+" is a positive number");
        }else if(num<0){
            System.out.println(num+" is a negative number");
        }else{
            System.out.println(num+" is a Zero");
        }
    }
}
