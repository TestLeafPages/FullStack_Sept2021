package challenges;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class HandlingShadowDom {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://developer.servicenow.com/dev.do");
		//driver.get("chrome://downloads/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Sign In']").click();
	//	String attribute = shadow.findElement("downloads-toolbar").getAttribute("id");
	//	System.out.println(attribute);
		
	}

}
