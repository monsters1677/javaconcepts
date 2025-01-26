package StringOperations;

public class StringMethods {
    public static void main(String[] args){
        String s1="Vivekananda   ";
        String s2="Ramakrishna Paramahamsa   ";
        System.out.println("Equals method"+s1.equals(s2));//
        System.out.println("Substring 1 :"+s1.substring(3)+s2.substring(3));
        System.out.println("Substring 2 :"+s1.substring(2,8)+" " +s2.substring(2,9));
        System.out.println("string to char aarray 1:"+s1.toCharArray()+"  "+s2.toCharArray());
        System.out.println("Upper case letters :"+s1.toUpperCase()+" "+s2.toUpperCase());
        System.out.println("Lower case letters"+s1.toLowerCase()+" "+s2.toLowerCase());
        System.out.println("concatination :"+s1.concat(s2));
        System.out.println("Equals method"+s1.equals(s2));
        System.out.println("Comparison :"+s1.compareTo(s2));
        //System.out.println(s1.compare);
        System.out.println("replacing a character :"+s1.replace('e','n'));
        System.out.println("Trimming :"+s1.trim()+" "+s2.trim());
        System.out.println(" equals Ignore case :"+s1.equalsIgnoreCase(s2));
        System.out.println("characters' indexes :"+s1.indexOf('e')+" "+s2.indexOf('a'));
        System.out.println("to know empty or not :"+s1.isEmpty()+" "+s2.isEmpty());
        System.out.println();
        ///// Object Class methods:
        // toString()
        //equals()
        // hashCode()
        ///// Thread()
        //notfy()
        //notifyAll()
        //wait()

    }
}
