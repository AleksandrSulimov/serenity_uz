package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * План закупок на с на утверждении
 * @author s.serov 28.04.2016
 *
 */
public class PlanPurchaseOnStatementPage extends PlanPurchasePage {
	
			
	  public PlanPurchaseOnStatementPage(WebDriver driver) {
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
	  @FindBy(xpath=".//div[button[@title[contains(.,'План закупок на утверждении')]]]/a[@title='Закрыть']")
	  protected WebElementFacade closeLink;
	  
	  //Кнопка Утвердить
	  @FindBy(xpath=".//button[@title='Утвердить']")
	  private WebElementFacade statementButton;
	  
	  
	  /**
	   * Закрыть План закупок на согласовании
	   */
		public void clickOnLinkClose(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closeLink.waitUntilClickable().click();
			
		}
	
	  /**
	   * Клик по кнопке Утвердить
	   */
	  public void clickOnButtonStatement() {
		  waitingForFieldVisible(statementButton);
		  statementButton.waitUntilClickable().click();
	  }
	  
	  
}