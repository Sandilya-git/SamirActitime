package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class UserModule extends BaseClass {
	@Test
	public void addUser() throws EncryptedDocumentException, IOException {
		String userfName=f.getExcelData("AddUser",1,1);
		String userlName=f.getExcelData("AddUser",1,2);
		String email=f.getExcelData("AddUser",1,3);
		String lgnUserName=f.getExcelData("AddUser", 1, 4);
		String uPwd=f.getExcelData("AddUser",1,5);
		String uCnPwd=f.getExcelData("AddUser",1,6);
		HomePage h=new HomePage(driver);
		h.setUser();
		TaskListPage t=new TaskListPage(driver);
		t.getAddUserBtn().click();
		t.getFrNameTbx().sendKeys(userfName);
		t.getLsNameTbx().sendKeys(userlName);
		t.getEmailTbx().sendKeys(email);
		t.getLgUnTbx().sendKeys(lgnUserName);
		t.getLgPwdTbx().sendKeys(uPwd);
		t.getLgcnfpwdTbx().sendKeys(uCnPwd);
		t.getcUserBtn().click();
	}
	@Test
	public void deleteUser() throws EncryptedDocumentException, IOException, InterruptedException {
		String userfName=f.getExcelData("AddUser",1,1);
		HomePage h=new HomePage(driver);
		h.setUser();
		TaskListPage t=new TaskListPage(driver);
		t.getuSearchTbx().sendKeys(userfName);
		Thread.sleep(2000);
		t.getUnCntnr().click();
		Thread.sleep(2000);
		t.getuDelBtn().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}


}



