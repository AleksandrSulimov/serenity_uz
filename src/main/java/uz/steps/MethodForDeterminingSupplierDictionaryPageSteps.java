package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.MethodForDeterminingSupplierDictionaryPage;

/**
 * Справочник Способ определения поставщика
 * @author e.kuzmina 04.05.2016
 *
 */
@SuppressWarnings("serial")
public class MethodForDeterminingSupplierDictionaryPageSteps extends ScenarioSteps {


	public MethodForDeterminingSupplierDictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	MethodForDeterminingSupplierDictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Способ определения поставщика\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Наименование\" в справочнике \"Способ определения поставщика\"")
	public void clickOnFieldName(){
		applet.clickOnFieldName();    	
	}
	@Step("Ввести текст {0} в поле \"Наименование\" в справочнике \"Способ определения поставщика\"")
	public void setTextName(String text){
		applet.setTextName(text);    	
	}
	@Step("Забрать значение из поля \"Наименование\" в справочнике \"Способ определения поставщика\"")
	public String getValueName(){
		return applet.getValueName();    	
	}
	@Step("Нажать кнопку \"Обновить\" в справочнике \"Способ определения поставщика\"")
	public void clickOnButtonRefresh(){
		applet.clickOnButtonRefresh();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Способ определения поставщика\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Способ определения поставщика\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Способ определения поставщика\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Нажать радиокнопку в поле \"Наименование\" в справочнике \"Способ определения поставщика\"")
	public void clickOnRadioButtonName(){
		applet.clickOnRadioButtonName();    	
	}
}