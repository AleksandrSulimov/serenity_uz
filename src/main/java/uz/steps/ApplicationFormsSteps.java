package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.ApplicationForms;

/**
 * Формуляры Steps
 * @author s.serov 25.04.2016
 *
 */
@SuppressWarnings("serial")
public class ApplicationFormsSteps extends ScenarioSteps {


	public ApplicationFormsSteps(Pages pages) {
        super(pages);
    }
	
	ApplicationForms applet;

	@Step("Ожидаем загрузку \"Формуляры\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	
    @Step("Проверяем нажат ли линк \"Управление закупками\" в \"Формуляры\"")
    public Boolean isPushedProcurementManagement() {
    	return applet.isPushedLinkProcurementManagement();
    }
    @Step("Нажимаем линк \"Управление закупками\" в \"Формуляры\"")
    public void clickOnLinkProcurementManagement(){
    	applet.clickOnLinkProcurementManagement();    	
    }
    
    @Step("Проверяем нажат ли линк \"План закупок\" в \"Формуляры\"")
    public Boolean isPushedLinkPlanProcurement() {
    	return applet.isPushedLinkPlanProcurement();
    }
    @Step("Нажимаем линк \"План закупок\" в \"Формуляры\"")
    public void clickOnLinkPlanProcurement(){
    	applet.clickOnLinkPlanProcurement();    	
    }
    
    @Step("Нажимаем линк \"Позиции плана закупок - 200\" в \"Формуляры\"")
    public void clickOnLinkPositionPlanProcurement200(){
    	applet.clickOnLinkPositionPlanProcurement200();    	
    }
}