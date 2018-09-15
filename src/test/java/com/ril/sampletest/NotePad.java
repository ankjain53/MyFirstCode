package com.ril.sampletest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class NotePad {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");

		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);

		driver.findElement(By.name("Maximize")).click();

		driver.findElement(By.name("File")).click();

		driver.findElement(By.id("1")).click();


		driver.findElement(By.id("15")).sendKeys("Hello World!!");

		driver.findElement(By.name("Close")).click();


		driver.findElement(By.name("Cancel")).click();


		driver.findElement(By.name("Format")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("View")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Help")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Edit")).click();
		Thread.sleep(1000);

		driver.findElement(By.name("Edit")).sendKeys(Keys.chord(Keys.CONTROL, "f"));

		Thread.sleep(2000);

		driver.findElement(By.name("Find what:")).sendKeys("Hello");

		Thread.sleep(2000);	

		driver.findElement(By.name("Up")).click();

		Thread.sleep(2000);

		driver.findElement(By.name("Find Next")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("Close")).click();


		
		

		
		
		/*driver.findElement(By.name("Format")).sendKeys(Keys.chord(Keys.ARROW_DOWN));
		driver.findElement(By.name("Format")).sendKeys(Keys.chord(Keys.ARROW_DOWN));
		
		driver.findElement(By.name("Font")).click();*/
		Thread.sleep(3000);
		
	//	driver.findElement(By.name("Cancel")).click();


		driver.findElement(By.name("Close")).click();

		Thread.sleep(2000);
		driver.findElement(By.name("Don't Save")).click();



		//	driver.findElement(By.name("Save")).click();
		//Thread.sleep(5000);

		System.out.println("Notepad Closed");



	}

}
