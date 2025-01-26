package WhileLoop;

public class Palindrome {
    public static void main(String[] args){
        int h=421;
        int back=h;
        int solo=0;
        int reverse=0;
        while (back!=0){
            solo=back%10;
            reverse=reverse*10+solo;
            back=back/10;
        }
        if (h==reverse){
            System.out.println(h+" is a Palindrome number");
        }else{
            System.out.println(h+" is not a Palindrome number");
        }
    }
}
