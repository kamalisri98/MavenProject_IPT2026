package com.runner;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.utility.ReadExcelData;

public class TestRunner {

	public static void main(String[] args) throws InterruptedException, IOException  {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String username=ReadExcelData.getParticularData(1, 0);
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys(username);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Win10\\eclipse-workspace\\MavenProject\\Screenshots.png");
		FileHandler.copy(source, destination);
		
       }

       }
