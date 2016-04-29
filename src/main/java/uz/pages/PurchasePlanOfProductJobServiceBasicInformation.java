package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Общие сведения 
 * на странице 'План закупок товаров, работ, услуг' 
 * @author e.kuzmina 29.04.2016
 *
 */
public class PurchasePlanOfProductJobServiceBasicInformation extends BasePage {
	
			
	  public PurchasePlanOfProductJobServiceBasicInformation(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Общая информация о плане закупок']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Общая информация о плане закупок']";
	  
	  @FindBy(xpath=".//span[text()='Общая информация о плане закупок']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='План закупок товаров, работ, услуг']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;
	  
	  //Кнопка Добавить вложение В блоке "Документы"
	  @FindBy(xpath=".//button[@title='Добавить вложение']")
	  private WebElementFacade addAttachmentButton;

	  //Поле Номер позиции плана закупок
	  @FindBy(xpath=".//tr[th/div/text()='Номер плана закупок']/ancestor::table[1]/ancestor::div[1]/following-sibling::div[2]/descendant::td[4]/div")
	  private WebElementFacade procurementPlanNumberField;
	  @FindBy(xpath=".//td[div/span='Номер плана закупок']/following-sibling::td[1]/div/input")
	  private WebElementFacade procurementPlanNumberInput;

	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Нажать кнопку "Добавить вложение" В блоке "Документы"
	   */
	  public void clickOnButtonAddAttachment(){
		  waitForLoadJS();
		  addAttachmentButton.waitUntilClickable().click();
	  }
}