package TestNg.TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumThirdAssignment {
	
	WebDriver driver;

	@Test
	public void ChromeLaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		driver.manage().window().maximize();
		
		// ImplicitWait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Using WebElement
		WebElement UserName_Feild =driver.findElement(By.xpath("//input[@id='username']"));
		WebElement Password_Feild = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login_Feild =driver.findElement(By.xpath("//button[@name='login']"));
		
		
		//Data 
		String Usser_id = "demo@techfios.com";
		String Password = "abc123";
		
		//Passing Data
		 UserName_Feild.sendKeys(Usser_id);
		 Password_Feild.sendKeys(Password);
		login_Feild.click();
		


}
}