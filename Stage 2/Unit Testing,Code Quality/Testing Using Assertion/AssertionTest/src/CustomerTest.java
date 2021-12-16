import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
	//Write the code for testing assertion using JUNIT
	Customer cust=new Customer("286314257896","Shfhgg","Skj","manikpur",(long)9451415,"abc1@gmail.com");
   @Test
   public void isAadharValidTest() {
	   assertTrue(cust.isValidAadharNo("789898989878"));
   }
   @Test
   public void isAadharInValidTest() {
	   assertFalse(cust.isValidAadharNo("102587986532"));
   }
   @Test
    public void isNameValidTest() {
    	assertNotEquals(cust.getFirstName(),cust.getLastName());
    }
   @Test
    public void isEmailValidTest() {
	   assertNotNull(cust.getEmailId());
   }
}
