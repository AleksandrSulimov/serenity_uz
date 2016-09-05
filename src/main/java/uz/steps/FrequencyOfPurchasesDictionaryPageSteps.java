package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.FrequencyOfPurchasesDictionaryPage;

/**
 * Справочник Периодичность осуществления закупки
 * @author e.kuzmina 27.04.2016
 *
 */
@SuppressWarnings("serial")
public class FrequencyOfPurchasesDictionaryPageSteps extends ScenarioSteps {


	public FrequencyOfPurchasesDictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	FrequencyOfPurchasesDictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Периодичность осуществления закупки\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Периодичность\" в справочнике \"Периодичность осуществления закупки\"")
	public void clickOnFieldFrequency(){
		applet.clickOnFieldFrequency();    	
	}
	@Step("Ввести текст {0} в поле \"Периодичность\" в справочнике \"Периодичность осуществления закупки\"")
	public void setTextFrequency(String text){
		applet.setTextFrequency(text);    	
	}
	@Step("Забрать значение из поля \"Периодичность\" в справочнике \"Периодичность осуществления закупки\"")
	public String getValueFrequency(){
		return applet.getValueFrequency();    	
	}
	@Step("Нажать кнопку Enter в справочнике \"Периодичность осуществления закупки\"")
	public void clickOnEnter(){
		applet.clickOnEnter();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Периодичность осуществления закупки\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Периодичность осуществления закупки\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Периодичность осуществления закупки\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Нажать радиокнопку в поле \"Периодичность\" в справочнике \"Периодичность осуществления закупки\"")
	public void clickOnRadioButtonFrequency(){
		applet.clickOnRadioButtonFrequency();    	
	}
}