package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.AddAttachmentPage;
/**
 * Добавление вложения
 * @author e.kuzmina 27.04.2016
 *
 */
@SuppressWarnings("serial")
public class AddAttachmentPageSteps extends ScenarioSteps {

	public AddAttachmentPageSteps(Pages pages) {
        super(pages);
    }
	
	AddAttachmentPage page;

	@Step("Ожидаем загрузку экрана \"Добавление вложения\"")
	public void waitingForAppletVisible() {
		page.waitingForAppletVisible();
	}
	
    @Step("Загрузить файл {0)")
    public void loadFile(String path) {
    	page.loadFile(path);
    }

    @Step("Нажать кнопку Сохранить")
    public void clickOnButtonSave() {
    	page.clickOnButtonSave();
    }
}