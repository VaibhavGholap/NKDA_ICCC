package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.basePackage.BaseClass;
import com.extentManager.ExtentManager;

public class NKDALoginTest extends BaseClass {
	
	@Test
	public void loginPageTest() throws InterruptedException {
		Thread.sleep(4000);
		WebElement imgElement=driver.findElement(By.xpath("//img[@class='img-fluid for-light'][1]"));
		Assert.assertTrue(imgElement.isDisplayed());
	}
	@Test
	public void loginTest() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("testsite@yopmail.com");
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Vaibhav@123");
		driver.findElement(By.xpath("//button[contains(@class,'btn btn-primary')]")).click();
		Thread.sleep(2000);
        String actualTitle=driver.getTitle();
        String expectedTitle="Utron- NKDA";
        Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void sampleCase() {
		ExtentManager.test.createNode("Validation1");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation2");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation3");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation4--changes--");
		Assert.assertTrue(true);
	}
}
