package fundementals.src.javaPrograms;

import java.util.SplittableRandom;

class Teacher{
    String tid;
    String tname;
    String phone;
    float sal;
    public Teacher(String tid, String tname, String phone,float sal){
        this.tid=tid;
        this.tname=tname;
        this.phone=phone;
        this.sal=sal;
    }
}
public class Externalization {
    public static void main(String[] args){
        Teacher t=new Teacher("ni-254","sharath","91-9177858342",52263.52f);
    }
}
