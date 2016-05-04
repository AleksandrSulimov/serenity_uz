package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Справочник 'Выбрать позицию плана закупок'
 * @author e.kuzmina 03.05.2016
 *
 */
public class SelectPositionOfProcurementPlanDiictionaryPage extends BasePage {
	
			
	  public SelectPositionOfProcurementPlanDiictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Выбрать позицию плана закупок']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[text()='Выбрать позицию плана закупок']";
	  
	  @FindBy(xpath=".//div[text()='Выбрать позицию плана закупок']")
	  private WebElementFacade field;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='ОКПД 2']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='ОКПД 2']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	  //Кнопка Обновить
	  @FindBy(xpath=".//div/div[text()='Выбрать позицию плана закупок']/following-sibling::div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]]")
	  private WebElementFacade refreshButton;

	  //Поле Номер позиции плана закупок
	  @FindBy(xpath=".//tr[th/div[text()='ОКПД 2']]/following-sibling::tr/descendant::th[3]/descendant::td[input]")
	  private WebElementFacade procurementPlanPositionNumberField;
	  private static String procurementPlanPositionNumberFieldXpath = ".//tr[th/div[text()='ОКПД 2']]/following-sibling::tr/descendant::th[3]/descendant::td[input]";
	  @FindBy(xpath=".//tr[th/div[text()='ОКПД 2']]/following-sibling::tr/descendant::th[3]/descendant::input")
	  private WebElementFacade procurementPlanPositionNumberInput;

	  //Поле Номер позиции плана закупок с найденным значением
	  private static String procurementPlanPositionNumberXpath = ".//div[text()='%s']";

	  //Поле Наименование объекта закупки (предмет контракта)
	  @FindBy(xpath=".//tr[th/div[text()='ОКПД 2']]/following-sibling::tr/descendant::th[6]/descendant::td[input]")
	  private WebElementFacade objectOfTenderNameField;
	  private static String objectOfTenderNameFieldXpath = ".//tr[th/div[text()='ОКПД 2']]/following-sibling::tr/descendant::th[6]/descendant::td[input]";
	  @FindBy(xpath=".//tr[th/div[text()='ОКПД 2']]/following-sibling::tr/descendant::th[6]/descendant::input")
	  private WebElementFacade objectOfTenderNameInput;

	  //Поле Наименование объекта закупки (предмет контракта) с найденным значением
	  private static String objectOfTenderNameXpath = ".//div[text()='%s']";
	  
	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

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
	   * Клик в поле Наименование объекта закупки (предмет контракта)
	   */
	  public void clickOnFieldObjectOfTenderName(){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(objectOfTenderNameFieldXpath)).click();
	  }
	  /**
	   * Ввести текст в поле Наименование объекта закупки (предмет контракта)
	   * @param text
	   */
	  public void setTextObjectOfTenderName(String text){
		  waitForLoadJS();
		  objectOfTenderNameInput.waitUntilClickable().clear();
		  objectOfTenderNameInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Наименование объекта закупки (предмет контракта)
	   * @return text
	   */
	  public String getValueObjectOfTenderName(){
		  waitForLoadJS();
		  return objectOfTenderNameInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик в поле Номер позиции плана закупок
	   */
	  public void clickOnFieldProcurementPlanPositionNumber(){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(procurementPlanPositionNumberFieldXpath)).click();
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
	   * Нажать кнопку OK
	   */
	  public void clickOnButtonOK(){
		  waitForLoadJS();
		  okButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку Обновить
	   */
	  public void clickOnButtonRefresh(){
		  waitForLoadJS();
		  refreshButton.waitUntilClickable().click();
	  }
	  /**
	   * Клик в поле Номер позиции плана закупок с переданным значением
	   */
	  public void clickOnFieldProcurementPlanPositionNumber(String text){
		  waitForLoadJS();
		  String xPathLocator = String.format(procurementPlanPositionNumberXpath, text); 
		  getDriver().findElement(By.xpath(xPathLocator)).click();
	  }
}