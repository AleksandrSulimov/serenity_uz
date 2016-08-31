package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsOnStatementPage;

/**
 * Планы-графики на утверждении Steps
 * @author s.serov 02.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsStatementSteps extends ScenarioSteps {


	public PlanGraphicsStatementSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsOnStatementPage applet;

	@Step("Ожидаем загрузку страницы \"Планы-графики на утверждении\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"Планы-графики на утверждении\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
	@Step("Проверяем задан ли \"фильтр\" на странице \"Планы-графики на утверждении\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"Планы-графики на утверждении\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Планы-графики на утверждении\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Планы-графики на утверждении\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер плана-графика\" в фильтре на странице \"Планы-графики на утверждении\"")
    public void cleanPlanGraphicsInFilter() {
    	applet.cleanPlanGraphicsInFilter();	
    }
    
    @Step("Вводим текст {0} в поле \"Номер плана-графика\" в фильтре на странице \"Планы-графики на утверждении\"")
    public void setPlanGraphicsInFilter(String string) {
    	applet.setPlanGraphicsInFilter(string);  	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Планы-графики на утверждении\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"Планы-графики на утверждении\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вкладку \"Планы-графики на утверждении\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();  	
    }
    
    @Step("Нажимаем кнопку \"Утвердить\" на странице \"Планы-графики на утверждении\"")
	public void clickOnButtonStatement() {
    	applet.clickOnButtonStatement();	
	}
    
}