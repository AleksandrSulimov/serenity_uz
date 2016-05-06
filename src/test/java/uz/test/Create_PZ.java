package uz.test;

import java.awt.AWTException;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.JSON;

@RunWith(SerenityRunner.class)
public class Create_PZ extends TestCasesBase{

	@Title("Создание ПЗ")
    @Test
	public void create_PZ() throws AWTException{
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Создание ПЗ");

		String ppzNum = JSON.readJSON("ppz_num", "ppz_num");
		
		h.createNewFile("C:\\test.txt");
		
		selectPushedProcurementManagement();
		goToApplicationForms();
		expandProcurementManagementOnApplicationForms();
		expandPlanProcurementOnApplicationForms();
		
		applicationFormsSteps.clickOnLinkPlanProcurementInPlanProcurement();
		
		purchasePlanSteps.waitingForAppletVisible();
		purchasePlanSteps.clickOnButtonCreteNewDocument();
		
		purchasePlanOfProductJobServiceTabSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceTabSteps.selectTabBasicInformation();
		
		purchasePlanOfProductJobServiceBasicInformationSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceBasicInformationSteps.clickOnButtonAddAttachment();
		
		addAttachment("C:\\test.txt");
		
		purchasePlanOfProductJobServiceTabSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceTabSteps.selectTabPositionPurchasePlan();
		
		purchasePlanOfProductJobServicePositionPurchasePlanSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServicePositionPurchasePlanSteps.clickOnButtonIncludePositionsPurchasePlan();
		
		//choosePpzForIncludeInPZDiictionaryPageSteps.waitingForAppletVisible();
		//choosePpzForIncludeInPZDiictionaryPageSteps.clickCheckBoxSelectFirstRow();
		//choosePpzForIncludeInPZDiictionaryPageSteps.clickOnButtonOK();
		
		selectValueInChoosePpzForIncludeInPZDiictionaryByPPZ(ppzNum);
		
		purchasePlanOfProductJobServiceTabSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceTabSteps.selectTabSpecialPurchases();
		purchasePlanOfProductJobServiceSpecialPurchasesSteps.waitingForAppletVisible();
		
		purchasePlanOfProductJobServiceTabSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceTabSteps.selectTabResultsOfKBK();
		purchasePlanOfProductJobServiceResultsOfKBKSteps.waitingForAppletVisible();
		
		purchasePlanOfProductJobServiceTabSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceTabSteps.selectTabCoordinationSheet();
		
		purchasePlanOfProductJobServiceCoordinationSheetSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceCoordinationSheetSteps.clickOnCheckBoxNeedCoordination();
		
		purchasePlanOfProductJobServiceCoordinationSheetSteps.clickOnButtonAddNewRecordCoordinators();
		purchasePlanOfProductJobServiceCoordinationSheetSteps.clickOnButtonChooseCoordinator();
		
		selectUser("Сафронов");
		
		purchasePlanOfProductJobServiceCoordinationSheetSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceCoordinationSheetSteps.clickOnButtonChooseValidator();

		selectUser("Сафронов");
		
		purchasePlanOfProductJobServiceTabSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceTabSteps.clickOnButttonCheckDocument();
		
		saveTestResults();
		
		purchasePlanOfProductJobServiceTabSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceTabSteps.selectTabBasicInformation();
		
		purchasePlanOfProductJobServiceBasicInformationSteps.waitingForAppletVisible();
		purchasePlanOfProductJobServiceBasicInformationSteps.clickOnButtonClose();
		
		purchasePlanSteps.waitingForAppletVisible();
		purchasePlanSteps.selectFirstRow();
		
		String pzNumber = purchasePlanSteps.getTextNumberPlanPurshed();
		commonSteps.log("Номер плана закупок = "+pzNumber);
		System.out.println("Номер плана закупок = "+pzNumber);
		Serenity.setSessionVariable("pzNum").to(pzNumber);
		JSON.writeJSON("pz_num", "pz_num", pzNumber);
		assertSteps.assertField("Статус плана закупки", "Черновик", purchasePlanSteps.getTextStatus());
		
		purchasePlanTabSteps.waitingForAppletVisible();
		purchasePlanTabSteps.selectTabAttributes();
		
		attributesPageSteps.waitingForAppletVisible();
		String pzId = attributesPageSteps.getTextId();
		commonSteps.log("Идентификатор плана закупок = "+pzId);
		System.out.println("Идентификатор плана закупок = "+pzId);
		Serenity.setSessionVariable("pzId").to(pzId);
		JSON.writeJSON("pz_id", "pz_id", pzId);
		purchasePlanSteps.clickOnLinkClosePZ();
	}
	
}
