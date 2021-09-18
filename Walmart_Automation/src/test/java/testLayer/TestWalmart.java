package testLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import basePackage.FinalWalmartBaseClass;
import pomPackage.POMWalmartSignin;

public class TestWalmart extends FinalWalmartBaseClass {
	
	POMWalmartSignin login;
	public TestWalmart() {
		super();	
	}
	
	@BeforeClass
	public void initialsetup() {
	initiation();
	login=new POMWalmartSignin();
	
	}
	//TC1
	
	@Test(priority=1)
	public void entersite() throws InterruptedException {
		login.Entersite();
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
	  
	  @Test(priority=2,dataProvider="Searchitems") public void searchwindow(String
	  Keywords) throws InterruptedException {
	  
	  login.Searchwindow(Keywords); Thread.sleep(2000);
	  driver.navigate().refresh(); login.Searchdataclear(); Thread.sleep(1000);   	
    	
    }
    public void Myacnt() {
    	
    	
    }
    
		
	}
	



	