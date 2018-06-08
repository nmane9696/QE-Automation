package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;


public class Login extends LoginPage {

	@Test
	public void userLoginMethod() throws InterruptedException {
		
		
		LoginPage obj = new LoginPage();
		
		obj.loginmethod();
		
		obj.clickMethod();
		
		System.out.println("\n\t completed POM DUMMY Project");
		System.out.println("Second Commit by Nitin --- M");
		
	}
	
	
	
	
}
