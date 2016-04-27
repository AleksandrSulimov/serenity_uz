package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebDriver;


/**
 * Вкладка Основные сведения 
 * на странице 'Позиция плана закупок товаров, работ, услуг 200' 
 * @author e.kuzmina 26.04.2016
 *
 */
public class PositionsPurchasePlanOfProductJobService200BasicInformation extends BasePage {
	
			
	  public PositionsPurchasePlanOfProductJobService200BasicInformation(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Общая информация о закупке']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Общая информация о закупке']";
	  
	  @FindBy(xpath=".//span[text()='Общая информация о закупке']")
	  private WebElementFacade field;
	  
	  //Поле Тип закупки
	  @FindBy(xpath=".//td[div[span='Тип закупки']]/following-sibling::td/descendant::div[1]")
	  private WebElementFacade purchaseTypeField;
	  @FindBy(xpath=".//td[div[span='Тип закупки']]/following-sibling::td[1]/div/span/input")
	  private WebElementFacade purchaseTypeInput;

	  //Поле ОКПД
	  @FindBy(xpath=".//td[div[span='ОКПД *']]/following-sibling::td[1]")
	  private WebElementFacade okpdField;
	  @FindBy(xpath=".//td[div[span='ОКПД *']]/following-sibling::td[1]/div/input")
	  private WebElementFacade okpdInput;
	  @FindBy(xpath=".//td[div[span='ОКПД *']]/following-sibling::td[2]/div/button")
	  private WebElementFacade okpdOpenDictionaryButton;

	  //Поле Наименование кода товара (работы, услуги) по ОКПД
	  @FindBy(xpath="//td[div[span='Наименование кода товара (работы, услуги) по ОКПД']]/following-sibling::td[1]")
	  private WebElementFacade codeProductNameField;
	  @FindBy(xpath="//td[div[span='Наименование кода товара (работы, услуги) по ОКПД']]/following-sibling::td[1]/div/textarea")
	  private WebElementFacade codeProductNameTextArea;

	  //Поле Наименование объекта закупки
	  @FindBy(xpath="//td[div[span='Наименование объекта закупки *']]/following-sibling::td[1]")
	  private WebElementFacade objectOfTenderNameField;
	  @FindBy(xpath="//td[div[span='Наименование объекта закупки *']]/following-sibling::td[1]/div/input")
	  private WebElementFacade objectOfTenderNameInput;

	  //Поле Описание позиции плана закупок
	  @FindBy(xpath=".//tr[td/div/div/table/tbody/tr/td/div/span='Описание позиции плана закупок']/following-sibling::tr[1]/td[1]")
	  private WebElementFacade descOfProcurementPlanPositionField;
	  @FindBy(xpath=".//tr[td/div/div/table/tbody/tr/td/div/span='Описание позиции плана закупок']/following-sibling::tr[1]/td[1]/div/textarea")
	  private WebElementFacade descOfProcurementPlanPositionTextArea;
	  
	  //Поле Срок осуществления закупки
	  @FindBy(xpath=".//td[div/span='Срок осуществления закупки']/following-sibling::td[1]")
	  private WebElementFacade termOfPurchaseField;
	  @FindBy(xpath=".//td[div/span='Срок осуществления закупки']/following-sibling::td[1]/div/span/input")
	  private WebElementFacade termOfPurchaseInput;

	  //Поле Периодичность осуществления закупки
	  @FindBy(xpath=".//td[div/span='Периодичность осуществления закупки']/following-sibling::td[1]")
	  private WebElementFacade frequencyOfPurchaseField;
	  @FindBy(xpath=".//td[div/span='Периодичность осуществления закупки']/following-sibling::td[1]/div/input")
	  private WebElementFacade frequencyOfPurchaseInput;
	  @FindBy(xpath=".//td[div/span='Периодичность осуществления закупки']/following-sibling::td[2]/div/button")
	  private WebElementFacade frequencyOfPurchaseButton;
	  
	  //Поле Обоснование закупки
	  @FindBy(xpath=".//tr[td/div/div/table/tbody/tr/td/div/span='Обоснование закупки']/following-sibling::tr[1]/td[1]")
	  private WebElementFacade justificationPurchasesField;
	  @FindBy(xpath=".//tr[td/div/div/table/tbody/tr/td/div/span='Обоснование закупки']/following-sibling::tr[1]/td[1]/div/textarea")
	  private WebElementFacade justificationPurchasesTextArea;
	  
	  //Поле Наименование мероприятия государственной программы Российской Федерации
	  @FindBy(xpath=".//tr[td/div[contains(span,'Наименование мероприятия государственной программы Российской Федерации')]]/following-sibling::tr[1]/td[1]")
	  private WebElementFacade nameOfStateProgramField;
	  @FindBy(xpath=".//tr[td/div[contains(span,'Наименование мероприятия государственной программы Российской Федерации')]]/following-sibling::tr[1]/td[1]/div/textarea")
	  private WebElementFacade nameOfStateProgramTextArea;
	  
