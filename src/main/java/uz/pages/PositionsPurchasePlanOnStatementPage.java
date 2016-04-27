package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Позиции плана закупок на утверждении
 * @author s.serov 27.04.2016
 *
 */
public class PositionsPurchasePlanOnStatementPage extends PositionsPurchasePlan200Page {
	
			
	  public PositionsPurchasePlanOnStatementPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//th[@title='Номер позиции плана закупок']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//th[@title='Номер позиции плана закупок']";
	  
	  @FindBy(xpath=".//th[@title='Номер позиции плана закупок']")
	  private WebElementFacade field;
	  
	  //Закрыть ППЗ
	  @FindBy(xpath=".//div[button[@title[contains(.,'Позиции плана закупок на утверждении')]]]/a[@title='Закрыть']")
	  private WebElementFacade closePPZOnStatementTabLink;
	  
	  //Кнопка Утвердить
	  @FindBy(xpath=".//button[@title='Утвердить']")
	  private WebElementFacade statementButton;
	  
	  
	  /**
	   * Закрыть Позиции плана закупок на согласовании
	   */
		public void clickOnLinkClosePPZOnStatement(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closePPZOnStatementTabLink.waitUntilClickable().click();
			
		}
	
	  /**
	   * Клик по кнопке Утвердить
	   */
	  public void clickOnButtonStatement() {
		  waitingForFieldVisible(statementButton);
		  statementButton.waitUntilClickable().click();
	  }
	  
	  
}