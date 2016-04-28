package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.PlanPurchasePage;
import uz.pages.PositionsPurchasePlan200Page;

/**
 * План закупок Steps
 * @author s.serov 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class PlanPurchaseSteps extends ScenarioSteps {


	public PlanPurchaseSteps(Pages pages) {
        super(pages);
    }
	
	PlanPurchasePage applet;

	@Step("Ожидаем загрузку страницы \"План закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Нажимаем кнопку \"Создать новый документ\" на странице \"План закупок\"")
	public void clickOnButtonCreteNewDocument(){
		applet.clickOnButtonCreteNewDocument();    	
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
	
	@Step("Нажимаем кнопку \"Отправить на согласование\" на странице \"План закупок\"")
	public void clickOnButtonSendToMatching(){
		applet.clickOnButtonSendToMatching();    	
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
    public void cleanPositionPlanPurshedInFilter() {
    	applet.cleanPositionPlanPurshedInFilter();    	
    }
    
    @Step("Вводим текст {0} в поле \"Номер плана закупок\" в фильтре на странице \"План закупок\"")
    public void setPositionPlanPurshedInFilter(String string) {
    	applet.setPositionPlanPurshedInFilter(string);    	
    }
    
    @Step("Нажимаем чекбоксу выбора строки в первой строке на странице \"План закупок\"")
    public void selectFirstRow(){
    	applet.selectFirstRow();    	
    }
    
    @Step("Возвращаем текст из поля \"Статус\" в первой строке таблицы на странице \"План закупок\"")
    public String  getTextStatus(){
    	return applet.getTextStatus();    	
    }
    
    @Step("Закрыть вкладку \"План закупок\"")
    public void clickOnLinkClose(){
    	applet.clickOnLinkClose();    	
    }
    
    @Step("Проверить существование строки со значением {0} в поле \"Номер плана закупок\" на странице \"План закупок\"")
    public boolean checkNumberPositionPlanPurshedEists(String text){
    	return applet.checkNumberPositionPlanPurshedEists(text);    	
    }
    
}