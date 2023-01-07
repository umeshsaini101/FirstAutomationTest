package TestCases;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCases {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1() {
		driver.navigate().to("https://homecliq.aiab.in");
		System.out.println(driver.getTitle());
	}
	@Test
	public void Test2() {
		driver.navigate().to("https://homecliq.aiab.in");
		System.out.println(driver.getTitle());
	}
	@Test
	public void Test3() {
		driver.navigate().to("https://homecliq.aiab.in");
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
