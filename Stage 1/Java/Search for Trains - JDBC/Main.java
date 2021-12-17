import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the source");
		String sou=sc.nextLine();
		System.out.println("Enter the destination");
		String des=sc.nextLine();
		System.out.println("Enter the coach type");
		String co=sc.nextLine();
		 if(co.equals("AC1") || co.equals("AC2") || co.equals("AC3") || co.equals("Seater")|| co.equals("Sleeper")){
		 TrainManagementSystem tr=new TrainManagementSystem();
		 ArrayList<Train> val=tr.viewTrain(co,sou,des);
		 if(val.isEmpty()){
		     System.out.println("No trains found");
		 }else{
		     for(Train t:val){
		         System.out.println(t.getTrainNumber()+" "+t.getTrainName());
		     }
		 }
		}else{
		    System.out.println("Invalid Coach Type");
		}
	}
}