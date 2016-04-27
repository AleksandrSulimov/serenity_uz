package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно Согласовать позицию плана закупок 200
 * @author s.serov 27.04.2016
 *
 */
public class ApprovalPositionPurchase200Dialog extends BasePage {
	
			
	  public ApprovalPositionPurchase200Dialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать позицию плана закупок 200')]]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[div[contains(.,'Согласовать позицию плана закупок 200')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать позицию плана закупок 200')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Согласовать
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать позицию плана закупок 200')]]/descendant::button[contains(.,'Согласовать')]")
	  private WebElementFacade approvalButton;
	  
	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать позицию плана закупок 200')]]/descendant::button[contains(.,'ОК')]")
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