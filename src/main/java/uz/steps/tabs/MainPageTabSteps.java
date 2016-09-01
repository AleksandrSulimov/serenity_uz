package uz.steps.tabs;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.tabs.MainPageTab;
/**
 * Вкладки на основной странице Steps
 * @author s.serov 25.04.2016
 *
 */
@SuppressWarnings("serial")
public class MainPageTabSteps extends ScenarioSteps {


	public MainPageTabSteps(Pages pages) {
        super(pages);
    }
	
	MainPageTab applet;

	@Step("Ожидаем загрузку вкладок на основной странице")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}

    @Step("Нажимаем на вкладку \"Формуляры\" на основной странице")
    public void clickOnTabApplicationForms(){
    	applet.clickOnTabApplicationForms();    	
    }
    @Step("Проверяем выбрана ли вкладка 'Формуляры' на основной странице")
    public void checkTabApplicationFormsIsActive(){
    	applet.checkTabApplicationFormsIsActive();
    }
}