package questionssolving;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions action = new Actions(driver);
		//drag and drop
		/*WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		action.dragAndDrop(source, target).perform();
		*/
		
		//mouse hover
		/*WebElement firstelement = driver.findElement(By.xpath("//button[text()='Point Me']"));
		WebElement targetelement = driver.findElement(By.xpath("//a[text()='Laptops']"));
		action.moveToElement(firstelement).moveToElement(targetelement).click();
		*/
		
		//scoll by
		//WebElement scroll = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
		
      /* WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
       field1.clear();
       field1.sendKeys("bapparaya");
       Thread.sleep(2000);
       action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
       action.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
       action.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		*/
		WebElement dropdown = driver.findElement(By.xpath("//input[@id='comboBox']"));
				dropdown.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dropdown);
		WebElement somevalue = driver.findElement(By.xpath("//div[@id='dropdown']/div[90]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", somevalue);
	}

}
