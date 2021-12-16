import java.util.*;
public class Placement{
    static void print(int a,int b,int c){
        if(a<0 || b<0 || c<0){
            System.out.println("Input is Invalid");
            return;
        }
        if(a==b && b==c){
            System.out.println("None of the department has got the highest placement");
            return;
        }
         if(a>=b && a>=c){
           System.out.println("Highest placement");
           System.out.println("CSE");
           if(a==b && b!=c){
               System.out.print("ECE");
           }else if(a==c && a!=c){
               System.out.print("MECH");
           }
           return;
       }else if(b>=a && b>=c){
           System.out.println("Highest placement");
           System.out.println("ECE");
           if(b==a && b!=c){
               System.out.print("CSE");
           }else if(b==c && b!=a){
               System.out.print("MECH");
           }
           return;
       }else if(c>=a && c>=b){
           System.out.println("Highest placement");
           System.out.println("MECH");
           if(b==a && b!=c){
               System.out.print("CSE");
           }else if(b==c && b!=a){
               System.out.print("MECH");
           }
           return;
       }
        
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the no of students placed in CSE:");
       System.out.print("Enter the no of students placed in ECE:");
       System.out.print("Enter the no of students placed in MECH:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       print(a,b,c);
    }
}