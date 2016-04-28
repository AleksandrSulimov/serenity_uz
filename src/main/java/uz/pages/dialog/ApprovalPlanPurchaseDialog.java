package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно Согласовать план закупок
 * @author s.serov 28.04.2016
 *
 */
public class ApprovalPlanPurchaseDialog extends BasePage {
	
			
	  public ApprovalPlanPurchaseDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать План Закупок')]]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[div[contains(.,'Согласовать План Закупок')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать План Закупок')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Согласовать
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать План Закупок')]]/descendant::button[contains(.,'Согласовать')]")
	  private WebElementFacade approvalButton;
	  
	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать План Закупок')]]/descendant::button[contains(.,'ОК')]")
	  private WebElementFacade okButton;
	
	  /**
	   * Клик по кнопке Согласовать
	   */
	  public void clickOnButtonApproval(){
		  waitingForFieldVisible(approvalButton);
		  approvalButton.waitUntilClickable().click();
		  waitingForFieldUnVisible(approvalButton);
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