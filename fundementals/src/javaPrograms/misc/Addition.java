package fundementals.src.javaPrograms.misc;

import java.util.*;
public class Addition{
    public static void main(String args[]){
        ArrayList<String> k=new ArrayList<String>();
        k.add("VK");
        k.add("MM");
        k.add("SY");
        k.add("SK");
        k.add("GP");
        Iterator l=k.iterator();
        while(l.hasNext()){
            System.out.print(l.next());
        }
    }
}
