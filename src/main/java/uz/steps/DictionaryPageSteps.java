package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.pages.DictionaryPage;

@SuppressWarnings("serial")
public class DictionaryPageSteps extends ScenarioSteps {
	
	public DictionaryPageSteps(Pages pages) {
        super(pages);
    }

	DictionaryPage dictionaryPage;
	
	@Step("Открыть браузер и перейти по ссылке")
	public void open(){
		dictionaryPage.open();
	}
	
	@Step("Открыть браузер и перейти по ссылке")
	public void open(String urlName){
		String[] param = {};
		dictionaryPage.open(urlName, param);
	}
	
	@Step("Перейти на страницу {0}")
	public void goToUrl(String url){
		dictionaryPage.goToUrl(url);
	}
	
	@Step("Развернуть окно браузера на весь экран")
	public void maximizeWindow(){
		dictionaryPage.maximizeBrowserWindow();
	}

}