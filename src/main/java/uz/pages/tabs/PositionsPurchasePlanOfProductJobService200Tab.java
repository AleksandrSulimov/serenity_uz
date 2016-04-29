package uz.pages.tabs;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import uz.pages.BasePage;

/**
 * Вкладки на странице 'Позиция плана закупок товаров, работ, услуг 200'	
 * @author e.kuzmina 26.04.2016
 *
 */
public class PositionsPurchasePlanOfProductJobService200Tab extends BasePage {
	
	
	  public PositionsPurchasePlanOfProductJobService200Tab(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//span[text()='Основные сведения']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Основные сведения']";
	  
	  @FindBy(xpath=".//span[text()='Основные сведения']")
	  private WebElementFacade field;
	  
	  //Кнопка Проверить документ
	  @FindBy(xpath=".//button[@title='Проверить документ']")
	  private WebElementFacade checkDocumentButton;
	  
	  //Вкладка Основные сведения
	  @FindBy(xpath=".//span[text()='Основные сведения']")
	  private WebElementFacade basicInformation;
	  //Вкладка Объем финансового обеспечения
	  @FindBy(xpath=".//span[text()='Объем финансового обеспечения']")
	  private WebElementFacade amountOfFinancialSupport;
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
	   * Выбрать вкладку Основные сведения
	   */
	  public void selectTabBasicInformation(){
		  waitForLoadJS();
		  basicInformation.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Объем финансового обеспечения
	   */
	  public void selectTabAmountOfFinancialSupport(){
		  waitForLoadJS();
		  amountOfFinancialSupport.waitUntilClickable().click();
	  }
	  /**
	   * Выбрать вкладку Лист согласования
	   */
	  public void selectTabCoordinationSheet(){
		  waitForLoadJS();
		  coordinationSheet.waitUntilClickable().click();
	  }
	  
}