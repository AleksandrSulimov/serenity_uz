package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.OKPD2DictionaryPage;

/**
 * Справочник ОКПД 2
 * @author e.kuzmina 26.04.2016
 *
 */
@SuppressWarnings("serial")
public class OKPD2DictionaryPageSteps extends ScenarioSteps {


	public OKPD2DictionaryPageSteps(Pages pages) {
        super(pages);
    }
	
	OKPD2DictionaryPage applet;

	@Step("Ожидаем загрузку справочника \"Справочник ОКПД 2\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	 
	@Step("Клик по элементу первого уровня со значением \"{0}\" в справочнике \"Справочник ОКПД 2\"")
	public void clickOnElementFirstLevel(String value){
		applet.clickOnElementFirstLevel(value);    	
	}
	@Step("Клик по элементу второго и ниже уровня со значением \"{0}\" в справочнике \"Справочник ОКПД 2\"")
	public void clickOnElementSecondLevel(String value){
		applet.clickOnElementSecondLevel(value);    	
	}
	@Step("Клик по элементу в списке справа со значением \"{0}\" в справочнике \"Справочник ОКПД 2\"")
	public void clickOnElementList(String value){
		applet.clickOnElementList(value);    	
	}
	@Step("Проверить существование элемента со значением \"{0}\" в справочнике \"Справочник ОКПД 2\"")
	public void checkElementTreeExists(String value){
		applet.checkElementTreeExists(value);    	
	}
	@Step("Проверить существование элемента в списке справа со значением \"{0}\" в справочнике \"Справочник ОКПД 2\"")
	public void checkElementListExists(String value){
		applet.checkElementListExists(value);    	
	}
	 /**
	   * Раскрыть список первого уровня в справочнике
	   * @param value
	   */
	public void openListFirstLevel(String value){
		applet.checkElementTreeExists(value);
		applet.clickOnElementFirstLevel(value);  
		applet.openListFirstLevel(value);    	
	}
	 /**
	   * Раскрыть список второго уровня в справочнике
	   * @param value
	   */
	public void openListSecondLevel(String value){
		applet.checkElementTreeExists(value);
		applet.clickOnElementSecondLevel(value);  
		applet.openListSecondLevel(value);    	
	}
	/**
	   * Клик по элементу в списке справа
	   * @param value
	   */
	public void clickElementList(String value){
		applet.checkElementListExists(value);
		applet.clickOnElementList(value);  
	}
    
}