package fundementals.src.javaPrograms.Demo;
class Sharath{
    int f=78;
    char c='S';
    public void m1(){
        System.out.println(f+"and "+c+" are from Sharath class");
    }
}
public class Practice {
    public static void main(String[] args){
        Sharath refVar=new Sharath();
        System.out.println(refVar.f+" "+refVar.c);
        refVar.m1();
    }
}
