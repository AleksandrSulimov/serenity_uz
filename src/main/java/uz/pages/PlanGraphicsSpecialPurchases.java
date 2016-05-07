package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Особые закупки
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
public class PlanGraphicsSpecialPurchases extends BasePage {
	
			
	  public PlanGraphicsSpecialPurchases(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Лекарственные препараты (п.7 ч.2 ст.83 44-ФЗ)']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Лекарственные препараты (п.7 ч.2 ст.83 44-ФЗ)']";
	  
	  @FindBy(xpath=".//span[text()='Лекарственные препараты (п.7 ч.2 ст.83 44-ФЗ)']")
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