package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Позиции плана закупок на согласовании
 * @author s.serov 27.04.2016
 *
 */
public class PositionsPurchasePlanOnApprovalPage extends PositionsPurchasePlan200Page {
	
			
	  public PositionsPurchasePlanOnApprovalPage(WebDriver driver) {
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
	  @FindBy(xpath=".//div[button[@title[contains(.,'Позиции плана закупок на согласовании')]]]/a[@title='Закрыть']")
	  private WebElementFacade closePPZOnApprovalTabLink;
	  
	  //Кнопка Создать новый документ
	  @FindBy(xpath=".//button[@title='Создать новый документ']")
	  private WebElementFacade creteNewDocumentButton;

	
		public void clickOnLinkClosePPZOnApproval(){
			waitForLoadJS();
			closePPZOnApprovalTabLink.waitUntilClickable().click();
			getDriver().switchTo().defaultContent();
		}
	
		
	  /**
	   * Клик по кнопке Создать новый документ
	   */
	  public void clickOnButtonCreteNewDocument(){
		  waitForLoadJS();
		  creteNewDocumentButton.waitUntilClickable().click();
		  
	  }
	  
}