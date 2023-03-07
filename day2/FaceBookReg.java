package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookReg {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
 
		        driver.get(" https://en-gb.facebook.com/");
		          
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        
		        driver.findElement(By.linkText("Create new account")).click();	      
		        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Menaka");
		       driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nagarajan");
		       driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("1234567890");
		       driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("menaka123");
	 
		       	WebElement selectdate = driver.findElement(By.xpath("//select[@id='day']"));
		       	Select drop1=new Select(selectdate);
		       	drop1.selectByValue("16");
	
		       	WebElement selectmonth = driver.findElement(By.xpath("//select[@id='month']"));
		       	Select drop2=new Select(selectmonth);
		       	drop2.selectByValue("11");
		       	
		    	WebElement selectyear = driver.findElement(By.xpath("//select[@id='year']"));
		       	Select drop3=new Select(selectyear);
		       	drop3.selectByValue("1984");
		       	
		        driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
	
	}

}
