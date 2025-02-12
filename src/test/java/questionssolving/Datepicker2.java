package questionssolving;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BAPPARAYA R\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
		
		String exptdate="January 2026";
		String exptdatee="13";
		
		
		while(true) {
			String actualdate = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
			if(actualdate.equals(exptdate)) {
				List<WebElement> dates = driver.findElements(By.xpath("//div[@class='DayPicker-Months']/div[1]/div[3]/div/div/div/p[1]"));
				for(WebElement date:dates) {
					if(date.getText().equals(exptdatee)) {
						date.click();
						break;
					}
				}
			}
			
			driver.findElement(By.xpath("//div[@class='DayPicker-NavBar']/span[2]")).click();
		}
				

	}

}
