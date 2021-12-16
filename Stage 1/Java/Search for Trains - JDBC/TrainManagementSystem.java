
import java.util.ArrayList;
import java.sql.*;
public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination){
		  ArrayList<Train> b=new ArrayList<>();
		  try{
		      PreparedStatement stm=null;
		 Connection con=DB.getConnection();
		 stm=con.prepareStatement("select * from train where source='"+source+"' and destination='"+destination+"' and "+coachType+">0 order by train_number");
		 ResultSet re=stm.executeQuery();
		 while(re.next()){
		     int num=re.getInt(1);
		     String name=re.getString(2);
		     String sour=re.getString(3);
		     String des=re.getString(4);
		     int ac1=re.getInt(5);
		     int ac2=re.getInt(6);
		     int ac3=re.getInt(7);
		     int sep=re.getInt(8);
		     int set=re.getInt(9);
		     b.add(new Train(num,name,sour,des,ac1,ac2,ac3,sep,set));
		 }
		 }
		 catch(Exception e){
		     System.out.println(e);
		 }
		 return b;
	}

}
