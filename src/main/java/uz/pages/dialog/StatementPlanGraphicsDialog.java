package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно Утвердить план-график
 * @author s.serov 02.05.2016
 *
 */
public class StatementPlanGraphicsDialog extends BasePage {
	
			
	  public StatementPlanGraphicsDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план-график')]]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[div[contains(.,'Утвердить план-график')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план-график')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Утвердить
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план-график')]]/descendant::button[contains(.,'Утвердить')]")
	  private WebElementFacade statementlButton;
	  

	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Утвердить план-график')]]/descendant::button[contains(.,'ОК')]")
	  private WebElementFacade okButton;
	
	  /**
	   * Клик по кнопке Согласовать
	   */
	  public void clickOnButtonStatement(){
		  waitingForFieldVisible(statementlButton);
		  statementlButton.waitUntilClickable().click();
		  waitingForFieldUnVisible(statementlButton);
	  }
	  /**
	   * Клик по кнопке Согласовать
	   */
	  public void clickOnButtonStatementBeforeJinnClient(){
		  waitingForFieldVisible(statementlButton);
		  statementlButton.waitUntilClickable().click();
		  //waitingForFieldUnVisible(statementlButton);
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