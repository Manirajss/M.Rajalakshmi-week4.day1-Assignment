package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTwo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='render']//tr[1]"));
		for (int i = 0; i < rows.size(); i++) {
			System.out.println("Number of Rows in a Table : "+rows.size());
			break;
		}
		List<WebElement> columns = driver.findElements(By.xpath("//div[@class='render']//tr[1]/th"));
		for (int j = 0; j < columns.size(); j++) {
			System.out.println("Number of Columns in a Table : "+columns.size());
			break;
		}
	}

}
