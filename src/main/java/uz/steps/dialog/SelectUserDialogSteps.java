package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.SelectUserDialog;

/**
 * Диалоговое окно Выбрать пользователя
 * @author e.kuzmina 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class SelectUserDialogSteps extends ScenarioSteps {


	public SelectUserDialogSteps(Pages pages) {
        super(pages);
    }
	
	SelectUserDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Выбрать пользователя\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Клик по полю \"ФИО пользователя\" со значением \"{0}\" в диалоговом окне \"Выбрать пользователя\"")
	public void clickOnFieldUserFIO(String text){
		applet.clickOnFieldUserFIO(text);    	
	}
	@Step("Нажимаем кнопку \"ОК\" в диалоговом окне \"Выбрать пользователя\"")
	public void clickOnButtonOk() {
		applet.clickOnButtonOk();
	}
		
}