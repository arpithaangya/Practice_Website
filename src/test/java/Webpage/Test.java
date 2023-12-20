package Webpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;

public class Test {

	
	
	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		String title = driver.getTitle();
		System.out.println("Title of webpage is "+title);
	}
	
	
	
}
