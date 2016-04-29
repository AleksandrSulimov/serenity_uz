package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка атрибуты
 * @author ekuzmina 29.04.2016
 *
 */
public class AttributesPage extends BasePage {
	
			
	  public AttributesPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//span[@title='Глобальный идентификатор документа']")
	  protected WebElementFacade applet;
	  protected String appletXpath = ".//span[@title='Глобальный идентификатор документа']";
	  
	  @FindBy(xpath=".//span[@title='Глобальный идентификатор документа']")
	  protected WebElementFacade field;
	  
	  //Идентификатор 
	  @FindBy(xpath=".//td[span[@title='Глобальный идентификатор документа']]/following-sibling::td")
	  protected WebElementFacade idField;
	  /**
	   * Возвращаем текст поля Идентификатор
	   * @return String
	   */
	  public String getTextId(){
		  waitForLoadJS();
		  return idField.waitUntilClickable().getText();
	  }
}