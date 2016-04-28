package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно Утвердить план закупок
 * @author s.serov 28.04.2016
 *
 */
public class StatementPlanPurchaseDialog extends BasePage {
	
			
	  public StatementPlanPurchaseDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план закупок')]]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[div[contains(.,'Утвердить план закупок')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план закупок')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Согласовать
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план закупок')]]/descendant::button[contains(.,'Утвердить')]")
	  private WebElementFacade statementlButton;
	  

	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план закупок')]]/descendant::button[contains(.,'ОК')]")
	  private WebElementFacade okButton;
	
	  /**
	   * Клик по кнопке Согласовать
	   */
	  public void clickOnButtonStatement(){
		  waitingForFieldVisible(statementlButton);
		  statementlButton.waitUntilClickable().click();
		  waitingForFieldUnVisible(statementlButton);
	  }
	  

	  /**
	   * Клик по кнопке ОК
	   */
	  public void clickOnButtonOk() {
		  waitingForFieldVisible(okButton);
		  okButton.waitUntilClickable().click();
		  waitingForFieldUnVisible(okButton);
	  }
	  
}