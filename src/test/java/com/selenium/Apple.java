package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apple {
		@Test
		public void selenium() throws InterruptedException {
		
		  WebDriver driver = null;

		   // public static void main(String[] args) throws InterruptedException{
		        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\webdriver\\chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		        //open the web app
		        driver.navigate().to("http://18.118.134.148:8080/LoginWebApp/");
		        driver.manage().window().maximize();
		        String title = driver.getTitle();

		        if(title.equalsIgnoreCase("Java Simple Login Web App"))
		            System.out.println("Title matches");
		        else
				System.out.println(title);
		        Thread.sleep(3000);


		       driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[4]/td/a")).click();
		       Thread.sleep(3000);
		       
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[1]/td[2]/input")).sendKeys("zameer");

		      Thread.sleep(3000);
		      
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[2]/td[2]/input")).sendKeys("shaik");
		      Thread.sleep(3000); 
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[3]/td[2]/input")).sendKeys("zameer.shaik@cgi.com");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[4]/td[2]/input")).sendKeys("zameer.shaik");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[5]/td[2]/input")).sendKeys("Apple@123");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[6]/td[2]/input")).click();
		      // driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[6]/td[1]/input")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[7]/td/a")).click();
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[1]/td[2]/input")).sendKeys("zameer.shaik");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[2]/td[2]/input")).sendKeys("Apple@123");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[3]/td[2]/input")).click();
		      // driver.findElement(By.xpath("/html/body/form/center/table/tbody/tr[3]/td[1]/input")).click();
		      Thread.sleep(3000);
		      driver.close();
		       
		    }
	}
