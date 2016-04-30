package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно Согласовать Позиции плана-графика закупок 
 * @author s.serov 30.04.2016
 *
 */
public class ApprovalPositionsPlanGraphicsPurchesDialog extends BasePage {
	
			
	  public ApprovalPositionsPlanGraphicsPurchesDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать закупку')]]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[div[contains(.,'Согласовать закупку')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать закупку')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Согласовать
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать закупку')]]/descendant::button[contains(.,'Согласовать')]")
	  private WebElementFacade approvalButton;
	  
	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать закупку')]]/descendant::button[contains(.,'ОК')]")
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