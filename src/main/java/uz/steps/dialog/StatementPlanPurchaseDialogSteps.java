package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.StatementPlanPurchaseDialog;

/**
 * Диалоговое окно Утвердить план закупок
 * @author s.serov 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class StatementPlanPurchaseDialogSteps extends ScenarioSteps {


	public StatementPlanPurchaseDialogSteps(Pages pages) {
        super(pages);
    }
	
	StatementPlanPurchaseDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Утвердить план закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Утвердить\" на странице \"Утвердить план закупок\"")
	public void clickOnButtonStatement(){
		applet.clickOnButtonStatement();  	
	}
	
	@Step("Нажимаем кнопку \"ОК\" на странице \"Утвердить план закупок\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}