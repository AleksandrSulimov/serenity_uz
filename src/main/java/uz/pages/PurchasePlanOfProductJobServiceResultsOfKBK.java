package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Итоги по КБК
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
public class PurchasePlanOfProductJobServiceResultsOfKBK extends BasePage {
	
			
	  public PurchasePlanOfProductJobServiceResultsOfKBK(WebDriver driver) {
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
	  @FindBy(xpath=".//span[text()='План закупок товаров, работ, услуг']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;
	  
	  /**
	   * Нажать кнопку Закрыть
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
}