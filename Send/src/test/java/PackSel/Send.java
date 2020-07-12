package PackSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.*;

public class Send {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "D:\\Senthil\\Rough docs\\geckodriver.exe";
	public WebDriver driver;

	@BeforeTest
	public void verifyHomepageTitle() {

		System.out.println("launching firefox browser");
		System.setProperty("webdriver.gecko.driver", driverPath);
		System.setProperty("webdriver.gecko.driver", driverPath);
				
		driver = new FirefoxDriver();
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		//India is strong
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		/*
		 * driver.close(); driver.quit();
		 */
	}

//	@FindBy(xpath = "// input[@type='email']]")  
//	WebElement usernameTxtBox2;

	@FindBy(name = "userName")
	WebElement User;

	@Test
	public void Logon() {
		boolean User = driver.findElement(By.name("userName")).isEnabled();
		boolean Pass = driver.findElement(By.name("userName")).isEnabled();

		if (User = true) {
			WebElement UserN = driver.findElement(By.name("userName"));
			UserN.sendKeys("Admin");
		} else {
			System.out.println("UserName Field Not Found");
		}

		if (Pass = true)

		{
			WebElement Password = driver.findElement(By.name("password"));
			Password.sendKeys("Admin123");
			WebElement Submit = driver.findElement(By.name("submit"));
			Submit.click();
			driver.manage().window().maximize();
// Implicit Timeout          
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
			driver.quit();
		} else {
			System.out.println("Password Field Not Found");
		}

	}

}