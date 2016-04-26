package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Create_PPZ_200_Regular extends TestCasesBase{

	@Title("Создание ППЗ 200 обычная")
    @Test
	public void create_PPZ_200_Regular(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Создание ППЗ 200 обычная");

		menuSteps.waitingForAppletVisible();
		if(!menuSteps.isPushedProcurementManagement()){
			menuSteps.clickOnLinkProcurementManagement();
		}
		
		mainPageTabSteps.waitingForAppletVisible();
		mainPageTabSteps.clickOnTabApplicationForms();
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedProcurementManagement()){
			applicationFormsSteps.clickOnLinkProcurementManagement();
		}
		
		if(!applicationFormsSteps.isPushedLinkPlanProcurement()){
			applicationFormsSteps.clickOnLinkPlanProcurement();
		}
		
		applicationFormsSteps.clickOnLinkPositionPlanProcurement200();
		
		positionsPurchasePlan200Steps.waitingForAppletVisible();
		positionsPurchasePlan200Steps.clickOnButtonCreteNewDocument();
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabBasicInformation();
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldPurchaseType();
		assertSteps.assertField("Тип закупки", "Закупка", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValuePurchaseType());
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonOkpdOpenDictionary();
		okpd2DictionaryPageSteps.waitingForAppletVisible();
		okpd2DictionaryPageSteps.openListFirstLevel("26");
		okpd2DictionaryPageSteps.clickOnElementSecondLevel("26.2");

		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldCodeProductName();
		System.out.println(positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueCodeProductName());



	}
	
}
