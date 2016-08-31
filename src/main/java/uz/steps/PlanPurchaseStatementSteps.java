package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanPurchaseOnStatementPage;

/**
 * План закупок на с на утверждении Steps
 * @author s.serov 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class PlanPurchaseStatementSteps extends ScenarioSteps {


	public PlanPurchaseStatementSteps(Pages pages) {
        super(pages);
    }
	
	PlanPurchaseOnStatementPage applet;

	@Step("Ожидаем загрузку страницы \"План закупок на утверждении\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Обновить список документов\" на странице \"План закупок на утверждении\"")
	public void clickOnButtonRefreshListOfDocument(){
		applet.clickOnButtonRefreshListOfDocument();    	
	}
	@Step("Проверяем задан ли \"фильтр\" на странице \"План закупок на утверждении\"")
	public Boolean isFilterExist(){
		return applet.isFilterExist();   	
	}
	@Step("Нажимаем кнопку \"Сбросить фильтр\" на странице \"План закупок на утверждении\"")
	public void clickOnButtonResetFilter(){
		applet.clickOnButtonResetFilter();    	
	}
		
    @Step("Проверяем нажат ли линк \"Фильтр\" на странице \"План закупок на утверждении\"")
    public Boolean isPushedLinkFilter() {
    	return applet.isPushedLinkFilter();
    }
    
    @Step("Нажимаем линк \"Фильтр\" на странице \"План закупок на утверждении\"")
    public void clickOnLinkFilter(){
    	applet.clickOnLinkFilter();
    }
    
    @Step("Очищаем поле \"Номер плана закупок\" в фильтре на странице \"План закупок на утверждении\"")
    public void cleanPlanPurshedInFilter() {
    	applet.cleanPlanPurshedInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер плана закупок\" в фильтре на странице \"План закупок на утверждении\"")
    public void setPlanPurshedInFilter(String string) {
    	applet.setPlanPurshedInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"План закупок на утверждении\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Состояние\" в первой строке таблицы на странице \"План закупок на утверждении\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вкладку \"План закупок на утверждении\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();  	
    }
    
    @Step("Нажимаем кнопку \"Утвердить\" на странице \"План закупок на утверждении\"")
	public void clickOnButtonStatement() {
    	applet.clickOnButtonStatement();	
	}
    
}