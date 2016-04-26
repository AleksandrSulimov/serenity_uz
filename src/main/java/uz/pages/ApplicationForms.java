package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Формуляры
 * @author s.serov 25.04.2016
 *
 */
public class ApplicationForms extends BasePage {
	
			
	  public ApplicationForms(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//span[span[contains(.,'Управление закупками')]]/a")
	  private WebElementFacade applet;
	  @FindBy(xpath=".//span[span[contains(.,'Управление закупками')]]/a")
	  private WebElementFacade field;
	  

	  //Управление закупками
	  @FindBy(xpath=".//div[span/span[contains(.,'Управление закупками')]]/span[1]/a")
	  private WebElementFacade procurementManagementLink;
	  //План закупок
	  @FindBy(xpath=".//div[span/span[contains(.,'План закупок')]]/span[1]/a")
	  private WebElementFacade planProcurementLink;
	  
	  //Позиции плана закупок 200
	  @FindBy(xpath=".//a[span[text()='Позиция плана закупок - 200']]")
	  private WebElementFacade positionPlanProcurement200Link;
	  
	  /**
	   * Клик по линку Управление закупками
	   */
	  public void clickOnLinkProcurementManagement(){
		  waitForLoadJS();
		  procurementManagementLink.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли линк Управление закупками
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkProcurementManagement(){
		  waitForLoadJS();
		  String title = procurementManagementLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	
	  
	  /**
	   * Клик по линку План закупок
	   */
	  public void clickOnLinkPlanProcurement(){
		  waitForLoadJS();
		  planProcurementLink.waitUntilClickable().click();
	  }
	  /**
	   * Проверяем нажат ли линк План закупок
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedLinkPlanProcurement(){
		  waitForLoadJS();
		  String title = planProcurementLink.waitUntilClickable().getAttribute("title");
		  if(title.contains("Свернуть")){
			  return true;
		  }
		  return false;
	  }
	  
	  /**
	   * Клик по линку Позиции плана закупок - 200
	   */
	  public void clickOnLinkPositionPlanProcurement200(){
		  waitForLoadJS();
		  positionPlanProcurement200Link.waitUntilClickable().click();
	  }
}