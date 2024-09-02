package sample;

import org.testng.annotations.Test;

public class Sample1 {
	@Test
	
 public void createUser()
	{
	 System.out.println("user created");
 }
	@Test
	public void modifyUser()
	{
		System.out.println("user modified");
	}
	@Test
	public void deleteUser()
	{
		System.out.println("user deleted");
	}
}
