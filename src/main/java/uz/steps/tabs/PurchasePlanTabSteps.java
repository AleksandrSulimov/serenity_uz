package uz.steps.tabs;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.tabs.PurchasePlanTab;
/**
 * Вкладки внизу страницы 'План закупок'	
 * @author e.kuzmina 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class PurchasePlanTabSteps extends ScenarioSteps {


	public PurchasePlanTabSteps(Pages pages) {
        super(pages);
    }
	
	PurchasePlanTab applet;

	@Step("Ожидаем загрузку вкладок внизу страницы \"План закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	@Step("Выбрать вкладку \"Атрибуты\" внизу страницы \"План закупок\"")
	public void selectTabAttributes(){
		applet.selectTabAttributes();    	
	}
}