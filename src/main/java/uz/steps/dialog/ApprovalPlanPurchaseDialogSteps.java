package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.ApprovalPlanPurchaseDialog;

/**
 * Диалоговое окно Согласовать план закупок Steps
 * @author s.serov 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class ApprovalPlanPurchaseDialogSteps extends ScenarioSteps {


	public ApprovalPlanPurchaseDialogSteps(Pages pages) {
        super(pages);
    }
	
	ApprovalPlanPurchaseDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Согласовать план закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Согласовать\" на странице \"Согласовать план закупок\"")
	public void clickOnButtonApproval(){
		applet.clickOnButtonApproval();    	
	}
	@Step("Нажимаем кнопку \"ОК\" на странице \"Согласовать план закупок\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}