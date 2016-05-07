package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Общие сведения 
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
public class PlanGraphicsBasicInformation extends BasePage {
	
			
	  public PlanGraphicsBasicInformation(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='План-график']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='План-график']";
	  
	  @FindBy(xpath=".//span[text()='План-график']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='План-график']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;
	  
	  //Поле Фамилия
	  @FindBy(xpath=".//td[div/span='Фамилия']/following-sibling::td[1]/div")
	  private WebElementFacade lastNameField;
	  @FindBy(xpath=".//td[div/span='Фамилия']/following-sibling::td[1]/div/input")
	  private WebElementFacade lastNameInput;

	  //Поле Имя
	  @FindBy(xpath=".//td[div/span='Имя']/following-sibling::td[1]/div")
	  private WebElementFacade firstNameField;
	  @FindBy(xpath=".//td[div/span='Имя']/following-sibling::td[1]/div/input")
	  private WebElementFacade firstNameInput;

	  //Поле Отчество
	  @FindBy(xpath=".//td[div/span='Отчество']/following-sibling::td[1]/div")
	  private WebElementFacade middleNameField;
	  @FindBy(xpath=".//td[div/span='Отчество']/following-sibling::td[1]/div/input")
	  private WebElementFacade middleNameInput;

	  //Поле Телефон
	  @FindBy(xpath=".//span[text()='Сведения об исполнителе (ответственном за формирование плана-графика)']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div/span='Телефон']/following-sibling::td[1]/div")
	  private WebElementFacade phoneField;
	  @FindBy(xpath=".//span[text()='Сведения об исполнителе (ответственном за формирование плана-графика)']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div/span='Телефон']/following-sibling::td[1]/div/input")
	  private WebElementFacade phoneInput;

	  //Поле Факс
	  @FindBy(xpath=".//td[div/span='Факс']/following-sibling::td[1]/div")
	  private WebElementFacade faxField;
	  @FindBy(xpath=".//td[div/span='Факс']/following-sibling::td[1]/div/input")
	  private WebElementFacade faxInput;

	  //Поле Адрес электронной почты
	  @FindBy(xpath=".//span[text()='Сведения об исполнителе (ответственном за формирование плана-графика)']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div/span='Адрес электронной почты']/following-sibling::td[1]/div")
	  private WebElementFacade emailField;
	  @FindBy(xpath=".//span[text()='Сведения об исполнителе (ответственном за формирование плана-графика)']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div/span='Адрес электронной почты']/following-sibling::td[1]/div/input")
	  private WebElementFacade emailInput;

	  //Кнопка Добавить вложение 
	  @FindBy(xpath=".//button[@title='Добавить вложение']")
	  private WebElementFacade addAttachmentButton;
	  
		
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Клик по полю Фамилия
	   */
	  public void clickOnFieldLastName(){
		  waitForLoadJS();
		  lastNameField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Фамилия
	   */
	  public String getValueLastName(){
		  waitForLoadJS();
		  return lastNameInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Фамилия
	   */
	  public void setTextLastName(String text){
		  waitForLoadJS();
		  lastNameInput.waitUntilClickable().clear();
		  lastNameInput.sendKeys(text);
	  }

	  /**
	   * Клик по полю Имя
	   */
	  public void clickOnFieldFirstName(){
		  waitForLoadJS();
		  firstNameField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Имя
	   */
	  public String getValueFirstName(){
		  waitForLoadJS();
		  return firstNameInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Имя
	   */
	  public void setTextFirstName(String text){
		  waitForLoadJS();
		  firstNameInput.waitUntilClickable().clear();
		  firstNameInput.sendKeys(text);
	  }

	  /**
	   * Клик по полю Отчество
	   */
	  public void clickOnFieldMiddleName(){
		  waitForLoadJS();
		  middleNameField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Отчество
	   */
	  public String getValueMiddleName(){
		  waitForLoadJS();
		  return middleNameInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Отчество
	   */
	  public void setTextMiddleName(String text){
		  waitForLoadJS();
		  middleNameInput.waitUntilClickable().clear();
		  middleNameInput.sendKeys(text);
	  }

	  /**
	   * Клик по полю Телефон
	   */
	  public void clickOnFieldPhone(){
		  waitForLoadJS();
		  phoneField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Телефон
	   */
	  public String getValuePhone(){
		  waitForLoadJS();
		  return phoneInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Телефон
	   */
	  public void setTextPhone(String text){
		  waitForLoadJS();
		  phoneInput.waitUntilClickable().clear();
		  phoneInput.sendKeys(text);
	  }

	  /**
	   * Клик по полю Факс
	   */
	  public void clickOnFieldFax(){
		  waitForLoadJS();
		  faxField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Факс
	   */
	  public String getValueFax(){
		  waitForLoadJS();
		  return faxInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Факс
	   */
	  public void setTextFax(String text){
		  waitForLoadJS();
		  faxInput.waitUntilClickable().clear();
		  faxInput.sendKeys(text);
	  }

	  /**
	   * Клик по полю Адрес электронной почты
	   */
	  public void clickOnFieldEmail(){
		  waitForLoadJS();
		  emailField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Адрес электронной почты
	   */
	  public String getValueEmail(){
		  waitForLoadJS();
		  return emailInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Адрес электронной почты
	   */
	  public void setTextEmail(String text){
		  waitForLoadJS();
		  emailInput.waitUntilClickable().clear();
		  emailInput.sendKeys(text);
	  }
	  
	  /**
	   * Нажать кнопку Добавить вложение
	   */
	  public void clickOnButtonAddAttachment(){
		  waitForLoadJS();
		  addAttachmentButton.waitUntilClickable().click();
	  }
}