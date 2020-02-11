package Tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Checkboxass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\Basanthi\\Selenium\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	
	driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
	driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).click();
	
	//driver.findElement(By.xpath("//input[@id='checkBoxOption3']")).clear();
	
	//count the no.of checkboxes
	
	System.out.println(driver.findElements(By.xpath("//input[@id='checkbox-example']")).size());
	driver.findElement(By.id("checkbox-example"));
	
	System.out.println(driver.findElement(By.id("checkbox-example")).getText());
	for(int i=1;i<3;i++)
	
	{
	driver.findElement(By.id("checkbox-example")).click();
		
	
	
	}
	
	}
	
	}