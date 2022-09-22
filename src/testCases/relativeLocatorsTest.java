package testCases;

import java.io.IOException;
import java.time.Duration;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relativeLocatorsTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\seleniumPrequisite\\excecutables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebElement above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		WebElement above = driver.findElement(with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("trainer@way2automation.com");
		WebElement below = driver.findElement(with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("Delhi");
		
		//WebElement near = driver.findElement(with(By.partialLinkText("THE")).near(By.linkText("Signin")));
		//near.click();
		WebElement rightof = driver.findElement(with(By.xpath("//input[@type='password']")).toRightOf(By.tagName("label")));
		rightof.sendKeys("hjgfdjhs");
		
		WebElement leftof = driver.findElement(with(By.linkText("Signin")).toLeftOf(By.cssSelector("div.bottom:nth-child(12) > div:nth-child(2) > input:nth-child(1)")));
		leftof.click();
			

	}

}
