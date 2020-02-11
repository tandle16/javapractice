package Tests;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;

public class multiplewindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","G:\\Basanthi\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("html/body/div[1]/div/footer/ul/li[1]/a")).click();
		System.out.println("Before switching");
		System.out.println(driver.getTitle());
		
		
Set<String>ids=driver.getWindowHandles();

Iterator<String> it=ids.iterator();
String parentid=it.next();
String childid=it.next();
driver.switchTo().window(childid);
System.out.println("after swtching");
System.out.println(driver.getTitle());
driver.switchTo().window(parentid);
System.out.println("Switching back to parent");
System.out.println(driver.getTitle());

	}

}
