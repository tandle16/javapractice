package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asnrealtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Basanthi\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption3")).click();
		driver.findElement(By.id("dropdown-class-example")).click();
		WebElement dropdownExample=driver.findElement(By.id("dropdown-class-example"));
		
		List<WebElement> listoflabel=dropdownExample.findElements(By.id("dropdown-class-example"));
		int sizeoflabel=listoflabel.size();
		for(int i=1;i<=sizeoflabel;i++)
		{
			listoflabel.get(i).click();
		}
		
		
		
	}

}
