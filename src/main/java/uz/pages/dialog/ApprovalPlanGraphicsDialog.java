package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно Согласовать план-график
 * @author s.serov 02.05.2016
 *
 */
public class ApprovalPlanGraphicsDialog extends BasePage {
	
			
	  public ApprovalPlanGraphicsDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать план-график')]]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[div[contains(.,'Согласовать план-график')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать план-график')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Согласовать
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать план-график')]]/descendant::button[contains(.,'Согласовать')]")
	  private WebElementFacade approvalButton;
	  
	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Согласовать план-график')]]/descendant::button[contains(.,'ОК')]")
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