package testLayer;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basePackage.BaseLogin;
import pomPackage.POMLogin;
import testdata.Excelsheet;

public class TestLogin extends BaseLogin {

	POMLogin log;
	public Actions action;

	public TestLogin() {
		super();
	}

	@BeforeClass
	public void initialsetup() {
		initiation();
		screenshots("Login");
		log = new POMLogin();
	}
	
	
	// Type username and password one by one
	
	/*
	 * @Test(priority=1) public void uname() throws InterruptedException {
	 * log.typeUserName(prop.getProperty("username")); Thread.sleep(2000); }
	 * 
	 * @Test(priority=2) public void passw() throws InterruptedException {
	 * log.typePassword(prop.getProperty("password")); Thread.sleep(2000); }
	 * 
	 * @Test(priority=3) public void signin() throws InterruptedException {
	 * log.clickSignin(); Thread.sleep(2000); //driver.switchTo().frame();
	 * action=new Actions(driver);
	 * action.moveToElement(driver.findElement(By.id("px-captcha"))).clickAndHold().
	 * build().perform(); Thread.sleep(4000); }
	 * 
	 * 
	 * @Test public void Login() { log.typeUserName(prop.getProperty(username)); }
	 */

	
	
	// Login via the username and password mwntioned in excelsheet
	
	@DataProvider
	public Object[][] Details() {
		Object result[][] = Excelsheet.readdata("Sheet1");
		return result;

	}

	@Test(dataProvider = "Details")
	public void Login(String name, String pass) throws InterruptedException {
		log.typeUserName(name);
		Thread.sleep(2000);
		log.typePassword(pass);
		Thread.sleep(2000);
		// log.clickSignin();
		driver.navigate().refresh();
	}
	
	
	
	

}