package batman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Class_B {

	@Test
	public void Test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		String url = System.getProperty("url");
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys("rcb");
		
	}
}
