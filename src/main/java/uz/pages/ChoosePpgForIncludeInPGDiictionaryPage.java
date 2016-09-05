package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


/**
 * Справочник Выбор ППГ для включения в ПГ
 * @author e.kuzmina 05.05.2016
 *
 */
public class ChoosePpgForIncludeInPGDiictionaryPage extends BasePage {
	
			
	  public ChoosePpgForIncludeInPGDiictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Выбор ППГ для включения в ПГ']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[text()='Выбор ППГ для включения в ПГ']")
	  private WebElementFacade field;
	  
	  
	  //Кнопка Обновить
	  @FindBy(xpath="(.//div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]])[2]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Номер позиции плана графика закупок']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Номер позиции плана графика закупок']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	  //Чекбокс в первой строке
	  @FindBy(xpath=".//tr[th/div='Номер позиции плана графика закупок']/ancestor::table[1]/ancestor::div[1]/following-sibling::div[2]/descendant::td[1]/div/span")
	  private WebElementFacade selectFirstRowCheckBox;

	  //Поле Номер позиции плана графика закупок
	  @FindBy(xpath=".//div[text()='Номер позиции плана графика закупок']/ancestor::table[1]/ancestor::div[1]/following-sibling::div[2]/descendant::tr[1]/td[4]/div")
	  private WebElementFacade ppgNumberField;
	  private String ppgNumberXpath = ".//div[text()='Номер позиции плана графика закупок']/ancestor::tr[1]/following-sibling::tr[1]/th[4]/descendant::td[input]";
	  @FindBy(xpath=".//div[text()='Номер позиции плана графика закупок']/ancestor::tr[1]/following-sibling::tr[1]/th[4]/descendant::td/input")
	  private WebElementFacade ppgNumberInput;
	  
	  /**
	   * Нажать кнопку Обновить
	   */
	  public void clickOnEnter(){
		  waitForLoadJS();
		  ppgNumberInput.waitUntilClickable().sendKeys(Keys.ENTER);
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
	   * Кликнуть чекбокс 'Выделить первую строку'
	   */
	  public void clickCheckBoxSelectFirstRow(){
		  waitForLoadJS();
		  selectFirstRowCheckBox.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик в поле Номер позиции плана графика закупок
	   */
	  public void clickOnFieldPpgNumber(){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(ppgNumberXpath)).click();
	  }
	  /**
	   * Ввести текст в поле Номер позиции плана графика закупок
	   * @param text
	   */
	  public void setTextPpgNumber(String text){
		  waitForLoadJS();
		  ppgNumberInput.waitUntilClickable().clear();
		  ppgNumberInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Номер позиции плана графика закупок
	   * @return text
	   */
	  public String getValuePpgNumber(){
		  waitForLoadJS();
		  return ppgNumberInput.waitUntilClickable().getAttribute("value");
	  }
}