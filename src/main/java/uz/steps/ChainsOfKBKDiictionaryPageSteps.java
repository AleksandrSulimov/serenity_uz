package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.ChainsOfKBKDiictionaryPage;

/**
 * Справочник Цепочки КБК 
 * @author e.kuzmina 27.04.2016
 *
 */
@SuppressWarnings("serial")
public class ChainsOfKBKDiictionaryPageSteps extends ScenarioSteps {


	public ChainsOfKBKDiictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	ChainsOfKBKDiictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Цепочки КБК\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик в поле \"Цепочка КБК\" в справочнике \"Цепочки КБК\"")
	public void clickOnFieldChainsOfKBK(){
		applet.clickOnFieldChainsOfKBK();    	
	}
	@Step("Ввести текст {0} в поле \"Цепочка КБК\" в справочнике \"Цепочки КБК\"")
	public void setTextChainsOfKBK(String text){
		applet.setTextChainsOfKBK(text);    	
	}
	@Step("Забрать значение из поля \"Цепочка КБК\" в справочнике \"Цепочки КБК\"")
	public String getValueChainsOfKBK(){
		return applet.getValueChainsOfKBK();    	
	}
	@Step("Нажать кнопку \"Обновить\" в справочнике \"Цепочки КБК\"")
	public void clickOnButtonRefresh(){
		applet.clickOnButtonRefresh();    	
	}
	@Step("Нажать кнопку \"OK\" в справочнике \"Цепочки КБК\"")
	public void clickOnButtonOK(){
		applet.clickOnButtonOK();    	
	}
	@Step("Проверить нажата ли кнопка \"Видимость фильтров\" в справочнике \"Цепочки КБК\"")
	public boolean checkFilterOn(){
		return applet.checkFilterOn();    	
	}
	@Step("Нажать кнопку \"Видимость фильтров\" в справочнике \"Цепочки КБК\"")
	public void clickFilter(){
		applet.clickFilter();    	
	}
	@Step("Клик в поле \"Цепочка КБК\" со значением {0} в справочнике \"Цепочки КБК\"")
	public void clickOnFieldChainsOfKBK(String text){
		applet.clickOnFieldChainsOfKBK(text);    	
	}
}