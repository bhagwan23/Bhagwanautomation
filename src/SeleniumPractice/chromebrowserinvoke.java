package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowserinvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
				//Create Driver object for chrome browser
				
				//WE will strictly implement method of WebDriver
				
				//invoke.exe file first
				
				System.setProperty("webdriver.chrome.driver", "E:\\chrome\\chromedriver.exe");
				
		        WebDriver driver = new ChromeDriver();	
		        driver.get("https://www.google.com/");
		        System.out.println(driver.getTitle());//Validate if your page title is correct
		        System.out.println(driver.getCurrentUrl());//Validate if you landed current URL
		       // System.out.println(driver.getPageSource());//Print page Source
		        driver.navigate().to("https://in.yahoo.com/?p=us");
		        driver.navigate().back();
		        driver.navigate().forward();
		        driver.close();
		        
		        System.out.println("Value printed successfully");
		        System.out.println("git pull printed successfully");
				

	}

}
