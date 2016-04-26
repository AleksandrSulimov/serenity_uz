package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class CommonPage extends PageObject {
	
	public CommonPage(WebDriver driver) {
        super(driver);
    }
	
	protected static final Logger logger = LoggerFactory.getLogger(CommonPage.class);
	
    public void maximizeBrowserWindow() {
        getDriver().manage().window().maximize();
    }

    public void clickOnButtonBackOnBrowser() {
        getDriver().navigate().back();
    }
    
	@FindBy(xpath=".//div[@id='maskoverlay']")
	protected WebElementFacade maskoverlay;
	
	 public Boolean isOverlayVisible(){
		 WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		 
		 try {
			 wait.until(ExpectedConditions.visibilityOf(maskoverlay));
			 //maskoverlay.waitUntilVisible();
			 return true;
		} catch (Exception e) {
			return false;
		}
		 
	 }

	 public Boolean isOverlayUnVisible(){
		 maskoverlay.waitUntilNotVisible();
		 return true;
	 }

	 /**
	  * Ожидание в мс
	  * @param timeInMilliseconds
	  */
	public void waitSeconds(int timeInMilliseconds) {
		waitABit(timeInMilliseconds);
	}

}