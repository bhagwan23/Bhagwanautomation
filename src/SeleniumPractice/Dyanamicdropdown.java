package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dyanamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();

		driver.get("https://www.spicejet.com/");
	   // driver.manage().window().maximize();

		Thread.sleep(12000);
		//driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
	//	driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).click();
       // Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_originStation1']")));
		//s.selectByValue("3");
		//s.selectByIndex(5);
		//driver.findElement(By.xpath("text()='Bengaluru (BLR)')")).click();
		//s.selectByVisibleText(" Bengaluru (BLR)");
		

	}

}
