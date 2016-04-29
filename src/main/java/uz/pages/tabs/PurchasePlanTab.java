package uz.pages.tabs;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;
import uz.pages.BasePage;

/**
 * Вкладки внизу страницы 'План закупок'	
 * @author e.kuzmina 29.04.2016
 *
 */
public class PurchasePlanTab extends BasePage {
	
	
	  public PurchasePlanTab(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//span[text()=' Атрибуты']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()=' Атрибуты']";
	  
	  @FindBy(xpath=".//span[text()=' Атрибуты']")
	  private WebElementFacade field;
	  
	  //Вкладка Атрибуты
	  @FindBy(xpath=".//span[text()=' Атрибуты']")
	  private WebElementFacade attributes;
	  
	  /**
	   * Выбрать вкладку Атрибуты
	   */
	  public void selectTabAttributes(){
		  waitForLoadJS();
		  attributes.waitUntilClickable().click();
	  }
	  
}