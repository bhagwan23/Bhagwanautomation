package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id='Adults']")).click();
		Select s = new Select(driver.findElement(By.xpath("//select[@id='Adults']")));
		s.selectByValue("4");
		
		
		driver.findElement(By.id("Childrens")).click();
		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByValue("2");
		
		driver.findElement(By.id("Infants")).click();
		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s2.selectByValue("1");

		driver.findElement(By.cssSelector(".icon.ir.datePicker")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		driver.findElement(By.xpath("//a[@title='More search options']")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		driver.findElement(By.cssSelector("#SearchBtn")).click();
		
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
