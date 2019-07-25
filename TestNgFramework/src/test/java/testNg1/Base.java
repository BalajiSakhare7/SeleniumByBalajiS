package testNg1;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public void initiate() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MaliPatil\\Desktop\\RadicalMahindaSelenium\\SeleniumSoftwares\\WebDrivers\\chromedrivers\\Windows\\2.42\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void FailedTestScreenshot(String testname) {
		File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src1, new File("C:\\Users\\MaliPatil\\eclipse-workspace\\TestNgFramework\\screenshts\\"+ testname+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
