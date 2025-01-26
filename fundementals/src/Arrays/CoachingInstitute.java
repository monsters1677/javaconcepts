package Arrays;

public class CoachingInstitute {
    String instituteId;
    String instituteOwner;
    String instituteAddress;
    double instituteIncome;
    int noOfInstitutes;
    Student[] students;

    public CoachingInstitute(String instituteId, String instituteOwner, String instituteAddress, double instituteIncome, int noOfInstitutes,Student[] students){
        this.instituteId=instituteId;
        this.instituteOwner=instituteOwner;
        this.instituteAddress=instituteAddress;
        this.instituteIncome=instituteIncome;
        this.noOfInstitutes=noOfInstitutes;
        this.students=students;
    }
    public void displayDetails(){
        System.out.println("Institute Details:");
        System.out.println("Institute id is"+this.instituteId);
        System.out.println("Owner of the institute is"+this.instituteOwner);
        System.out.println("Address of the institute is "+this.instituteAddress);
        System.out.println("Income of the institute is"+this.instituteIncome);
        if (noOfInstitutes == 1) {
            System.out.println("Number of institutes is"+this.noOfInstitutes);
        }else {
            System.out.println("Number of institutes are"+this.noOfInstitutes);
        }
        System.out.println("Student Id \t Name \t Phone no \t Email \t \t \t Fee status");
        System.out.println("-------------------------------------------------------------");
        for(Student s:students){
            System.out.print(s.stid+"\t");
            System.out.print(s.stName+"\t");
            System.out.print(s.stPhoneNo+"\t");
            System.out.print(s.stEmail+"\t");
            System.out.print(s.stFeeStatus+"\t");
            System.out.println();
        }
    }
    public static void main(String[] args){
        Student st1=new Student("FSJ-N7-524","Kishor",9177858342L,"kishor@gmail.com","Paid");
        Student st2=new Student("FSJ-N7-530","Sharath",9618331963L,"sharath@gmail.com","Paid");
        Student st3=new Student("FSJ-N7-545","Prasad",9618315426L,"prasad@gmail.com","Pending");
        Student st4=new Student("FSJ-N7-521","sjeeva",7288849885L,"sjeeva@gmail.com","Paid");
        Student st5=new Student("FSJ-N7-550","Murali",9618331963L,"Mmurali@gmail.com","Paid");
        Student[] students={st1,st2,st3,st4,st5};
        CoachingInstitute ci=new CoachingInstitute("Soft@253","Durga","Ameerpet",5000000,1,students);
        ci.displayDetails();
    }
}