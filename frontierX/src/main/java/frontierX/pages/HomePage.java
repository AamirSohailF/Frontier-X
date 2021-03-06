package frontierX.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import frontierX.scripts.TrainingLoad;

public class HomePage extends BasePage {

	//	Creating WebElements
	@FindBy(xpath = "//input[@placeholder='Search by Title']")
	private WebElement searchTextField ;
	
	@FindBy(xpath = "//button[@class='search-button']")
	private WebElement searchButton ;
	
	@FindBy(xpath = "//i[@class='fa fa-power-off']")
	private WebElement logoutButton ;
	
	@FindBy(xpath = "//i[@class='fa fa-refresh']")
	private WebElement refreshButton ;
	
	@FindBy(xpath = "//h5[.='0']//../h5")
	private WebElement trainingLoad ;
	
	@FindBy(xpath = "(//div[.='0%']/../div)[2]")
	private WebElement trainingLoadPercent ;
	
	@FindBy(xpath = "//i[@class='fa fa-chevron-down']")
	private WebElement trainingLoadDownArrow ;
	
	@FindBy(xpath = "//i[@class='fa fa-chevron-up']")
	private WebElement trainingLoadUpArrow ;
	
	@FindBy(xpath = "//img[@src='/images/Dropdown_change.png?1954b4fed9b0b4f0befe41fc6c9f36fb']")
	private WebElement activityButton;
	
	@FindBy(xpath = "(//a[@class='dropdown-item w-time download-wtext'])[1]")
	private WebElement shareActivityLink ;
	
	@FindBy(partialLinkText = "Download Summary Data (CSV)")
	private WebElement downloadCSVFile ;
	
	@FindBy(partialLinkText = "Download ECG Data (ZIP)")
	private WebElement downloadZIPFile ;
	
	@FindBy(partialLinkText = "Genrate ECG PDF")
	private WebElement ecgPDF ;
	
	@FindBy(partialLinkText = "Download Fit File")
	private WebElement downloadFITFile ;
	
	@FindBy(xpath = "//span[.=' Live ECGs ']")
	private WebElement liveECG ;
	
	@FindBy(xpath = "//span[.='Live User Dashboard']")
	private WebElement liveUserDashboard ;
	
	@FindBy(partialLinkText = "Edit Activity")
	private WebElement editActivity ;
	
	@FindBy(xpath = "(//button[.='Cancel'])[1]")
	private WebElement cancelButtonEdit ;
	
	@FindBy(xpath = "//button[.='Save']")
	private WebElement saveButtonEdit ;
	
	@FindBy(partialLinkText = "Delete Activity")
	private WebElement deleteActivity ;
	
	@FindBy(xpath = "//button[text()='Keep']")
	private WebElement keepButton;
	
	@FindBy(xpath = "(//button[@class='btn cancel-button'])[3]")
	private WebElement cancelShareActivity;
	
	
	
	//	Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
	
	//	Action Methods
	public void clickOnActivityButton()	{
		activityButton.click();
	}
	
	public void enterWorkout(String workout) {
		searchTextField.sendKeys(workout);
	}
	
	public void clickOnSearchWorkout() {
		searchButton.click();
	}
	
	public String trainingLoad() {
		return trainingLoad.getText();
	}
	
	public String trainingLoadPercent(){
		return trainingLoadPercent.getText();
	}
	
	public void clickOnTrainingLoadDownArrow() {
		trainingLoadDownArrow.click();
	}
	
	public void clickOnTrainingLoadUpArrow() {
		trainingLoadUpArrow.click();
	}
	
	public void clickOnDownloadCSV() {
		downloadCSVFile.click();
	}
	
	public void clickOnDownloadZIP() {
		downloadZIPFile.click();
	}
	
	public void shareActivityLink() {
		shareActivityLink.click();
	}
	
	public void cancelShareActivityLink() {
		cancelShareActivity.click();
	}
	
	public void generateECGPDF() {
		ecgPDF.click();
	}
	
	public void clickOnDownloadFIT() {
		downloadFITFile.click();
	}
	
	public void clickOnLiveECG() {
		liveECG.click();
	}
	
	public void clickOnLiveUserDashboard() {
		liveUserDashboard.click();
	}
	
	public void editActivity() {
		editActivity.click();
	}
	
	public void deleteActivity() {
		deleteActivity.click();
	}
	
	public void keepButton() {
		keepButton.click();
	}
	
	public void cancelButtonEdit() {
		cancelButtonEdit.click();
	}
	
	public void saveButtonEdit() {
		saveButtonEdit.click();
	}
	
	public void logout() {
		logoutButton.click();
	}
	
	public void refresh() {
		refreshButton.click();
	}
	
}
