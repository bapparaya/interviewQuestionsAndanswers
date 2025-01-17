package questionssolving;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableDuplicatevalues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		List<WebElement> prices = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td[4]"));
		Set unique = new HashSet();
		Set duplicate = new HashSet();
		int count=0;
		for(WebElement price: prices) {
			if(unique.add(price.getText())) {
				//System.out.println("unique values added");
			}else{
				duplicate.add(price.getText());
				count++;
			}
		}
		
		System.out.println(unique);
		System.out.println(duplicate);
		System.out.println(count);

	}

}
