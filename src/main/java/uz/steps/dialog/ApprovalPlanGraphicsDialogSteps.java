package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.ApprovalPlanGraphicsDialog;

/**
 * Диалоговое окно Согласовать план-график Steps
 * @author s.serov 02.05.2016
 *
 */
@SuppressWarnings("serial")
public class ApprovalPlanGraphicsDialogSteps extends ScenarioSteps {


	public ApprovalPlanGraphicsDialogSteps(Pages pages) {
        super(pages);
    }
	
	ApprovalPlanGraphicsDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Согласовать план-график\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Согласовать\" на странице \"Согласовать план-график\"")
	public void clickOnButtonApproval(){
		applet.clickOnButtonApproval();    	
	}
	@Step("Нажимаем кнопку \"ОК\" на странице \"Согласовать план-график\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}