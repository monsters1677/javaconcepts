package fundementals.src.javaPrograms.PrimitiveDT;

import java.lang.System;
class byte1{
    byte a=56;
    byte b=80;
    byte c=40;
    byte d=10;

    public void add(){
        int e=a+b;
        System.out.println("Addition of 'e' value is "+e);
    }

    public void subs(){
        int f=c-d;
        System.out.println("Substraction of 'f' value is "+f);
    }

    public void multi(){
        int g=d*a;
        System.out.println("Multiplication of 'g' value is  "+g);
    }

    public void div(){
        int h=a/b;
        System.out.println("Division of 'h' value is "+h);
    }
    public void modulo(){
        int i=b%c;
        System.out.println("Result of modulo operation b/w "+b+"and"+c+"is"+i);
    }
}
public class Byte {
    public static void main(String[] args) {
        byte1 j = new byte1();
        j.add();
        j.subs();
        j.multi();
        j.div();
        j.modulo();
    }
}
