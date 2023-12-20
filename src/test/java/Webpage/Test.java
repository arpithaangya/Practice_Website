package Webpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;

public class Test {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		String title = driver.getTitle();
		System.out.println("Title of webpage is "+title);
		
		WebElement read = driver.findElement(By.xpath("//div[@class=\"date-posts\"]/child::div//h3"));
		System.out.println(read.getText());
		
		WebElement textarea = driver.findElement(By.id("ta1"));
		textarea.sendKeys("This is sample text written by Arpitha");
		
		Select oldNews = new Select(driver.findElement(By.id("drop1")));
		oldNews.selectByIndex(2);
		
		WebElement button = driver.findElement(By.id("but2"));
		boolean checkbtn = button.isEnabled();
		System.out.println("Button is enabled "+checkbtn);
		
		WebElement button1 = driver.findElement(By.id("but1"));
		boolean checkbtn1 = button.isEnabled();
		System.out.println("Button is enabled "+checkbtn1);
		
		
	}
	
	
	
}
