import java.util.*;
public class Authority{
    static boolean check(String s){
        for(char c:s.toCharArray()){
            if((int)c==32){
                continue;
            }
            else if((int)c>=65 && (int)c<=90){
                continue;
            }
            else if((int)c>=97 && (int)c<=122){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        System.out.println("Inmate's name:");
        System.out.println("Inmate's father's name:");
        if(check(s) && check(s1)){
            System.out.println(s.toUpperCase()+" "+s1.toUpperCase());
        }else{
            System.out.println("Invalid name");
        }
    }
}