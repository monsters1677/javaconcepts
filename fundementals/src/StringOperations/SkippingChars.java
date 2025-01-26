package StringOperations;

public class SkippingChars {
    public static void main(String[] args) {
        String s="Ramakrishna Math";
        char[] n=s.toCharArray();
        System.out.println(n);
        String m="";
        for(int i=0;i<n.length;i++){
            if(i%2!=0){
                m=m+n[i];
            }
        }
        System.out.println("original string :"+n);
        System.out.println("Optimized string :"+m);
    }
}
