package uz.test;

import java.awt.AWTException;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Create_PPZ_200_Special extends TestCasesBase{

	@Title("Создание ППЗ 200 Особая")
    @Test
	public void create_PPZ_200_Special() throws AWTException{
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Создание ППЗ 200 Особая");

		h.createNewFile("C:\\test.txt");
		
		selectPushedProcurementManagement();
		goToApplicationForms();
		expandProcurementManagementOnApplicationForms();
		expandPlanProcurementOnApplicationForms();	
		
		applicationFormsSteps.clickOnLinkPositionPlanProcurement200();
		
		positionsPurchasePlan200Steps.waitingForAppletVisible();
		positionsPurchasePlan200Steps.clickOnButtonCreteNewDocument();
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabBasicInformation();
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldPurchaseType();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.openListPurchaseType();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.selectFromDropDownList("Товары");
		assertSteps.assertField("Тип закупки", "Товары, работы, услуги, не превышающие 100 тыс. руб. (п.4 ч.1 ст.93 44-ФЗ)", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValuePurchaseType());
				
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonOkpdOpenDictionary();
		okpd2DictionaryPageSteps.waitingForAppletVisible();
		okpd2DictionaryPageSteps.openListFirstLevel("26", 2);
		okpd2DictionaryPageSteps.openListSecondLevel("26.2");
		okpd2DictionaryPageSteps.openListSecondLevel("26.20");
		okpd2DictionaryPageSteps.openListSecondLevel("26.20.2");
		okpd2DictionaryPageSteps.clickOnElementSecondLevel("26.20.22");
		if(okpd2DictionaryPageSteps.checkFilterOn()){
			okpd2DictionaryPageSteps.clickFilter();
		}
		okpd2DictionaryPageSteps.clickOnFieldCode();
		okpd2DictionaryPageSteps.setTextCode("26.20.22.000");
		okpd2DictionaryPageSteps.clickOnButtonRefresh();
		if(!okpd2DictionaryPageSteps.getValueCode().equals("26.20.22.000")){
			assertSteps.assertFalse("Поиск значения \"26.20.22.000\" в справочнике", "Значение \"26.20.22.000\" не найдено в справочнике");
		}
		okpd2DictionaryPageSteps.clickOnButtonOK();
		
		assertSteps.assertField("ОКПД *", "26.20.22.000", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueOKPD());
		assertSteps.assertFieldEmpty("Наименование кода товара (работы, услуги) по ОКПД", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueCodeProductName());
		assertSteps.assertFieldEmpty("Наименование объекта закупки", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueObjectOfTenderName());
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldDescOfProcurementPlanPosition();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.setTextDescOfProcurementPlanPosition("Услуги по ремонту компьютеров");
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldJustificationPurchases();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.setTextJustificationPurchases("Производственная необходимость");
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonAddAttachment();

		addAttachment("C:\\test.txt");
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabAmountOfFinancialSupport();

		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnButtonСreateNewRecord();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnFieldPublishYearInput();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.selectFromDropDownList("2016");
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnButtonOpenDictionaryKD();
		
		selectValueInChainsOfKBKDiictionary("100.01.06.39.2.04.00590.244 14");
		
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnButtonOpenDictionaryAdditionalAnalyticalSig();
		selectValueInAdditionalAnalyticalSignDictionary("Иное");
		
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnFieldYear2016();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.setTextYear2016("15");
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabCoordinationSheet();
		
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnCheckBoxNeedCoordination();
		
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnButtonAddNewRecordCoordinators();
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnButtonChooseCoordinator();
		
		selectUser("Сафронов");
		
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnButtonChooseValidator();

		selectUser("Сафронов");
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.clickOnButttonCheckDocument();
		
		saveTestResults();
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabBasicInformation();
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldProcurementPlanPositionNumber();
		String ppzNumber = positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueProcurementPlanPositionNumber();
		commonSteps.log("Номер позиции плана закупок = "+ppzNumber);
		System.out.println("Номер позиции плана закупок = "+ppzNumber);
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonClose();
		
		positionsPurchasePlan200Steps.waitingForAppletVisible();
		if(!positionsPurchasePlan200Steps.isPushedLinkFilter()){
			positionsPurchasePlan200Steps.clickOnLinkFilter();
		}
		if(positionsPurchasePlan200Steps.isFilterExist()){
			positionsPurchasePlan200Steps.clickOnButtonResetFilter();
		}
		positionsPurchasePlan200Steps.setPositionPlanPurshedInFilter(ppzNumber);
		positionsPurchasePlan200Steps.selectFirstRow();
		if(!positionsPurchasePlan200Steps.checkNumberPositionPlanPurshedEists(ppzNumber)){
			assertSteps.assertFalse("Проверка существования записи в ППЗ", "Запись с номером "+ppzNumber+" не найдена!");
		}
		assertSteps.assertField("Статус записи в ППЗ", "Черновик", positionsPurchasePlan200Steps.getTextStatus());
		
		purchasePlanTabSteps.selectTabAttributes();
		
		attributesPageSteps.waitingForAppletVisible();
		String ppzId = attributesPageSteps.getTextId();
		commonSteps.log("Идентификатор позиции плана закупок = "+ppzId);
		System.out.println("Идентификатор позиции плана закупок = "+ppzId);
		
		positionsPurchasePlan200Steps.clickOnLinkClosePPZ();
	
	}
	
}