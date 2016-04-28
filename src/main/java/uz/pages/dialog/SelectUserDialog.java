package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import uz.pages.BasePage;


/**
 * Диалоговое окно Выбрать пользователя
 * @author e.kuzmina 28.04.2016
 *
 */
public class SelectUserDialog extends BasePage {
	
			
	  public SelectUserDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Выбор пользователя']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[text()='Выбор пользователя']";
	  
	  @FindBy(xpath=".//div[text()='Выбор пользователя']")
	  private WebElementFacade field;
	  
	  //Поле ФИО пользователя (с переданным значением)
	  private String userFioField = ".//div[text()='ФИО пользователя']/ancestor::table/ancestor::div[1]/following-sibling::div[2]/descendant::span[2][contains(text(), '%s')]";
	  
	  //Кнопка ОК
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;
	
	  /**
	   * Клик по полю ФИО пользователя с переданным значением
	   */
	  public void clickOnFieldUserFIO(String text){  
		  	waitForLoadJS();
			String xPathLocator = String.format(userFioField, text); 
			waitFor(ExpectedConditions.elementToBeClickable(By.xpath(xPathLocator)));
			getDriver().findElement(By.xpath(xPathLocator)).click();

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