package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
	//	driver.findElement(By.id("autosuggest")).sendKeys("Ind");

		Thread.sleep(2000L);

		List<WebElement> options = driver.findElements(By.cssSelector("ul[id='ui-id-1']>li"));

		for(WebElement option :options)

		{

		System.out.println(option.getText());

		if(option.getText().equalsIgnoreCase("India"))

		{

		System.out.println(option.getText());

		Thread.sleep(2000);

		option.click();

		break;
    	   }
       }
       
		
		

	}

}
