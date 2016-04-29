package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.ChoosePpzForIncludeInPZDiictionaryPage;

/**
 * Справочник Выбор ППЗ для включения в ПЗ
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class ChoosePpzForIncludeInPZDiictionaryPageSteps extends ScenarioSteps {


	public ChoosePpzForIncludeInPZDiictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	ChoosePpzForIncludeInPZDiictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Выбор ППЗ для включения в ПЗ\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Номер позиции плана закупок\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void clickOnFieldProcurementPlanPositionNumber(){
		applet.clickOnFieldProcurementPlanPositionNumber();    	
	}
	@Step("Ввести текст {0} в поле \"Номер позиции плана закупок\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void setTextProcurementPlanPositionNumber(String text){
		applet.setTextProcurementPlanPositionNumber(text);    	
	}
	@Step("Забрать значение из поля \"Номер позиции плана закупок\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public String getValueProcurementPlanPositionNumber(){
		return applet.getValueProcurementPlanPositionNumber();    	
	}
	@Step("Нажать кнопку \"Обновить\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void clickOnButtonRefresh(){
		applet.clickOnButtonRefresh();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Клик в поле \"Номер позиции плана закупок\" со значением {0} в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void clickOnFieldProcurementPlanPositionNumber(String text){
		applet.clickOnFieldProcurementPlanPositionNumber(text);    	
	}
	@Step("Кликнуть чекбокс \"Выделить первую строку\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void clickCheckBoxSelectFirstRow(){
		applet.clickCheckBoxSelectFirstRow();    	
	}
	@Step("Кликнуть чекбокс \"Выделить все строки\" в справочнике \"Выбор ППЗ для включения в ПЗ\"")
	public void clickCheckBoxSelectAll(){
		applet.clickCheckBoxSelectAll();    	
	}
}