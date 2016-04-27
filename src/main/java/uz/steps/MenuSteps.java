package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.Menu;

/**
 * Меню слева страницы Steps
 * @author s.serov 25.04.2016
 *
 */
@SuppressWarnings("serial")
public class MenuSteps extends ScenarioSteps {


	public MenuSteps(Pages pages) {
        super(pages);
    }
	
	Menu applet;

	@Step("Ожидаем загрузку \"Меню\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	
    @Step("Проверяем нажат ли линк \"Управление закупками\" в \"Меню\"")
    public Boolean isPushedProcurementManagement() {
    	return applet.isPushedProcurementManagement();
    }

    @Step("Нажимаем линк \"Управление закупками\" в \"Меню\"")
    public void clickOnLinkProcurementManagement(){
    	applet.clickOnLinkProcurementManagement();    	
    }
    

    @Step("Проверяем нажат ли линк \"Все\" в \"Меню\"")
    public Boolean isPushedAll() {
    	return applet.isPushedAll();
    }

    @Step("Нажимаем линк \"Все\" в \"Меню\"")
    public void clickOnLinkAll(){
    	applet.clickOnLinkAll();    	
    }
}