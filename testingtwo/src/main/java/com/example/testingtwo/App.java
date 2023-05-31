package com.example.testingtwo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Karthi");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("L");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("Karthimama02@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Karthi@2003");
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1500)", "");
    }
}
