package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Справочник Дополнительный аналитический признак
 * @author e.kuzmina 28.04.2016
 *
 */
public class AdditionalAnalyticalSignDictionaryPage extends BasePage {
	
			
	  public AdditionalAnalyticalSignDictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[div='Дополнительный аналитический признак']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[div='.//div[div='Дополнительный аналитический признак']']")
	  private WebElementFacade field;
	  
	  //Поле Дополнительный аналитический признак
	  @FindBy(xpath="(.//tr[th/div[text()='Дополнительный аналитический признак']]/following-sibling::tr/descendant::td[input])[1]")
	  private WebElementFacade additionalAnalyticalSignField;
	  @FindBy(xpath=".//tr[th/div[text()='Дополнительный аналитический признак']]/following-sibling::tr/descendant::input[1]")
	  private WebElementFacade additionalAnalyticalSignInput;

	  //Радиокнопка в поле Дополнительный аналитический признак
	  @FindBy(xpath="(.//span[contains(@class,'radio')])[1]")
	  private WebElementFacade additionalAnalyticalSignRadioButton;

	  //Кнопка Обновить
	  @FindBy(xpath=".//div[contains(text(),'Выбор записи из справочника')]/following-sibling::div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Дополнительный аналитический признак']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Дополнительный аналитический признак']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	 
		
	  /**
	   * Клик в поле Дополнительный аналитический признак
	   */
	  public void clickOnFieldAdditionalAnalyticalSign(){
		  waitForLoadJS();
		  additionalAnalyticalSignField.waitUntilClickable().click();
	  }
	  /**
	   * Ввести текст в поле Дополнительный аналитический признак
	   * @param text
	   */
	  public void setTextAdditionalAnalyticalSign(String text){
		  waitForLoadJS();
		  additionalAnalyticalSignInput.waitUntilClickable().clear();
		  additionalAnalyticalSignInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Дополнительный аналитический признак
	   * @return text
	   */
	  public String getValueAdditionalAnalyticalSign(){
		  waitForLoadJS();
		  return additionalAnalyticalSignInput.waitUntilClickable().getAttribute("value");
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
	   * Нажать радиокнопку в поле Дополнительный аналитический признак
	   */
	  public void clickOnRadioButtonAdditionalAnalyticalSign(){
		  waitForLoadJS();
		  additionalAnalyticalSignRadioButton.waitUntilClickable().click();
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