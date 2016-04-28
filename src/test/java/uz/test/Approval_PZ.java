package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Approval_PZ extends TestCasesBase{

	@Title("Согласование/Утверждение ПЗ")
    @Test
	public void approval_PZ(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Согласование/Утверждение ПЗ");

		String purshedNumber = "5406105211.540501001.2.16.00004.1601";//5406105211.540501001.2016-2018.01
		

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
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase()){
			applicationFormsSteps.clickOnExpandLinkPlanPurchaseAfterExpandLinkPlanPurchase();
		}
		

		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPlanPurchase()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPlanPurchase();
		}
		
		applicationFormsSteps.clickOnLinkPlanPurchaseApproval();
		
		//На утверждение
		positionsPurchasePlanApprovalSteps.waitingForAppletVisible();
		if(!positionsPurchasePlanApprovalSteps.isPushedLinkFilter()){
			positionsPurchasePlanApprovalSteps.clickOnLinkFilter();
		}
		if(positionsPurchasePlanApprovalSteps.isFilterExist()){
			positionsPurchasePlanApprovalSteps.clickOnButtonResetFilter();
		}
		
		//positionsPurchasePlanApprovalSteps.cleanPositionPlanPurshedInFilter();
		positionsPurchasePlanApprovalSteps.setPositionPlanPurshedInFilter(purshedNumber);
		positionsPurchasePlanApprovalSteps.selectFirstRow();
		positionsPurchasePlanApprovalSteps.clickOnButtonApproval();
		
		approvalPositionPurchase200DialogSteps.waitingForAppletVisible();
		approvalPositionPurchase200DialogSteps.clickOnButtonApproval();
		approvalPositionPurchase200DialogSteps.waitingForAppletVisible();
		approvalPositionPurchase200DialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPurchasePlanApprovalSteps.getTextStatus();
			if(status.equals("Согласовано")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Согласовано", positionsPurchasePlanApprovalSteps.getTextStatus());
		
		positionsPurchasePlanApprovalSteps.clickOnLinkClosePPZOnApproval();
		
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPosition200()){
			applicationFormsSteps.clickOnLinkPosition200();
		}
		

		if(!applicationFormsSteps.isPushedLinkMyDocument()){
			applicationFormsSteps.clickOnLinkMyDocument();
		}
		
		applicationFormsSteps.clickOnLinkPlanPurchaseStatement();

		
		
		positionsPurchasePlanStatementSteps.waitingForAppletVisible();
		if(!positionsPurchasePlanStatementSteps.isPushedLinkFilter()){
			positionsPurchasePlanStatementSteps.clickOnLinkFilter();
		}
		if(positionsPurchasePlanStatementSteps.isFilterExist()){
			positionsPurchasePlanStatementSteps.clickOnButtonResetFilter();
		}
		
		//positionsPurchasePlanStatementSteps.cleanPositionPlanPurshedInFilter();
		positionsPurchasePlanStatementSteps.setPositionPlanPurshedInFilter(purshedNumber);
		positionsPurchasePlanStatementSteps.selectFirstRow();
		positionsPurchasePlanStatementSteps.clickOnButtonStatement();
		
		statementPositionPurchase200DialogSteps.waitingForAppletVisible();
		statementPositionPurchase200DialogSteps.clickOnButtonStatement();
		statementPositionPurchase200DialogSteps.waitingForAppletVisible();
		statementPositionPurchase200DialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPurchasePlanStatementSteps.getTextStatus();
			if(status.equals("Утверждено")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Утверждено", positionsPurchasePlanStatementSteps.getTextStatus());
		
		positionsPurchasePlanStatementSteps.clickOnLinkClosePPZOnStatement();
	}
	
}
