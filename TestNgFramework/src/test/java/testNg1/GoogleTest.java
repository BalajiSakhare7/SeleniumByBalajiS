package testNg1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GoogleTest {
	WebDriver driver;
	
    
	/*
	 * @BeforeMethod public void setUp() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\MaliPatil\\Desktop\\RadicalMahindaSelenium\\SeleniumSoftwares\\WebDrivers\\chromedrivers\\Windows\\2.42\\chromedriver.exe"
	 * ); driver=new ChromeDriver(); driver.get("https://www.google.com");
	 * driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * }
	 */
	
	@AfterMethod public void tearDown() { 
	driver.quit(); 
	}
	
  @Test(priority=0,groups="title")
  @Parameters({"url"})
  public void googleTitleTest(String url) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaliPatil\\Desktop\\RadicalMahindaSelenium\\SeleniumSoftwares\\WebDrivers\\chromedrivers\\Windows\\2.42\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  String title=driver.getTitle();
	  System.out.println(title);
	  Assert.assertEquals(title, "Google");
	  
	  System.out.println(Thread.currentThread().getId());
  }
  
  @Test(priority=1, groups="logo")
  @Parameters({"url"})
  public void googleLogoTest(String url1) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaliPatil\\Desktop\\RadicalMahindaSelenium\\SeleniumSoftwares\\WebDrivers\\chromedrivers\\Windows\\2.42\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url1);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //boolean logo=driver.findElement(By.xpath("//*[@id=\"hplogo\"]/div[2]")).isDisplayed();
	  
	  //System.out.println("logo present"+ logo);
	  System.out.println(Thread.currentThread().getId());
	  SoftAssert sasser=new SoftAssert();
	  sasser.assertEquals(true, false);
	  
	  System.out.println("this is soft assert test");
	  
	  sasser.assertAll();
  }
  
  @Test(priority=2, groups="link")
  public void googleGmailLink() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaliPatil\\Desktop\\RadicalMahindaSelenium\\SeleniumSoftwares\\WebDrivers\\chromedrivers\\Windows\\2.42\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  boolean gmail=driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).isDisplayed();
	  System.out.println("Gmail Link"+ gmail);
	  System.out.println(Thread.currentThread().getId());
  }
  
  @Test(priority=5, groups="test")
  public void test4() {
	  System.out.println("test4");
	  System.out.println(Thread.currentThread().getId());
  }
  @Test(priority=4, groups="test")
  public void test5() {
	  System.out.println("test5");
	  System.out.println(Thread.currentThread().getId());
  }
  @Test(priority=3, groups="test")
  public void test6() {
	  System.out.println("test6");
	  System.out.println(Thread.currentThread().getId());
  }
  
  
  
  
}
