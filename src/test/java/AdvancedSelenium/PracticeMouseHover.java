package AdvancedSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeMouseHover {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     driver= new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/hovers");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        WebElement profile= driver.findElement(By.xpath("//img[@alt='user Avatar'][1])"));
        Actions  a = new Actions (driver);
        
         a.moveToElement(profile).build().perform();




       

}
}
