package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


/**
 * Вкладка Итоги по КБК
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
public class PlanGraphicsResultsOfKBK extends BasePage {
	
			
	  public PlanGraphicsResultsOfKBK(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Код бюджетной классификации']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Код бюджетной классификации']";
	  
	  @FindBy(xpath=".//span[text()='Код бюджетной классификации']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='План-график']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;

	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
}