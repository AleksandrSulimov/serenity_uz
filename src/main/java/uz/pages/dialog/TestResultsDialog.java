package uz.pages.dialog;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import uz.pages.BasePage;


/**
 * Диалоговое окно Результаты проверки
 * @author e.kuzmina 28.04.2016
 *
 */
public class TestResultsDialog extends BasePage {
	
			
	  public TestResultsDialog(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Результаты проверки']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[text()='Результаты проверки']";
	  
	  @FindBy(xpath=".//div[text()='Результаты проверки']")
	  private WebElementFacade field;
	  
	  //Кнопка Сохранить
	  @FindBy(xpath=".//button[text()='Сохранить']")
	  private WebElementFacade saveButton;
	  private String saveButtonXpath = ".//button[text()='Сохранить']";
	
	  /**
	   * Клик по кнопке Сохранить
	   */
	  public void clickOnButtonSave() {
		  waitingForFieldVisible(saveButton);
		  saveButton.waitUntilClickable().click();
		  waitingForFieldUnVisible(saveButton);
	  }

	  /**
	   * Проверить существование кнопки Сохранить
	   */
	  public boolean checkSaveButtonEists() {
		  if(getDriver().findElements(By.xpath(saveButtonXpath)).size()>0){
			  return true;
		  }
		  return false;
	  }
	  
}