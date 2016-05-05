package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.JSON;

@RunWith(SerenityRunner.class)
public class Approval_PZ extends TestCasesBase{

	
	@Title("Согласование/Утверждение ПЗ")
    @Test
	public void approval_PZ(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Согласование/Утверждение ПЗ");

		String purshedNumber = JSON.readJSON("pz_num", "pz_num");
		

		selectPushedProcurementManagement();
			
		goToApplicationForms();

		expandProcurementManagementOnApplicationForms();
		
		expandPlanProcurementOnApplicationForms();
		
		//План закупок
		applicationFormsSteps.clickOnLinkPlanPurchase();
		
		planPurchaseSteps.waitingForAppletVisible();
		
		//Раскрыли фильтр
		if(!planPurchaseSteps.isPushedLinkFilter()){
			planPurchaseSteps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(planPurchaseSteps.isFilterExist()){
			planPurchaseSteps.clickOnButtonResetFilter();
		}
		
		planPurchaseSteps.setPlanPurshedInFilter(purshedNumber);
		planPurchaseSteps.selectFirstRow();
		planPurchaseSteps.clickOnButtonSendToMatching();
		planPurchaseSteps.clickOnButtonRefreshListOfDocument();
		String status = "";
		for(int i=0; i<6; i++){
			status = planPurchaseSteps.getTextStatus();
			if(status.equals("На согласовании")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "На согласовании", planPurchaseSteps.getTextStatus());
		
		planPurchaseSteps.clickOnLinkClose();
		
		//Согласование
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase()){
			applicationFormsSteps.clickOnExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase();
		}
		

		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPlanPurchase()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPlanPurchase();
		}
		
		applicationFormsSteps.clickOnLinkPlanPurchaseApproval();
		
		
		planPurchaseOnApprovalSteps.waitingForAppletVisible();
		if(!planPurchaseOnApprovalSteps.isPushedLinkFilter()){
			planPurchaseOnApprovalSteps.clickOnLinkFilter();
		}
		if(planPurchaseOnApprovalSteps.isFilterExist()){
			planPurchaseOnApprovalSteps.clickOnButtonResetFilter();
		}
		
		planPurchaseOnApprovalSteps.setPlanPurshedInFilter(purshedNumber);
		planPurchaseOnApprovalSteps.selectFirstRow();
		planPurchaseOnApprovalSteps.clickOnButtonApproval();
		
		approvalPlanPurchaseDialogSteps.waitingForAppletVisible();
		approvalPlanPurchaseDialogSteps.clickOnButtonApproval();
		approvalPlanPurchaseDialogSteps.waitingForAppletVisible();
		approvalPlanPurchaseDialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = planPurchaseOnApprovalSteps.getTextStatus();
			if(status.equals("Согласовано")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Согласовано", planPurchaseOnApprovalSteps.getTextStatus());
		
		planPurchaseOnApprovalSteps.clickOnLinkClose();
		
		//Утверждение
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase()){
			applicationFormsSteps.clickOnExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase();
		}
		

		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPlanPurchase()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPlanPurchase();
		}
		
		applicationFormsSteps.clickOnLinkPlanPurchaseStatement();

		
		
		planPurchaseStatementSteps.waitingForAppletVisible();
		if(!planPurchaseStatementSteps.isPushedLinkFilter()){
			planPurchaseStatementSteps.clickOnLinkFilter();
		}
		if(planPurchaseStatementSteps.isFilterExist()){
			planPurchaseStatementSteps.clickOnButtonResetFilter();
		}
		
		planPurchaseStatementSteps.setPlanPurshedInFilter(purshedNumber);
		planPurchaseStatementSteps.selectFirstRow();
		planPurchaseStatementSteps.clickOnButtonStatement();
		
		statementPlanPurchaseDialogSteps.waitingForAppletVisible();
		statementPlanPurchaseDialogSteps.clickOnButtonStatementBeforeJinnClient();
		//autoItSteps.signInJinnClient();
		//autoItSteps.selectFirstCertificateInJinnClient();
		autoItSteps.signInJinnClientAndSelectFirstCertificateInJinnClient();
		statementPlanPurchaseDialogSteps.waitingForAppletVisible();
		statementPlanPurchaseDialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = planPurchaseStatementSteps.getTextStatus();
			if(status.equals("Утверждено")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Утверждено", planPurchaseStatementSteps.getTextStatus());
		
		planPurchaseStatementSteps.clickOnLinkClose();
	}
	
}
