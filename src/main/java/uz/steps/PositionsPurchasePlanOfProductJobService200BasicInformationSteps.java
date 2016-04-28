package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPurchasePlanOfProductJobService200BasicInformation;

/**
 * Вкладка Основные сведения 
 * на странице 'Позиция плана закупок товаров, работ, услуг 200' 
 * @author e.kuzmina 26.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPurchasePlanOfProductJobService200BasicInformationSteps extends ScenarioSteps {


	public PositionsPurchasePlanOfProductJobService200BasicInformationSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPurchasePlanOfProductJobService200BasicInformation applet;

	@Step("Ожидаем загрузку вкладки \"Основные сведения\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажать кнопку \"Завершить\" на вкладке \"Основные сведения\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Клик по полю \"Номер позиции плана закупок\" на вкладке \"Основные сведения\"")
	public void clickOnFieldProcurementPlanPositionNumber() {
		applet.clickOnFieldProcurementPlanPositionNumber();
	}
	@Step("Забрать значение из поля \"Номер позиции плана закупок\" на вкладке \"Основные сведения\"")
	public String getValueProcurementPlanPositionNumber(){
		return applet.getValueProcurementPlanPositionNumber();    	
	}
	
	@Step("Клик по полю \"Тип закупки\" на вкладке \"Основные сведения\"")
	public void clickOnFieldPurchaseType() {
		applet.clickOnFieldPurchaseType();
	}
	@Step("Забрать значение из поля \"Тип закупки\" на вкладке \"Основные сведения\"")
	public String getValuePurchaseType(){
		return applet.getValuePurchaseType();    	
	}

	@Step("Клик по полю \"ОКПД\" на вкладке \"Основные сведения\"")
	public void clickOnFieldOKPD() {
		applet.clickOnFieldOKPD();
	}
	@Step("Забрать значение из поля \"ОКПД\" на вкладке \"Основные сведения\"")
	public String getValueOKPD(){
		return applet.getValueOKPD();    	
	}
	@Step("Открыть справочник в поле \"ОКПД\" на вкладке \"Основные сведения\"")
	public void clickOnButtonOkpdOpenDictionary(){
		applet.clickOnButtonOkpdOpenDictionary();    	
	}
	
	@Step("Клик по полю \"Наименование кода товара (работы, услуги) по ОКПД\" на вкладке \"Основные сведения\"")
	public void clickOnFieldCodeProductName() {
		applet.clickOnFieldCodeProductName();
	}
	@Step("Забрать значение из поля \"Наименование кода товара (работы, услуги) по ОКПД\" на вкладке \"Основные сведения\"")
	public String getValueCodeProductName(){
		return applet.getValueCodeProductName();    	
	}

	@Step("Клик по полю \"Наименование объекта закупки\" на вкладке \"Основные сведения\"")
	public void clickOnFieldObjectOfTenderName() {
		applet.clickOnFieldObjectOfTenderName();
	}
	@Step("Забрать значение из поля \"Наименование объекта закупки\" на вкладке \"Основные сведения\"")
	public String getValueObjectOfTenderName(){
		return applet.getValueObjectOfTenderName();    	
	}

	@Step("Клик по полю \"Описание позиции плана закупок\" на вкладке \"Основные сведения\"")
	public void clickOnFieldDescOfProcurementPlanPosition() {
		applet.clickOnFieldDescOfProcurementPlanPosition();
	}
	@Step("Забрать значение из поля \"Описание позиции плана закупок\" на вкладке \"Основные сведения\"")
	public String getValueDescOfProcurementPlanPosition(){
		return applet.getValueDescOfProcurementPlanPosition();    	
	}
	@Step("Ввести текст {0} в поле \"Описание позиции плана закупок\" на вкладке \"Основные сведения\"")
	public void setTextDescOfProcurementPlanPosition(String text) {
		applet.setTextDescOfProcurementPlanPosition(text);
	}
	
	@Step("Клик по полю \"Срок осуществления закупки\" на вкладке \"Основные сведения\"")
	public void clickOnFieldTermOfPurchase() {
		applet.clickOnFieldTermOfPurchase();
	}
	@Step("Забрать значение из поля \"Срок осуществления закупки\" на вкладке \"Основные сведения\"")
	public String getValueTermOfPurchase(){
		return applet.getValueTermOfPurchase();    	
	}
	@Step("Ввести текст {0} в поле \"Срок осуществления закупки\" на вкладке \"Основные сведения\"")
	public void setTextTermOfPurchase(String text) {
		applet.setTextTermOfPurchase(text);
	}

	@Step("Клик по полю \"Периодичность осуществления закупки\" на вкладке \"Основные сведения\"")
	public void clickOnFieldFrequencyOfPurchase() {
		applet.clickOnFieldFrequencyOfPurchase();
	}
	@Step("Забрать значение из поля \"Периодичность осуществления закупки\" на вкладке \"Основные сведения\"")
	public String getValueFrequencyOfPurchase(){
		return applet.getValueFrequencyOfPurchase();    	
	}
	@Step("Ввести текст {0} в поле \"Периодичность осуществления закупки\" на вкладке \"Основные сведения\"")
	public void setTextFrequencyOfPurchase(String text) {
		applet.setTextFrequencyOfPurchase(text);
	}
	@Step("Открыть справочник в поле \"Периодичность осуществления закупки\" на вкладке \"Основные сведения\"")
	public void clickOnButtonFrequencyOfPurchase(){
		applet.clickOnButtonFrequencyOfPurchase();    	
	}
	
	@Step("Клик по полю \"Обоснование закупки\" на вкладке \"Основные сведения\"")
	public void clickOnFieldJustificationPurchases() {
		applet.clickOnFieldJustificationPurchases();
	}
	@Step("Забрать значение из поля \"Обоснование закупки\" на вкладке \"Основные сведения\"")
	public String getValueJustificationPurchases(){
		return applet.getValueJustificationPurchases();    	
	}
	@Step("Ввести текст {0} в поле \"Обоснование закупки\" на вкладке \"Основные сведения\"")
	public void setTextJustificationPurchases(String text) {
		applet.setTextJustificationPurchases(text);
	}
	
	@Step("Клик по полю \"Наименование мероприятия государственной программы\" на вкладке \"Основные сведения\"")
	public void clickOnFieldNameOfStateProgram() {
		applet.clickOnFieldNameOfStateProgram();
	}
	@Step("Забрать значение из поля \"Наименование мероприятия государственной программы\" на вкладке \"Основные сведения\"")
	public String getValueNameOfStateProgram(){
		return applet.getValueNameOfStateProgram();    	
	}
	@Step("Ввести текст {0} в поле \"Наименование мероприятия государственной программы\" на вкладке \"Основные сведения\"")
	public void setTextNameOfStateProgram(String text) {
		applet.setTextNameOfStateProgram(text);
	}
	
	@Step("Нажать кнопку \"Добавить вложение\" в блоке \"Документы\" на вкладке \"Основные сведения\"")
	public void clickOnButtonAddAttachment() {
		applet.clickOnButtonAddAttachment();
	}
	
}