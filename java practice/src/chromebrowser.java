import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chromebrowser {
 //static WebDriver driver=new ChromeDriver();
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","G://Basanthi//Selenium//chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("http://facebook.com");//URLin the browser
//driver.findElement(By.className("inputtext")).sendKeys("helloworld");

driver.findElement(By.id("email")).sendKeys("This is Email id ");
driver.findElement(By.name("pass")).sendKeys("12345");
/*driver.findElement(By.linkText("Forgot account")).click();*/
driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");

	}

}
