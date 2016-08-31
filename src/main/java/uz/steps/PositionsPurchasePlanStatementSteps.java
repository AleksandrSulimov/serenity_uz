package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPurchasePlanOnStatementPage;

/**
 * Позиции плана закупок на утверждении Steps
 * @author s.serov 27.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPurchasePlanStatementSteps extends ScenarioSteps {


	public PositionsPurchasePlanStatementSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPurchasePlanOnStatementPage applet;

	@Step("Ожидаем загрузку страницы \"Позиции плана закупок на утверждении\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"Позиции плана закупок на утверждении\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
	@Step("Проверяем задан ли \"фильтр\" на странице \"Позиции плана закупок на утверждении\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"Позиции плана закупок на утверждении\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Позиции плана закупок на утверждении\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Позиции плана закупок на утверждении\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер позиции плана закупок\" в фильтре на странице \"Позиции плана закупок на утверждении\"")
    public void cleanPositionPlanPurshedInFilter() {
    	applet.cleanPositionPlanPurshedInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер позиции плана закупок\" в фильтре на странице \"Позиции плана закупок на утверждении\"")
    public void setPositionPlanPurshedInFilter(String string) {
    	applet.setPositionPlanPurshedInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Позиции плана закупок на утверждении\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Состояние\" в первой строке таблицы на странице \"Позиции плана закупок на утверждении\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вкладку \"Позиции плана закупок на утверждении\"")
    public void clickOnLinkClosePPZOnStatement(){
    	applet.clickOnLinkClosePPZOnStatement();  	
    }
    
    @Step("Нажимаем кнопку \"Утвердить\" на странице \"Позиции плана закупок на утверждении\"")
	public void clickOnButtonStatement() {
    	applet.clickOnButtonStatement();	
	}
    
}