	  //Кнопка Добавить вложение В блоке "Документы"
	  @FindBy(xpath=".//button[@title='Добавить вложение']")
	  private WebElementFacade addAttachmentButton;
	  
	  
	  /**
	   * Клик по полю Тип закупки
	   */
	  public void clickOnFieldPurchaseType(){
		  waitForLoadJS();
		  purchaseTypeField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Тип закупки
	   */
	  public String getValuePurchaseType(){
		  waitForLoadJS();
		  return purchaseTypeInput.waitUntilClickable().getAttribute("value");
	  }
	  
	  /**
	   * Клик по полю ОКПД
	   */
	  public void clickOnFieldOKPD(){
		  waitForLoadJS();
		  okpdField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля ОКПД
	   */
	  public String getValueOKPD(){
		  waitForLoadJS();
		  return okpdInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Отурыть справочник в поле ОКПД
	   */
	  public void clickOnButtonOkpdOpenDictionary(){
		  waitForLoadJS();
		  okpdOpenDictionaryButton.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по полю Наименование кода товара (работы, услуги) по ОКПД
	   */
	  public void clickOnFieldCodeProductName(){
		  waitForLoadJS();
		  codeProductNameField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование кода товара (работы, услуги) по ОКПД
	   */
	  public String getValueCodeProductName(){
		  waitForLoadJS();
		  return codeProductNameTextArea.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю Наименование объекта закупки
	   */
	  public void clickOnFieldObjectOfTenderName(){
		  waitForLoadJS();
		  objectOfTenderNameField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование объекта закупки
	   */
	  public String getValueObjectOfTenderName(){
		  waitForLoadJS();
		  return objectOfTenderNameInput.waitUntilClickable().getAttribute("value");
	  }
	  
	  /**
	   * Клик по полю Описание позиции плана закупок
	   */
	  public void clickOnFieldDescOfProcurementPlanPosition(){
		  waitForLoadJS();
		  descOfProcurementPlanPositionField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Описание позиции плана закупок
	   */
	  public String getValueDescOfProcurementPlanPosition(){
		  waitForLoadJS();
		  return descOfProcurementPlanPositionTextArea.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Ввести текст в поле Описание позиции плана закупок
	   * @param text
	   */
	  public void setTextDescOfProcurementPlanPosition(String text){
		  waitForLoadJS();
		  descOfProcurementPlanPositionTextArea.waitUntilClickable().sendKeys(text);;
	  }
	  
	  /**
	   * Клик по полю Срок осуществления закупки
	   */
	  public void clickOnFieldTermOfPurchase(){
		  waitForLoadJS();
		  termOfPurchaseField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Срок осуществления закупки
	   */
	  public String getValueTermOfPurchase(){
		  waitForLoadJS();
		  return termOfPurchaseInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Ввести текст в поле Срок осуществления закупки
	   * @param text
	   */
	  public void setTextTermOfPurchase(String text){
		  waitForLoadJS();
		  termOfPurchaseInput.waitUntilClickable().sendKeys(text);;
	  }
	  
	  /**
	   * Клик по полю Периодичность осуществления закупки
	   */
	  public void clickOnFieldFrequencyOfPurchase(){
		  waitForLoadJS();
		  frequencyOfPurchaseField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Периодичность осуществления закупки
	   */
	  public String getValueFrequencyOfPurchase(){
		  waitForLoadJS();
		  return frequencyOfPurchaseInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Ввести текст в поле Периодичность осуществления закупки
	   * @param text
	   */
	  public void setTextFrequencyOfPurchase(String text){
		  waitForLoadJS();
		  frequencyOfPurchaseInput.waitUntilClickable().sendKeys(text);;
	  }
	  /**
	   * Отурыть справочник в поле Периодичность осуществления закупки
	   */
	  public void clickOnButtonFrequencyOfPurchase(){
		  waitForLoadJS();
		  frequencyOfPurchaseButton.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по полю Обоснование закупки
	   */
	  public void clickOnFieldJustificationPurchases(){
		  waitForLoadJS();
		  justificationPurchasesField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Обоснование закупки
	   */
	  public String getValueJustificationPurchases(){
		  waitForLoadJS();
		  return justificationPurchasesTextArea.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Ввести текст в поле Обоснование закупки
	   * @param text
	   */
	  public void setTextJustificationPurchases(String text){
		  waitForLoadJS();
		  justificationPurchasesTextArea.waitUntilClickable().sendKeys(text);;
	  }
	  
	  /**
	   * Клик по полю Наименование мероприятия государственной программы
	   */
	  public void clickOnFieldNameOfStateProgram(){
		  waitForLoadJS();
		  nameOfStateProgramField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование мероприятия государственной программы
	   */
	  public String getValueNameOfStateProgram(){
		  waitForLoadJS();
		  return nameOfStateProgramTextArea.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Ввести текст в поле Наименование мероприятия государственной программы
	   * @param text
	   */
	  public void setTextNameOfStateProgram(String text){
		  waitForLoadJS();
		  nameOfStateProgramTextArea.waitUntilClickable().sendKeys(text);;
	  }
	  
	  /**
	   * Нажать кнопку "Добавить вложение" В блоке "Документы"
	   */
	  public void clickOnButtonAddAttachment(){
		  waitForLoadJS();
		  addAttachmentButton.waitUntilClickable().click();
	  }
}