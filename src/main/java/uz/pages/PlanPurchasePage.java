package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * План покупок
 * @author s.serov 28.04.2016
 *
 */
public class PlanPurchasePage extends PositionsPurchasePlan200Page {
	
			
	  public PlanPurchasePage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//th[@title='Номер плана закупок']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//th[@title='Номер плана закупок']";
	  
	  @FindBy(xpath=".//th[@title='Номер позиции плана закупок']")
	  private WebElementFacade field;
	  
	  //Закрыть ППЗ
	  @FindBy(xpath=".//div[button[@title[contains(.,'Позиции плана закупок на согласовании')]]]/a[@title='Закрыть']")
	  private WebElementFacade closePPZOnApprovalTabLink;
	  
	  //Кнопка Согласовать закупку
	  @FindBy(xpath=".//button[@title='Согласовать']")
	  private WebElementFacade approvalButton;
	  
	  
	  /**
	   * Закрыть Позиции плана закупок на согласовании
	   */
		public void clickOnLinkClosePPZOnApproval(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closePPZOnApprovalTabLink.waitUntilClickable().click();
			
		}
	
	  /**
	   * Клик по кнопке Согласовать закупку
	   */
	  public void clickOnButtonApproval() {
		  waitingForFieldVisible(approvalButton);
		  approvalButton.waitUntilClickable().click();
	  }
	  
	  
}