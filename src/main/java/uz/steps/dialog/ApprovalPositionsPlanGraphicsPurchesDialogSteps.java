package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.ApprovalPositionsPlanGraphicsPurchesDialog;

/**
 * Диалоговое окно Согласовать Позиции плана-графика закупок Steps
 * @author s.serov 30.04.2016
 *
 */
@SuppressWarnings("serial")
public class ApprovalPositionsPlanGraphicsPurchesDialogSteps extends ScenarioSteps {


	public ApprovalPositionsPlanGraphicsPurchesDialogSteps(Pages pages) {
        super(pages);
    }
	
	ApprovalPositionsPlanGraphicsPurchesDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Согласовать закупку\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Согласовать\" на странице \"Согласовать закупку\"")
	public void clickOnButtonApproval(){
		applet.clickOnButtonApproval();    	
	}
	@Step("Нажимаем кнопку \"ОК\" на странице \"Согласовать закупку\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}