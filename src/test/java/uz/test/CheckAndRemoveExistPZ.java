package uz.test;

import java.awt.AWTException;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.PropertyLoader;

@RunWith(SerenityRunner.class)
public class CheckAndRemoveExistPZ extends TestCasesBase{

	@Title("Проверка наличия ранее созданного ПГ и его удаление")
    @Test
	public void checkAndRemoveExistPZ() throws AWTException{
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Проверка наличия ранее созданного ПГ и его удаление");
		Boolean flag = false;
		selectPushedProcurementManagement();
		selectPushedProcurementManagement();
		goToApplicationForms();
		expandProcurementManagementOnApplicationForms();
		expandPlanProcurementOnApplicationForms();
		
		applicationFormsSteps.clickOnLinkPlanProcurementInPlanProcurement();
		
		planPurchaseSteps.waitingForAppletVisible();

		//Раскрыли фильтр
		if(!planPurchaseSteps.isPushedLinkFilter()){
			planPurchaseSteps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(planPurchaseSteps.isFilterExist()){
			planPurchaseSteps.clickOnButtonResetFilter();
		}
		if(planPurchaseSteps.isFirstRowExist()){
			
			planPurchaseSteps.selectFirstRow();
			
			purchasePlanTabSteps.waitingForAppletVisible();
			purchasePlanTabSteps.selectTabAttributes();
			
			attributesPageSteps.waitingForAppletVisible();
			String pzId = attributesPageSteps.getTextId();
			commonSteps.log("Идентификатор плана закупок = "+pzId);
			System.out.println("Идентификатор плана закупок = "+pzId);
			Serenity.setSessionVariable("pzId").to(pzId);
			flag = true;
		}

		planPurchaseSteps.clickOnLinkClose();
		
		if (flag){
			String guid = Serenity.sessionVariableCalled("pzId").toString();
	    	//dictionarySteps.open();
			//dictionarySteps.open("adm");
	    	dictionarySteps.goToUrl(PropertyLoader.loadProperty("admin_url"));
			dictionarySteps.maximizeWindow();
			adminLoginSteps.waitingForAppletVisible();
			adminLoginSteps.enterLogin(PropertyLoader.loadProperty("admin_user"));
			adminLoginSteps.enterPassword(PropertyLoader.loadProperty("admin_pass"));
			adminLoginSteps.clickOkButton();
			
			adminLeftMenuSteps.waitingForAppletVisible();
			adminLeftMenuSteps.clickOnAdminNavigationTab();
			
			if(!adminLeftMenuSteps.isPushedExpandLinkAdministration()){
				adminLeftMenuSteps.clickOnExpandLinkAdministration();
			}
			
			if(!adminLeftMenuSteps.isPushedAdministrationComplexExpandLinkInformation()){
				adminLeftMenuSteps.clickOnExpandLinkAdministrationComplex();
			}

			adminLeftMenuSteps.clickOnLinkAutoProcedure();
			
			//autoprocedureSteps.waitingForAppletVisible();
			autoprocedureSteps.clickOnRowAutoProcedureRemoveDocumentFromDb();
			autoprocedureSteps.clickOnBottonEdit();
			autoprocedureSteps.clickOnTabRunnableProcedure();
			autoprocedureSteps.clickOnBottonEditRunnableProcedure();
			autoprocedureSteps.setTextRemovableCondition(guid);
			autoprocedureSteps.clickOnBottonSaveRunnableProcedure();
			autoprocedureSteps.clickOnBottonSave();
			autoprocedureSteps.clickOnRowAutoProcedureRemoveDocumentFromDb();
			autoprocedureSteps.clickOnBottonRun();
			
			parametersRunTaskDialogSteps.clickOnButtonRun();
		}
	
	}
	
}
