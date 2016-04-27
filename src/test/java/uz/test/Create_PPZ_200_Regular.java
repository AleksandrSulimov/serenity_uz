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
			menuSteps.clickOnLinkProcurementManagement(); //ssss
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

		
		
		
		positionsPurchasePlanOfProductJobService200BasicInformationSteps.clickOnButtonFrequencyOfPurchase();


	}
	
}
