package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.ChoosePpgForIncludeInPGDiictionaryPage;

/**
 * Справочник Выбор ППГ для включения в ПГ
 * @author e.kuzmina 05.05.2016
 *
 */
@SuppressWarnings("serial")
public class ChoosePpgForIncludeInPGDiictionaryPageSteps extends ScenarioSteps {


	public ChoosePpgForIncludeInPGDiictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	ChoosePpgForIncludeInPGDiictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Выбор ППГ для включения в ПГ\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Нажать кнопку \"Обновить\" в справочнике \"Выбор ППГ для включения в ПГ\"")
	public void clickOnButtonRefresh(){
		applet.clickOnButtonRefresh();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Выбор ППГ для включения в ПГ\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Выбор ППГ для включения в ПГ\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Выбор ППГ для включения в ПГ\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Кликнуть чекбокс \"Выделить первую строку\" в справочнике \"Выбор ППГ для включения в ПГ\"")
	public void clickCheckBoxSelectFirstRow(){
		applet.clickCheckBoxSelectFirstRow();    	
	}
}