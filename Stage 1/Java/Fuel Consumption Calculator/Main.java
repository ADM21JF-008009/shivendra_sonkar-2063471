import java.util.*;
public class Main{
    static void print(double a,double b){
        if(b<=0){
            System.out.println((int)b+" is an Invalid Input");
            return;
        }
        double c=Double.parseDouble(String.format("%.2f",(a/b)*100));
        double d=Double.parseDouble(String.format("%.2f",b*0.6214));
        double e=a*0.2642;
        double f=d/e;
        System.out.println("Liters/100KM");
        System.out.println(String.format("%.2f",c));
        System.out.println("Miles/gallons");
        System.out.println(String.format("%.2f",f));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        double a=sc.nextDouble();
        if(a<=0){
            System.out.println((int)a+" is an Invalid Input");
           // return;
        }else{
            System.out.println("Enter the distance covered");
        double b=sc.nextDouble();
        print(a,b);
        }
    }
}