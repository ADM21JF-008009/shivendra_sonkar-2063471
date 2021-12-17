package com.cts.rainbowjewellers.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
 

import com.cts.rainbowjewellers.service.RainbowJewellersService;
@RunWith(Parameterized.class)
//@Category(UnitTest.class)
public class RainbowJewellersParameterizedTest {

	private double gram;
	private double expectedgoldprice;
	public RainbowJewellersParameterizedTest(double gram, double expectedgoldprice) {
		super();
		this.gram = gram;
		this.expectedgoldprice = expectedgoldprice;
	}
	RainbowJewellersService rain=new RainbowJewellersService();
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 9.6,48401.76 }, 
                { 56,282343.6},
                {24.5,123525.325},
                {0,0},{-1,-5041.85}
        });
    }
    @Test
	public void testCalculateGoldPrice() {
	   assertEquals(expectedgoldprice,rain.calculategoldprice(gram),0.001); 	
	}

}
