package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.dialog.TestResultsDialog;

/**
 * Диалоговое окно Результаты проверки
 * @author e.kuzmina 28.04.2016
 *
 */
@SuppressWarnings("serial")
public class TestResultsDialogSteps extends ScenarioSteps {


	public TestResultsDialogSteps(Pages pages) {
        super(pages);
    }
	
	TestResultsDialog applet;

	@Step("Ожидаем загрузку диалоговое окно \"Результаты проверки\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Сохранить\" в диалоговом окне \"Результаты проверки\"")
	public void clickOnButtonSave() {
		applet.clickOnButtonSave();
	}
	@Step("Проверить существование кнопки \"Сохранить\" в диалоговом окне \"Результаты проверки\"")
	public boolean checkSaveButtonEists() {
		return applet.checkSaveButtonEists();
	}	
}