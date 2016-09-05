package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.OkvedDictionaryPage;

/**
 * Справочник ОКВЭД
 * @author e.kuzmina 04.05.2016
 *
 */
@SuppressWarnings("serial")
public class OkvedDictionaryPageSteps extends ScenarioSteps {


	public OkvedDictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	OkvedDictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"ОКВЭД\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Код\" в справочнике \"ОКВЭД\"")
	public void clickOnFieldCode(){
		applet.clickOnFieldCode();    	
	}
	@Step("Ввести текст {0} в поле \"Код\" в справочнике \"ОКВЭД\"")
	public void setTextCode(String text){
		applet.setTextCode(text);    	
	}
	@Step("Забрать значение из поля \"Код\" в справочнике \"ОКВЭД\"")
	public String getValueCode(){
		return applet.getValueCode();    	
	}
	@Step("Нажать кнопку Enter в справочнике \"ОКВЭД\"")
	public void clickOnEnter(){
		applet.clickOnEnter();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"ОКВЭД\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"ОКВЭД\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"ОКВЭД\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Нажать радиокнопку в поле \"Код\" в справочнике \"ОКВЭД\"")
	public void clickOnRadioButtonCode(){
		applet.clickOnRadioButtonCode();    	
	}
}