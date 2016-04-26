package uz.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import org.hamcrest.MatcherAssert;

import uz.utils.Helpers;

@SuppressWarnings("serial")
public class AssertSteps extends ScenarioSteps {

	public AssertSteps(Pages pages) {
        super(pages);
    }

	@Step("{0}. Ожидаемое значение: {1}. Текущее значение: {2}")
	public void assertEqualsStringValue(String description, String expected, String actual){
		MatcherAssert.assertThat("Ошибка при проверке поля. Ожидаемое значение: "+expected+". Текущее значение: "+actual, actual.equals(expected));
	}
	@Step("{0}. Ожидаемое значение: {1}.")//Текущее значение: {2}
	public void assertContainsStringValue(String description, String expected, String actual){
		actual = actual.replaceAll("\r|\n|\r\n", "");
		MatcherAssert.assertThat("Ошибка при проверке поля. Ожидаемое значение: "+expected+". Текущее значение: "+actual, actual.contains(expected));
	}
	@Step("Проверить что поле \"{0}\" содержит значение: \"{1}\"")
	public void assertFieldContainsValue(String field, String expected, String actual){
		actual = actual.replaceAll("\r|\n|\r\n", "");
		MatcherAssert.assertThat("Ошибка при проверке содержания поля \""+field+"\". Ожидаемое значение: "+expected+". Текущее значение: "+actual, actual.contains(expected));
	}
	@Step("Проверить что значение в поле \"{0}\" соответсвует шаблону: \"{1}\"")
	public void assertFieldMatchesValue(String field, String expected, String actual){
		actual = actual.replaceAll("\r|\n|\r\n", "");
		MatcherAssert.assertThat("Ошибка при проверке соответствия поля \""+field+"\" шаблону: [["+expected+"]]. Текущее значение: [["+actual+"]]", actual.matches(expected));
	}
	@Step("Проверить поле \"{0}\". Ожидаемое значение: \"{1}\". Текущее значение: \"{2}\"")
	public void assertField(String field, String expected, String actual){
		actual = actual.replaceAll("\r|\n|\r\n", "");
		MatcherAssert.assertThat("Ошибка при проверке поля \""+field+"\". Ожидаемое значение: '"+expected+"'. Текущее значение: '"+actual+"'", actual.equalsIgnoreCase(expected));
	}
	
	@Step("Проверить поле \"{0}\". Ожидаемое значение: {1}. Текущее значение: {3}")
	public void assertEqualsDate(String field, String expectedDate, String expectedDateFormat,  String actualDate, String actualDateFormat){
		MatcherAssert.assertThat("Ошибка при проверке поля \""+field+"\". Ожидаемое значение: "+expectedDate+". Текущее значение: "+actualDate, new Helpers().stringToDate(expectedDate, expectedDateFormat).compareTo(new Helpers().stringToDate(actualDate,actualDateFormat))==0);
	}
	@Step("Проверить поле \"{0}\". Ожидаемое значение: {1}. Текущее значение: {2}")
	public void assertDigitalValue(String field, String expected, String actual){
		MatcherAssert.assertThat("Ошибка при проверке поля \""+field+"\". Ожидаемое значение: "+expected+". Текущее значение: "+actual, ((actual.replaceAll(",00р.", "")).replaceAll("0р.", "").replaceAll("\\D", "")).equals(expected.replaceAll("\\D", "")));
	}
	
	@Step("Проверить, что поле \"{0}\" не пустое")
	public void assertFieldEmpty(String field, String actual){
		MatcherAssert.assertThat("Ошибка при проверке поля \""+field+"\". Текущее значение: "+actual, !actual.equals(""));
	}
	
	@Step("{0}")
	public void assertFalse(String description, String errorDescription){
		MatcherAssert.assertThat(errorDescription, false);
	}
	
	@Step("{0}")
	public void assertTrue(String description) {
		MatcherAssert.assertThat(description, true);
	}

	@Step("{0}. Ожидаемое значение: {1}. Текущее значение: {2}")
	public void assertNotEqualsStringValue(String description, String expected, String actual) {
		MatcherAssert.assertThat("Ошибка при проверке поля. Ожидаемое значение: "+expected+". Текущее значение: "+actual, !actual.equals(expected));

	}
	@Step("{0}. Ожидаемое значение: {1}. Текущее значение: {2}")
	public void assertEqualsDouble(String description, Double expected, Double actual) {
		MatcherAssert.assertThat("Ошибка при проверке поля. Ожидаемое значение: "+expected+". Текущее значение: "+actual, actual.equals(expected));

	}
	@Step("Проверить поле \"{0}\". Ожидаемое значение: \"{1}\". Текущее значение: \"{2}\"")
	public void assertFieldEqualsDouble(String field, Double expected, Double actual) {
		MatcherAssert.assertThat("Ошибка при проверке поля \""+field+"\". Ожидаемое значение: "+expected+". Текущее значение: "+actual, actual.equals(expected));
	}
	
	@Step("Проверить сумму в поле \"{0}\". Ожидаемое значение: {1}. Текущее значение: {2}")
	public void assertSum(String field, String expected, String actual){
		System.out.println(expected+" == "+actual);
		double actualDouble = Double.valueOf(actual.replaceAll(",|р.|\\s", ""));
		double expectedDouble = Double.valueOf(expected.replaceAll(",|р.|\\s", ""));
		MatcherAssert.assertThat("Ошибка при проверке суммы в поле \""+field+"\". Ожидаемое значение: "+expected+". Текущее значение: "+actual+". ["+actualDouble+" != "+expectedDouble+"]", actualDouble==expectedDouble);
	}
	
	@Step("Проверить поле \"{0}\". Ожидаемое значение: NULL. Текущее значение: \"{1}\"")
	public void assertFieldIsNull(String field, String actual) {
		MatcherAssert.assertThat("Ошибка при проверке поля \""+field+"\". Ожидаемое значение: NULL. Текущее значение: "+actual, actual==null);
	}
	
	
}