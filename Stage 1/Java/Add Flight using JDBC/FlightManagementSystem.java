import java.sql.*;
public class FlightManagementSystem {
    public  boolean addFlight(Flight flightObj){
        try{
         Connection con=DB.getConnection();
         PreparedStatement st=con.prepareStatement("insert into flight values(?,?,?,?,?)");
         st.setInt(1,flightObj.getFlightId());
         st.setString(2,flightObj.getSource());
         st.setString(3,flightObj.getDestination());
         st.setInt(4,flightObj.getNoOfSeats());
         st.setDouble(5,flightObj.getFlightFare());
         st.execute();
         return true;
        }catch(Exception e){
	        e.printStackTrace();
	       // return false;
	    }
	    return false;
    }
}