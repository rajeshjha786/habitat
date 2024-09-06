package InterviewCoding;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Basic {
	WebDriver driver;
	
	@BeforeTest
	public void beforesetup(){
	WebDriverManager.getInstance().setup(); 
	 driver= new ChromeDriver();
	}
	
	@Test(priority=1)
	public void setup() throws IOException, Exception{
		
		
	driver.get("https://www.google.com/");
	driver.quit();
//	Thread.sleep(2000);
//	
//	
//	driver.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]")).sendKeys("Rajesh kumar Jha");
//	
//	Actions builder= new Actions(driver);
//	builder.keyDown(Keys.ENTER);
//	driver.findElement(By.xpath("//div[@class='lJ9FBc']//input[@class='gNO89b']")).click();
//	builder.keyUp(Keys.ENTER);
//    builder.build().perform();
//    driver.manage().window().maximize();
//    List<WebElement> element= driver.findElements(By.xpath("//h3[contains(@class,'LC20lb MBeuO DKV0Md')]"));
//    System.out.println(element.isEmpty());
//    
//    
//    
//    
//    
/

    
    
    
    
    
    //	Iterator itr=element.iterator();
//	while(itr.hasNext()){
//
//   for(int i=0;i<element.size();i++){
//	if(element.get(i).getText()=="Rajesh Kumar Jha shell"){
//		 System.out.println(driver.getTitle());
//		
//		
//	}
//}
	}
	
//	List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'OBMEnb')]//ul//li//descendant::div[@class='pcTkSc']"));
//	
//	
//	System.out.println(list.size());
//	for(int i=0;i<list.size();i++){
//		if(list.get(i).getAttribute("aria-label").contains("rajesh exports")){
//			list.get(i).click();
//			break;
//		}
	}

	
	
//	driver.findElement(By.xpath("//a[contains(@class,'primaryBtn font24 latoBold widgetSearchBtn ')]")).click();
	
	
	//ul[contains(@class,'G43f7e')]//li[1]
	
	
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
//	
//	driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')] ")).clear();
//	driver.findElement(By.xpath("//input[contains(@class,'gLFyf gsfi')] ")).sendKeys("Sprinklr");
//	driver.findElement(By.xpath("//div[contains(@class,'FPdoLc lJ9FBc')]//input[contains(@class,'gNO89b')] ")).click();
//	
//	List<WebElement> list=driver.findElements(By.xpath("//a[contains(@href,'')]"));
//	
//	System.out.println(list);
	
//	Iterator<WebElement> itr=list.iterator();
//	
//	while(itr.hasNext()){
//		
//		System.out.println(itr.next().getSize());
//		System.out.println(itr.next().getText());
//		
//	}
	
	
	
	
	


