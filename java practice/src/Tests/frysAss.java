package Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frysAss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","G:\\Basanthi\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://FRYS.COM/");
	driver.findElement(By.id("searchbxquery")).sendKeys("4gb ram");
	driver.findElement(By.xpath("//input[@value='GO']")).click();
    
	WebElement pageNumElem = driver.findElement(By.id("pageNumber"));
	List<WebElement> listofpageNum = pageNumElem.findElements(By.tagName("a"));
	int sizeoflist=listofpageNum.size();
    for(int i=0;i<sizeoflist;i++)
    {
    	Actions builder=new Actions(driver);
    	WebElement anchorElement = listofpageNum.get(i);
    	//listofpageNum.get(i).sendKeys(arg0);
    	builder.keyDown(anchorElement,Keys.CONTROL).click(anchorElement);
    	
    }
	}

}
