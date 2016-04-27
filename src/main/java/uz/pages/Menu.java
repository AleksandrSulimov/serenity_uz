package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Меню слева страницы
 * @author s.serov 25.04.2016
 *
 */
public class Menu extends BasePage {
	
			
	  public Menu(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[div/a/span[text()='Управление закупками']]")
	  private WebElementFacade applet;
	  @FindBy(xpath=".//div/a/span[text()='Управление закупками']")
	  private WebElementFacade field;
	  

	  //Управление закупками
	  @FindBy(xpath=".//a[span[text()='Управление закупками']]")
	  private WebElementFacade procurementManagementLink;
	  @FindBy(xpath=".//a[span[text()='Управление закупками']]/img")
	  private WebElementFacade isPushedProcurementManagementImg;
	  
	  //Все
	  @FindBy(xpath=".//a[span[text()='Все']]/span")
	  private WebElementFacade allLink;
	  @FindBy(xpath=".//a[span[text()='Все']]/img")
	  private WebElementFacade isPushedAllImg;
	  
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
	  public Boolean isPushedProcurementManagement(){
		  waitForLoadJS();
		  String src = isPushedProcurementManagementImg.waitUntilClickable().getAttribute("src");
		  if(src.contains("manage_purchase_on.png")){
			  return true;
		  }
		  return false;
	  }
	

	  /**
	   * Клик по линку Все
	   */
	  public void clickOnLinkAll(){
		  waitForLoadJS();
		  allLink.waitUntilClickable().click();

	  }
	  /**
	   * Проверяем нажат ли линк Все
	   * @return Boolean (true - если линк нажат)
	   */
	  public Boolean isPushedAll(){
		  waitForLoadJS();
		  String src = isPushedAllImg.waitUntilClickable().getAttribute("src");
		  if(src.contains("all_on.png")){
			  return true;
		  }
		  return false;
	  }
	  
}