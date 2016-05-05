package uz.test;

import java.awt.AWTException;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Create_PG extends TestCasesBase{

	@Title("Создание ПГ")
    @Test
	public void create_PG() throws AWTException{
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Создание ПГ");
		
		selectPushedProcurementManagement();
		goToApplicationForms();
		expandProcurementManagementOnApplicationForms();
		expandPlanGraphicsOnApplicationForms();
		applicationFormsSteps.clickOnLinkPlanGraphicsAfterPlanGraphicsExpandLink();
		
		planGraphicsSteps.waitingForAppletVisible();
		planGraphicsSteps.clickOnButtonCreteNewDocument();
		
		selectYearOfPlanGraficsPageSteps.waitingForAppletVisible();
		assertSteps.assertField("Заказчик", "Управление Федерального казначейства по Кировской области", selectYearOfPlanGraficsPageSteps.getValueCustomer());
		assertSteps.assertField("Год плана-графика*", "2016", selectYearOfPlanGraficsPageSteps.getValueYearPlanGrafics());
		selectYearOfPlanGraficsPageSteps.clickOnButtonSelect();
		
		planGraphicsTabSteps.waitingForAppletVisible();
		planGraphicsTabSteps.selectTabBasicInformation();
		
		planGraphicsBasicInformationSteps.waitingForAppletVisible();
		planGraphicsBasicInformationSteps.clickOnFieldLastName();
		planGraphicsBasicInformationSteps.setTextLastName("Сафронов");
		planGraphicsBasicInformationSteps.setTextFirstName("Олег");
		planGraphicsBasicInformationSteps.setTextMiddleName("Викторович");
		planGraphicsBasicInformationSteps.setTextPhone("45-45-45");
		planGraphicsBasicInformationSteps.setTextFax("45-45-45 (1)");
		planGraphicsBasicInformationSteps.setTextEmail("Safronov@mail.ru");
		planGraphicsBasicInformationSteps.clickOnButtonAddAttachment();
		
		addAttachmentWithType("C:\\test.txt", "Отчет о реализации плана-графика закупок (*)");
		
		planGraphicsTabSteps.waitingForAppletVisible();
		planGraphicsTabSteps.selectTabPositionsPlanGrafics();
		
		planGraphicsPositionsPlanGraficsSteps.waitingForAppletVisible();
		planGraphicsPositionsPlanGraficsSteps.clickOnButtonIncludePositionsInPlanGrafic();
		
		choosePpgForIncludeInPGDiictionaryPageSteps.waitingForAppletVisible();
		choosePpgForIncludeInPGDiictionaryPageSteps.clickCheckBoxSelectFirstRow();
		choosePpgForIncludeInPGDiictionaryPageSteps.clickOnButtonOK();
		
		planGraphicsTabSteps.waitingForAppletVisible();
		planGraphicsTabSteps.selectTabSpecialPurchases();
		
		planGraphicsSpecialPurchasesSteps.waitingForAppletVisible();

		planGraphicsTabSteps.waitingForAppletVisible();
		planGraphicsTabSteps.selectTabTotalIndicatorsPlanGrafics();
		
		planGraphicsTotalIndicatorsPlanGraficsSteps.waitingForAppletVisible();
		planGraphicsTotalIndicatorsPlanGraficsSteps.clickOnButtonFillProcurementVolumeOfSubjectsSmallBusiness();
		planGraphicsTotalIndicatorsPlanGraficsSteps.clickOnButtonFillProcurementVolumeOfImplementedByRequestQuotation();
		planGraphicsTotalIndicatorsPlanGraficsSteps.clickOnButtonFillProcurementVolumeDeterminedAccordingFederalLaw();

		planGraphicsTabSteps.selectTabResultsOfKBK();
		planGraphicsResultsOfKBKSteps.waitingForAppletVisible();
		
		planGraphicsTabSteps.selectTabCoordinationSheet();
		
		planGraphicsCoordinationSheetSteps.waitingForAppletVisible();
		
		assertSteps.assertFieldEmpty("ФИО сотрудника в блоке \"Автор\"", planGraphicsCoordinationSheetSteps.getValueFioEmployeeAuthor());
		assertSteps.assertFieldEmpty("Должность в блоке \"Автор\"", planGraphicsCoordinationSheetSteps.getValuePositionAuthor());
		
		planGraphicsCoordinationSheetSteps.setTextPhoneAuthor("45-45-45");
		
		planGraphicsCoordinationSheetSteps.clickOnCheckBoxNeedCoordination();
		
		planGraphicsCoordinationSheetSteps.clickOnButtonAddNewRecordCoordinators();
		planGraphicsCoordinationSheetSteps.clickOnButtonChooseCoordinator();
		
		selectUser("Сафронов");
		
		planGraphicsCoordinationSheetSteps.waitingForAppletVisible();
		planGraphicsCoordinationSheetSteps.clickOnButtonChooseValidator();

		selectUser("Сафронов");
		
		planGraphicsCoordinationSheetSteps.clickOnFieldPhoneValidator();
		planGraphicsCoordinationSheetSteps.setTextPhoneValidator("45-45-45");

		planGraphicsCoordinationSheetSteps.clickOnButttonCheckDocument();
		
		saveTestResults();

		planGraphicsTabSteps.selectTabBasicInformation();
		planGraphicsBasicInformationSteps.waitingForAppletVisible();
		

		planGraphicsSteps.waitingForAppletVisible();
		planGraphicsSteps.selectFirstRow();
		
		String pgNumber = planGraphicsSteps.getTextNumberPlanGraphics();
		commonSteps.log("Номер плана-графика = "+pgNumber);
		System.out.println("Номер плана-графика = "+pgNumber);
		
		assertSteps.assertField("Статус плана-графика", "Черновик", planGraphicsSteps.getTextStatus());
		
		purchasePlanTabSteps.waitingForAppletVisible();
		purchasePlanTabSteps.selectTabAttributes();
		
		attributesPageSteps.waitingForAppletVisible();
		String pgId = attributesPageSteps.getTextId();
		commonSteps.log("Идентификатор плана-графика = "+pgId);
		System.out.println("Идентификатор плана-графика = "+pgId);
		
		planGraphicsSteps.clickOnLinkClose();
	
	}
	
}
