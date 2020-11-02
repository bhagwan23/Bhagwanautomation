package SeleniumPractice;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkcount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement footer1 = footer.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[1]/ul[1]"));
		System.out.println(footer1.findElements(By.tagName("a")).size());
		
		//4 click on each link in the column and check if the pages are opening
		for(int i=1;i<footer1.findElements(By.tagName("a")).size();i++)
			
		{
			
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer1.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(5000);
		}
		
		Set<String> abc =driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

	}

}
