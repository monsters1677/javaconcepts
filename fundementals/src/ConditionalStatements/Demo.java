package ConditionalStatements;

public class Demo {
    public static void main(String[] args) {
        int stmarks = 80;
        String sname="SHARATH";
        if (stmarks<100){
            if(stmarks<35){
                System.out.println(sname+" has failed");
            }else if(stmarks<=45){
                System.out.println(sname+" has passed in 3rd class");
            }else if(stmarks<=60){
                System.out.println(sname+" has passed in 2nd class");
            }else if (stmarks<=75){
                System.out.println(sname+" has passed in 1st class");
            }else {
                System.out.println(sname+" has passed in Distinction");
            }
        }else{
            System.out.println("Please provide valid marks");
        }
    }
}