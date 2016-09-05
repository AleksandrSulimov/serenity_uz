package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


/**
 * Справочник Периодичность осуществления закупки
 * @author e.kuzmina 27.04.2016
 *
 */
public class FrequencyOfPurchasesDictionaryPage extends BasePage {
	
			
	  public FrequencyOfPurchasesDictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[div='Периодичность']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[div='Периодичность']")
	  private WebElementFacade field;
	  
	  //Поле Периодичность
	  @FindBy(xpath="(.//tr[th/div[text()='Периодичность']]/following-sibling::tr/descendant::td[input])[1]")
	  private WebElementFacade frequencyField;
	  private static String frequencyFieldXpath = "(.//tr[th/div[text()='Периодичность']]/following-sibling::tr/descendant::td[input])[1]";
	  @FindBy(xpath=".//tr[th/div[text()='Периодичность']]/following-sibling::tr/descendant::input[1]")
	  private WebElementFacade frequencyInput;

	  //Радиокнопка в поле Периодичность
	  @FindBy(xpath="(.//span[contains(@class,'radio')])[1]")
	  private WebElementFacade frequencyRadioButton;

	  //Кнопка Обновить
	  @FindBy(xpath=".//div/div[text()='Периодичность осуществления закупки']/following-sibling::div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Периодичность']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Периодичность']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	 
		
	  /**
	   * Клик в поле Периодичность
	   */
	  public void clickOnFieldFrequency(){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(frequencyFieldXpath)).click();
	  }
	  /**
	   * Ввести текст в поле Периодичность
	   * @param text
	   */
	  public void setTextFrequency(String text){
		  waitForLoadJS();
		  frequencyInput.waitUntilClickable().clear();
		  frequencyInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Периодичность
	   * @return text
	   */
	  public String getValueFrequency(){
		  waitForLoadJS();
		  return frequencyInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Нажать кнопку Обновить
	   */
	  public void clickOnEnter(){
		  waitForLoadJS();
		  frequencyInput.waitUntilClickable().sendKeys(Keys.ENTER);
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
	   * Нажать радиокнопку в поле Периодичность
	   */
	  public void clickOnRadioButtonFrequency(){
		  waitForLoadJS();
		  frequencyRadioButton.waitUntilClickable().click();
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