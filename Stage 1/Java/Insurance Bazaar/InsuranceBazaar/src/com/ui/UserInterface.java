package com.ui;
import com.utility.*;
import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		System.out.println("Enter the no of Policy names you want to store");
		int t=sc.nextInt();
		Map<Integer,String> map=new TreeMap<>();
		Bazaar ba=new Bazaar();
		ba.setPolicyMap(map);
		while(t-->0){
		    System.out.println("Enter the Policy ID");
		    int id=sc.nextInt();
		    System.out.println("Enter the Policy Name");
		    sc.nextLine();
		    String s=sc.nextLine();
		    ba.addPolicyDetails(id,s);
		}
        for(Integer i:map.keySet()){
            System.out.println(i+" "+map.get(i));
        }
        System.out.println("Enter the policy type to be searched");
        String st=sc.nextLine();
        List<Integer> c=ba.searchBasedOnPolicyType(st);
        for(Integer u:c){
            System.out.println(u);
        }
	}

}
