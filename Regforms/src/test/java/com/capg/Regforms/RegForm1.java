package com.capg.Regforms;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegForm1 {

	static WebDriver driver;

	@Test
	public void regformtest() {

		
		System.setProperty("webdriver.chrome.driver", "D:\\web drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8085/regform/regform.html");
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("txtFN")).sendKeys("akhil");
		driver.findElement(By.name("txtLN")).sendKeys("lakka");
		driver.findElement(By.id("txtEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("txtPhone")).sendKeys("7895123546");
		Select s = new Select(driver.findElement(By.name("size")));
		s.selectByIndex(2);
		driver.findElement(By.id("txtAddress1")).sendKeys("plot 141");
		driver.findElement(By.id("txtAddress2")).sendKeys("Almasguda");
		Select city = new Select(driver.findElement(By.name("city")));
		city.selectByVisibleText("Hyderabad");
		Select state = new Select(driver.findElement(By.name("state")));
		state.selectByVisibleText("Telangana");
		driver.findElement(By.name("memberStatus")).click();
		driver.findElement(By.linkText("Next")).click();

		Alert alert = driver.switchTo().alert();
		alert.accept();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.id("txtCardholderName")).sendKeys("Akhil Lakka");
		driver.findElement(By.id("txtDebit")).sendKeys("1234 5678 5365 1232");
		driver.findElement(By.id("txtCvv")).sendKeys("565");
		driver.findElement(By.id("txtMonth")).sendKeys("February");
		driver.findElement(By.id("txtYear")).sendKeys("2028");
		driver.findElement(By.id("btnPayment")).click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		// Actions act = new Actions(driver);

	}
}