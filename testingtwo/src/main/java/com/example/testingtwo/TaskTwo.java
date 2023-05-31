package com.example.testingtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/";
		driver.navigate().to(url);
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("search"));
		search.sendKeys("mobiles");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3500)", "");
				
		WebElement returns =driver.findElement(By.linkText("Returns"));
		returns.click();
		driver.navigate().back();
		WebElement gift=driver.findElement(By.xpath("/html/body/footer/div/div/div[3]/ul/li[2]/a"));
		gift.click();
		driver.quit();
	}
}
