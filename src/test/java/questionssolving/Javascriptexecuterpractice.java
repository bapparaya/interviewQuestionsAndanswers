package questionssolving;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptexecuterpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Bapparaya');",name);
		WebElement femaleCheckbox = driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click();", femaleCheckbox);
		
		//scroll to till the webelemtn is available
		//WebElement dynamictble = driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
		//js.executeScript("arguments[0].scrollIntoView(true);", dynamictble);
		
		//scroll page by pixel
		//js.executeScript("window.scrollBy(0,1000)");
		//System.out.println(js.executeScript("window.scroll"));
		
		//scroll to bottom of the page
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollTo(0,0)");
		
		//js.executeScript("window.scrollTo(0,document.body.scrollheight)");
     //   js.executeScript("window.scrollTo(0,1000)");
        
        
		
		

	}

}
