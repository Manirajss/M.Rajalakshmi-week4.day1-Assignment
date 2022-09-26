package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFour {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		List<WebElement> columns = driver.findElements(By.xpath("//div[@id='contentblock']//th"));
		for (int i = 0; i < columns.size(); i++) {
			System.out.println("Number of Rows in a Table: "+ columns.size());
		}
		List<WebElement> rows = driver.findElements(By.xpath("//div[@id='contentblock']//tr"));
		for (int j = 0; j < rows.size(); j++) {
			System.out.println("Number of Rows in a Table: "+ rows.size());
		}
		WebElement progress = driver.findElement(By.xpath("//tr[@class='even']/td[2]"));
		System.out.println("The progress value of Learn to interact with Elements: "+ progress.getText());
		WebElement task = driver.findElement(By.xpath("//div[@id='contentblock']//tr[2]/td[3]"));
		task.click();
	}

}
