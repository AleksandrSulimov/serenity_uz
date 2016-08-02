package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Редактирование записи
 * Вкладка Спецификация ТРУ
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 03.05.2016
 *
 */
public class PositionsPlanGraphicsPurchesSpecificationTruEditingRecord extends BasePage {
	
			
	  public PositionsPlanGraphicsPurchesSpecificationTruEditingRecord(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//div[text()='Редактирование записи']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//div[text()='Редактирование записи']";
	  
	  @FindBy(xpath=".//div[text()='Редактирование записи']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//button[text()='Закрыть']")
	  private WebElementFacade closeButton;
	  
	  //Поле Код ОКПД2
	  @FindBy(xpath=".//td[div/span='Код ОКПД2*']/following-sibling::td[1]/div")
	  private WebElementFacade codeOkpd2Field;
	  @FindBy(xpath=".//td[div/span='Код ОКПД2*']/following-sibling::td[1]/div/input")
	  private WebElementFacade codeOkpd2Input;

	  //Поле Наименование кода товара (работы, услуги) по ОКПД 2
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Наименование кода вида экономической деятельности по ОКВЭД 2']/following-sibling::td[1]")
	  private WebElementFacade nameOfProductCodeField;
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Наименование кода вида экономической деятельности по ОКВЭД 2']/following-sibling::td[1]/div/input")
	  private WebElementFacade nameOfProductCodeTextarea;

	  //Кнопка Ok
	  @FindBy(xpath=".//button[text()='Ok']")
	  private WebElementFacade okButton;

	  //Поле Код ОКВЭД2*
	  @FindBy(xpath=".//td[div/span='Код ОКВЭД2*']/following-sibling::td[1]/div")
	  private WebElementFacade codeOkved2Field;
	  @FindBy(xpath=".//td[div/span='Код ОКВЭД2*']/following-sibling::td[1]/div/input")
	  private WebElementFacade codeOkved2Input;
	  @FindBy(xpath=".//td[div/span='Код ОКВЭД2*']/following-sibling::td[2]/div/button")
	  private WebElementFacade codeOkved2Button;

	  //Поле Наименование кода вида экономической деятельности по ОКВЭД 2
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Наименование кода вида экономической деятельности по ОКВЭД 2']/following-sibling::td[1]")
	  private WebElementFacade nameOfCodeEconomicActivityOKVED2Field;
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Наименование кода вида экономической деятельности по ОКВЭД 2']/following-sibling::td[1]/div/input")
	  private WebElementFacade nameOfCodeEconomicActivityOKVED2Input;

	  //Поле Наименование товара работы или услуги*
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Наименование товара работы или услуги*']/following-sibling::td[1]")
	  private WebElementFacade nameOfProductJobServiceField;
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Наименование товара работы или услуги*']/following-sibling::td[1]/div/input")
	  private WebElementFacade nameOfProductJobServiceInput;

	  //Поле Минимально необходимые требования, предъявляемые к товару, работе, услуге*
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Минимально необходимые требования, предъявляемые к товару, работе, услуге*']/following-sibling::td[1]")
	  private WebElementFacade minimumNecessaryRequirementsField;
	  @FindBy(xpath=".//div[text()='Редактирование записи']/following-sibling::div[1]/descendant::td[div/span='Минимально необходимые требования, предъявляемые к товару, работе, услуге*']/following-sibling::td[1]/div/input")
	  private WebElementFacade minimumNecessaryRequirementsInput;

	  //Поле Наименование единицы измерения*
	  @FindBy(xpath=".//td[div/span='Наименование единицы измерения*']/following-sibling::td[1]/div")
	  private WebElementFacade nameOfMeasureField;
	  @FindBy(xpath=".//td[div/span='Наименование единицы измерения*']/following-sibling::td[1]/div/input")
	  private WebElementFacade nameOfMeasureInput;
	  @FindBy(xpath=".//td[div/span='Наименование единицы измерения*']/following-sibling::td[2]/div/button")
	  private WebElementFacade nameOfMeasureButton;

	  //Поле Количество (объем)*
	  @FindBy(xpath=".//td[div/span='Количество (объем)*']/following-sibling::td[1]/div")
	  private WebElementFacade amountField;
	  @FindBy(xpath=".//td[div/span='Количество (объем)*']/following-sibling::td[1]/div/input")
	  private WebElementFacade amountInput;
	  
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Клик по полю Код ОКПД2
	   */
	  public void clickOnFieldCodeOKPD2(){
		  waitForLoadJS();
		  codeOkpd2Field.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Код ОКПД2
	   */
	  public String getValueCodeOKPD2(){
		  waitForLoadJS();
		  return codeOkpd2Input.getAttribute("value");
	  }
	  /**
	   * Клик по полю Наименование кода товара (работы, услуги) по ОКПД 2
	   */
	  public void clickOnFieldNameOfProductCode(){
		  waitForLoadJS();
		  nameOfProductCodeField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование кода товара (работы, услуги) по ОКПД 2
	   */
	  public String getValueNameOfProductCode(){
		  waitForLoadJS();
		  return nameOfProductCodeTextarea.getAttribute("value");
	  }
	  /**
	   * Нажать кнопку Ok
	   */
	  public void clickOnButtonOK(){
		  waitForLoadJS();
		  okButton.waitUntilClickable().click();
		  okButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Клик по полю Код ОКВЭД2*
	   */
	  public void clickOnFieldCodeOKVED2(){
		  waitForLoadJS();
		  codeOkved2Field.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Код ОКВЭД2*
	   */
	  public String getValueCodeOKVED2(){
		  waitForLoadJS();
		  return codeOkved2Input.getAttribute("value");
	  }
	  /**
	   * Открыть справочник в поле Код ОКВЭД2*
	   */
	  public void clickOnButtonCodeOKVED2(){
		  waitForLoadJS();
		  codeOkved2Button.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по полю Наименование кода вида экономической деятельности по ОКВЭД 2
	   */
	  public void clickOnFieldCodeEconomicActivityOKVED2(){
		  waitForLoadJS();
		  nameOfCodeEconomicActivityOKVED2Field.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование кода вида экономической деятельности по ОКВЭД 2
	   */
	  public String getValueCodeEconomicActivityOKVED2(){
		  waitForLoadJS();
		  return nameOfCodeEconomicActivityOKVED2Input.getAttribute("value");
	  }

	  /**
	   * Клик по полю Наименование товара работы или услуги*
	   */
	  public void clickOnFieldNameOfProductJobService(){
		  waitForLoadJS();
		  nameOfProductJobServiceField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование товара работы или услуги*
	   */
	  public String getValueNameOfProductJobService(){
		  waitForLoadJS();
		  return nameOfProductJobServiceInput.getAttribute("value");
	  }

	  /**
	   * Клик по полю Минимально необходимые требования, предъявляемые к товару, работе, услуге*
	   */
	  public void clickOnFieldMinimumNecessaryRequirements(){
		  waitForLoadJS();
		  minimumNecessaryRequirementsField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Минимально необходимые требования, предъявляемые к товару, работе, услуге*
	   */
	  public String getValueMinimumNecessaryRequirements(){
		  waitForLoadJS();
		  return minimumNecessaryRequirementsInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Минимально необходимые требования, предъявляемые к товару, работе, услуге*
	   */
	  public void setTextMinimumNecessaryRequirements(String text){
		  waitForLoadJS();
		  minimumNecessaryRequirementsInput.waitUntilClickable().sendKeys(text);
	  }
	  
	  /**
	   * Клик по полю Наименование единицы измерения*
	   */
	  public void clickOnFieldNameOfMeasure(){
		  waitForLoadJS();
		  nameOfMeasureField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование единицы измерения*
	   */
	  public String getValueNameOfMeasure(){
		  waitForLoadJS();
		  return nameOfMeasureInput.getAttribute("title");
	  }
	  /**
	   * Открыть справочник в поле Наименование единицы измерения*
	   */
	  public void clickOnButtonNameOfMeasure(){
		  waitForLoadJS();
		  nameOfMeasureButton.waitUntilClickable().click();
	  }
	  /**
	   * Клик по полю Количество (объем)*
	   */
	  public void clickOnFieldAmount(){
		  waitForLoadJS();
		  amountField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Количество (объем)*
	   */
	  public String getValueAmount(){
		  waitForLoadJS();
		  return amountInput.getAttribute("value");
	  }
	  /**
	   * Ввести значение в поле Количество (объем)*
	   */
	  public void setTextAmount(String text){
		  waitForLoadJS();
		  amountInput.waitUntilClickable().sendKeys(text);
	  }
}