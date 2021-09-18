
package testLayer;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import basePackage.FinalWalmartBaseClass;
import pomPackage.POMCreateAccount;
import pomPackage.POMLogin;
import pomPackage.POMWalmartSignin;
import testdata.Excelsheet;

public class FinalWalmartTestLayer extends FinalWalmartBaseClass{
	
	POMCreateAccount create;
	POMLogin login;
	POMWalmartSignin WmartLogin;
	
	public FinalWalmartTestLayer() {
		super();	
	}
	
	@BeforeMethod
	
	public void initsetup()  {
		initiation();
	create= new POMCreateAccount();
	screenshots("Login");
	login= new POMLogin();
	WmartLogin = new POMWalmartSignin();
		
	}
	
	// to pass the data via Data provider
	
	
	@DataProvider(name="getdata for firstname")
	public Object[][] firstname(){
		return new Object[][] {{"Roicians"},{"ra"},{"r"}};
		
	}

	
	
	
	// Test cases for create account page
	
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
	
	
	
	
	// Test cases for login account page
	

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
		login.typeUserName(name);
		Thread.sleep(2000);
		login.typePassword(pass);
		Thread.sleep(2000);
		// log.clickSignin();
		driver.navigate().refresh();
	}
	
	
	@Test(priority=11)
	public void entersite() throws InterruptedException {
		WmartLogin.Entersite();
		Thread.sleep(10000);
	

}
	
	/*
	  @Test public void ShopCart() { 
		  login.ShopCartt();
		  }
	  
	  @Test
	  public void search() {
	  
	  }
	 
	
	//TC2
  @Test(priority=2)
  
  public void Backtoschool() throws InterruptedException {
  	System.out.println(" back to school menu");
  	login.BackToSchool();
  	Thread.sleep(2000);
  	driver.navigate().back();
  	Thread.sleep(2000);
  }
  
  //TC3
	@Test(priority=3)
  public void campusready() throws InterruptedException {
  	login.CampusReady();
  	Thread.sleep(2000);
  	driver.navigate().back();
  	Thread.sleep(2000);
	}
	//TC4
	
  @Test(priority=4)
  public void rollback() throws InterruptedException {
  	login.Rollback();
  	Thread.sleep(2000);
  	driver.navigate().back();
  	Thread.sleep(2000);
  }
  
  //TC5
  
  
  @Test(priority=5)
  public void Stationery() throws InterruptedException {
  	login.stationery();
  	Thread.sleep(2000);
  	driver.navigate().back();
  	Thread.sleep(2000);
  }
  
  //TC6
  
  @Test(priority=6)
  public void clothing() throws InterruptedException {
  	login.Clothing();
  	Thread.sleep(2000);
  	driver.navigate().back();
  	Thread.sleep(2000);
  	
  }
  //TC7
  
  @Test(priority=7)
  public void ShopGrocery() throws InterruptedException {
  	login.Shopgrocery();
  	Thread.sleep(2000);
  	driver.navigate().back();
  	Thread.sleep(2000);
  }
  
  */
  
  //TC8
	
	  @DataProvider(name="Searchitems") 
	  public Object[][] searchlist(){ 
	  return new Object[][] {{"table"},{"chair"},{"bedsheet"}};
	  
	  
	  }
	  
	  @Test(priority=12,dataProvider="Searchitems")
	  public void searchwindow(String Keywords) throws InterruptedException {
	  WmartLogin.Searchwindow(Keywords);
	  Thread.sleep(2000);
	  driver.navigate().refresh();
	  WmartLogin.Searchdataclear(); 
	  Thread.sleep(1000);   	
  	
  }

	  
	  
	  
  
		
}
