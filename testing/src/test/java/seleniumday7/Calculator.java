package seleniumday7;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
public class Calculator {
	
	int num1=20;
	int num2=10;
	
	

	@Test(priority = 1)
	public void addition()
	{
		int sum=num1+num2;
		AssertJUnit.assertEquals(sum, 30);
	}
	
	@Test(priority = 2)
	public void subtraction()
	{
		int minus=num1-num2;
		AssertJUnit.assertEquals(minus, 10);
	}
	
	@Test(priority = 3)
	public void multiplication()
	{
		int product=num1*num2;
		AssertJUnit.assertEquals(product, 200);
	}
	
	@Test(priority = 4)
	public void division()
	{
		int divide=num1/num2;
		AssertJUnit.assertEquals(divide, 2);
	}
}
