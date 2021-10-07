package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\AKASH\\eclipse-workspace\\AmzonIn\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	 driver.get("https://www.amazon.in/");
	 
	String title=driver.getTitle();
	System.out.println(title);
	
	WebElement txtamazon = driver.findElement(By.xpath("//a[contains(text(),'use')]"));
	String name = txtamazon.getText();
	System.out.println(name);
	}

}
	
