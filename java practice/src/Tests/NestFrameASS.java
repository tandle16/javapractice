package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestFrameASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver","G:\\Basanthi\\Selenium\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
	// TODO Auto-generated method stub
	driver.get("https://the-internet.herokuapp.com");
	driver.findElement(By.linkText("Nested Frames")).click();
	driver.switchTo().frame("frame.top");
	driver.switchTo().frame("frame.middle");
	System.out.println(driver.findElement(By.xpath("/html/frameset/frame[2]")).getText());
			
	}

}