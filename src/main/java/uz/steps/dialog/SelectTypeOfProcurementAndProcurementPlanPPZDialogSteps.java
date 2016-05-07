package uz.steps.dialog;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.hamcrest.MatcherAssert;

import uz.pages.dialog.SelectTypeOfProcurementAndProcurementPlanPPZDialog;

/**
 * Диалоговое окно 'Выбрать тип закупки и вид расходов позиции плана закупок'
 * @author e.kuzmina 03.05.2016
 *
 */
@SuppressWarnings("serial")
public class SelectTypeOfProcurementAndProcurementPlanPPZDialogSteps extends ScenarioSteps {


	public SelectTypeOfProcurementAndProcurementPlanPPZDialogSteps(Pages pages) {
        super(pages);
    }
	
	SelectTypeOfProcurementAndProcurementPlanPPZDialog applet;

	@Step("Ожидаем загрузку диалогового окна \"Выбрать тип закупки и вид расходов позиции плана закупок\"")
	public void waitingForAppletVisible() {
		applet.waitingForAppletVisibleInFrame();
	}
	
	@Step("Нажимаем кнопку \"Выбрать\" в диалоговом окне \"Выбрать тип закупки и вид расходов позиции плана закупок\"")
	public void clickOnButtonSelect(){
		applet.clickOnButtonSelect();    	
	}
	@Step("Вернуть значение выбранной радиокнопки в диалоговом окне \"Выбрать тип закупки и вид расходов позиции плана закупок\"")
	public String getValueCheckedRadioButton() {
		return applet.getValueCheckedRadioButton();
	}
	
	/**
	 * Проверить значение выбранной радиокнопки
	 * @param expected
	 */
	public void checkRadioButtonValue(String expected) {
		String chekedRadioButton = getValueCheckedRadioButton();
		if(!chekedRadioButton.equals("Позиция плана закупок 200")){
			MatcherAssert.assertThat("В диалоговом окне \"Выбрать тип закупки и вид расходов позиции плана закупок\" выбрана раиокнопка \""+chekedRadioButton+"\". Ожидаемое значение: \""+expected+"\"", false);
		}
	}
		
}