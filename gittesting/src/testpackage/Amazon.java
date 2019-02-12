package testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Pandu\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		System.out.println(l.size());
		Thread.sleep(5000);
		driver.findElement(By.id("nav-link-shopall")).click();
		List<WebElement> l1=driver.findElements(By.xpath("//a"));
		System.out.println(l1.size());
		Thread.sleep(5000);
		driver.close();
	}

}
