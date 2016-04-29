package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.AttributesPage;
/**
 * Вкладка атрибуты
 * @author ekuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class AttributesPageSteps extends ScenarioSteps {

	public AttributesPageSteps(Pages pages) {
        super(pages);
    }
	
	AttributesPage page;

	@Step("Ожидаем загрузку вкладки \"Атрибуты\"")
	public void waitingForAppletVisible() {
		page.waitingForAppletVisible();
	}
	
    @Step("Забрать текст из поля \"Идентификатор\"")
    public String getTextId() {
    	return page.getTextId();
    }
}