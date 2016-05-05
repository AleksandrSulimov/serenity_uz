package uz.utils;
import java.io.File;

import org.hamcrest.MatcherAssert;

import autoitx4java.AutoItX;

import com.jacob.com.LibraryLoader;
/**
* AutoIt
* Класс для работы с библиотекой AutoIt и JACOB
* @author s.serov 24.11.2015
*
*/
public class AutoIt {

	 final String JACOB_DLL_TO_USE = System.getProperty("sun.arch.data.model").contains("32") ?
	          "jacob-1.18-x86.dll" : "jacob-1.18-x64.dll";
	 
	 private AutoItX control;
	 
	 public AutoIt(){
		 File file = new File(System.getProperty("user.dir")+"\\lib", JACOB_DLL_TO_USE);
		  System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		  
		  control = new AutoItX();
	 }
	/**
	 * Выбираем сертификат
	 */
	 public void selectCertInJinnClient(){
		 control.winWait("Jinn-Client", "", 5); //[Title:Jinn-Client]
		if(control.winExists("Jinn-Client")){
			control.winActivate("Jinn-Client");
			/*
			control.controlClick("", "Обновить", "");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			*/
			control.controlClick("Jinn-Client", "", "1000");
			control.controlSend("Jinn-Client","","1000","12345678");
			control.controlClick("Jinn-Client", "OK", "1");
			Boolean isClose = control.winWaitClose("Jinn-Client", "", 5);
			if(!isClose){
				MatcherAssert.assertThat("Окно Jinn-Clien не закрылось", false);
			}
		}else{
			System.out.println("Окно Jinn-Client для выбора сертификата не появилось");
			//MatcherAssert.assertThat("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось", false);
		}
	 }
	 
	 public void signInJinnClient(){
		 control.winWait("Jinn-Client. Просмотр документа перед формированием подписи", "", 5); //[Title:Jinn-Client]
		if(control.winExists("Jinn-Client. Просмотр документа перед формированием подписи")){
			control.winActivate("JJinn-Client. Просмотр документа перед формированием подписи");
			control.controlClick("Jinn-Client. Просмотр документа перед формированием подписи", "Подписать", "1");
			
			Boolean isClose = control.winWaitClose("Jinn-Client. Просмотр документа перед формированием подписи", "", 5);
			if(!isClose){
				MatcherAssert.assertThat("Jinn-Client. Просмотр документа перед формированием подписи", false);
			}
		}else{
			System.out.println("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось");
			//MatcherAssert.assertThat("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось", false);
		}
	 }
	 
	 public void selectFileInFireFox(){
		 File f = new File("src/main/resources/test.txt");
		 String path = f.getAbsolutePath();
		 control.winWait("Выгрузка файла", "", 5); //[Title:Jinn-Client]
		if(control.winExists("Выгрузка файла")){
			control.winActivate("Выгрузка файла");
			control.controlClick("Выгрузка файла", "", "[CLASS:Edit; INSTANCE:1]");
			control.controlSend("Выгрузка файла","","[CLASS:Edit; INSTANCE:1]",path);
			control.controlClick("Выгрузка файла", "", "[CLASS:Button; INSTANCE:1]");
			Boolean isClose = control.winWaitClose("Выгрузка файла", "", 5);
			if(!isClose){
				MatcherAssert.assertThat("Окно Выгрузка файла не закрылось", false);
			}
		}else{
			System.out.println("Окно Выгрузка файла не появилось");
			//MatcherAssert.assertThat("Окно Jinn-Client. Просмотр документа перед формированием подписи не появилось", false);
		}
	 }
	 
}
