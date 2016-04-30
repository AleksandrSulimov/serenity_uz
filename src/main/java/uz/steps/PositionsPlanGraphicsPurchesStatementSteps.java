package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesOnStatementPage;

/**
 * Позиции плана-графика закупок на утверждении Steps
 * @author s.serov 30.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesStatementSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesStatementSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesOnStatementPage applet;

	@Step("Ожидаем загрузку страницы \"Позиции плана-графика закупок на утверждении\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"Позиции плана-графика закупок на утверждении\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
	@Step("Проверяем задан ли \"фильтр\" на странице \"Позиции плана-графика закупок на утверждении\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"Позиции плана-графика закупок на утверждении\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Позиции плана-графика закупок на утверждении\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Позиции плана-графика закупок на утверждении\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер укрупненной закупки\" в фильтре на странице \"Позиции плана-графика закупок на утверждении\"")
    public void cleanPositionPlanGraphicInFilter() {
    	applet.cleanPositionPlanGraphicInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер укрупненной закупки\" в фильтре на странице \"Позиции плана-графика закупок на утверждении\"")
    public void setPositionPlanGraphicInFilter(String string) {
    	applet.setPositionPlanGraphicInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Позиции плана-графика закупок на утверждении\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"Позиции плана-графика закупок на утверждении\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вклвдку \"Позиции плана-графика закупок на утверждении\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();  	
    }
    
    @Step("Нажимаем кнопку \"Утвердить\" на странице \"Позиции плана-графика закупок на утверждении\"")
	public void clickOnButtonStatement() {
    	applet.clickOnButtonStatement();	
	}
    
}