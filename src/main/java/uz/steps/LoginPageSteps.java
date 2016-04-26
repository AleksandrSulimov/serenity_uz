package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.LoginPage;

@SuppressWarnings("serial")
public class LoginPageSteps extends ScenarioSteps {

	public LoginPageSteps(Pages pages) {
        super(pages);
    }
	
	LoginPage loginPage;

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
    
    @Step("Нажимаем кнопку \"Вход в систему\"")
    public void clickOnEnterButton() {
    	loginPage.clickSubmitButton();
    }

}