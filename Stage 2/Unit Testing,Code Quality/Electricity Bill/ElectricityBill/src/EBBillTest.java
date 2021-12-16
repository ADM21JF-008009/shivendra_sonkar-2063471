import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class EBBillTest
{
 //  EBBill bill=null;
@Test
public void calculateBillAmount_50Unit() {
	EBBill   bill =new EBBill(50);
	   assertEquals(130,bill.calculateBillAmount(),0.001);
   }
@Test
public void calculateBillAmount_100Unit() {
	EBBill  bill =new EBBill(100);
	   assertEquals(292.5,bill.calculateBillAmount(),0.001);
}
@Test
public void calculateBillAmount_200Unit() {
	EBBill  bill =new EBBill(200);
	   assertEquals(818.5,bill.calculateBillAmount(),0.001);
}
@Test
public void calculateBillAmount_1000Unit() {
	EBBill  bill =new EBBill(1000);
	   assertEquals(7018.5,bill.calculateBillAmount(),0.001);
}
@Test
public void calculateBillAmount_5000Unit() {
	EBBill  bill =new EBBill(5000);
	   assertEquals(47018.5,bill.calculateBillAmount(),0.001);
}
@Test
public void calculateBillAmount_0Unit() {
	EBBill   bill =new EBBill(0);
	   assertEquals(0.0,bill.calculateBillAmount(),0.001);
}
}