package testNg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {
	
	@BeforeSuite
	public void takeBackup() {
		System.out.println("Set system property for chrome driver exe");
	}
	@BeforeTest
	public void test3() {
		System.out.println("Launch the browser");
	}
	@BeforeClass
	public void test1() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void test2() {
		System.out.println("enter URL");
	}
	
	//------------------------------------------------
	
	@Test
	public void appTitleTest() {
		System.out.println("verify app title");
	}
	
	@Test
	public void appLoginTest() {
		System.out.println("Verify app login");
	}
	
	@Test
	public void appLogoTest() {
		System.out.println("Logo test");
	}
	//------------------------------------------------
	
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}
	
	@AfterClass
	public void CloseBroser() {
		System.out.println("closing browser");
	}
	
	@AfterTest
	public void deletecoci() {
		System.out.println("deleting cocies");
	}
	
	
	@AfterSuite
	public void generateReport() {
		System.out.println("Report generation");
	}
	
	
}
