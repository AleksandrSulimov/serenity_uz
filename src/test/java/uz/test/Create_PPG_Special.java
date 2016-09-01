package uz.test;

import java.awt.AWTException;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

import uz.utils.JSON;

@RunWith(SerenityRunner.class)
public class Create_PPG_Special extends TestCasesBase{

	@Title("Создание ППГ особая")
    @Test
	public void create_PPG_Special() throws AWTException{
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Создание ППГ особая");
		
		String ppzNum = JSON.readJSON("ppz_num", "ppz_num");
		
		selectPushedProcurementManagement();
		goToApplicationForms();
		checkApplicationFormsIsActive();
		expandProcurementManagementOnApplicationForms();
		expandPlanningOnApplicationForms();
		expandPlanGraphicsFirstLevelOnApplicationForms();
		expandPositionPlanGraphicsOnApplicationForms();
		applicationFormsSteps.clickOnLinkPositionPlanGraphicsPurches();
		
		positionsPlanGraphicsPurchesSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesSteps.clickOnButtonCreteNewDocument();
		
		selectTypeOfProcurementAndProcurementPlanPPZDialogSteps.waitingForAppletVisible();
		selectTypeOfProcurementAndProcurementPlanPPZDialogSteps.checkRadioButtonValue("Позиция плана закупок 200");
		selectTypeOfProcurementAndProcurementPlanPPZDialogSteps.clickOnButtonSelect();
		
		//selectValueInSelectPositionOfProcurementPlanDiictionaryByOKPD2("26.20.22.000");
		selectValueInSelectPositionOfProcurementPlanDiictionaryByPPZ(ppzNum);
		
		positionsPlanGraphicsPurchesTabSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesTabSteps.selectTabBasicInformation();
		
		positionsPlanGraphicsPurchesBasicInformationSteps.waitingForAppletVisible();
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldProcurementPlanPositionNumber();
		assertSteps.assertFieldEmpty("Номер позиции плана закупок", positionsPlanGraphicsPurchesBasicInformationSteps.getValueProcurementPlanPositionNumber());
		//assertSteps.assertFieldEmpty("Идентификационный код закупки", positionsPlanGraphicsPurchesBasicInformationSteps.getValueIdentificationProcurementCode());
		assertSteps.assertFieldEmpty("Статус", positionsPlanGraphicsPurchesBasicInformationSteps.getValueStatus());
		assertSteps.assertFieldEmpty("Тип закупки позиции плана закупок", positionsPlanGraphicsPurchesBasicInformationSteps.getValueTypeOfPurchasePositionProcurementPlan());
		assertSteps.assertFieldEmpty("Дата создания", positionsPlanGraphicsPurchesBasicInformationSteps.getValueCreationDate());
		assertSteps.assertFieldEmpty("Заказчик", positionsPlanGraphicsPurchesBasicInformationSteps.getValueCustomer());
		assertSteps.assertFieldEmpty("ИНН", positionsPlanGraphicsPurchesBasicInformationSteps.getValueINN());
		assertSteps.assertFieldEmpty("КПП", positionsPlanGraphicsPurchesBasicInformationSteps.getValueKPP());
		assertSteps.assertFieldEmpty("ОГРН", positionsPlanGraphicsPurchesBasicInformationSteps.getValueOGRN());
		assertSteps.assertFieldEmpty("Наименование объекта закупки (предмет контракта)", positionsPlanGraphicsPurchesBasicInformationSteps.getValueObjectOfTenderName());
		assertSteps.assertFieldEmpty("Код ОКПД 2", positionsPlanGraphicsPurchesBasicInformationSteps.getValueOKPD());
		assertSteps.assertFieldEmpty("Наименование кода товара (работы, услуги) по ОКПД 2", positionsPlanGraphicsPurchesBasicInformationSteps.getValueNameOfProductCode());
		
		positionsPlanGraphicsPurchesTabSteps.selectTabCoordinationSheet();
		
		positionsPlanGraphicsPurchesCoordinationSheetSteps.waitingForAppletVisible();
		assertSteps.assertField("ФИО сотрудника в блоке \"Автор\"", "Олег В. Сафронов", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueFioEmployeeAuthor());
		assertSteps.assertField("Должность в блоке \"Автор\"", "Начальник", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValuePositionAuthor());
		assertSteps.assertField("Этап в блоке \"Согласующие\"", "1", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueStageMatcher());
		assertSteps.assertField("Код группы в блоке \"Согласующие\"", "1", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueCodeGroupMatcher());
		assertSteps.assertField("Порядковый номер согласующего в блоке \"Согласующие\"", "1", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueSequenceNumberMatching());
		assertSteps.assertField("ФИО сотрудника в блоке \"Согласующие\"", "Олег В. Сафронов", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueFioEmployeeMatching());
		assertSteps.assertField("Должность в блоке \"Согласующие\"", "Начальник", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValuePositionMatching());
		assertSteps.assertField("Результат согласования в блоке \"Согласующие\"", "Требует согласования", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueResultMatching());
		assertSteps.assertField("ФИО сотрудника в блоке \"Утверждающий\"", "Олег В. Сафронов", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValueFioEmployeePredicating());
		assertSteps.assertField("Должность в блоке \"Утверждающий\"", "Начальник", positionsPlanGraphicsPurchesCoordinationSheetSteps.getValuePositionPredicating());

		positionsPlanGraphicsPurchesCoordinationSheetSteps.clickOnButtonCheckDocument();
		
		saveTestResults();
		
		positionsPlanGraphicsPurchesTabSteps.selectTabBasicInformation();
		positionsPlanGraphicsPurchesBasicInformationSteps.waitingForAppletVisible();
		
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnFieldPositionsPlanGraphicsPurchesNumber();
		String ppgNum = positionsPlanGraphicsPurchesBasicInformationSteps.getValuePositionsPlanGraphicsPurchesNumber();
		commonSteps.log("Номер позиции плана-графика закупок = "+ppgNum);
		System.out.println("Номер позиции плана-графика закупок = "+ppgNum);
		Serenity.setSessionVariable("ppgNum").to(ppgNum);
		JSON.writeJSON("ppg_num", "ppg_num", ppgNum);
		positionsPlanGraphicsPurchesBasicInformationSteps.clickOnButtonClose();
		
		positionsPlanGraphicsPurchesSteps.waitingForAppletVisible();
		
		//Раскрыли фильтр
		if(!positionsPlanGraphicsPurchesSteps.isPushedLinkFilter()){
			positionsPlanGraphicsPurchesSteps.clickOnLinkFilter();
		}
		//Очистили фильтр
		if(positionsPlanGraphicsPurchesSteps.isFilterExist()){
			positionsPlanGraphicsPurchesSteps.clickOnButtonResetFilter();
		}
		
		positionsPlanGraphicsPurchesSteps.setPositionPlanGraphicInFilter(ppgNum);
		positionsPlanGraphicsPurchesSteps.selectFirstRow();
		assertSteps.assertField("Статус ППГ", "Черновик", positionsPlanGraphicsPurchesSteps.getTextStatus());

		purchasePlanTabSteps.waitingForAppletVisible();
		purchasePlanTabSteps.selectTabAttributes();
		
		attributesPageSteps.waitingForAppletVisible();
		String ppgId = attributesPageSteps.getTextId();
		commonSteps.log("Идентификатор позиции плана-графика закупок = "+ppgId);
		System.out.println("Идентификатор позиции плана-графика закупок = "+ppgId);
		Serenity.setSessionVariable("ppgId").to(ppgId);
		JSON.writeJSON("ppg_id", "ppg_id", ppgId);
		positionsPlanGraphicsPurchesSteps.clickOnLinkClose();
	
	}
	
}
