package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Планы-графики на утверждении
 * @author s.serov 02.05.2016
 *
 */
public class PlanGraphicsOnStatementPage extends PlanGraphicsPage {
	
			
	  public PlanGraphicsOnStatementPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//th[contains(.,'Номер плана-графика')]") //th[@title='Номер документа']
	  private WebElementFacade applet; 
	  private String appletXpath = ".//th[contains(.,'Номер плана-графика')]";
		    
	  @FindBy(xpath=".//th[contains(.,'Номер плана-графика')]")
	  private WebElementFacade field;
	  
	  //Закрыть
	  @FindBy(xpath=".//div[button[@title[contains(.,'Планы-графики на утверждении')]]]/a[@title='Закрыть']")
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