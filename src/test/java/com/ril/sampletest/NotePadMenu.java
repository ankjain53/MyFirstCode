package com.ril.sampletest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class NotePadMenu {

	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{


		DesktopOptions options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\notepad.exe");

		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"),options);

		Thread.sleep(2000);

		driver.findElement(By.name("Maximize")).click();

		driver.findElement(By.name("File")).click();

		driver.findElement(By.name("Save As...")).click();

		Thread.sleep(4000);

		driver.findElement(By.name("Documents")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("SearchEditBox")).sendKeys("Win");
		Thread.sleep(4000);

		
		Actions act= new Actions(driver);
		{

			WebElement element = driver.findElement(By.name("Win Notepad Save"));
			act.moveToElement(element).doubleClick().build().perform();;

		}

		long File1=System.currentTimeMillis();
		System.out.println(File1);

		driver.findElement(By.id("1001")).sendKeys("File1");
		driver.findElement(By.name("Save")).click();
		driver.findElement(By.name("No")).click();
		driver.findElement(By.name("Cancel")).click();
		driver.findElement(By.name("Close")).click();


		System.out.println("NotePad");



	}

}
