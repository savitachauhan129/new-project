package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseCreateAccount;
import pomPackage.POMCreateAccount;

public class TestCreateAccount extends BaseCreateAccount{
	
	POMCreateAccount create;
	
	public TestCreateAccount() {
		super();	
	}
	
	@BeforeMethod
	
	public void initsetup()  {
		initiation();
	create= new POMCreateAccount();
		
	}
	
	// to pass the data via Data provider
	
	
	@DataProvider(name="getdata for firstname")
	public Object[][] firstname(){
		return new Object[][] {{"Roicians"},{"ra"},{"r"}};
		
	}

    @Test(priority=1,dataProvider="getdata for firstname")
    public void FirstName(String Keywords) throws InterruptedException{
    create.typefname(Keywords);
    /*if(s.equals("Please enter valid first name")) {
    	System.out.println("Test case is Pass");
    }else {
    	System.out.println("Test case is fail");
    }*/
    
    Thread.sleep(1000);
    driver.close();
    }
	
	
	/*@Test(priority=1)
	
	public void FirstName() throws InterruptedException {
		create.typefname(prop.getProperty("firstname"));
		Thread.sleep(1000);
		driver.close();
		}
	*/
	
	
	@Test(priority=2)
	public void LastName() throws InterruptedException {
		create.typelname(prop.getProperty("lastname"));
		Thread.sleep(1000);
		driver.close();
		}
	
	@Test(priority=3)
	public void Email() throws InterruptedException {
		
		create.typeEmail(prop.getProperty("Email"));
		Thread.sleep(1000);
		driver.close();
		}
	
	@Test(priority=4)
	public void PhoneNumber() throws InterruptedException {
	
		create.typePhone(prop.getProperty("phonenumb"));
		Thread.sleep(1000);
		driver.close();
		}
	
	@Test(priority=5)
	public void Password() throws InterruptedException {
		create.Createpass(prop.getProperty("password"));
		Thread.sleep(1000);
		driver.close();
		}
	
	@Test(priority=6)
	public void Checkbox2() throws InterruptedException {
		create.MandatoryCheck();
		Thread.sleep(1000);
		driver.close();
		}
	
	@Test(priority=7)
	public void Createbutton() throws InterruptedException {
		create.ClickCreate();
		Thread.sleep(1000);
		driver.close();
		}
	
	@Test(priority=9)
	public void Captcha() throws InterruptedException {
		create.pressandhold(null);
		driver.close();

	}
	
	@Test(priority=8)
	public void createaccount() {
		create.typefname(prop.getProperty("firstname"));
		create.typelname(prop.getProperty("lastname"));
		create.typeEmail(prop.getProperty("Email"));
		create.typePhone(prop.getProperty("phonenumb"));
		create.Createpass(prop.getProperty("password"));
		create.MandatoryCheck();
		create.ClickCreate();
		
		
	} 
	

	
}
