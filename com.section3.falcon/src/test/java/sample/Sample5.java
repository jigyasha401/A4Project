package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample5 {
	public void softAssertStrictComparison() {
		String expectedData = "raja";
		String actualData = "Raja";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualData,expectedData);
		System.out.println("strict comparison passed!!");
}
	@Test
	public void containsLevelComparison()
	{
		String expectedData = "raja";
		String actualData = "maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparison passed!!");
		
	}	
	}
