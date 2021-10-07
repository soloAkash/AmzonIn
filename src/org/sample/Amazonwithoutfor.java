package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonwithoutfor {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AKASH\\eclipse-workspace\\Task\\driver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("Iphone ",Keys .ENTER);
		
		WebElement lnkIphone = driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (64GB) - Purple']"));
		lnkIphone.click();
		
		
		String ParentwindowId = driver.getWindowHandle();
		System.out.println(ParentwindowId);
		
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		
		List <String>listwindowsId= new ArrayList<>();
		
		listwindowsId.addAll(allwindowId);
		String childwindowId=listwindowsId.get(1);
		driver.switchTo().window(childwindowId);
		
	}
	

}
