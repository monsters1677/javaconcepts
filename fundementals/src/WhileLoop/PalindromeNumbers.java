package WhileLoop;

public class PalindromeNumbers {
    public static void main(String[] args){
        for (int i=1;i<=1000;i++){
            String s=""+i;
            StringBuffer h=new StringBuffer(s);
            h.reverse();
            String reverseNum=h.toString();
            if (s.equals(reverseNum)){
                System.out.println(i+" is a Polindrome");
            }
            else{
                System.out.println(i+" is not a polindrome");
            }
        }
    }
}
