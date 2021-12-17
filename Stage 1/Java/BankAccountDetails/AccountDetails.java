import java.util.*;
public class AccountDetails{
    Scanner sc=new Scanner(System.in);
   public Account getAccountDetails(){
       Account ac=new Account();
       System.out.println("Enter account id:");
        int account=sc.nextInt();
        System.out.println("Enter account type:");
        String s=sc.next();
        while(true){
            System.out.println("Enter balance:");
           int amount=sc.nextInt();
           if(amount<=0){
            System.out.println("Balance should be positive");
           }else{
               ac.setBalance(amount);
               break;
           }
        }
        ac.setAccountType(s);
        ac.setAccountId(account);
        return ac;
   }
   public int getWithdrawAmount(){
       int am;
        while(true){
            System.out.println("Enter amount to be withdrawn:");
            am=sc.nextInt();
            if(am<=0){
            System.out.println("Amount should be positive");
            }else{
                break;
            }
        }
        return am;
   }
    public static void main(String args[]){
        AccountDetails account=new AccountDetails();
        Account ac=account.getAccountDetails();
        boolean val=ac.withdraw(account.getWithdrawAmount());
        
    }
}