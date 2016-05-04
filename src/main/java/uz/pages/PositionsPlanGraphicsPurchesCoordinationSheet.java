package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Вкладка Лист согласования
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 04.05.2016
 *
 */
public class PositionsPlanGraphicsPurchesCoordinationSheet extends BasePage {
	
			
	  public PositionsPlanGraphicsPurchesCoordinationSheet(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Автор']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Автор']";
	  
	  @FindBy(xpath=".//span[text()='Автор']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='Позиция плана-графика закупок']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;
	  
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

	  //Чекбокс Требуется согласование в блоке Согласующие
	  @FindBy(xpath=".//span[@title='Установите чек-бокс если требуется согласование' and input[@type='checkbox']]/div")
	  private WebElementFacade needCoordinationCheckBox;
	  private String needCoordinationCheckBoxXpath = ".//span[@title='Установите чек-бокс если требуется согласование' and input[@type='checkbox']]/input";

	  //Поле Этап в блоке Согласующие
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[2]")
	  private WebElementFacade stageMatcherField;
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[2]/div/input")
	  private WebElementFacade stageMatcherInput;

	  //Поле Код группы в блоке Согласующие
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[3]")
	  private WebElementFacade codeGroupMatcherField;
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[3]/div/input")
	  private WebElementFacade codeGroupMatcherInput;

	  //Поле Порядковый номер согласующего в блоке Согласующие
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[4]")
	  private WebElementFacade sequenceNumberMatchingField;
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[4]/div/input")
	  private WebElementFacade sequenceNumberMatchingInput;

	  //Поле ФИО сотрудника в блоке Согласующие
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[5]")
	  private WebElementFacade fioEmployeeMatchingField;
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[5]/div/input")
	  private WebElementFacade fioEmployeeMatchingInput;

	  //Поле Должность в блоке Согласующие
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[6]")
	  private WebElementFacade positionMatchingField;
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[6]/div/input")
	  private WebElementFacade positionMatchingInput;

	  //Поле Результат согласования в блоке Согласующие
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[10]")
	  private WebElementFacade resultMatchingField;
	  @FindBy(xpath=".//span[text()='Согласующие']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[1]/descendant::div[4]/following-sibling::div[2]/descendant::td[10]/div/span/input")
	  private WebElementFacade resultMatchingInput;
	  

	  //Поле ФИО сотрудника в блоке Утверждающий
	  @FindBy(xpath=".//span[text()='Утверждающий']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::tr[3]/descendant::td[1]")
	  private WebElementFacade fioEmployeePredicatingField;
	  @FindBy(xpath=".//span[text()='Утверждающий']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::tr[3]/descendant::td[1]/div/input[@title='Выберите утверждающего сотрудника из справочника']")
	  private WebElementFacade fioEmployeePredicatingInput;

	  //Поле Должность в блоке Утверждающий
	  @FindBy(xpath=".//span[text()='Утверждающий']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::tr[3]/descendant::td[2]")
	  private WebElementFacade positionPredicatingField;
	  @FindBy(xpath=".//span[text()='Утверждающий']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::tr[3]/descendant::td[2]/div/input")
	  private WebElementFacade positionPredicatingInput;
	  

	  //Кнопка Проверить документ
	  @FindBy(xpath=".//button[@title='Проверить документ']")
	  private WebElementFacade checkDocumentButton;
	  
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Клик по полю ФИО сотрудника в блоке Автор
	   */
	  public void clickOnFieldFioEmployeeAuthor(){
		  waitForLoadJS();
		  fioEmployeeAuthorField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля ФИО сотрудника в блоке Автор
	   */
	  public String getValueFioEmployeeAuthor(){
		  waitForLoadJS();
		  return fioEmployeeAuthorInput.getAttribute("value");
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
	   * Забрать значение чекбокса Требуется согласование
	   */
	  public String getValueNeedCoordinationCheckBox(){
		  waitForLoadJS();
		  return getDriver().findElement(By.xpath(needCoordinationCheckBoxXpath)).getAttribute("checked");
	  }
	  /**
	   * Забрать значение из поля Этап в блоке Согласующие
	   */
	  public String getValueStageMatcher(){
		  waitForLoadJS();
		  return stageMatcherInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля Код группы в блоке Согласующие
	   */
	  public String getValueCodeGroupMatcher(){
		  waitForLoadJS();
		  return codeGroupMatcherInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля Порядковый номер согласующего в блоке Согласующие
	   */
	  public String getValueSequenceNumberMatching(){
		  waitForLoadJS();
		  return sequenceNumberMatchingInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля ФИО сотрудника в блоке Согласующие
	   */
	  public String getValueFioEmployeeMatching(){
		  waitForLoadJS();
		  return fioEmployeeMatchingInput.getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля Должность в блоке Согласующие
	   */
	  public String getValuePositionMatching(){
		  waitForLoadJS();
		  return positionMatchingInput.getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля Результат согласования в блоке Согласующие
	   */
	  public String getValueResultMatching(){
		  waitForLoadJS();
		  return resultMatchingInput.getAttribute("value");
	  }
	  
	  /**
	   * Забрать значение из поля ФИО сотрудника в блоке Утверждающий
	   */
	  public String getValueFioEmployeePredicating(){
		  waitForLoadJS();
		  return fioEmployeePredicatingInput.getAttribute("value");
	  }
	  
	  /**
	   * Забрать значение из поля Должность в блоке Утверждающий
	   */
	  public String getValuePositionPredicating(){
		  waitForLoadJS();
		  return positionPredicatingInput.getAttribute("value");
	  }
	  /**
	   * Нажать кнопку Проверить документ
	   */
	  public void clickOnButtonCheckDocument(){
		  waitForLoadJS();
		  checkDocumentButton.waitUntilClickable().click();
	  }
}