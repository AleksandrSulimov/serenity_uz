package uz.steps.admin;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.admin.AdminLoginPage;

@SuppressWarnings("serial")
public class AdminLoginSteps extends ScenarioSteps {

	public AdminLoginSteps(Pages pages) {
        super(pages);
    }
	
	AdminLoginPage loginPage;

	@Step("Ожидаем загрузку экрана авторизации")
	public void waitingForAppletVisible() {
		loginPage.waitingForAppletVisible();
	}
	
    @Step("Вводим в поле \"Имя пользователя\" значение {0}")
    public void enterLogin(String login) {
    	loginPage.setUserName(login);
    }

    @Step("Вводим в поле \"Пароль\"")
    public void enterPassword(String password) {
    	loginPage.setUserPassword(password);
    }
    
    @Step("Нажимаем кнопку \"Ок\"")
    public void clickOkButton() {
    	loginPage.clickOkButton();
    }

}