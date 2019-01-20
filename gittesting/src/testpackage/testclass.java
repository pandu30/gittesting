package testpackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Pandu\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.co.in/"); 
		Thread.sleep(5000);
		driver.close();

	}

}
