package uz.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Справочник Наименование единицы измерения
 * @author e.kuzmina 04.05.2016
 *
 */
public class NameOfMeasureDictionaryPage extends BasePage {
	
			
	  public NameOfMeasureDictionaryPage(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
	
	  }
	  
	  @FindBy(xpath=".//div[text()='Основная списковая форма']")
	  private WebElementFacade applet;
	  
	  @FindBy(xpath=".//div[text()='Основная списковая форма']")
	  private WebElementFacade field;
	  
	  //Поле Наименование
	  @FindBy(xpath="(.//tr[th/div[text()='Наименование']]/following-sibling::tr/descendant::td[input])[3]")
	  private WebElementFacade nameField;
	  private static String nameFieldXpath = "(.//tr[th/div[text()='Код']]/following-sibling::tr/descendant::td[input])[1]";
	  @FindBy(xpath="(.//tr[th/div[text()='Наименование']]/following-sibling::tr/descendant::td[input])[3]/input")
	  private WebElementFacade nameInput;

	  //Радиокнопка в поле Наименование
	  @FindBy(xpath="(.//span[contains(@class,'radio')])[1]")
	  private WebElementFacade nameRadioButton;

	  //Кнопка Обновить
	  @FindBy(xpath=".//div/div[contains(.,'Основная списковая форма')]/following-sibling::div//td/button[@title='Обновить список документов' and img[contains(@src,'refresh')]]")
	  private WebElementFacade refreshButton;

	  //Кнопка OK
	  @FindBy(xpath=".//button[text()='OK']")
	  private WebElementFacade okButton;

	  //Значок Видимость фильтров ON
	  private static String filterOn = ".//table[tbody/tr/th//div='Код']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_on')]";
	  //Значок Видимость фильтров OFF
	  private static String filterOff = ".//table[tbody/tr/th//div='Код']/descendant::img[@title='Видимость фильтров' and contains(@src, 'filter_off')]";
	 
	  /**
	   * Клик в поле Наименование
	   */
	  public void clickOnFieldName(){
		  waitForLoadJS();
		  getDriver().findElement(By.xpath(nameFieldXpath)).click();
	  }
	  /**
	   * Ввести текст в поле Наименование
	   * @param text
	   */
	  public void setTextName(String text){
		  waitForLoadJS();
		  nameInput.waitUntilClickable().clear();
		  nameInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Забрать значение из поля Наименование
	   * @return text
	   */
	  public String getValueName(){
		  waitForLoadJS();
		  return nameInput.waitUntilClickable().getAttribute("value");
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
	   * Нажать радиокнопку в поле Наименование
	   */
	  public void clickOnRadioButtonName(){
		  waitForLoadJS();
		  nameRadioButton.waitUntilClickable().click();
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