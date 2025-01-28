package fundementals.src.javaPrograms.misc;

import java.util.*;
public class Vk{
    public static void main(String args[]){
        Stack<String> kl=new Stack<String>();
        kl.push("B.Kondanna");
        kl.push("Lakshmi Devi");
        kl.push("Ramana");
        kl.push("Guramma");
        kl.push("Sharath");
        kl.push("VK");
        Iterator<String> hg=kl.iterator();
        while(hg.hasNext()){
            System.out.println(hg.next());
        }
    }
}
