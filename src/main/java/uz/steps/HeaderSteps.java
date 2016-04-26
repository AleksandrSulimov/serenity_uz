package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.Header;
/**
 * Шапка сайта Steps
 * @author s.serov 25.04.2016
 *
 */
@SuppressWarnings("serial")
public class HeaderSteps extends ScenarioSteps {


	public HeaderSteps(Pages pages) {
        super(pages);
    }
	
	Header applet;

	@Step("Ожидаем загрузку \"Шапки\" сайта")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}

    @Step("Нажимаем кнопку \"Выйти\" в \"Шапке\" сайта")
    public void clickOnButtonExit(){
    	applet.clickOnButtonExit();    	
    }
}