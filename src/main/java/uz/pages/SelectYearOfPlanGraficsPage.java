package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Выбор года плана-графика закупок
 * @author e.kuzmina 05.05.2016
 *
 */
public class SelectYearOfPlanGraficsPage extends BasePage {
	
			
	  public SelectYearOfPlanGraficsPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Выбор года плана-графика закупок']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[text()='Выбор года плана-графика закупок']")
	  private WebElementFacade field;
	  
	  //Поле Заказчик
	  @FindBy(xpath=".//td[div/span='Заказчик']/following-sibling::td[1]/div")
	  private WebElementFacade customerField;
	  @FindBy(xpath=".//td[div/span='Заказчик']/following-sibling::td[1]/div/span")
	  private WebElementFacade customerInput;

	  //Поле Год плана-графика*
	  @FindBy(xpath=".//td[div/span='Год плана-графика*']/following-sibling::td[1]/div")
	  private WebElementFacade yearPlanGraficsField;
	  @FindBy(xpath=".//td[div/span='Год плана-графика*']/following-sibling::td[1]/div/span/input")
	  private WebElementFacade yearPlanGraficsInput;

	  //Кнопка Выбрать
	  @FindBy(xpath=".//button[text()='Выбрать']")
	  private WebElementFacade selectButton;
	  
	  /**
	   * Клик в поле Заказчик
	   */
	  public void clickOnFieldCustomer(){
		  waitForLoadJS();
		  customerField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Заказчик
	   * @return text
	   */
	  public String getValueCustomer(){
		  waitForLoadJS();
		  return customerField.waitUntilClickable().getText();
	  }
	  
	  /**
	   * Клик в поле Год плана-графика*
	   */
	  public void clickOnFieldYearPlanGrafics(){
		  waitForLoadJS();
		  yearPlanGraficsField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Год плана-графика*
	   * @return text
	   */
	  public String getValueYearPlanGrafics(){
		  waitForLoadJS();
		  return yearPlanGraficsInput.waitUntilClickable().getAttribute("value");
	  }
	  
	  /**
	   * Нажать кнопку Выбрать
	   */
	  public void clickOnButtonSelect(){
		  waitForLoadJS();
		  selectButton.waitUntilClickable().click();
		  selectButton.waitUntilNotVisible();
	  }
}