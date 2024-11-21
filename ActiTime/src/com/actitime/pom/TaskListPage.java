package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustBtn;
	@FindBy(id="customerLightBox_nameField")
	private WebElement custNameTbx;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement custDescTbx;
	@FindBy(xpath="//button[contains(text(),'Select an active customer')]")
	private WebElement custDropdown;
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompOpt;
	@FindBy(id="customerLightBox_commitBtn")
	private WebElement createcustBtn;
	@FindBy(xpath="//a[text()='All Customers']/../../div[@class='title ellipsis']")
	private WebElement createdCustHeading;
	//delete customer coding start
	@FindBy(xpath="//input[@placeholder='Start typing name ...']")
	private WebElement searchTbx;
	@FindBy(xpath="//span[@class='highlightToken']/../..//div[@class='editButton available']")
	private WebElement settingEdtBtn;
	@FindBy(xpath="//div[@class='customerNamePlaceHolder']/..//div[@class='action']")
	private WebElement actionsBtn;
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deleteBtn;
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement perDeleteBtn;
	//create project coding start
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewPBtn;
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProjBtn;
	@FindBy(id="projectPopup_projectNameField")
	private WebElement projNameTbx;
	@FindBy(id="projectPopup_customerSelectorPlaceholder")
	private WebElement custPrDrdown;
	@FindBy(xpath="//a[text()='Our Company']")
	private WebElement ourCompPrOpt;
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement projDescTbx;
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProjBtn;
	//delete project coding start
	@FindBy(xpath="//input[@placeholder='Start typing name ...']")
	private WebElement psearchTbx;
	@FindBy(xpath="//span[@class='highlightToken']/../..//div[@class='editButton available']")
	private WebElement settingPEdtBtn;
	@FindBy(xpath="//div[@class='projectNamePlaceholder']/..//div[@class='action']")
	private WebElement actionPBtn;
	@FindBy(xpath="(//div[text()='Delete'])[3]")
	private WebElement deletePBtn;
	@FindBy(id="projectPanel_deleteConfirm_submitTitle")
	private WebElement perDelPBtn;
	// add user coding start
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUserBtn;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement frNameTbx;
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement lsNameTbx;	
	@FindBy(id="userDataLightBox_emailField")
	private WebElement emailTbx;
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement lgUnTbx;
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement lgPwdTbx;
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement lgcnfpwdTbx;
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement cUserBtn;
	//delete user coding start
	@FindBy(xpath="(//input[@class='filterFieldInput inputFieldWithPlaceholder'])")
	private WebElement uSearchTbx;
	@FindBy(xpath="//span[text()='Kim']")
	private WebElement unCntnr;
	@FindBy(id="userDataLightBox_deleteBtn")
	private WebElement uDelBtn;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getNewCustBtn() {
		return newCustBtn;
	}
	public WebElement getCustNameBtn() {
		return custNameTbx;
	}
	public WebElement getCustDescTbx() {
		return custDescTbx;
	}
	public WebElement getCustDropdown() {
		return custDropdown;
	}
	public WebElement getOurCompOpt() {
		return ourCompOpt;
	}
	public WebElement getCreatecustBtn() {
		return createcustBtn;
	}
	public WebElement getCreatedCustHeading() {
		return createdCustHeading;
	}
	//delete customer getter method
	public WebElement getSearchTbx() {
		return searchTbx;
	}
	public WebElement getSettingEdtBtn() {
		return settingEdtBtn;
	}
	public WebElement getActionsBtn() {
		return actionsBtn;
	}
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}
	public WebElement getPerDeleteBtn() {
		return perDeleteBtn;
	}
	
    //create project getter method
	public WebElement getCustNameTbx() {
		return custNameTbx;
	}
	public WebElement getAddNewPBtn() {
		return addNewPBtn;
	}
	public WebElement getNewProjBtn() {
		return newProjBtn;
	}
	public WebElement getProjNameTbx() {
		return projNameTbx;
	}
	public WebElement getCustPrDrdown() {
		return custPrDrdown;
	}
	public WebElement getOurCompPrOpt() {
		return ourCompPrOpt;
	}
	public WebElement getProjDescTbx() {
		return projDescTbx;
	}
	public WebElement getCreateProjBtn() {
		return createProjBtn;
	}
	//delete project getter method
	public WebElement getPsearchTbx() {
		return psearchTbx;
	}
	public WebElement getSettingPEdtBtn() {
		return settingPEdtBtn;
	}
	public WebElement getActionPBtn() {
		return actionPBtn;
	}
	public WebElement getDeletePBtn() {
		return deletePBtn;
	}
	public WebElement getPerDelPBtn() {
		return perDelPBtn;
	}
	
	//add user getter method
	public WebElement getAddUserBtn() {
		return addUserBtn;
	}
	public WebElement getFrNameTbx() {
		return frNameTbx;
	}
	public WebElement getLsNameTbx() {
		return lsNameTbx;
	}
	public WebElement getEmailTbx() {
		return emailTbx;
	}
	public WebElement getLgUnTbx() {
		return lgUnTbx;
	}
	public WebElement getLgPwdTbx() {
		return lgPwdTbx;
	}
	public WebElement getLgcnfpwdTbx() {
		return lgcnfpwdTbx;
	}
	public WebElement getcUserBtn() {
		return cUserBtn;
	}
	//delete user getter method
	public WebElement getuSearchTbx() {
		return uSearchTbx;
	}
	public WebElement getUnCntnr() {
		return unCntnr;
	}
	public WebElement getuDelBtn() {
		return uDelBtn;
	}
	
}
