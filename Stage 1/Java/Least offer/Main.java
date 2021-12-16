import java.util.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     int t=sc.nextInt();
     String s[]=new String[t];
     int ans[]=new int[t];
     int min=Integer.MAX_VALUE;
     sc.nextLine();
     for(int i=0;i<t;i++){
         s[i]=sc.nextLine();
     }
     for(int i=0;i<t;i++){
         String s1[]=s[i].split(",");
         String a=s1[0];
         int b=Integer.parseInt(s1[1]);
         int c=Integer.parseInt(s1[2]);
         int per=(b*c)/100;
         min=Math.min(min,per);
         ans[i]=per;
     }
     for(int i=0;i<t;i++){
         if(min==ans[i]){
             String s1[]=s[i].split(",");
             System.out.println(s1[0]);
         }
     }
    }
}