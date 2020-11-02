package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
       System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
        
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		String opt = driver.findElement(By.xpath("//label[@for='benz']")).getText();
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText(opt);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(opt);
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		String text=  driver.switchTo().alert().getText();
		
		if (text.contains(opt))
				{
			System.out.println("Alert message success");
				}
		
		else
			System.out.println("Something wrong with execution");
		

	}

}
