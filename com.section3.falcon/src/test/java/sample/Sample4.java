package sample;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample4 {
@Test
public void softAssertStrictComparison() {
	String expectedData = "raja";
	String actualData = "Raja";
		Assert.assertEquals(actualData,expectedData);
	System.out.println("strict comparison passed!!");
}
@Test
	public void containsLevelComparison()
	{
		String expectedData = "raja";
		String actualData = "maharaja";
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparison passed!!");
		sa.assertAll();
	}	
}

