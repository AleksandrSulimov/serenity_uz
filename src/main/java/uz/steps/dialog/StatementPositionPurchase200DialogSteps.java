package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.StatementPositionPurchase200Dialog;

/**
 * Диалоговое окно Утвердить позицию плана закупок 200 Steps
 * @author s.serov 27.04.2016
 *
 */
@SuppressWarnings("serial")
public class StatementPositionPurchase200DialogSteps extends ScenarioSteps {


	public StatementPositionPurchase200DialogSteps(Pages pages) {
        super(pages);
    }
	
	StatementPositionPurchase200Dialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Утвердить позицию плана закупок 200\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Утвердить\" на странице \"Утвердить позицию плана закупок 200\"")
	public void clickOnButtonStatement(){
		applet.clickOnButtonStatement();  	
	}
	
	@Step("Нажимаем кнопку \"ОК\" на странице \"Утвердить позицию плана закупок 200\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}