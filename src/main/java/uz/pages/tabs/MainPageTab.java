package uz.pages.tabs;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	  
	  /**
	   * Проверяем нажата ли вкладка Формуляры
	   */
	  public void checkTabApplicationFormsIsActive(){
		  Boolean flag = false;
		  int i = 0;
		  while(flag == false){
			  try {
			       Thread.sleep(2000);
			     } catch( InterruptedException ex ) {
			     }

			  flag = applicationFormsTab.waitUntilClickable().getAttribute("class").contains("Selected");
			  if(flag == false){
				  getDriver().navigate().refresh();
				  i++;
				  try {
				       Thread.sleep(6000);
				     } catch( InterruptedException ex ) {
				     }
				  clickOnTabApplicationForms();
			  }
			  if(i > 3){
				  break;
			  }
		  }
		  Assert.assertTrue(flag);
		  
	  }
	  
}