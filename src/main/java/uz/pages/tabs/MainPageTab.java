package uz.pages.tabs;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;

import uz.pages.BasePage;

/**
 * Вкладки на основной странице
 * @author s.serov 25.04.2016
 *
 */
public class MainPageTab extends BasePage {
	

	  public MainPageTab(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	  }
	  
	  @FindBy(xpath=".//a[text()='Формуляры']")
	  private WebElementFacade applet;
	  @FindBy(xpath=".//a[text()='Формуляры']")
	  private WebElementFacade field;

	  //Формуляры
	  @FindBy(xpath=".//a[text()='Формуляры']")
	  private WebElementFacade applicationFormsTab;
	 
	  /**
	   * Кликаем по вкладке Формуляры
	   */
	  public void clickOnTabApplicationForms(){
		  waitForLoadJS();
		  applicationFormsTab.waitUntilClickable().click();
	  }
	  
}