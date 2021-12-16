import java.util.*;
public class StudentMain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int student=sc.nextInt();
        System.out.println("Enter Student's Name:");
        String name=sc.nextLine();
        System.out.println("Enter Student's address:");
        String address=sc.nextLine();
        System.out.println("Whether the student is from NIT(Yes/No):");
        String fr=sc.nextLine();
        while(!fr.equals("yes") || !fr.equals("YES") || !fr.equals("NO") || !fr.equals("no")){
          System.out.println("Wrong Input");
          System.out.println("Whether the student is from NIT(Yes/No):");
          fr=sc.nextLine();
        }
        if(fr.equals("yes") || fr.equals("YES")){
           Student s1=new Student(student,name,address);
           System.out.println("Student id:"+s1.getStudentId());
           System.out.println("Student name:"+s1.getStudentName());
           System.out.println("Address:"+s1.getStudentAddress());
           System.out.println("College name:"+s1.getCollegeName());
        }else{
           System.out.println("Enter the college name:"); 
           String college=sc.nextLine();
           Student s2=new Student(student,name,address,college);
           System.out.println("Student id:"+s2.getStudentId());
           System.out.println("Student name:"+s2.getStudentName());
           System.out.println("Address:"+s2.getStudentAddress());
           System.out.println("College name:"+s2.getCollegeName());
        }
    }
}