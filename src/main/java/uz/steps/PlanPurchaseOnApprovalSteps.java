package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanPurchaseOnApprovalPage;

/**
 * План закупок на согласовании Steps
 * @author s.serov 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class PlanPurchaseOnApprovalSteps extends ScenarioSteps {


	public PlanPurchaseOnApprovalSteps(Pages pages) {
        super(pages);
    }
	
	PlanPurchaseOnApprovalPage applet;

	@Step("Ожидаем загрузку страницы \"План закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"План закупок\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
		
	@Step("Проверяем задан ли \"фильтр\" на странице \"План закупок\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"План закупок\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
	
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"План закупок\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"План закупок\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер плана закупок\" в фильтре на странице \"План закупок\"")
    public void cleanPlanPurshedInFilter() {
    	applet.cleanPlanPurshedInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер плана закупок\" в фильтре на странице \"План закупок\"")
    public void setPlanPurshedInFilter(String string) {
    	applet.setPlanPurshedInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"План закупок\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"План закупок\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вклвдку \"План закупок на согласовании\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();  	
    }
    
    @Step("Нажимаем кнопку \"Согласовать закупку\" на странице \"План закупок\"")
	public void clickOnButtonApproval() {
    	applet.clickOnButtonApproval();  	
	}
    
}