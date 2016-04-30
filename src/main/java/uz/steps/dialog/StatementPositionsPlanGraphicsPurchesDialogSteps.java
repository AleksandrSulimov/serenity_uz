package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.StatementPositionsPlanGraphicsPurchesDialog;

/**
 * Диалоговое окно Утвердить Позиции плана-графика закупок Steps
 * @author s.serov 30.04.2016
 *
 */
@SuppressWarnings("serial")
public class StatementPositionsPlanGraphicsPurchesDialogSteps extends ScenarioSteps {


	public StatementPositionsPlanGraphicsPurchesDialogSteps(Pages pages) {
        super(pages);
    }
	
	StatementPositionsPlanGraphicsPurchesDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Утвердить закупку\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Утвердить\" на странице \"Утвердить закупку\"")
	public void clickOnButtonStatement(){
		applet.clickOnButtonStatement();  	
	}
	
	@Step("Нажимаем кнопку \"ОК\" на странице \"Утвердить закупку\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}