package uz.pages.tabs;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;

/**
 * Вкладки на странице 'План закупок товаров, работ, услуг'	
 * @author e.kuzmina 29.04.2016
 *
 */
public class PurchasePlanOfProductJobServiceTab extends BasePage {
	
	
	  public PurchasePlanOfProductJobServiceTab(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//span[text()='Общие сведения']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Общие сведения']";
	  
	  @FindBy(xpath=".//span[text()='Общие сведения']")
	  private WebElementFacade field;
	  
	  //Кнопка Проверить документ
	  @FindBy(xpath=".//button[@title='Проверить документ']")
	  private WebElementFacade checkDocumentButton;
	  
	  //Вкладка Общие сведения
	  @FindBy(xpath=".//span[text()='Общие сведения']")
	  private WebElementFacade basicInformation;
	  //Вкладка Позиции плана закупок
	  @FindBy(xpath=".//span[text()='Позиции плана закупок']")
	  private WebElementFacade positionPurchasePlan;
	  //Вкладка Особые закупки
	  @FindBy(xpath=".//span[text()='Особые закупки']")
	  private WebElementFacade specialPurchases;
	  //Вкладка Итоги по КБК
	  @FindBy(xpath=".//span[text()='Итоги по КБК']")
	  private WebElementFacade resultsOfKBK;
	  //Вкладка Лист согласования
	  @FindBy(xpath=".//span[text()='Лист согласования']")
	  private WebElementFacade coordinationSheet;
		
	  /**
	   * Нажать кнопку Проверить документ
	   */
	  public void clickOnButttonCheckDocument(){
		  waitForLoadJS();
		  checkDocumentButton.waitUntilClickable().click();
	  }
	  
	  /**
	   * Выбрать вкладку Общие сведения
	   */
	  public void selectTabBasicInformation(){
		  waitForLoadJS();
		  basicInformation.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Позиции плана закупок
	   */
	  public void selectTabPositionPurchasePlan(){
		  waitForLoadJS();
		  positionPurchasePlan.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Особые закупки
	   */
	  public void selectTabSpecialPurchases(){
		  waitForLoadJS();
		  specialPurchases.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Итоги по КБК
	   */
	  public void selectTabResultsOfKBK(){
		  waitForLoadJS();
		  resultsOfKBK.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Лист согласования
	   */
	  public void selectTabCoordinationSheet(){
		  waitForLoadJS();
		  coordinationSheet.waitUntilClickable().click();
	  }
	  
}