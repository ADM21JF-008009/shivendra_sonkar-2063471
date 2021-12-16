import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ValidateUtility va=new ValidateUtility();
        String n=sc.nextLine();
       // sc.next();
        String proName=sc.nextLine();
        Validate v=va.validateEmployeeName();
        boolean b=v.validateName(n);
        if(b){
            System.out.println("Employee name is valid");
        }else{
            System.out.println("Employee name is invalid");
        }
        Validate v2=va.validateProductName();
        boolean b2=v2.validateName(proName);
        if(b2){
            System.out.println("Product name is valid");
        }else{
            System.out.println("Product name is invalid");
        }
    }
    public static Validate validateEmployeeName() 
    {
        Validate v=(name)->{
            if(name.length()<5 || name.length()>20){
                return false;
            }else{
                for(char c:name.toCharArray()){
                    if(c>=65 && c<=91){
                        continue;
                    }else if(c==32){
                        continue;
                    }else if(c>=97 && c<=121){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
            return true;
        };
        return v;
    }
    
    public static Validate validateProductName() 
    {
        Validate v1=(name)->{
           if(name.length()<6 || !Character.isLetter(name.charAt(0))){
               return false;
           }
           int count=0;
           for(char c:name.toCharArray()){
               if(Character.isDigit(c)){
                   count++;
               }
           }
           if(count==5){
               return true;
           }
           return false;
        };
        return v1;
    }
}