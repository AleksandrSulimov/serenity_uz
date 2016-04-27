package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

public class Header extends BasePage {
	
			
	  public Header(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[div/a/img[@title='Электронный бюджет']]/descendant::button[contains(.,'Выйти')]")
	  private WebElementFacade applet;
	  @FindBy(xpath=".//div[div/a/img[@title='Электронный бюджет']]/descendant::button[contains(.,'Выйти')]")
	  private WebElementFacade field;
	  

	  @FindBy(xpath=".//div[div/a/img[@title='Электронный бюджет']]/descendant::button[contains(.,'Выйти')]")
	  private WebElementFacade exitButton;
		  
	  /**
	   * Клик по кнопке Выйти
	   */
	  public void clickOnButtonExit(){
		  waitingForFieldVisible(exitButton);
		  exitButton.waitUntilClickable().click();
	  }

}