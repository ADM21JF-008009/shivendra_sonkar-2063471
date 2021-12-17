import java.util.*;
public class Main {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the minimum height");
	  double he=sc.nextDouble();
	  System.out.println("Enter the maximum weight");
	  double we=sc.nextDouble();
	  PlayerSelectionSystem pl=new PlayerSelectionSystem();
      List<String> val=pl.playersBasedOnHeightWeight(he,we);
      if(val.isEmpty()){
          System.out.println("No players are with minimum height of "+he+" and maximum weight of "+we);
      }else{
         for(String s:val){
             System.out.println(s);
         }
      }
		
	}
}