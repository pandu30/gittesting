package testpackage;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
		if(l.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Pandu\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		elseif(l.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Pandu\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.ie.driver","D:\\Pandu\\Selenium\\iedriveraserver.exe");
			driver=new InternetExplorerDriver();
		}
	}

	}

}
