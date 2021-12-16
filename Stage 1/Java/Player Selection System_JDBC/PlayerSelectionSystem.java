import java.util.List;

import java.util.*;
import java.sql.*;
public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight){
		 List<String> v=new ArrayList<>();
		 try{
		 Connection con=DB.getConnection();
		 PreparedStatement stm=con.prepareStatement("select * from player where height>="+minHeight+" and weight<="+maxWeight+"order by playerName");
		 ResultSet res=stm.executeQuery();
		 while(res.next()){
		     String name=res.getString(2);
		     v.add(name);
		 }
		 }catch(Exception e){
		     
		 }
		return v;
	}
}
