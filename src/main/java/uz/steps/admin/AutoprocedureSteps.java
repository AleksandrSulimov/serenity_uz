package uz.steps.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.admin.AutoprocedurePage;

/**
 * Автопроцедуры Steps
 * @author s.serov 02.05.2016
 *
 */
@SuppressWarnings("serial")
public class AutoprocedureSteps extends ScenarioSteps {


	public AutoprocedureSteps(Pages pages) {
        super(pages);
    }
	
	AutoprocedurePage applet;

	@Step("Ожидаем загрузку страницы \"Автопроцедуры\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	 
	@Step("Клик по строке \"Автопроцедура удаления из БД документов\" на странице \"Автопроцедуры\"")
	public void clickOnRowAutoProcedureRemoveDocumentFromDb(){
		applet.clickOnRowAutoProcedureRemoveDocumentFromDb();    	
	}
	
	@Step("Нажимаем кнопку \"Редактировать\" на странице \"Автопроцедуры\"")
	public void clickOnBottonEdit(){
		applet.clickOnBottonEdit();    	
	}
	@Step("Клик по вкладке \"Исполняемая процедура\" на странице \"Автопроцедуры\"")
	public void clickOnTabRunnableProcedure(){
		applet.clickOnTabRunnableProcedure();    	
	}
	@Step("Нажимаем кнопку \"Редактировать\" на вкладке \"Исполняемая процедура\" на странице \"Автопроцедуры\"")
	public void clickOnBottonEditRunnableProcedure(){
		applet.clickOnBottonEditRunnableProcedure();    	
	}
    
    @Step("Вводим текст {0} в поле \"Значение\" в строке \"Условия удаления\" на вкладке \"Исполняемая процедура\"")
    public void setTextRemovableCondition(String string) {
    	applet.setTextRemovableCondition(string);    	
    }
    @Step("Нажимаем кнопку \"Сохранить\" на вкладке \"Исполняемая процедура\" на странице \"Автопроцедуры\"")
	public void clickOnBottonSaveRunnableProcedure(){
		applet.clickOnBottonSaveRunnableProcedure();    	
	}
    @Step("Нажимаем кнопку \"Сохранить\" на странице \"Автопроцедуры\"")
	public void clickOnBottonSave(){
		applet.clickOnBottonSave();    	
	}
    @Step("Нажимаем кнопку \"Запустить задание на исполнение\" на странице \"Автопроцедуры\"")
	public void clickOnBottonRun(){
		applet.clickOnBottonRun();    	
	}
    
    
}