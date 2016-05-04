package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesSpecificationTruEditingRecord;

/**
 * Редактирование записи
 * Вкладка Спецификация ТРУ
 * на странице 'Позиция плана-графика закупок' 
 * @author e.kuzmina 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesSpecificationTruEditingRecordSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesSpecificationTruEditingRecord applet;

	@Step("Ожидаем загрузку окна \"Редактирование записи\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Нажать кнопку \"Завершить\" в окне \"Редактирование записи\"")
	public void clickOnButtonClose() {
		applet.clickOnButtonClose();
	}
	
	@Step("Клик по полю \"Код ОКПД2\" в окне \"Редактирование записи\"")
	public void clickOnFieldCodeOKPD2() {
		applet.clickOnFieldCodeOKPD2();
	}
	@Step("Забрать значение из поля \"Код ОКПД2\" в окне \"Редактирование записи\"")
	public String getValueCodeOKPD2(){
		return applet.getValueCodeOKPD2();    	
	}
	
	@Step("Клик по полю \"Наименование кода товара (работы, услуги) по ОКПД 2\" в окне \"Редактирование записи\"")
	public void clickOnFieldNameOfProductCode() {
		applet.clickOnFieldNameOfProductCode();
	}
	@Step("Забрать значение из поля \"Наименование кода товара (работы, услуги) по ОКПД 2\" в окне \"Редактирование записи\"")
	public String getValueNameOfProductCode(){
		return applet.getValueNameOfProductCode();    	
	}
	@Step("Нажать кнопку \"OK\" на вкладке \"Спецификация ТРУ\"")
	public void clickOnButtonOK() {
		applet.clickOnButtonOK();
	}

	@Step("Клик по полю \"Код ОКВЭД2*\" в окне \"Редактирование записи\"")
	public void clickOnFieldCodeOKVED2() {
		applet.clickOnFieldCodeOKVED2();
	}
	@Step("Забрать значение из поля \"Код ОКВЭД2\" в окне \"Редактирование записи\"")
	public String getValueCodeOKVED2(){
		return applet.getValueCodeOKVED2();    	
	}
	@Step("Открыть справочник в поле \"Код ОКВЭД2*\" в окне \"Редактирование записи\"")
	public void clickOnButtonCodeOKVED2() {
		applet.clickOnButtonCodeOKVED2();
	}
	
	@Step("Клик по полю \"Наименование кода вида экономической деятельности по ОКВЭД 2\" в окне \"Редактирование записи\"")
	public void clickOnFieldCodeEconomicActivityOKVED2() {
		applet.clickOnFieldCodeEconomicActivityOKVED2();
	}
	@Step("Забрать значение из поля \"Наименование кода вида экономической деятельности по ОКВЭД 2\" в окне \"Редактирование записи\"")
	public String getValueCodeEconomicActivityOKVED2(){
		return applet.getValueCodeEconomicActivityOKVED2();    	
	}
	@Step("Клик по полю \"Наименование товара работы или услуги*\" в окне \"Редактирование записи\"")
	public void clickOnFieldNameOfProductJobService() {
		applet.clickOnFieldNameOfProductJobService();
	}
	@Step("Забрать значение из поля \"Наименование товара работы или услуги*\" в окне \"Редактирование записи\"")
	public String getValueNameOfProductJobService(){
		return applet.getValueNameOfProductJobService();    	
	}
	@Step("Ввести текст {0} в поле \"Наименование товара работы или услуги*\" в окне \"Редактирование записи\"")
	public void setTextMinimumNecessaryRequirements(String text) {
		applet.setTextMinimumNecessaryRequirements(text);
	}

	@Step("Клик по полю \"Наименование единицы измерения*\" в окне \"Редактирование записи\"")
	public void clickOnFieldNameOfMeasure() {
		applet.clickOnFieldNameOfMeasure();
	}
	@Step("Забрать значение из поля \"Наименование единицы измерения*\" в окне \"Редактирование записи\"")
	public String getValueNameOfMeasure(){
		return applet.getValueNameOfMeasure();    	
	}
	@Step("Открыть справочник в поле \"Наименование единицы измерения*\" в окне \"Редактирование записи\"")
	public void clickOnButtonNameOfMeasure() {
		applet.clickOnButtonNameOfMeasure();
	}

	@Step("Клик по полю \"Количество (объем)*\" в окне \"Редактирование записи\"")
	public void clickOnFieldAmount() {
		applet.clickOnFieldAmount();
	}
	@Step("Забрать значение из поля \"Количество (объем)*\" в окне \"Редактирование записи\"")
	public String getValueAmount(){
		return applet.getValueAmount();    	
	}
	@Step("Ввести текст {0} в поле \"Количество (объем)*\" в окне \"Редактирование записи\"")
	public void setTextAmount(String text) {
		applet.setTextAmount(text);
	}
}