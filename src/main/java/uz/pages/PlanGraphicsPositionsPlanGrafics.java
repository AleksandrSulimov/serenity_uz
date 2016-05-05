package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


/**
 * Вкладка Позиции плана-графика
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
public class PlanGraphicsPositionsPlanGrafics extends BasePage {
	
			
	  public PlanGraphicsPositionsPlanGrafics(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//button[@title='Включить позиции в план-график']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//button[@title='Включить позиции в план-график']";
	  
	  @FindBy(xpath=".//button[@title='Включить позиции в план-график']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='План-график']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;

	  //Кнопка Включить позиции в план-график
	  @FindBy(xpath=".//button[@title='Включить позиции в план-график']")
	  private WebElementFacade includePositionsInPlanGraficButton;

		
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
		
	  /**
	   * Нажать кнопку Включить позиции в план-график
	   */
	  public void clickOnButtonIncludePositionsInPlanGrafic(){
		  waitForLoadJS();
		  includePositionsInPlanGraficButton.waitUntilClickable().click();
	  }
}