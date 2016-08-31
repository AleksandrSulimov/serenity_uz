package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPurchasePlanOnApprovalPage;

/**
 * Позиции плана закупок на согласовании
 * @author s.serov 27.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPurchasePlanApprovalSteps extends ScenarioSteps {


	public PositionsPurchasePlanApprovalSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPurchasePlanOnApprovalPage applet;

	@Step("Ожидаем загрузку страницы \"Позиции плана закупок на согласовании\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"Позиции плана закупок на согласовании\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
		
	@Step("Проверяем задан ли \"фильтр\" на странице \"Позиции плана закупок на согласовании\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"Позиции плана закупок на согласовании\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
	
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Позиции плана закупок на согласовании\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Позиции плана закупок на согласовании\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер позиции плана закупок\" в фильтре на странице \"Позиции плана закупок на согласовании\"")
    public void cleanPositionPlanPurshedInFilter() {
    	applet.cleanPositionPlanPurshedInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер позиции плана закупок\" в фильтре на странице \"Позиции плана закупок на согласовании\"")
    public void setPositionPlanPurshedInFilter(String string) {
    	applet.setPositionPlanPurshedInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Позиции плана закупок на согласовании\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Состояние\" в первой строке таблицы на странице \"Позиции плана закупок на согласовании\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вкладку \"Позиции плана закупок на согласовании\"")
    public void clickOnLinkClosePPZOnApproval(){
    	applet.clickOnLinkClosePPZOnApproval();  	
    }
    
    @Step("Нажимаем кнопку \"Согласовать закупку\" на странице \"Позиции плана закупок на согласовании\"")
	public void clickOnButtonApproval() {
    	applet.clickOnButtonApproval();  	
	}
    
}