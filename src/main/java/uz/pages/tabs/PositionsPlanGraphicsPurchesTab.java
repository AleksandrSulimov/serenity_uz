package uz.pages.tabs;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;

/**
 * Вкладки на странице 'Позиция плана-графика закупок'	
 * @author e.kuzmina 03.05.2016
 *
 */
public class PositionsPlanGraphicsPurchesTab extends BasePage {
	
	
	  public PositionsPlanGraphicsPurchesTab(WebDriver driver) {
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
	  //Вкладка Спецификация ТРУ
	  @FindBy(xpath=".//span[text()='Спецификация ТРУ']")
	  private WebElementFacade specificationTRU;
	  //Вкладка Условия закупки
	  @FindBy(xpath=".//span[text()='Условия закупки']")
	  private WebElementFacade termsOfPurchase;
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
	   * Выбрать вкладку Спецификация ТРУ
	   */
	  public void selectTabSpecificationTRU(){
		  waitForLoadJS();
		  specificationTRU.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Условия закупки
	   */
	  public void selectTabTermsOfPurchase(){
		  waitForLoadJS();
		  termsOfPurchase.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Лист согласования
	   */
	  public void selectTabCoordinationSheet(){
		  waitForLoadJS();
		  coordinationSheet.waitUntilClickable().click();
	  }
	  
}