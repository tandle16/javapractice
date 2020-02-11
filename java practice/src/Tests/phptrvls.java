package Tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class phptrvls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.gecko.driver", "G:\\Basanthi\\Selenium\\geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver","G:\\Basanthi\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();

		driver.get("http://www.phptravels.net");
driver.findElement(By.xpath("//div[contains(@class,'select2-drop-active')]")).sendKeys("hyd");

}}