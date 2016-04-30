package uz.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import org.hamcrest.MatcherAssert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Helpers {

	protected static final Logger logger = LoggerFactory.getLogger(Helpers.class);
	/**
	 * Возвращает текущую дату в указанном формате
	 * @param format
	 * @return String
	 */
	public String getFormattedCurrentDate(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Calendar c = Calendar.getInstance();
		String currentDate = sdf.format(c.getTime());
		return currentDate;
	}
	/**
	 * Возвращает Date 
	 * @param stringDate - дата в формате строки
	 * @param format - формат даты
	 * @return Date
	 */
	public Date stringToDate(String stringDate, String format){
		DateFormat f = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = f.parse(stringDate);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MatcherAssert.assertThat("Ошибка при конвертации строки: "+stringDate+" к формату: "+format, false);
		}
		return date;
		
	}
	
	/**
	 * Вычесть минуты из даты
	 * @param d
	 * @param minutes
	 * @return
	 */
	public Date dateMinusMinutes(Date d, int minutes){
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MINUTE, -minutes);
		return cal.getTime();
		
	}
	/**
	 * Прибавить минуты к дате
	 * @param d
	 * @param minutes
	 * @return
	 */
	public Date datePlusMinutes(Date d, int minutes){
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.MINUTE, minutes);
		return cal.getTime();
		
	}
	/**
	 * Прибавить часы к дате
	 * @param d
	 * @param minutes
	 * @return
	 */
	public Date datePlusHours(Date d, int minutes){
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR, minutes);
		return cal.getTime();
		
	}
	/**
	 * Возвращает текущую дату
	 * @return Date
	 */
	public Date getCurDate(){
		Calendar c = Calendar.getInstance();
		return c.getTime();
	}
	
	/**
	 * Возращает рандомный номер мобильного телефона
	 * @return String
	 */
	public String rndCellNum(){
		String num = "+79";
		Random r = new Random();
		for(int i=0; i<9;i++){
			num = num+r.nextInt(10);
		}
		//logger.info(num);
		return num;
	}
	
	/**
	 * Возвращает уникальный eduid
	 * @return
	 */
	public String getEDUID(){
		String eduid = "eduid"+System.nanoTime();
		//Serenity.setSessionVariable("eduid").to(eduid);
		return eduid;
	}
	
	/**
	 * Возвращает маскированный номер карты
	 * @param cardNumber
	 * @return
	 */
	public String getMaskedCard(String cardNumber){
		return cardNumber.substring(0,6)+"******"+cardNumber.substring(cardNumber.length()-4,cardNumber.length());
	}
	/**
	 * Возвращает маскированный номер карты
	 * @param cardNumber
	 * @return
	 */
	public String getMaskedCard(){
		String cardNumber = Serenity.sessionVariableCalled("numCard").toString();
		return cardNumber.substring(0,6)+"******"+cardNumber.substring(cardNumber.length()-4,cardNumber.length());
	}
	
	/**
	 * Добавляем ",00р." или "р." к стринге
	 * @param num
	 * @return
	 */
	public String formatStringMoney(String num){
		Boolean flag = false;
		for(int i=0;i<num.length();i++){ 
		    if(String.valueOf(num.charAt(i)).equals(",")){
		    	flag = true;
		   }
		}
		if(flag){
			num = num + "р.";
		}else{
			num = num + ",00р.";
		}
		return num;
	}
	/**
	 * Задержка в выполнении скрипта
	 * @param sec
	 */
	@Step("Задержка в выполнении скрипта {0} sec")
	public void sleep(long sec){
		long y=0;
		JOptionPane pane;
		JDialog dialog;
		java.util.Date startDate = new java.util.Date();
		pane = new JOptionPane("Осталось "+String.valueOf(sec-y)+" сек");
		dialog = pane.createDialog("Задержка в выполнении скрипта "+sec+" сек.");
		dialog.setSize(350, 150);
		dialog.setFocusable(true);
		dialog.setModal(false);
		dialog.setVisible(true);
		dialog.setAlwaysOnTop(true);
		while(sec-y>0){
			y = new  java.util.Date().getTime()/1000 - startDate.getTime()/1000;
			pane.setMessage("Осталось "+String.valueOf(sec-y)+" сек");
		}
		dialog.setVisible(false);
		dialog.dispose();
		return;
	}
	/**
	 * Взвращает дату в указанном формате
	 * @param date
	 * @param format
	 * @return formattedDate
	 */
	public String getStringFromDate(Date date, String format){
		  SimpleDateFormat sdf = new SimpleDateFormat(format);
		  String formattedDate = sdf.format(date);
		  return formattedDate;
	 }
	/**
	 * Взвращает текущуюю дату в указанном формате +- указанное количество дней
	 * @param format
	 * @param day
	 * @return formattedDate
	 */
	public String getCurTimeFormattedAddDay(String format, int day){
		  Calendar cl = Calendar. getInstance();
		  cl.setTime(new java.util.Date());
		  cl.add(Calendar.DAY_OF_YEAR, day);
		  SimpleDateFormat sdf = new SimpleDateFormat(format);
		  String formattedDate = sdf.format(cl.getTime());
		  return formattedDate;
	 }
	/**
	 * Взвращает текущуюю дату в указанном формате
	 * @param format
	 * @param day
	 * @return formattedDate
	 */
	public String getCurTimeFormatted(String format){
		  Calendar cl = Calendar. getInstance();
		  cl.setTime(new java.util.Date());
		  SimpleDateFormat sdf = new SimpleDateFormat(format);
		  String formattedDate = sdf.format(cl.getTime());
		  return formattedDate;
	 }
	/**
	 * Взвращает текущуюю дату в указанном формате +- указанное количество лет
	 * @param format
	 * @param year
	 * @return formattedDate
	 */
	public String getCurTimeFormattedAddYear(String format, int year){
		  Calendar cl = Calendar. getInstance();
		  cl.setTime(new java.util.Date());
		  cl.add(Calendar.YEAR, year);
		  SimpleDateFormat sdf = new SimpleDateFormat(format);
		  String formattedDate = sdf.format(cl.getTime());
		  return formattedDate;
	 }
	/**
	 * Взвращает текущуюю дату в указанном формате +- указанное количество минут
	 * @param format
	 * @param year
	 * @return formattedDate
	 */
	public String getCurTimeFormattedAddMinute(String format, int minute){
		  Calendar cl = Calendar. getInstance();
		  cl.setTime(new java.util.Date());
		  cl.add(Calendar.MINUTE, minute);
		  SimpleDateFormat sdf = new SimpleDateFormat(format);
		  String formattedDate = sdf.format(cl.getTime());
		  return formattedDate;
	 }
	/**
	 * Преобразует дату из формата formatIn в формат formatOut. Возвращает строку
	 * @param formatIn
	 * @param formatOut
	 * @return formattedDate
	 */
	 public String getDateFormatted(String dateIn, String formatIn, String formatOut) {
		  SimpleDateFormat sdfIn = new SimpleDateFormat(formatIn);
		  SimpleDateFormat sdfOut = new SimpleDateFormat(formatOut);
		  String formattedDate = "";
		  Date myDate;
			try {
				myDate = sdfIn.parse(dateIn);
				formattedDate = sdfOut.format(myDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		  return formattedDate;
	 }
	 /**
		 * Возвращает радомное число типа String. На вход количество симаолов
		 * @param length
		 */
		public String randomNum(int length){
			String num = "";
			Random r = new Random();
			for(int i=0; i<length;i++){
				num = num+(r.nextInt(9)+1);
			}
			return num.substring(0,length);
		}
	
		/**
		 * Конвертирует String вида 1000 в String вида 1 000,00р.
		 * @param val
		 * @return String
		 */
		public String convertStringToCurrency(String val){
			Locale locale = new Locale("ru_RU");//ru
			NumberFormat currencyFormatter = null;
			Double currencyAmount = null;
			String inStr = "";
			String out = "";
			try {
				inStr = val.replaceAll(" ", "");
				currencyAmount = Double.parseDouble(inStr);
				currencyFormatter = NumberFormat.getCurrencyInstance(locale);
				out = currencyFormatter.format(currencyAmount);
				out = out.replaceAll("¤ ", "")+" р.";
				out = out.replaceAll(" "," ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return out;
		}
		/**
		 * Возвращает рандомно выбранную фамилию
		 * @return String
		 */
		public String getRandomLastName(){
			String str = "";
			String path = "src/main/resources/dic/lastname.txt";
			File f = new File(path);
			int rowNum = new Random().nextInt(250) + 2;
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
				for(int i=1; i<=rowNum && str!=null; i++){
					str = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		
		/**
		 * Возвращает рандомно выбранное Имя
		 * @return String
		 */
		public String getRandomFirstName(){
			String str = "";
			String path = "src/main/resources/dic/firstname.txt";
			File f = new File(path);
			int rowNum = new Random().nextInt(140) + 2;
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
				for(int i=1; i<=rowNum && str!=null; i++){
					str = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		
		/**
		 * Возвращает рандомно выбранное Отчество
		 * @return String
		 */
		public String getRandomMiddleName(){
			String str = "";
			String path = "src/main/resources/dic/midame.txt";
			File f = new File(path);
			int rowNum = new Random().nextInt(55) + 2;
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
				for(int i=1; i<=rowNum && str!=null; i++){
					str = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
		
		public String getRandomPassport(String divisionCode, String idDate) {
			String str = "          ";
			String path = "src/main/resources/dic/passport.txt";
			File f = new File(path);
			BufferedReader br;
			String passportNum = randomNum(6);
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
				while(!str.substring(0, 2).equals(divisionCode.substring(0, 2)) && str!=null){
					str = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			passportNum = str.substring(3, 5) + idDate.substring(idDate.length()-2) + passportNum;
			return passportNum;
		}
		/**
		 * Возвращает транслит строки
		 * @return String
		 */
		public String getTranslitForString(String letter){
			String str = "";
			String path = "src/main/resources/dic/translit.txt";
			File f = new File(path);
			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(f), "UTF-8"));
				while(str!=null && !str.subSequence(0,1).equals(letter)){
					str = br.readLine();
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str.substring(2);
		}
		/**
		 * Возвращает уникальный email
		 * @return
		 */
		public String getUniqueEmail(){
			if(new Random().nextInt(10)%2==0){
				return "test"+randomNum(6)+"@mail.ru";
			}
			return "test"+randomNum(6)+"@gmail.com";
		}
		/**
		 * Создать файл
		 * @param path
		 */
		public void createNewFile(String path){
			File file = new File(path);
			if(!file.exists()) {
			   try {
				file.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
}
