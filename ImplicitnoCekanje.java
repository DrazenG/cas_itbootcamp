package p23_09_2021;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitnoCekanje {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("file:///C:/Users/Dell/Desktop/ImplicitWaitUvod2.html");
		
		WebElement div = driver.findElement(By.tagName("div"));
		System.out.println(div.getText());
		System.out.println("KRAJ");
		
		driver.findElement(By.tagName("div"));
		
		
		driver.findElement(By.tagName("div"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.tagName("div"));
		
		
		
	}

}
