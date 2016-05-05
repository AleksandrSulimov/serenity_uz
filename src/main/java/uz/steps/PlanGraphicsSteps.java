package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsPage;

/**
 * План-график Steps
 * @author s.serov 01.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsSteps extends ScenarioSteps {


	public PlanGraphicsSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsPage applet;

	@Step("Ожидаем загрузку страницы \"План-график\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Нажимаем кнопку \"Создать план-график\" на странице \"План-график\"")
	public void clickOnButtonCreteNewDocument(){
		applet.clickOnButtonCreteNewDocument();    	
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"План-график\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
	
	@Step("Проверяем задан ли \"фильтр\" на странице \"План-график\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"План-график\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
	
	@Step("Нажимаем кнопку \"Отправить на согласование\" на странице \"План-график\"")
	public void clickOnButtonSendToMatching(){
		applet.clickOnButtonSendToMatching();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"План-график\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"План-график\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер плана-графика\" в фильтре на странице \"План-график\"")
    public void cleanPlanGraphicsInFilter() {
    	applet.cleanPlanGraphicsInFilter();
    }
    
    @Step("Вводим текст {0} в поле \"Номер плана-графика\" в фильтре на странице \"План-график\"")
    public void setPlanGraphicsInFilter(String string) {
    	applet.setPlanGraphicsInFilter(string);
    }

    @Step("Возвращаем текст из поля \"Номер плана-графика\" в первой строке таблицы на странице \"План-график\"")
    public String  getTextNumberPlanGraphics(){
    	return applet.getTextNumberPlanGraphics();    	
    }
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"План-график\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"План-график\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вкладку \"План-график\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();    	
    }
    
    @Step("Проверить существование строки со значением {0} в поле \"Номер плана-графика\" на странице \"План-график\"")
    public boolean checkNumberPlanGraphicsEists(String text){
    	return applet.checkNumberPlanGraphicsEists(text);
    }
    
}