package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.StatementPlanGraphicsDialog;

/**
 * Диалоговое окно Утвердить план-график Steps
 * @author s.serov 02.05.2016
 *
 */
@SuppressWarnings("serial")
public class StatementPlanGraphicsDialogSteps extends ScenarioSteps {


	public StatementPlanGraphicsDialogSteps(Pages pages) {
        super(pages);
    }
	
	StatementPlanGraphicsDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Утвердить план-график\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Утвердить\" на странице \"Утвердить план-график\"")
	public void clickOnButtonStatement(){
		applet.clickOnButtonStatement();  	
	}
	
	@Step("Нажимаем кнопку \"Утвердить\" на странице \"Утвердить план-график\"")
	public void clickOnButtonStatementBeforeJinnClient(){
		applet.clickOnButtonStatementBeforeJinnClient();  	
	}
	@Step("Нажимаем кнопку \"ОК\" на странице \"Утвердить план-график\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}