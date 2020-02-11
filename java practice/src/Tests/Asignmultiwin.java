package Tests;
import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Asignmultiwin {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\Basanthi\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
// TODO Auto-generated method stub
driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).click();
		
	
		
	//	Set<String>ids=driver.getWindowHandles();
		//Iterator<String> it=ids.iterator();
		
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
		

		Set<String>cpc=driver.getWindowHandles();
		Iterator<String> it=cpc.iterator();
		
		String parentwindow =it.next();
	
		driver.switchTo().window(it.next());
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/div/a")).getText());
	
		driver.switchTo().window(parentwindow);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='content']/ul/li[33]/a")).getText());
	}

}
