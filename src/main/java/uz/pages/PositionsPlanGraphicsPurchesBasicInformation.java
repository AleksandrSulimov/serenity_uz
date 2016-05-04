package uz.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


/**
 * Вкладка Общие сведения 
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 03.05.2016
 *
 */
public class PositionsPlanGraphicsPurchesBasicInformation extends BasePage {
	
			
	  public PositionsPlanGraphicsPurchesBasicInformation(WebDriver driver) {
		super(driver);
		setField(field);
		setApplet(applet);
		setAppletXpath(appletXpath);
		
	  }
	  
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']")
	  private WebElementFacade applet;
	  private String appletXpath = ".//span[text()='Общая информация о позиции плана-графика закупок']";
	  
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']")
	  private WebElementFacade field;

	  //Кнопка Закрыть
	  @FindBy(xpath=".//span[text()='Позиция плана-графика закупок']/ancestor::table[3]/descendant::button[@title='Закрыть окно']")
	  private WebElementFacade closeButton;
	  
	  //Поле Номер позиции плана закупок
	  @FindBy(xpath=".//td[div/span='Номер позиции плана закупок']/following-sibling::td[1]/div")
	  private WebElementFacade procurementPlanPositionNumberField;
	  @FindBy(xpath=".//td[div/span='Номер позиции плана закупок']/following-sibling::td[1]/div/input")
	  private WebElementFacade procurementPlanPositionNumberInput;

	  //Поле Номер позиции плана графика закупок
	  @FindBy(xpath=".//td[div/span='Номер позиции плана-графика закупок']/following-sibling::td[1]/div")
	  private WebElementFacade positionsPlanGraphicsPurchesNumberField;
	  @FindBy(xpath=".//td[div/span='Номер позиции плана-графика закупок']/following-sibling::td[1]/div/input")
	  private WebElementFacade positionsPlanGraphicsPurchesNumberInput;

	  //Поле Идентификационный код закупки
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Идентификационный код закупки']]/following-sibling::td[1]/div")
	  private WebElementFacade identificationProcurementCodeField;
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Идентификационный код закупки']]/following-sibling::td[1]/div/input")
	  private WebElementFacade identificationProcurementCodeInput;

	  //Поле Статус
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Статус']]/following-sibling::td[1]/div")
	  private WebElementFacade statusField;
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Статус']]/following-sibling::td[1]/div/input")
	  private WebElementFacade statusInput;
	  
	  //Поле Тип закупки позиции плана закупок
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Тип закупки позиции плана закупок']]/following-sibling::td[1]/div")
	  private WebElementFacade typeOfPurchasePositionProcurementPlanField;
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Тип закупки позиции плана закупок']]/following-sibling::td[1]/div/span/input")
	  private WebElementFacade typeOfPurchasePositionProcurementPlanInput;

	  //Поле Дата создания
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Дата создания']]/following-sibling::td[1]/div")
	  private WebElementFacade creationDateField;
	  @FindBy(xpath=".//span[text()='Общая информация о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Дата создания']]/following-sibling::td[1]/div/span/input")
	  private WebElementFacade creationDateInput;

	  //Поле Заказчик
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Заказчик']]/following-sibling::td[1]/div")
	  private WebElementFacade customerField;
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Заказчик']]/following-sibling::td[1]/div/textarea")
	  private WebElementFacade customerTextarea;

