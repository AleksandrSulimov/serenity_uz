package uz.steps.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.admin.AdminLeftMenu;

/**
 * Меню слева страницы
 * @author s.serov 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class AdminLeftMenuSteps extends ScenarioSteps {


	public AdminLeftMenuSteps(Pages pages) {
        super(pages);
    }
	
	AdminLeftMenu applet;

	@Step("Ожидаем загрузку \"Меню\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisible();
	}
	@Step("Клик по вкладке \"Дерево навигации администратора\" в левом меню на странице")
    public void clickOnAdminNavigationTab(){
    	applet.clickOnAdminNavigationTab();    	
    }
	
    @Step("Проверяем нажат ли линк \"Администрирование\" во вкладке \"Дерево навигации администратора\"")
    public Boolean isPushedExpandLinkAdministration() {
    	return applet.isPushedExpandLinkAdministration();
    }
    @Step("Нажимаем линк \"Администрирование\" во вкладке \"Дерево навигации администратора\"")
    public void clickOnExpandLinkAdministration(){
    	applet.clickOnExpandLinkAdministration();    	
    }
    

    @Step("Проверяем нажат ли линк \"Администрирование комплекса\" во вкладке \"Дерево навигации администратора\"")
    public Boolean isPushedAdministrationComplexExpandLinkInformation() {
    	return applet.isPushedAdministrationComplexExpandLinkInformation();
    }
    @Step("Нажимаем линк \"Администрирование комплекса\" во вкладке \"Дерево навигации администратора\"")
    public void clickOnExpandLinkAdministrationComplex(){
    	applet.clickOnExpandLinkAdministrationComplex();    	
    }
    
    @Step("Нажимаем линк \"Автопроцедуры\" во вкладке \"Дерево навигации администратора\"")
    public void clickOnLinkAutoProcedure(){
    	applet.clickOnLinkAutoProcedure();    	
    }
}