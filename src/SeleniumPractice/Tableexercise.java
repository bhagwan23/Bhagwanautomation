package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableexercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		System.setProperty("webdriver.chrome.driver", "\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30449/rcb-vs-kxip-31st-match-indian-premier-league-2020");
		//WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		WebElement table = driver.findElement(By.xpath("//div[@id='innings_2']"));

       // int rowcount = table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
        int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        
        for(int i=0;i<count-2;i++)
        {
        	
        String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
        int valueInteger = Integer.parseInt(value);
        sum=sum+valueInteger;
        
        }
        
      // System.out.println(sum);
        
       String Extras = driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-60'][contains(normalize-space(),'Extras')]//following-sibling::div[1]")).getText();
       int extravalue = Integer.parseInt(Extras);
       int Totalsumvalue = sum+extravalue;
       System.out.println(Totalsumvalue);
       String Actualtotal = driver.findElement(By.xpath("//div[@id='innings_1']//div[@class='cb-col cb-col-60'][contains(normalize-space(),'Total')]//following-sibling::div[1]")).getText();
       int Actualtotalvalue = Integer.parseInt(Actualtotal);
       if(Actualtotalvalue ==Totalsumvalue)
       {
    	   System.out.println("count matched");
       }
       else
       {
    	   System.out.println("Count failed");
       }
    	   
	}
	

}
