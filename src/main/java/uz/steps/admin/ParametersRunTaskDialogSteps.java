package uz.steps.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.admin.ParametersRunTaskDialog;

/**
 * Диалоговое окно Параметры запуска задания... Steps
 * @author s.serov 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class ParametersRunTaskDialogSteps extends ScenarioSteps {


	public ParametersRunTaskDialogSteps(Pages pages) {
        super(pages);
    }
	
	ParametersRunTaskDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Параметры запуска задания...\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Выполнить\" на странице \"Параметры запуска задания...\"")
	public void clickOnButtonRun(){
		applet.clickOnButtonRun();    	
	}
	@Step("Нажимаем кнопку \"ОК\" на странице \"Параметры запуска задания...\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}