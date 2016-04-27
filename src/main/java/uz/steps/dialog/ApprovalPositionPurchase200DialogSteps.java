package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.ApprovalPositionPurchase200Dialog;

/**
 * Диалоговое окно Согласовать позицию плана закупок 200 Steps
 * @author s.serov 27.04.2016
 *
 */
@SuppressWarnings("serial")
public class ApprovalPositionPurchase200DialogSteps extends ScenarioSteps {


	public ApprovalPositionPurchase200DialogSteps(Pages pages) {
        super(pages);
    }
	
	ApprovalPositionPurchase200Dialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Согласовать позицию плана закупок 200\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Согласовать\" на странице \"Согласовать позицию плана закупок 200\"")
	public void clickOnButtonApproval(){
		applet.clickOnButtonApproval();    	
	}
	@Step("Нажимаем кнопку \"ОК\" на странице \"Согласовать позицию плана закупок 200\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}