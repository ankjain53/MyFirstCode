package com.ril.sampletest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class IETest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{

		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Program Files\\Internet Explorer\\iexplore.exe");

		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);
		Thread.sleep(5000);
		driver.findElement(By.name("Tools")).click();

		driver.findElement(By.name("Internet options")).click();
		driver.findElement(By.name("Tabs")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("6115")).click();
		
		driver.findElement(By.name("The new tab page")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("Cancel")).click();
		driver.findElement(By.name("Settings")).click();
		
		
		
		
	
		
		driver.findElement(By.name("Cancel")).click();
		driver.findElement(By.name("Cancel")).click();



		driver.findElement(By.name("Tools")).click();

		driver.findElement(By.name("About Internet Explorer")).click();
		driver.findElement(By.name("Close")).click();
		
         
		System.out.println("Test Pass");



	}

}
