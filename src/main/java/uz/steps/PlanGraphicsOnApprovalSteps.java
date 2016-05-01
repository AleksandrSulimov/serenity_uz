package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanGraphicsOnApprovalPage;

/**
 * План-график на согласовании Steps
 * @author s.serov 01.05.2016
 *
 */
@SuppressWarnings("serial")
public class PlanGraphicsOnApprovalSteps extends ScenarioSteps {


	public PlanGraphicsOnApprovalSteps(Pages pages) {
        super(pages);
    }
	
	PlanGraphicsOnApprovalPage applet;

	@Step("Ожидаем загрузку страницы \"Планы-графики на согласовании\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"Планы-графики на согласовании\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
		
	@Step("Проверяем задан ли \"фильтр\" на странице \"Планы-графики на согласовании\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"Планы-графики на согласовании\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
	
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Планы-графики на согласовании\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Планы-графики на согласовании\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер плана-графика\" в фильтре на странице \"Планы-графики на согласовании\"")
    public void cleanPlanGraphicsInFilter() {
    	applet.cleanPlanGraphicsInFilter(); 	
    }
    
    @Step("Вводим текст {0} в поле \"Номер плана-графика\" в фильтре на странице \"Планы-графики на согласовании\"")
    public void setPlanGraphicsInFilter(String string) {
    	applet.setPlanGraphicsInFilter(string);	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Планы-графики на согласовании\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"Планы-графики на согласовании\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вклвдку \"Планы-графики на согласовании\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();  	
    }
    
    @Step("Нажимаем кнопку \"Согласовать закупку\" на странице \"Планы-графики на согласовании\"")
	public void clickOnButtonApproval() {
    	applet.clickOnButtonApproval();  	
	}
    
}