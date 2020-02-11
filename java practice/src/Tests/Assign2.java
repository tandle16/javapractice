package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "G:\\Basanthi\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.cleartrip.com");

		Select dropdown = new Select(driver.findElement(By.id("Adults")));
		dropdown.selectByIndex(3);
		Select dropdownChild = new Select(driver.findElement(By.id("Childrens")));
		dropdownChild.selectByIndex(2);
		driver.findElement(
				By.cssSelector("input[class='depart_date keyValue span span24 required hasDatepicker placeholder']"))
				.click();

		driver.findElement(By.cssSelector(".ui-state-highlight")).click();
		// driver.findElement(By.id("MoreOptionsLink")).click();
		 driver.findElement(By.cssSelector("#MoreOptionsLink")).click();
		//driver.findElement(By.cssSelector(".weak")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo airlines");
		// a[@id='MoreOptionsLink']Preferred Airline
		

		driver.findElement(By.cssSelector("input[id='SearchBtn']")).click();

		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());
	}

}
