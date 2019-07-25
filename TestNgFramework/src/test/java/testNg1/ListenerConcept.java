package testNg1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;

@Listeners(Consept_Listener.class)
public class ListenerConcept extends Base{
  @Test
  public void test1() {
	  
		/*
		 * System.out.println("this is test1");
		 * System.out.println(System.getProperty("user.dir"));
		 */
	  Assert.assertEquals(true, true);
  }
  
  @Test
  public void test2() {
	  
	  System.out.println("this is test2");
	  Assert.assertEquals(true, true);
  }
  @Test()
  public void test3() {
	  throw new SkipException("skipped test");
	  //System.out.println("this is test3");
	  
	  //Assert.assertEquals(true, true);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  initiate();
  }

  @AfterMethod
  public void afterClass() {
	  driver.quit();
  }

}
