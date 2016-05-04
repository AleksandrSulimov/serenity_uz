package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesBasicInformation;

/**
 * Вкладка Общие сведения 
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesBasicInformationSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesBasicInformationSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesBasicInformation applet;

	@Step("Ожидаем загрузку вкладки \"Общие сведения\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Общие сведения\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Клик по полю \"Номер позиции плана закупок\" на вкладке \"Общие сведения\"")
	public void clickOnFieldProcurementPlanPositionNumber() {
		applet.clickOnFieldProcurementPlanPositionNumber();
	}
	@Step("Забрать значение из поля \"Номер позиции плана закупок\" на вкладке \"Общие сведения\"")
	public String getValueProcurementPlanPositionNumber(){
		return applet.getValueProcurementPlanPositionNumber();    	
	}

	@Step("Клик по полю \"Номер позиции плана графика закупок\" на вкладке \"Общие сведения\"")
	public void clickOnFieldPositionsPlanGraphicsPurchesNumber() {
		applet.clickOnFieldPositionsPlanGraphicsPurchesNumber();
	}
	@Step("Забрать значение из поля \"Номер позиции плана графика закупок\" на вкладке \"Общие сведения\"")
	public String getValuePositionsPlanGraphicsPurchesNumber(){
		return applet.getValuePositionsPlanGraphicsPurchesNumber();    	
	}
	
	@Step("Клик по полю \"Идентификационный код закупки\" на вкладке \"Общие сведения\"")
	public void clickOnFieldIdentificationProcurementCode() {
		applet.clickOnFieldIdentificationProcurementCode();
	}
	@Step("Забрать значение из поля \"Идентификационный код закупки\" на вкладке \"Общие сведения\"")
	public String getValueIdentificationProcurementCode(){
		return applet.getValueIdentificationProcurementCode();    	
	}

	@Step("Клик по полю \"Статус\" на вкладке \"Общие сведения\"")
	public void clickOnFieldStatus() {
		applet.clickOnFieldStatus();
	}
	@Step("Забрать значение из поля \"Статус\" на вкладке \"Общие сведения\"")
	public String getValueStatus(){
		return applet.getValueStatus();    	
	}
	
	@Step("Клик по полю \"Тип закупки позиции плана закупок\" на вкладке \"Общие сведения\"")
	public void clickOnFieldTypeOfPurchasePositionProcurementPlan() {
		applet.clickOnFieldTypeOfPurchasePositionProcurementPlan();
	}
	@Step("Забрать значение из поля \"Тип закупки позиции плана закупок\" на вкладке \"Общие сведения\"")
	public String getValueTypeOfPurchasePositionProcurementPlan(){
		return applet.getValueTypeOfPurchasePositionProcurementPlan();    	
	}

	@Step("Клик по полю \"Дата создания\" на вкладке \"Общие сведения\"")
	public void clickOnFieldCreationDate() {
		applet.clickOnFieldCreationDate();
	}
	@Step("Забрать значение из поля \"Дата создания\" на вкладке \"Общие сведения\"")
	public String getValueCreationDate(){
		return applet.getValueCreationDate();    	
	}

	@Step("Клик по полю \"Заказчик\" на вкладке \"Общие сведения\"")
	public void clickOnFieldCustomer() {
		applet.clickOnFieldCustomer();
	}
	@Step("Забрать значение из поля \"Заказчик\" на вкладке \"Общие сведения\"")
	public String getValueCustomer(){
		return applet.getValueCustomer();    	
	}

	@Step("Клик по полю \"ИНН\" на вкладке \"Общие сведения\"")
	public void clickOnFieldINN() {
		applet.clickOnFieldINN();
	}
	@Step("Забрать значение из поля \"ИНН\" на вкладке \"Общие сведения\"")
	public String getValueINN(){
		return applet.getValueINN();    	
	}

	@Step("Клик по полю \"КПП\" на вкладке \"Общие сведения\"")
	public void clickOnFieldKPP() {
		applet.clickOnFieldKPP();
	}
	@Step("Забрать значение из поля \"КПП\" на вкладке \"Общие сведения\"")
	public String getValueKPP(){
		return applet.getValueKPP();    	
	}
	@Step("Клик по полю \"ОГРН\" на вкладке \"Общие сведения\"")
	public void clickOnFieldOGRN() {
		applet.clickOnFieldOGRN();
	}
	@Step("Забрать значение из поля \"ОГРН\" на вкладке \"Общие сведения\"")
	public String getValueOGRN(){
		return applet.getValueOGRN();    	
	}
	@Step("Клик по полю \"Наименование объекта закупки (предмет контракта)\" на вкладке \"Общие сведения\"")
	public void clickOnFieldObjectOfTenderName() {
		applet.clickOnFieldObjectOfTenderName();
	}
	@Step("Забрать значение из поля \"Наименование объекта закупки (предмет контракта)\" на вкладке \"Общие сведения\"")
	public String getValueObjectOfTenderName(){
		return applet.getValueObjectOfTenderName();    	
	}
	@Step("Клик по полю \"Код ОКПД 2\" на вкладке \"Общие сведения\"")
	public void clickOnFieldOKPD() {
		applet.clickOnFieldOKPD();
	}
	@Step("Забрать значение из поля \"Код ОКПД 2\" на вкладке \"Общие сведения\"")
	public String getValueOKPD(){
		return applet.getValueOKPD();    	
	}
	@Step("Клик по полю \"Наименование кода товара (работы, услуги) по ОКПД 2\" на вкладке \"Общие сведения\"")
	public void clickOnFieldNameOfProductCode() {
		applet.clickOnFieldNameOfProductCode();
	}
	@Step("Забрать значение из поля \"Наименование кода товара (работы, услуги) по ОКПД 2\" на вкладке \"Общие сведения\"")
	public String getValueNameOfProductCode(){
		return applet.getValueNameOfProductCode();    	
	}
	@Step("Клик по полю \"Способ определения поставщика *\" на вкладке \"Общие сведения\"")
	public void clickOnFieldMethodForDeterminingSupplier() {
		applet.clickOnFieldMethodForDeterminingSupplier();
	}
	@Step("Забрать значение из поля \"Способ определения поставщика *\" на вкладке \"Общие сведения\"")
	public String getValueMethodForDeterminingSupplier(){
		return applet.getValueMethodForDeterminingSupplier();    	
	}
	@Step("Раскрыть справочник в поле \"Способ определения поставщика *\" на вкладке \"Общие сведения\"")
	public void clickOnButtonMethodForDeterminingSupplier() {
		applet.clickOnButtonMethodForDeterminingSupplier();
	}
	@Step("Клик по полю \"Срок размещения извещения (срок заключения контракта) * - Выбрать год\" на вкладке \"Общие сведения\"")
	public void clickOnFieldInvestmentTermOfNoticeYear() {
		applet.clickOnFieldInvestmentTermOfNoticeYear();
	}
	@Step("Забрать значение из поля \"Срок размещения извещения (срок заключения контракта) * - Выбрать год\"")
	public String getValueInvestmentTermOfNoticeYear(){
		return applet.getValueInvestmentTermOfNoticeYear();    	
	}
	@Step("Клик по полю \"Срок размещения извещения (срок заключения контракта) * - Выбрать месяц\" на вкладке \"Общие сведения\"")
	public void clickOnFieldInvestmentTermOfNoticeMonth() {
		applet.clickOnFieldInvestmentTermOfNoticeMonth();
	}
	@Step("Забрать значение из поля \"Срок размещения извещения (срок заключения контракта) * - Выбрать месяц\"")
	public String getValueInvestmentTermOfNoticeMonth(){
		return applet.getValueInvestmentTermOfNoticeMonth();    	
	}
	
	@Step("Клик по полю \"Срок исполнения контракта * - Выбрать год\" на вкладке \"Общие сведения\"")
	public void clickOnFieldExecutionTermOfContractYear() {
		applet.clickOnFieldExecutionTermOfContractYear();
	}
	@Step("Забрать значение из поля \"Срок исполнения контракта * - Выбрать год\"")
	public String getValueExecutionTermOfContractYear(){
		return applet.getValueExecutionTermOfContractYear();    	
	}
	@Step("Клик по полю \"Срок исполнения контракта * - Выбрать месяц\" на вкладке \"Общие сведения\"")
	public void clickOnFieldExecutionTermOfContractMonth() {
		applet.clickOnFieldExecutionTermOfContractMonth();
	}
	@Step("Забрать значение из поля \"Срок исполнения контракта * - Выбрать месяц\"")
	public String getValueExecutionTermOfContractMonth(){
		return applet.getValueExecutionTermOfContractMonth();    	
	}
	
	@Step("Клик по полю \"Ориентировочная начальная (максимальная) цена контракта\" на вкладке \"Общие сведения\"")
	public void clickOnFieldEstimatedPriceOfContract() {
		applet.clickOnFieldEstimatedPriceOfContract();
	}
	@Step("Забрать значение из поля \"Ориентировочная начальная (максимальная) цена контракта\" на вкладке \"Общие сведения\"")
	public String getValueEstimatedPriceOfContract(){
		return applet.getValueEstimatedPriceOfContract();    	
	}

	@Step("Клик по полю \"Размер выплат в текущем году исполнения контракта*\" на вкладке \"Общие сведения\"")
	public void clickOnFieldSizeOfPaymentsInCurrentYear() {
		applet.clickOnFieldSizeOfPaymentsInCurrentYear();
	}
	@Step("Забрать значение из поля \"Размер выплат в текущем году исполнения контракта*\" на вкладке \"Общие сведения\"")
	public String getValueSizeOfPaymentsInCurrentYear(){
		return applet.getValueSizeOfPaymentsInCurrentYear();    	
	}

	@Step("Клик по полю \"Валюта контракта*\" на вкладке \"Общие сведения\"")
	public void clickOnFieldContractCurrency() {
		applet.clickOnFieldContractCurrency();
	}
	@Step("Забрать значение из поля \"Валюта контракта*\" на вкладке \"Общие сведения\"")
	public String getValueContractCurrency(){
		return applet.getValueContractCurrency();    	
	}
}