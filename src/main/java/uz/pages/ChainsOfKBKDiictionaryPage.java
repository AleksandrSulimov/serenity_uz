package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Справочник Цепочки КБК 
 * @author e.kuzmina 27.04.2016
 *
 */
public class ChainsOfKBKDiictionaryPage extends BasePage {
	
			
	  public ChainsOfKBKDiictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Цепочка КБК']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath="..//div[text()='Цепочка КБК']")
	  private WebElementFacade field;
	  
	  //Поле Цепочка КБК 
	  @FindBy(xpath=".//tr[th/div='Цепочка КБК']/following-sibling::tr/th[3]/descendant::td[input]")
	  private WebElementFacade сhainsOfKBKField;
	  @FindBy(xpath=".//tr[th/div='Цепочка КБК']/following-sibling::tr/th[3]/descendant::input")
	  private WebElementFacade сhainsOfKBKInput;

	  //Поле Цепочка КБК с найденным значением
	  private static String сhainsOfKBKXpath = ".//div[text()='%s']";
	  
	  
	  //Кнопка Обновить
	  @FindBy(xpath="(.//div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]])[2]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Цепочка КБК']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Цепочка КБК']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	 
		
	  /**
	   * Клик в поле Цепочка КБК 
	   */
	  public void clickOnFieldChainsOfKBK(){
		  waitForLoadJS();
		  сhainsOfKBKField.waitUntilClickable().click();
	  }
	  /**
	   * Ввести текст в поле Цепочка КБК 
	   * @param text
	   */
	  public void setTextChainsOfKBK(String text){
		  waitForLoadJS();
		  сhainsOfKBKInput.waitUntilClickable().clear();
		  сhainsOfKBKInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Цепочка КБК 
	   * @return text
	   */
	  public String getValueChainsOfKBK(){
		  waitForLoadJS();
		  return сhainsOfKBKInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Нажать кнопку Обновить
	   */
	  public void clickOnButtonRefresh(){
		  waitForLoadJS();
		  refreshButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку OK
	   */
	  public void clickOnButtonOK(){
		  waitForLoadJS();
		  okButton.waitUntilClickable().click();
	  }
	  /**
	   * Проверить нажата ли кнопка Видимость фильтров
	   * @return boolean
	   */
	  public boolean checkFilterOn(){
		  waitForLoadJS();
		  int count = getDriver().findElements(By.xpath(filterOn)).size();
		  if(count>0){
			  return true;
		  }
		  return false;
	  }
	  /**
	   * Нажать кнопку Видимость фильтров
	   */
	  public void clickFilter(){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(filterOn)).click();
		  getDriver().findElement(By.xpath(filterOff));
	  }
	  /**
	   * Клик в поле Цепочка КБК с переданным значением
	   */
	  public void clickOnFieldChainsOfKBK(String text){
		  waitForLoadJS();
		  String xPathLocator = String.format(сhainsOfKBKXpath, text); 
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
}