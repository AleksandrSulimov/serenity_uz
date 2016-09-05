package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


/**
 * Справочник ОКВЭД
 * @author e.kuzmina 04.05.2016
 *
 */
public class OkvedDictionaryPage extends BasePage {
	
			
	  public OkvedDictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='ОКВЭД']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[text()='ОКВЭД']")
	  private WebElementFacade field;
	  
	  //Поле Код
	  @FindBy(xpath="(.//tr[th/div[text()='Код']]/following-sibling::tr/descendant::td[input])[1]")
	  private WebElementFacade codeField;
	  private static String codeFieldXpath = "(.//tr[th/div[text()='Код']]/following-sibling::tr/descendant::td[input])[1]";
	  @FindBy(xpath=".//tr[th/div[text()='Код']]/following-sibling::tr/descendant::input[1]")
	  private WebElementFacade codeInput;

	  //Радиокнопка в поле Код
	  @FindBy(xpath="(.//span[contains(@class,'radio')])[1]")
	  private WebElementFacade codeRadioButton;

	  //Кнопка Обновить
	  @FindBy(xpath=".//div/div[contains(.,'ОКВЭД')]/following-sibling::div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Код']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Код']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	  /**
	   * Клик в поле Код
	   */
	  public void clickOnFieldCode(){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(codeFieldXpath)).click();
	  }
	  /**
	   * Ввести текст в поле Код
	   * @param text
	   */
	  public void setTextCode(String text){
		  waitForLoadJS();
		  codeInput.waitUntilClickable().clear();
		  codeInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Код
	   * @return text
	   */
	  public String getValueCode(){
		  waitForLoadJS();
		  return codeInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Нажать кнопку Обновить
	   */
	  public void clickOnEnter(){
		  waitForLoadJS();
		  codeInput.waitUntilClickable().sendKeys(Keys.ENTER);
//		  refreshButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку OK
	   */
	  public void clickOnButtonOK(){
		  waitForLoadJS();
		  okButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать радиокнопку в поле Код
	   */
	  public void clickOnRadioButtonCode(){
		  waitForLoadJS();
		  codeRadioButton.waitUntilClickable().click();
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
	  
}