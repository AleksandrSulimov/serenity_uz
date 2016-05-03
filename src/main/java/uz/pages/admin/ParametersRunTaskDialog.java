package uz.pages.admin;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;


/**
 * Диалоговое окно Параметры запуска задания...
 * @author s.serov 02.05.2016
 *
 */
public class ParametersRunTaskDialog extends BasePage {
	
			
	  public ParametersRunTaskDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[div[contains(.,'Параметры запуска задания...')]]")
	  private WebElementFacade applet;
	  
	  private String appletXpath = ".//div[div[contains(.,'Параметры запуска задания...')]]";
	  
	  @FindBy(xpath=".//div[div[contains(.,'Параметры запуска задания...')]]")
	  private WebElementFacade field;
	  
	  //Кнопка Выполнить
	  @FindBy(xpath=".//div[div[contains(.,'Параметры запуска задания...')]]/descendant::button[contains(.,'Выполнить')]")
	  private WebElementFacade runButton;
	  
	  //Кнопка ОК
	  @FindBy(xpath=".//div[div[contains(.,'Параметры запуска задания...')]]/descendant::button[contains(.,'ОК')]")
	  private WebElementFacade okButton;
	
	  /**
	   * Клик по кнопке Выполнить
	   */
	  public void clickOnButtonRun(){
		  waitingForFieldVisible(runButton);
		  runButton.waitUntilClickable().click();
		  waitingForFieldUnVisible(runButton);
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