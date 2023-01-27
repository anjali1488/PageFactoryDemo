package testcases;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo {

	static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException
	{
	
	String url = "https://adactinhotelapp.com/";
	String node = "http://192.168.1.7:4444/wd/hub";
	
	ChromeOptions opt = new ChromeOptions();
    driver = new RemoteWebDriver(new URL(node),opt);
    driver.navigate().to(url);
    String title = driver.getTitle();
    System.out.println(title);
	
	}
}
