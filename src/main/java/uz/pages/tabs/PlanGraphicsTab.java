package uz.pages.tabs;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;

/**
 * Вкладки на странице 'План-график'	
 * @author e.kuzmina 05.05.2016
 *
 */
public class PlanGraphicsTab extends BasePage {
	
	
	  public PlanGraphicsTab(WebDriver driver) {
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
	  //Вкладка Позиции плана-графика
	  @FindBy(xpath=".//span[text()='Позиции плана-графика']")
	  private WebElementFacade positionsPlanGrafics;
	  //Вкладка Особые закупки
	  @FindBy(xpath=".//span[text()='Особые закупки']")
	  private WebElementFacade specialPurchases;
	  //Вкладка Итоговые показатели плана-графика
	  @FindBy(xpath=".//span[text()='Итоговые показатели плана-графика']")
	  private WebElementFacade totalIndicatorsPlanGrafics;
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
	   * Выбрать вкладку Позиции плана-графика
	   */
	  public void selectTabPositionsPlanGrafics(){
		  waitForLoadJS();
		  positionsPlanGrafics.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Особые закупки
	   */
	  public void selectTabSpecialPurchases(){
		  waitForLoadJS();
		  specialPurchases.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Итоговые показатели плана-графика
	   */
	  public void selectTabTotalIndicatorsPlanGrafics(){
		  waitForLoadJS();
		  totalIndicatorsPlanGrafics.waitUntilClickable().click();
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