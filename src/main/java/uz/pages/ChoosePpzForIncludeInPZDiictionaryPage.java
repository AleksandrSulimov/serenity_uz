package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Справочник Выбор ППЗ для включения в ПЗ
 * @author e.kuzmina 29.04.2016
 *
 */
public class ChoosePpzForIncludeInPZDiictionaryPage extends BasePage {
	
			
	  public ChoosePpzForIncludeInPZDiictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Выбор ППЗ для включения в ПЗ']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[text()='Выбор ППЗ для включения в ПЗ']")
	  private WebElementFacade field;
	  
	  //Поле Номер позиции плана закупок 
	  @FindBy(xpath=".//tr[th/div='Номер позиции плана закупок']/following-sibling::tr/th[2]/descendant::td[input]")
	  private WebElementFacade procurementPlanPositionNumberField;
	  @FindBy(xpath=".//tr[th/div='Номер позиции плана закупок']/following-sibling::tr/th[2]/descendant::input")
	  private WebElementFacade procurementPlanPositionNumberInput;

	  //Поле Номер позиции плана закупок  с найденным значением
	  private static String procurementPlanPositionNumberXpath = ".//div[text()='%s']";
	  
	  
	  //Кнопка Обновить
	  @FindBy(xpath="(.//div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]])[2]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Номер позиции плана закупок']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Номер позиции плана закупок']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	  //Чекбокс в первой строке
	  @FindBy(xpath=".//div[text()='Номер позиции плана закупок']/ancestor::table[1]/ancestor::div[1]/following-sibling::div[2]/descendant::span[contains(@class, 'checkbox')][1]")
	  private WebElementFacade selectFirstRowCheckBox;

	  //Чекбокс "Выделить все строки"
	  @FindBy(xpath=".//table[tbody/tr/th//div='Номер позиции плана закупок']/descendant::img[@title='Видимость фильтров']/ancestor::table[2]/preceding-sibling::span[contains(@class,'listheader-checkable')]")
	  private WebElementFacade selectAllCheckBox;

		
	  /**
	   * Клик в поле Номер позиции плана закупок 
	   */
	  public void clickOnFieldProcurementPlanPositionNumber(){
		  waitForLoadJS();
		  procurementPlanPositionNumberField.waitUntilClickable().click();
	  }
	  /**
	   * Ввести текст в поле Номер позиции плана закупок 
	   * @param text
	   */
	  public void setTextProcurementPlanPositionNumber(String text){
		  waitForLoadJS();
		  procurementPlanPositionNumberInput.waitUntilClickable().clear();
		  procurementPlanPositionNumberInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Номер позиции плана закупок 
	   * @return text
	   */
	  public String getValueProcurementPlanPositionNumber(){
		  waitForLoadJS();
		  return procurementPlanPositionNumberInput.waitUntilClickable().getAttribute("value");
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
	   * Клик в поле Номер позиции плана закупок с переданным значением
	   */
	  public void clickOnFieldProcurementPlanPositionNumber(String text){
		  waitForLoadJS();
		  String xPathLocator = String.format(procurementPlanPositionNumberXpath, text); 
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
	  /**
	   * Кликнуть чекбокс 'Выделить первую строку'
	   */
	  public void clickCheckBoxSelectFirstRow(){
		  waitForLoadJS();
		  selectFirstRowCheckBox.waitUntilClickable().click();
	  }
	  /**
	   * Кликнуть чекбокс 'Выделить все строки'
	   */
	  public void clickCheckBoxSelectAll(){
		  waitForLoadJS();
		  selectAllCheckBox.waitUntilClickable().click();
	  }
}