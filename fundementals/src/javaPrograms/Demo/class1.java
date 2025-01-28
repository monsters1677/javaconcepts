package fundementals.src.javaPrograms.Demo;
class manoj{
    float f=666.6f;
    float i=5.5f;
    public void add(){
        float result=f+i;
        System.out.println("added result :"+result);
    }
    public void sub(){
        float result=f-i;
        System.out.println("sub result :"+result);
    }
    public void mult(){
        float result=f*i;
        System.out.println("mult result:"+result);
    }
    public void divi(){
        float result=f/i;
        System.out.println("divi result:"+result);
    }

}
public class class1 {
    public static void main(String[] args) {
        manoj g = new manoj();
        g.add();
        g.sub();
        g.mult();
        g.divi();
    }
}