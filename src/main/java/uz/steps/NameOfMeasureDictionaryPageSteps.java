package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.NameOfMeasureDictionaryPage;

/**
 * Справочник Наименование единицы измерения
 * @author e.kuzmina 04.05.2016
 *
 */
@SuppressWarnings("serial")
public class NameOfMeasureDictionaryPageSteps extends ScenarioSteps {


	public NameOfMeasureDictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	NameOfMeasureDictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Наименование единицы измерения\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Наименование\" в справочнике \"Наименование единицы измерения\"")
	public void clickOnFieldName(){
		applet.clickOnFieldName();    	
	}
	@Step("Ввести текст {0} в поле \"Наименование\" в справочнике \"Наименование единицы измерения\"")
	public void setTextName(String text){
		applet.setTextName(text);    	
	}
	@Step("Забрать значение из поля \"Наименование\" в справочнике \"Наименование единицы измерения\"")
	public String getValueName(){
		return applet.getValueName();    	
	}
	@Step("Нажать кнопку \"Обновить\" в справочнике \"Наименование единицы измерения\"")
	public void clickOnButtonRefresh(){
		applet.clickOnButtonRefresh();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Наименование единицы измерения\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Наименование единицы измерения\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Наименование единицы измерения\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Нажать радиокнопку в поле \"Наименование\" в справочнике \"Наименование единицы измерения\"")
	public void clickOnRadioButtonName(){
		applet.clickOnRadioButtonName();    	
	}
}