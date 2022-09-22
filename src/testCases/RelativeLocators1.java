package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;
import java.util.List;

public class RelativeLocators1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumPrequisite\\excecutables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//		driver.get("https://way2automation.com/way2auto_jquery/index.php");
//		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
//		//phone.sendKeys("212342354");
//		WebElement email = driver.findElement(with(By.xpath("//input[@type='email']"))
//					.below(phone)
//					.above(By.tagName("select")));
//		email.sendKeys("trainer@gmail.com");
//		//driver.findElement(with(By.partialLinkText("THE")).above(By.linkText("EXPLORE LIFETIME MEMBERSHIP"))).click();
////		List <WebElement> labels = driver.findElements(with(By.tagName("label")).below(By.xpath("//*[@id=\"load_form\"]/h3")));
////		
////		for(WebElement label: labels) {
////			System.out.println(label.getText());
				//System.out.println("change to file ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com");
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).getText());
		//driver.findElement(with(By.xpath("//input[@type='password']")).above(By.id("btnLogin"))).sendKeys("4573625");
		
	}

}
