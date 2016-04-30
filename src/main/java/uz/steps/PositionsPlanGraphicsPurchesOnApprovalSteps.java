package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PositionsPlanGraphicsPurchesOnApprovalPage;

/**
 * Позиции плана-графика закупок на согласовании Steps
 * @author s.serov 30.04.2016
 *
 */
@SuppressWarnings("serial")
public class PositionsPlanGraphicsPurchesOnApprovalSteps extends ScenarioSteps {


	public PositionsPlanGraphicsPurchesOnApprovalSteps(Pages pages) {
        super(pages);
    }
	
	PositionsPlanGraphicsPurchesOnApprovalPage applet;

	@Step("Ожидаем загрузку страницы \"Позиции плана-графика закупок на согласовании\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"Позиции плана-графика закупок на согласовании\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
		
	@Step("Проверяем задан ли \"фильтр\" на странице \"Позиции плана-графика закупок на согласовании\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"Позиции плана-графика закупок на согласовании\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
	
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"Позиции плана-графика закупок на согласовании\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"Позиции плана-графика закупок на согласовании\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер укрупненной закупки\" в фильтре на странице \"Позиции плана-графика закупок на согласовании\"")
    public void cleanPositionPlanGraphicInFilter() {
    	applet.cleanPositionPlanGraphicInFilter(); 	
    }
    
    @Step("Вводим текст {0} в поле \"Номер укрупненной закупки\" в фильтре на странице \"Позиции плана-графика закупок на согласовании\"")
    public void setPositionPlanGraphicInFilter(String string) {
    	applet.setPositionPlanGraphicInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"Позиции плана-графика закупок на согласовании\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"Позиции плана-графика закупок на согласовании\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вклвдку \"Позиции плана-графика закупок на согласовании\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();  	
    }
    
    @Step("Нажимаем кнопку \"Согласовать закупку\" на странице \"Позиции плана-графика закупок на согласовании\"")
	public void clickOnButtonApproval() {
    	applet.clickOnButtonApproval();  	
	}
    
}