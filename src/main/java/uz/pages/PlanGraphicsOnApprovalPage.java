package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * План-график на согласовании
 * @author s.serov 01.05.2016
 *
 */
public class PlanGraphicsOnApprovalPage extends PlanGraphicsPage {
	
			
	  public PlanGraphicsOnApprovalPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//th[contains(.,'Номер плана-графика')]")
	  private WebElementFacade applet; 
	  private String appletXpath = ".//th[contains(.,'Номер плана-графика')]";
		    
	  @FindBy(xpath=".//th[contains(.,'Номер плана-графика')]")
	  private WebElementFacade field;
	  
	  //Закрыть
	  @FindBy(xpath=".//div[button[@title[contains(.,'Планы-графики на согласовании')]]]/a[@title='Закрыть']")
	  protected WebElementFacade closeLink;
	  
	  //Кнопка Согласовать закупку
	  @FindBy(xpath=".//button[@title='Согласовать']")
	  private WebElementFacade approvalButton;
	  
	  
	  /**
	   * Закрыть план-график на согласовании
	   */
		public void clickOnLinkClose(){
			waitForLoadJS();
			getDriver().switchTo().defaultContent();
			closeLink.waitUntilClickable().click();
			
		}
	
	  /**
	   * Клик по кнопке Согласовать
	   */
	  public void clickOnButtonApproval() {
		  waitingForFieldVisible(approvalButton);
		  approvalButton.waitUntilClickable().click();
	  }
	  
	  
}