package testpackage;

import org.openqa.selenium.chrome.ChromeDriver;


public class testclass {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Pandu\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.close();

	}

}
