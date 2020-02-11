package Tests;
import java.util.Iterator;
import java.util.Set;



//import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class exercise {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","G:\\Basanthi\\Selenium\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://the-internet.herokuapp.com");
By byElem = By.xpath("/html/body/div[2]/div/ul/li[33]/a");
System.out.println(driver.getTitle());
WebElement elem = driver.findElement(byElem);
elem.click();
System.out.println("Before Switching");
System.out.println(driver.getTitle());
Set<String> ids = driver.getWindowHandles();	

Iterator<String> it=ids.iterator();
String parentid = it.next();

driver.switchTo().window(it.next());
driver.switchTo().window(parentid);
System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText());



}
}