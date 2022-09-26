package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentOne {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.chittorgarh.com/");
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		//WebElement security = driver.findElement(By.xpath("//table[contains(@class,'table table-bordered table')]//tr[2]/td[3]"));
		List<WebElement> security = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//tr/td[3]"));
		for (int i = 0; i < security.size(); i++) {
			System.out.println(security.get(i).getText());
		}
		List<WebElement> security1 = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//tr/td[3]"));
		for (int j = 0; j < security1.size(); j++) {
			int Size=security1.size();
			System.out.println("The total numbers of the security names : "+Size);
			break;
		}
		if(security.size()==security1.size()) {
			System.out.println("Duplicates Present");
		}
		else {
			System.out.println("No Duplicates");
		}

	}

}
