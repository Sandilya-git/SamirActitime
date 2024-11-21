package com.actitime.testscript;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class ProjectModule extends BaseClass {
	@Test
	public void createProject() throws EncryptedDocumentException, IOException {
		String projectName=f.getExcelData("CreateProject",1,1);
		String pdescription=f.getExcelData("CreateProject",1,2);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewPBtn().click();
		t.getNewProjBtn().click();
		t.getProjNameTbx().sendKeys(projectName);
		t.getCustPrDrdown().click();
		t.getOurCompPrOpt().click();
		t.getProjDescTbx().sendKeys(pdescription);
		t.getCreateProjBtn().click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//a[text()='All Customers']/../../div[@class='title ellipsis']")
				, projectName));
		WebElement createdproj = t.getCreatedCustHeading();
		System.out.println(createdproj.getText());
	}
	@Test
	public void deleteProject() throws EncryptedDocumentException, IOException, InterruptedException {
		String projectName=f.getExcelData("CreateProject",1,1);
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		t.getPsearchTbx().sendKeys(projectName);
		t.getSettingPEdtBtn().click();
		Thread.sleep(2000);
		t.getActionPBtn().click();
		Thread.sleep(2000);
		t.getDeletePBtn().click();
		Thread.sleep(2000);
		t.getPerDelPBtn().click();
	}
}




