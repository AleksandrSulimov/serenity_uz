package uz.test;

import java.awt.AWTException;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Title;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class Create_PZ extends TestCasesBase{

	@Title("Создание ППЗ 200 обычная")
    @Test
	public void create_PPZ_200_Regular() throws AWTException{
		
		
		Serenity.setSessionVariable("start_time").to(h.getFormattedCurrentDate("dd.MM.yyyy HH:mm:ss"));
		Serenity.setSessionVariable("test_name").to("Создание ППЗ 200 обычная");

		h.createNewFile("C:\\test.txt");
		
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
		
		applicationFormsSteps.waitingForAppletVisible();
		
		if(!applicationFormsSteps.isPushedLinkPlanProcurement()){
			applicationFormsSteps.clickOnLinkPlanProcurement();
		}
		
		applicationFormsSteps.clickOnLinkPlanProcurementInPlanProcurement();
		
		purchasePlanSteps.waitingForAppletVisible();
		purchasePlanSteps.clickOnButtonCreteNewDocument();
		
		
		
		
		
		
		positionsPurchasePlan200Steps.waitingForAppletVisible();
		positionsPurchasePlan200Steps.clickOnButtonCreteNewDocument();
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabBasicInformation();
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldPurchaseType();
		assertSteps.assertField("Тип закупки", "Закупка", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValuePurchaseType());
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonOkpdOpenDictionary();
		okpd2DictionaryPageSteps.waitingForAppletVisible();
		okpd2DictionaryPageSteps.openListFirstLevel("26", 2);
		okpd2DictionaryPageSteps.openListSecondLevel("26.2");
		okpd2DictionaryPageSteps.openListSecondLevel("26.20");
		okpd2DictionaryPageSteps.openListSecondLevel("26.20.1");
		okpd2DictionaryPageSteps.clickOnElementSecondLevel("26.20.11");
		if(okpd2DictionaryPageSteps.checkFilterOn()){
			okpd2DictionaryPageSteps.clickFilter();
		}
		okpd2DictionaryPageSteps.clickOnFieldCode();
		okpd2DictionaryPageSteps.setTextCode("26.20.11.120");
		okpd2DictionaryPageSteps.clickOnButtonRefresh();
		if(!okpd2DictionaryPageSteps.getValueCode().equals("26.20.11.120")){
			assertSteps.assertFalse("Поиск значения \"26.20.11.120\" в справочнике", "Значение \"26.20.11.120\" не найдено в справочнике");
		}
		okpd2DictionaryPageSteps.clickOnButtonOK();
		
		assertSteps.assertField("ОКПД *", "26.20.11.120", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueOKPD());
		assertSteps.assertFieldEmpty("Наименование кода товара (работы, услуги) по ОКПД", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueCodeProductName());
		assertSteps.assertFieldEmpty("Наименование объекта закупки", positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueObjectOfTenderName());
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldDescOfProcurementPlanPosition();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.setTextDescOfProcurementPlanPosition("Услуги по ремонту электронных книг");
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldTermOfPurchase();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.setTextTermOfPurchase("12.2016");
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonFrequencyOfPurchase();
		
		frequencyOfPurchasesDictionaryPageSteps.waitingForAppletVisible();
		if(frequencyOfPurchasesDictionaryPageSteps.checkFilterOn()){
			frequencyOfPurchasesDictionaryPageSteps.clickFilter();
		}
		frequencyOfPurchasesDictionaryPageSteps.clickOnFieldFrequency();
		frequencyOfPurchasesDictionaryPageSteps.setTextFrequency("Ежемесячно");
		frequencyOfPurchasesDictionaryPageSteps.clickOnButtonRefresh();
		if(!frequencyOfPurchasesDictionaryPageSteps.getValueFrequency().equals("Ежемесячно")){
			assertSteps.assertFalse("Поиск значения \"Ежемесячно\" в справочнике", "Значение \"Ежемесячно\" не найдено в справочнике");
		}
		frequencyOfPurchasesDictionaryPageSteps.clickOnRadioButtonFrequency();
		frequencyOfPurchasesDictionaryPageSteps.clickOnButtonOK();
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldJustificationPurchases();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.setTextJustificationPurchases("Производственная необходимость");
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldNameOfStateProgram();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.setTextNameOfStateProgram("Книжки электронные записные и аналогичная компьютерная техника");
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonAddAttachment();

		addAttachmentPageSteps.waitingForAppletVisible(); 
		addAttachmentPageSteps.loadFile("C:\\test.txt");
		addAttachmentPageSteps.clickOnButtonSave();
		
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabAmountOfFinancialSupport();

		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnButtonСreateNewRecord();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnFieldPublishYearInput();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.selectFromDropDownList("2016");
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnButtonOpenDictionaryKD();
		
		chainsOfKBKDiictionaryPageSteps.waitingForAppletVisible();
		if(chainsOfKBKDiictionaryPageSteps.checkFilterOn()){
			chainsOfKBKDiictionaryPageSteps.clickFilter();
		}
		chainsOfKBKDiictionaryPageSteps.clickOnFieldChainsOfKBK();
		chainsOfKBKDiictionaryPageSteps.setTextChainsOfKBK("100.10.06.39.7.05.00190.242 14");
		chainsOfKBKDiictionaryPageSteps.clickOnButtonRefresh();
		if(!chainsOfKBKDiictionaryPageSteps.getValueChainsOfKBK().equals("100.10.06.39.7.05.00190.242 14")){
			assertSteps.assertFalse("Поиск значения \"100.10.06.39.7.05.00190.242 14\" в справочнике", "Значение \"100.10.06.39.7.05.00190.242 14\" не найдено в справочнике");
		}
		chainsOfKBKDiictionaryPageSteps.clickOnFieldChainsOfKBK("100.10.06.39.7.05.00190.242 14");
		chainsOfKBKDiictionaryPageSteps.clickOnButtonOK();
		
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnButtonOpenDictionaryAdditionalAnalyticalSig();
		
		additionalAnalyticalSignDictionaryPageSteps.waitingForAppletVisible();
		if(additionalAnalyticalSignDictionaryPageSteps.checkFilterOn()){
			additionalAnalyticalSignDictionaryPageSteps.clickFilter();
		}
		additionalAnalyticalSignDictionaryPageSteps.clickOnFieldAdditionalAnalyticalSign();
		additionalAnalyticalSignDictionaryPageSteps.setTextAdditionalAnalyticalSign("Оплата работ, услуг");
		additionalAnalyticalSignDictionaryPageSteps.clickOnButtonRefresh();
		if(!additionalAnalyticalSignDictionaryPageSteps.getValueAdditionalAnalyticalSign().equals("Оплата работ, услуг")){
			assertSteps.assertFalse("Поиск значения \"Оплата работ, услуг\" в справочнике", "Значение \"Оплата работ, услуг\" не найдено в справочнике");
		}
		additionalAnalyticalSignDictionaryPageSteps.clickOnRadioButtonAdditionalAnalyticalSign();
		additionalAnalyticalSignDictionaryPageSteps.clickOnButtonOK();
		
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.clickOnFieldYear2016();
		positionsPurchasePlanOfProductJobService200AmountOfFinancialSupportSteps.setTextYear2016("25");
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabCoordinationSheet();
		
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnCheckBoxNeedCoordination();
		
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnButtonAddNewRecordCoordinators();
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnButtonChooseCoordinator();
		
		selectUserDialogSteps.waitingForAppletVisible();
		selectUserDialogSteps.clickOnFieldUserFIO("Сафронов");
		selectUserDialogSteps.clickOnButtonOk();
		
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200CoordinationSheetSteps.clickOnButtonChooseValidator();

		selectUserDialogSteps.waitingForAppletVisible();
		selectUserDialogSteps.clickOnFieldUserFIO("Сафронов");
		selectUserDialogSteps.clickOnButtonOk();
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.clickOnButttonCheckDocument();
		
		testResultsDialogSteps.waitingForAppletVisible();
		if(!testResultsDialogSteps.checkSaveButtonEists()){
			assertSteps.assertFalse("Проверка существования кнопки Сохранить", "Кнопка Сохранить не найдена!");
		}
		testResultsDialogSteps.clickOnButtonSave();
		
		positionsPurchasePlanOfProductJobService200TabSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200TabSteps.selectTabBasicInformation();
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.waitingForAppletVisible();
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnFieldProcurementPlanPositionNumber();
		String procurementPlanPositionNumber = positionsPurchasePlanOfProductJobService200BasicInformationSteps.getValueProcurementPlanPositionNumber();
		commonSteps.log("Номер позиции плана закупок = "+procurementPlanPositionNumber);
		System.out.println(procurementPlanPositionNumber);
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonClose();
		
		positionsPurchasePlan200Steps.waitingForAppletVisible();
		if(!positionsPurchasePlan200Steps.isPushedLinkFilter()){
			positionsPurchasePlan200Steps.clickOnLinkFilter();
		}
		if(positionsPurchasePlan200Steps.isFilterExist()){
			positionsPurchasePlan200Steps.clickOnButtonResetFilter();
		}
		positionsPurchasePlan200Steps.setPositionPlanPurshedInFilter(procurementPlanPositionNumber);
		if(!positionsPurchasePlan200Steps.checkNumberPositionPlanPurshedEists(procurementPlanPositionNumber)){
			assertSteps.assertFalse("Проверка существования записи в ППЗ", "Запись с номером "+procurementPlanPositionNumber+" не найдена!");
		}
		assertSteps.assertField("Статус записи в ППЗ", "Черновик", positionsPurchasePlan200Steps.getTextStatus());
		
		positionsPurchasePlan200Steps.clickOnLinkClosePPZ();
	
	}
	
}
