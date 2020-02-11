import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","G:\\Basanthi\\Selenium\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("http://facebook.com");

/* driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mu own xpath");
driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
driver.findElement(By.xpath("//input[@value='log In']")).click();*/

////tagName[v='value']-CSS 

driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}
