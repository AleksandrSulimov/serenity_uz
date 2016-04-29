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
	  
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить План Закупок')]]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[div[contains(.,'Утвердить План Закупок')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить План Закупок')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Утвердить
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить План Закупок')]]/descendant::button[contains(.,'Утвердить')]")
	  private WebElementFacade statementlButton;
	  

	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить План Закупок')]]/descendant::button[contains(.,'ОК')]")
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
	   * Клик по кнопке Согласовать
	   */
	  public void clickOnButtonStatementBeforeJinnClient(){
		  waitingForFieldVisible(statementlButton);
		  statementlButton.waitUntilClickable().click();
		  //waitingForFieldUnVisible(statementlButton);
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