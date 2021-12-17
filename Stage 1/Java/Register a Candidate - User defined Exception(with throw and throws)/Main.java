import java.util.*;
public class Main{
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the candidate Details");
       System.out.println("Name");
       String name=sc.next();
       System.out.println("Gender");
       String gender=sc.next();
       System.out.println("Expected Salary");
       double salary=sc.nextDouble();
       if(salary<10000){
           throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
       }else{
       Candidate con=new Candidate();
       con.setName(name);
       con.setGender(gender);
       con.setExpectedSalary(salary);
       return con;
       }
    }
    public static void main(String args[]){
       try{
           Candidate can=getCandidateDetails();
           System.out.println("Registration Successful");
       }catch(InvalidSalaryException e){
           System.out.println(e.getMessage());
       }
    }
}