package uz.test;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.JSON;

@RunWith(SerenityRunner.class)
public class Approval_PPG extends TestCasesBase{

	@Title("Согласование/Утверждение ППГ")
    @Test
	public void approval_PPG(){
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Согласование/Утверждение ППГ");

		//String purshedNumber = "5406105211.540501001.2.16.00010.1601.003";
		String ppgNumber = JSON.readJSON("ppg_num", "ppg_num");
		String status = "";

		selectPushedProcurementManagement();
			
		goToApplicationForms();
		expandProcurementManagementOnApplicationForms();
		expandPlanningOnApplicationForms();
		expandPlanGraphicsFirstLevelOnApplicationForms();
		expandPlanGraphicsSecondLevelOnApplicationForms();
		expandPositionPlanGraphicsOnApplicationForms();
		
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurches();
		
		positionsPlanGraphicsPurchesSteps.waitingForAppletVisible();
		
		//Раскрыли фильтр
		if(!positionsPlanGraphicsPurchesSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesSteps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(positionsPlanGraphicsPurchesSteps.isFilterExist()){
			positionsPlanGraphicsPurchesSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesSteps.setPositionPlanGraphicInFilter(ppgNumber);
		positionsPlanGraphicsPurchesSteps.selectFirstRow();
		positionsPlanGraphicsPurchesSteps.clickOnButtonSendToMatching();
		positionsPlanGraphicsPurchesSteps.clickOnButtonRefreshListOfDocument();
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPlanGraphicsPurchesSteps.getTextStatus();
			if(status.equals("На согласовании")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "На согласовании", positionsPlanGraphicsPurchesSteps.getTextStatus());
		
		positionsPlanGraphicsPurchesSteps.clickOnLinkClose();
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkPositionPlanGraphics();
		}
		
		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPositionPlanGraphics();
		}
		
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurchesApproval();
		
		//На утверждение
		positionsPlanGraphicsPurchesOnApprovalSteps.waitingForAppletVisible();
		if(!positionsPlanGraphicsPurchesOnApprovalSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesOnApprovalSteps.clickOnLinkFilter();
		}
		if(positionsPlanGraphicsPurchesOnApprovalSteps.isFilterExist()){
			positionsPlanGraphicsPurchesOnApprovalSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesOnApprovalSteps.setPositionPlanGraphicInFilter(ppgNumber);
		positionsPlanGraphicsPurchesOnApprovalSteps.selectFirstRow();
		positionsPlanGraphicsPurchesOnApprovalSteps.clickOnButtonApproval();
		
		approvalPositionsPlanGraphicsPurchesDialogSteps.waitingForAppletVisible();
		approvalPositionsPlanGraphicsPurchesDialogSteps.clickOnButtonApproval();
		approvalPositionsPlanGraphicsPurchesDialogSteps.waitingForAppletVisible();
		approvalPositionsPlanGraphicsPurchesDialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPlanGraphicsPurchesOnApprovalSteps.getTextStatus();
			if(status.equals("Согласовано")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Согласовано", positionsPlanGraphicsPurchesOnApprovalSteps.getTextStatus());
		
		positionsPlanGraphicsPurchesOnApprovalSteps.clickOnLinkClose();
		
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkPositionPlanGraphics();
		}

		if(!applicationFormsSteps.isPushedLinkMyDocumentAfterPositionPlanGraphics()){
			applicationFormsSteps.clickOnLinkMyDocumentAfterPositionPlanGraphics();
		}
		
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurchesStatement();

		
		
		positionsPlanGraphicsPurchesStatementSteps.waitingForAppletVisible();
		if(!positionsPlanGraphicsPurchesStatementSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesStatementSteps.clickOnLinkFilter();
		}
		if(positionsPlanGraphicsPurchesStatementSteps.isFilterExist()){
			positionsPlanGraphicsPurchesStatementSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesStatementSteps.setPositionPlanGraphicInFilter(ppgNumber);
		positionsPlanGraphicsPurchesStatementSteps.selectFirstRow();
		positionsPlanGraphicsPurchesStatementSteps.clickOnButtonStatement();
		
		statementPositionsPlanGraphicsPurchesDialogSteps.waitingForAppletVisible();
		statementPositionsPlanGraphicsPurchesDialogSteps.clickOnButtonStatement();
		statementPositionsPlanGraphicsPurchesDialogSteps.waitingForAppletVisible();
		statementPositionsPlanGraphicsPurchesDialogSteps.clickOnButtonOk();
		
		status = "";
		for(int i=0; i<6; i++){
			status = positionsPlanGraphicsPurchesStatementSteps.getTextStatus();
			if(status.equals("Утверждено")){
				break;
			}
			h.sleep(3);
		}
		assertSteps.assertField("Состояние", "Утверждено", positionsPlanGraphicsPurchesStatementSteps.getTextStatus());
		
		positionsPlanGraphicsPurchesStatementSteps.clickOnLinkClose();
	}
	
}
