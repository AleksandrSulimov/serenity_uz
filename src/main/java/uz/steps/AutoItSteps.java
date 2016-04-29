package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import uz.utils.AutoIt;
/**
 * AutoIt
 * @author s.serov 29.04.2016
 *
 */
@SuppressWarnings("serial")
public class AutoItSteps extends ScenarioSteps {


	public AutoItSteps(Pages pages) {
        super(pages);
    }
	
	@Step("В Jinn-Client нажать \"Подписать\"")
	public void signInJinnClient() {
		new AutoIt().signInJinnClient();
	}
	
	@Step("В Jinn-Client выбрать первый сертификат")
	public void selectFirstCertificateInJinnClient() {
		new AutoIt().selectCertInJinnClient();
	}

}