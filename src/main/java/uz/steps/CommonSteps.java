package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.CommonPage;

@SuppressWarnings("serial")
public class CommonSteps extends ScenarioSteps {

	public CommonSteps(Pages pages) {
        super(pages);
    }
	
	CommonPage commonPage;

	@Step("Ожидание {0} мс")
    public void waitSeconds(int timeInMilliseconds) {
		commonPage.waitSeconds(timeInMilliseconds);
    }
	
	
    @Step("Ожидание загрузки страницы")
    public void pageLoaded () {
    	//commonPage.isOverlayVisible();
    	commonPage.isOverlayUnVisible();
    }


    @Step("Ожидание загрузки страницы")
    public void pageLoadedFull() {
    	commonPage.isOverlayVisible();
    	commonPage.isOverlayUnVisible();
    	//waitABit(2000);
    }
    
    @Step("{0}")
    public void log(String val){
    }
    
    @Step("Вывод тестовых данных в отчет. {0}: {1}")
    public void logTestData(String var, String val){
    }
    
    @Step("Нажимаем кнопку \"Вернуться назад\" в окне браузера")
	public void clickOnButtonBackOnBrowser() {
    	commonPage.clickOnButtonBackOnBrowser();
	}


}