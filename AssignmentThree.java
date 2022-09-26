package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentThree {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		List<WebElement> headers = driver.findElements(By.xpath("//div[@class='render']//tr"));
		for (int i = 0; i < headers.size(); i++) {
			System.out.println(headers.get(i).getText());
		}
	//	List<WebElement> resvalues = driver.findElements(By.xpath("//div[@class='render']//td"));
		//for (int j = 0; j < resvalues.size(); j++) {
			//System.out.println(resvalues.get(j).getText());
		//}

	}

}
