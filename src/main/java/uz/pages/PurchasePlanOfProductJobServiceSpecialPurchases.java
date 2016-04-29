package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Позиции плана закупок
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
public class PurchasePlanOfProductJobServiceSpecialPurchases extends BasePage {
	
			
	  public PurchasePlanOfProductJobServiceSpecialPurchases(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath="(.//div[span='ИКЗ'])[1]")
	  private WebElementFacade applet;
	  private String appletXpath = ".//button[@title='Включить позиции плана закупок в план закупок' and not (contains(@style, 'display:none'))]";
	  
	  @FindBy(xpath="(.//div[span='ИКЗ'])[1]")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='План закупок товаров, работ, услуг']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
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