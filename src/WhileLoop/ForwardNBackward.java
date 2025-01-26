package WhileLoop;

public class ForwardNBackward {
    public static void main(String[] args){
        int h=236;
        String forward="";
        String backward="";
        int digit=0;
        while (h%10!=0){
            digit=h%10;
            forward=digit+" "+forward;
            backward=backward+" "+digit;
            h=h/10;
        }
        System.out.println("forward :"+forward);
        System.out.println("backward :"+backward);
    }
}