	  //Поле ИНН
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='ИНН']]/following-sibling::td[1]/div")
	  private WebElementFacade innField;
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='ИНН']]/following-sibling::td[1]/div/input")
	  private WebElementFacade innInput;

	  //Поле КПП
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='КПП']]/following-sibling::td[1]/div")
	  private WebElementFacade kppField;
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='КПП']]/following-sibling::td[1]/div/input")
	  private WebElementFacade kppInput;

	  //Поле ОГРН
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='ОГРН']]/following-sibling::td[1]/div")
	  private WebElementFacade ogrnField;
	  @FindBy(xpath=".//span[text()='Сведения о федеральном государственном заказчике ']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='ОГРН']]/following-sibling::td[1]/div/input")
	  private WebElementFacade ogrnInput;

	  //Поле Наименование объекта закупки (предмет контракта)
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Наименование объекта закупки (предмет контракта)']]/following-sibling::td[1]/div")
	  private WebElementFacade objectOfTenderNameField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Наименование объекта закупки (предмет контракта)']]/following-sibling::td[1]/div/textarea")
	  private WebElementFacade objectOfTenderNameTextarea;

	  //Поле Код ОКПД 2
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Код ОКПД 2']]/following-sibling::td[1]/div")
	  private WebElementFacade codeOkpdField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Код ОКПД 2']]/following-sibling::td[1]/div/input")
	  private WebElementFacade codeOkpdInput;

	  //Поле Наименование кода товара (работы, услуги) по ОКПД 2
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Наименование кода товара (работы, услуги) по ОКПД 2']]/following-sibling::td[1]/div")
	  private WebElementFacade nameOfProductCodeField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Наименование кода товара (работы, услуги) по ОКПД 2']]/following-sibling::td[1]/div/textarea")
	  private WebElementFacade nameOfProductCodeTextarea;

	  //Поле Способ определения поставщика *
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Способ определения поставщика *']]/following-sibling::td[2]/div")
	  private WebElementFacade methodForDeterminingSupplierField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Способ определения поставщика *']]/following-sibling::td[2]/div/input")
	  private WebElementFacade methodForDeterminingSupplierInput;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Способ определения поставщика *']]/following-sibling::td[2]/div/button")
	  private WebElementFacade methodForDeterminingSupplierButton;

	  //Поле Срок размещения извещения (срок заключения контракта) *
	  //Выберите год
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок размещения извещения (срок заключения контракта) *']]/following-sibling::td[2]/div")
	  private WebElementFacade investmentTermOfNoticeYearField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок размещения извещения (срок заключения контракта) *']]/following-sibling::td[2]/div/span/input")
	  private WebElementFacade investmentTermOfNoticeYearInput;
	  //Поле Срок размещения извещения (срок заключения контракта) *
	  //Выберите месяц
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок размещения извещения (срок заключения контракта) *']]/following-sibling::td[4]/div")
	  private WebElementFacade investmentTermOfNoticeMonthField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок размещения извещения (срок заключения контракта) *']]/following-sibling::td[4]/div/span/input")
	  private WebElementFacade investmentTermOfNoticeMonthInput;

	  //Поле Срок исполнения контракта *
	  //Выберите год
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок исполнения контракта *']]/following-sibling::td[2]/div")
	  private WebElementFacade executionTermOfContractYearField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок исполнения контракта *']]/following-sibling::td[2]/div/span/input")
	  private WebElementFacade executionTermOfContractYearInput;
	  //Поле Срок исполнения контракта *
	  //Выберите месяц
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок исполнения контракта *']]/following-sibling::td[4]/div")
	  private WebElementFacade executionTermOfContractMonthField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Срок исполнения контракта *']]/following-sibling::td[4]/div/span/input")
	  private WebElementFacade executionTermOfContractMonthInput;

	  //Поле Ориентировочная начальная (максимальная) цена контракта*
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Ориентировочная начальная (максимальная) цена контракта*']]/following-sibling::td[1]/div")
	  private WebElementFacade estimatedPriceOfContractField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Ориентировочная начальная (максимальная) цена контракта*']]/following-sibling::td[1]/div/input")
	  private WebElementFacade estimatedPriceOfContractInput;

	  //Поле Размер выплат в текущем году исполнения контракта*
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Размер выплат в текущем году исполнения контракта*']]/following-sibling::td[1]/div")
	  private WebElementFacade sizeOfPaymentsInCurrentYearField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Размер выплат в текущем году исполнения контракта*']]/following-sibling::td[1]/div/input")
	  private WebElementFacade sizeOfPaymentsInCurrentYearInput;

	  //Поле Валюта контракта*
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Валюта контракта*']]/following-sibling::td[1]/div")
	  private WebElementFacade contractCurrencyField;
	  @FindBy(xpath=".//span[text()='Сведения о позиции плана-графика закупок']/ancestor::table[2]/ancestor::div[3]/following-sibling::div[1]/descendant::td[div[span='Валюта контракта*']]/following-sibling::td[1]/div/input")
	  private WebElementFacade contractCurrencyInput;
	  
		
	  /**
	   * Нажать кнопку Завершить
	   */
	  public void clickOnButtonClose(){
		  waitForLoadJS();
		  closeButton.waitUntilClickable().click();
		  closeButton.waitUntilNotVisible();
	  }
	  
	  /**
	   * Клик по полю Номер позиции плана закупок
	   */
	  public void clickOnFieldProcurementPlanPositionNumber(){
		  waitForLoadJS();
		  procurementPlanPositionNumberField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Номер позиции плана закупок
	   */
	  public String getValueProcurementPlanPositionNumber(){
		  waitForLoadJS();
		  return procurementPlanPositionNumberInput.getAttribute("value");
	  }
	  /**
	   * Клик по полю Номер позиции плана графика закупок
	   */
	  public void clickOnFieldPositionsPlanGraphicsPurchesNumber(){
		  waitForLoadJS();
		  positionsPlanGraphicsPurchesNumberField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Номер позиции плана графика закупок
	   */
	  public String getValuePositionsPlanGraphicsPurchesNumber(){
		  waitForLoadJS();
		  return positionsPlanGraphicsPurchesNumberInput.getAttribute("value");
	  }
	  /**
	   * Клик по полю Идентификационный код закупки
	   */
	  public void clickOnFieldIdentificationProcurementCode(){
		  waitForLoadJS();
		  identificationProcurementCodeField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Идентификационный код закупки
	   */
	  public String getValueIdentificationProcurementCode(){
		  waitForLoadJS();
		  return identificationProcurementCodeInput.getAttribute("value");
	  }
	  /**
	   * Клик по полю Статус
	   */
	  public void clickOnFieldStatus(){
		  waitForLoadJS();
		  statusField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Статус
	   */
	  public String getValueStatus(){
		  waitForLoadJS();
		  return statusInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю Тип закупки позиции плана закупок
	   */
	  public void clickOnFieldTypeOfPurchasePositionProcurementPlan(){
		  waitForLoadJS();
		  typeOfPurchasePositionProcurementPlanField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Тип закупки позиции плана закупок
	   */
	  public String getValueTypeOfPurchasePositionProcurementPlan(){
		  waitForLoadJS();
		  return typeOfPurchasePositionProcurementPlanInput.getAttribute("value");
	  }
	  /**
	   * Клик по полю Дата создания
	   */
	  public void clickOnFieldCreationDate(){
		  waitForLoadJS();
		  creationDateField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Дата создания
	   */
	  public String getValueCreationDate(){
		  waitForLoadJS();
		  return creationDateInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю Заказчик
	   */
	  public void clickOnFieldCustomer(){
		  waitForLoadJS();
		  customerField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Заказчик
	   */
	  public String getValueCustomer(){
		  waitForLoadJS();
		  return customerTextarea.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю ИНН
	   */
	  public void clickOnFieldINN(){
		  waitForLoadJS();
		  innField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля ИНН
	   */
	  public String getValueINN(){
		  waitForLoadJS();
		  return innInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю КПП
	   */
	  public void clickOnFieldKPP(){
		  waitForLoadJS();
		  kppField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля КПП
	   */
	  public String getValueKPP(){
		  waitForLoadJS();
		  return kppInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю ОГРН
	   */
	  public void clickOnFieldOGRN(){
		  waitForLoadJS();
		  ogrnField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля ОГРН
	   */
	  public String getValueOGRN(){
		  waitForLoadJS();
		  return ogrnInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю Наименование объекта закупки (предмет контракта)
	   */
	  public void clickOnFieldObjectOfTenderName(){
		  waitForLoadJS();
		  objectOfTenderNameField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Наименование объекта закупки (предмет контракта)
	   */
	  public String getValueObjectOfTenderName(){
		  waitForLoadJS();
		  return objectOfTenderNameTextarea.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю Код ОКПД 2
	   */
	  public void clickOnFieldOKPD(){
		  waitForLoadJS();
		  codeOkpdField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Код ОКПД 2
	   */
	  public String getValueOKPD(){
		  waitForLoadJS();
		  return codeOkpdInput.waitUntilClickable().getAttribute("value");
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
		  return nameOfProductCodeTextarea.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Клик по полю Способ определения поставщика *
	   */
	  public void clickOnFieldMethodForDeterminingSupplier(){
		  waitForLoadJS();
		  methodForDeterminingSupplierField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Способ определения поставщика *
	   */
	  public String getValueMethodForDeterminingSupplier(){
		  waitForLoadJS();
		  return methodForDeterminingSupplierInput.waitUntilClickable().getAttribute("value");
	  }
	  /**
	   * Раскрыть справочник в поле Способ определения поставщика *
	   */
	  public void clickOnButtonMethodForDeterminingSupplier(){
		  waitForLoadJS();
		  methodForDeterminingSupplierButton.waitUntilClickable().click();
	  }
	  /**
	   * Клик по полю Срок размещения извещения (срок заключения контракта) *
	   * Выбрать год
	   */
	  public void clickOnFieldInvestmentTermOfNoticeYear(){
		  waitForLoadJS();
		  investmentTermOfNoticeYearField.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по полю Срок размещения извещения (срок заключения контракта) *
	   * Выбрать месяц
	   */
	  public void clickOnFieldInvestmentTermOfNoticeMonth(){
		  waitForLoadJS();
		  investmentTermOfNoticeMonthField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Срок размещения извещения (срок заключения контракта) *
	   * Выбрать год
	   */
	  public String getValueInvestmentTermOfNoticeYear(){
		  waitForLoadJS();
		  return investmentTermOfNoticeYearInput.getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля Срок размещения извещения (срок заключения контракта) *
	   * Выбрать месяц
	   */
	  public String getValueInvestmentTermOfNoticeMonth(){
		  waitForLoadJS();
		  return investmentTermOfNoticeMonthInput.getAttribute("value");
	  }
	  
	  /**
	   * Клик по полю Срок исполнения контракта *
	   * Выбрать год
	   */
	  public void clickOnFieldExecutionTermOfContractYear(){
		  waitForLoadJS();
		  executionTermOfContractYearField.waitUntilClickable().click();
	  }
	  
	  /**
	   * Клик по полю Срок исполнения контракта *
	   * Выбрать месяц
	   */
	  public void clickOnFieldExecutionTermOfContractMonth(){
		  waitForLoadJS();
		  executionTermOfContractMonthField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Срок исполнения контракта *
	   * Выбрать год
	   */
	  public String getValueExecutionTermOfContractYear(){
		  waitForLoadJS();
		  return executionTermOfContractYearInput.getAttribute("value");
	  }
	  /**
	   * Забрать значение из поля Срок исполнения контракта *
	   * Выбрать месяц
	   */
	  public String getValueExecutionTermOfContractMonth(){
		  waitForLoadJS();
		  return executionTermOfContractMonthInput.getAttribute("value");
	  }
	  
	  /**
	   * Клик по полю Ориентировочная начальная (максимальная) цена контракта
	   */
	  public void clickOnFieldEstimatedPriceOfContract(){
		  waitForLoadJS();
		  estimatedPriceOfContractField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Ориентировочная начальная (максимальная) цена контракта
	   */
	  public String getValueEstimatedPriceOfContract(){
		  waitForLoadJS();
		  return estimatedPriceOfContractInput.getAttribute("value");
	  }
	  /**
	   * Клик по полю Размер выплат в текущем году исполнения контракта*
	   */
	  public void clickOnFieldSizeOfPaymentsInCurrentYear(){
		  waitForLoadJS();
		  sizeOfPaymentsInCurrentYearField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Размер выплат в текущем году исполнения контракта*
	   */
	  public String getValueSizeOfPaymentsInCurrentYear(){
		  waitForLoadJS();
		  return sizeOfPaymentsInCurrentYearInput.getAttribute("value");
	  }
	  /**
	   * Клик по полю Валюта контракта*
	   */
	  public void clickOnFieldContractCurrency(){
		  waitForLoadJS();
		  contractCurrencyField.waitUntilClickable().click();
	  }
	  /**
	   * Забрать значение из поля Валюта контракта*
	   */
	  public String getValueContractCurrency(){
		  waitForLoadJS();
		  return contractCurrencyInput.getAttribute("value");
	  }
}