package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Лист согласования
 * на странице 'План-график' 
 * @author e.kuzmina 05.05.2016
 *
 */
public class PlanGraphicsCoordinationSheet extends BasePage {
	
			
	  public PlanGraphicsCoordinationSheet(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath="(.//span[text()='ФИО сотрудника'])[1]")
	  private WebElementFacade applet;
	  private String appletXpath = "(.//span[text()='ФИО сотрудника'])[1]";
	  
	  @FindBy(xpath="(.//span[text()='ФИО сотрудника'])[1]")
	  private WebElementFacade field;

	  //Поле ФИО сотрудника в блоке Автор
	  @FindBy(xpath=".//span[text()='Автор']/ancestor::table[2]/ancestor::td[1]/descendant::tr[4]/td[1]/div")
	  private WebElementFacade fioEmployeeAuthorField;
	  @FindBy(xpath=".//span[text()='Автор']/ancestor::table[2]/ancestor::td[1]/descendant::tr[4]/td[1]/div/input")
	  private WebElementFacade fioEmployeeAuthorInput;

	  //Поле Должность в блоке Автор
	  @FindBy(xpath=".//span[text()='Автор']/ancestor::table[2]/ancestor::td[1]/descendant::tr[4]/td[2]/div")
	  private WebElementFacade positionAuthorField;
	  @FindBy(xpath=".//span[text()='Автор']/ancestor::table[2]/ancestor::td[1]/descendant::tr[4]/td[2]/div/input")
	  private WebElementFacade positionAuthorInput;

	  //Поле Телефон в блоке Автор
	  @FindBy(xpath=".//span[text()='Автор']/ancestor::table[2]/ancestor::td[1]/descendant::tr[4]/td[3]/div")
	  private WebElementFacade phoneAuthorField;
	  @FindBy(xpath=".//span[text()='Автор']/ancestor::table[2]/ancestor::td[1]/descendant::tr[4]/td[3]/div/input")
	  private WebElementFacade phoneAuthorInput;

	  //Чекбокс Требуется согласование в блоке Автор
	  @FindBy(xpath=".//span[@title='Установите чек-бокс если требуется согласование' and input[@type='checkbox']]/div")
	  private WebElementFacade needCoordinationCheckBox;
	  //Кнопка Добавить новую строку В таблице "Согласующие"
	  @FindBy(xpath=".//span[contains(@title, 'Номер этапа')]//ancestor::table[2]/descendant::button[@title='Добавить новую строку']")
	  private WebElementFacade addNewRecordCoordinatorsButton;

	  //Поле Телефон в блоке Утверждающий
	  @FindBy(xpath=".//span[text()='Утверждающий']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::tr[3]/td[4]/div")
	  private WebElementFacade phoneValidatorField;
	  @FindBy(xpath=".//span[text()='Утверждающий']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::tr[3]/td[4]/div/input")
	  private WebElementFacade phoneValidatorInput;

	  //Кнопка Выберите согласующего сотрудника из справочника В таблице "Согласующие"
	  @FindBy(xpath=".//button[@title='Выберите согласующего сотрудника из справочника']")
	  private WebElementFacade chooseCoordinatorButton;
	  
	  //Кнопка Выберите утверждающего сотрудника из справочника В таблице "Утверждающий"
	  @FindBy(xpath=".//button[@title='Выберите утверждающего сотрудника из справочника']")
	  private WebElementFacade chooseValidatorButton;
	  

	  //Кнопка Проверить документ
	  @FindBy(xpath=".//button[@title='Проверить документ']")
	  private WebElementFacade checkDocumentButton;
	  
	  /**
	   * Кликнуть чекбокс  Требуется согласование
	   */
	  public void clickOnCheckBoxNeedCoordination(){
		  waitForLoadJS();
		  needCoordinationCheckBox.waitUntilClickable().click();
	  }

	  /**
	   * Клик по полю ФИО сотрудника в блоке Автор
	   */
	  public void clickOnFieldFioEmployeeAuthor(){
		  waitForLoadJS();
		  fioEmployeeAuthorField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Телефон в блоке Автор
	   */
	  public String getValuePhoneAuthor(){
		  waitForLoadJS();
		  return phoneAuthorInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Телефон в блоке Автор
	   */
	  public void setTextPhoneAuthor(String text){
		  waitForLoadJS();
		  phoneAuthorInput.waitUntilClickable().sendKeys(text);
	  }
	  /**
	   * Клик по полю Должность в блоке Автор
	   */
	  public void clickOnFieldPositionAuthor(){
		  waitForLoadJS();
		  positionAuthorField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Должность в блоке Автор
	   */
	  public String getValuePositionAuthor(){
		  waitForLoadJS();
		  return positionAuthorInput.getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля ФИО сотрудника в блоке Автор
	   */
	  public String getValueFioEmployeeAuthor(){
		  waitForLoadJS();
		  return fioEmployeeAuthorInput.getAttribute("value");
	  }
	  
	  /**
	   * Нажать кнопку "Добавить новую строку" В таблице "Согласующие"
	   */
	  public void clickOnButtonAddNewRecordCoordinators(){
		  waitForLoadJS();
		  addNewRecordCoordinatorsButton.waitUntilClickable().click();
	  }
	  /**
	   * Нажать кнопку "Выберите согласующего сотрудника из справочника" В таблице "Согласующие"
	   */
	  public void clickOnButtonChooseCoordinator(){
		  waitForLoadJS();
		  chooseCoordinatorButton.waitUntilClickable().click();
	  }
	 
	  /**
	   * Нажать кнопку "Выберите утверждающего сотрудника из справочника" В таблице "Согласующие"
	   */
	  public void clickOnButtonChooseValidator(){
		  waitForLoadJS();
		  chooseValidatorButton.waitUntilClickable().click();
	  }
	  /**
	   * Клик по полю Телефон в блоке Утверждающий
	   */
	  public void clickOnFieldPhoneValidator(){
		  waitForLoadJS();
		  phoneValidatorField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Телефон в блоке Утверждающий
	   */
	  public String getValuePhoneValidator(){
		  waitForLoadJS();
		  return phoneValidatorInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Телефон в блоке Утверждающий
	   */
	  public void setTextPhoneValidator(String text){
		  waitForLoadJS();
		  phoneValidatorInput.waitUntilClickable().sendKeys(text);
	  }
		
		/**
	   * Нажать кнопку Проверить документ
	   */
	  public void clickOnButttonCheckDocument(){
		  waitForLoadJS();
		  checkDocumentButton.waitUntilClickable().click();
	  }
	  
}