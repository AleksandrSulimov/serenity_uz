package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.AdditionalAnalyticalSignDictionaryPage;

/**
 * Справочник Дополнительный аналитический признак
 * @author e.kuzmina 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class AdditionalAnalyticalSignDictionaryPageSteps extends ScenarioSteps {


	public AdditionalAnalyticalSignDictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	AdditionalAnalyticalSignDictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Дополнительный аналитический признак\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Дополнительный аналитический признак\" в справочнике \"Дополнительный аналитический признак\"")
	public void clickOnFieldAdditionalAnalyticalSign(){
		applet.clickOnFieldAdditionalAnalyticalSign();    	
	}
	@Step("Ввести текст {0} в поле \"Дополнительный аналитический признак\" в справочнике \"Дополнительный аналитический признак\"")
	public void setTextAdditionalAnalyticalSign(String text){
		applet.setTextAdditionalAnalyticalSign(text);    	
	}
	@Step("Забрать значение из поля \"Дополнительный аналитический признак\" в справочнике \"Дополнительный аналитический признак\"")
	public String getValueAdditionalAnalyticalSign(){
		return applet.getValueAdditionalAnalyticalSign();    	
	}
	@Step("Нажать кнопку \"Обновить\" в справочнике \"Дополнительный аналитический признак\"")
	public void clickOnButtonRefresh(){
		applet.clickOnButtonRefresh();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Дополнительный аналитический признак\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Дополнительный аналитический признак\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Дополнительный аналитический признак\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Нажать радиокнопку в поле \"Дополнительный аналитический признак\" в справочнике \"Дополнительный аналитический признак\"")
	public void clickOnRadioButtonAdditionalAnalyticalSign(){
		applet.clickOnRadioButtonAdditionalAnalyticalSign();    	
	}
}