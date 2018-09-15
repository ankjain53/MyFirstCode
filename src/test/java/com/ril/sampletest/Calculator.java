package com.ril.sampletest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");

		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
		Thread.sleep(2000);
		driver.findElement(By.id("137")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Add")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("8")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Equals")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("Edit")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Help")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("View")).click();
		Thread.sleep(2000);

	//	Actions act=new Actions(driver);

		//WebElement ele=driver.findElement(By.id("304"));

		//act.moveToElement(ele).build().perform();

		//	driver.findElement(By.name("View")).sendKeys(Keys.chord(Keys.ALT, "2"));


		Thread.sleep(1000);






		driver.quit();


	}

}
