package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * План закупок на согласовании
 * @author s.serov 28.04.2016
 *
 */
public class PlanPurchaseOnApprovalPage extends PlanPurchasePage {
	
			
	  public PlanPurchaseOnApprovalPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//th[@title='Номер документа']") 
	  private WebElementFacade applet; 
	  private String appletXpath = ".//th[@title='Номер документа']";
		    
	  @FindBy(xpath=".//th[@title='Номер документа']")
	  private WebElementFacade field;
	  
	  //Закрыть
	  @FindBy(xpath=".//div[button[@title[contains(.,'План закупок на согласовании')]]]/a[@title='Закрыть']")
	  protected WebElementFacade closeLink;
	  
	  //Кнопка Согласовать закупку
	  @FindBy(xpath=".//button[@title='Согласовать']")
	  private WebElementFacade approvalButton;
	  
	  
	  /**
	   * Закрыть План закупок на согласовании
	   */
		public void clickOnLinkClose(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closeLink.waitUntilClickable().click();
			
		}
	
	  /**
	   * Клик по кнопке Согласовать закупку
	   */
	  public void clickOnButtonApproval() {
		  waitingForFieldVisible(approvalButton);
		  approvalButton.waitUntilClickable().click();
	  }
	  
	  
}