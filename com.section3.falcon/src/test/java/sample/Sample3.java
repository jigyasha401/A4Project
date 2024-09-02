package sample;

import org.testng.annotations.Test;

public class Sample3 {
	
	@Test(priority = 1,invocationCount=5)
	 public void createUser()
		{
		 System.out.println("user created");
	 }
		@Test(priority = 2,dependsOnMethods = {"createUser"})
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

