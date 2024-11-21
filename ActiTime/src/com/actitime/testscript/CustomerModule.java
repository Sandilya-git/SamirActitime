package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListnerImplementation.class)
public class CustomerModule extends BaseClass {

	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException {
		String customerName=f.getExcelData("createCustomer",1,1);
		String description=f.getExcelData("createCustomer",1,2);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		t.getCustNameBtn().sendKeys(customerName);
		t.getCustDescTbx().sendKeys(description);
		t.getCustDropdown().click();
		t.getOurCompOpt().click();
		t.getCreatecustBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']")
				, customerName));
		WebElement createdcust = t.getCreatedCustHeading();
		System.out.println(createdcust.getText());
	}
	//delete customer deleting procedure
	@Test
	public void deleteCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String customerName=f.getExcelData("createCustomer",1,1);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getSearchTbx().sendKeys(customerName);
		t.getSettingEdtBtn().click();
		Thread.sleep(2000);
		t.getActionsBtn().click();
		Thread.sleep(2000);
		t.getDeleteBtn().click();
		Thread.sleep(2000);
		t.getPerDeleteBtn().click();
	}
}




