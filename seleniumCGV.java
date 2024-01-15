package selenium_test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumCGV {

	public static void main(String[] args) {
	    //드라이버 생성
	    WebDriver driver = new ChromeDriver();
	    
	    //페이지 띄우기
	    driver.get("https://www.naver.com/");
	    
//	    WebElement loginButton = driver.findElement(
//				By.xpath(
//						"/html/body/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div/a"));
//		loginButton.click();	    
	    
	    
	    
	    WebElement searchBox = driver.findElement(
				By.xpath(
						"/html/body/div[2]/div[1]/div/div[3]/div[2]/div/form/fieldset/div/input"));
	    searchBox.sendKeys("애슐리퀸즈 NC대전유성점");
	    searchBox.sendKeys(Keys.ENTER);
	    
	    // 예약 버튼 클릭 후 대기
	    WebDriverWait wait = new WebDriverWait(driver, 10); // 10초 대기
	    WebElement resButton =
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[2]/div[3]/div/section/div/div[5]/div/ul/li[1]/a/div[2]/div[1]/div/span")));
	    //예약 버튼 클릭
	    resButton.click();
	    
	    WebDriverWait wait5 = new WebDriverWait(driver, 5); // 10초 대기
	    WebElement nextButton = 
	    		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/section[2]/div/div[2]/div/div/ul/li[12]/button")));
	    nextButton.click();
	    
	    WebElement numBox = driver.findElement(
				By.xpath(
						"/html/body/div[1]/main/section[2]/div/div[2]/div/div/ul/li[21]/div/input"));
	    numBox.sendKeys("26");
	    
	    
	    WebDriverWait wait3 = new WebDriverWait(driver, 3); // 10초 대기
	    WebElement numButton = 
	    		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/section[2]/div/div[2]/div/div/ul/li[21]/div/button[2]")));
	    numButton.click();
	    
	    WebElement dateButton = driver.findElement(
				By.xpath(
						"/html/body/div[1]/main/section[2]/div/div[3]/div[1]/div/table/tbody/tr[4]/td[6]/button"));
		dateButton.click();
		
		WebElement timeButton = driver.findElement(
				By.xpath(
						"/html/body/div[1]/main/section[2]/div/div[3]/div[2]/div/ul/li[2]/button"));
		timeButton.click();
		
		WebElement plusButton = driver.findElement(
				By.xpath(
						"/html/body/div[1]/main/section[3]/div/div/ul/li[1]/div/div[2]/div/button[2]"));
		for(int i=0;i<26;i++) {
			plusButton.click();
		}
		
		WebElement nextNextButton = driver.findElement(
				By.xpath(
						"/html/body/div[1]/main/div[4]/div/button"));
		nextNextButton.click();
		
		
	    WebElement id = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/ul/li/div/div[1]/div[1]/input")));
	    id.sendKeys("a_lme");
	    
	    WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(
		        By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/ul/li/div/div[1]/div[2]/input")));
		    password.sendKeys("hellossafy");
		    
		    WebElement login = driver.findElement(
					By.xpath(
							"/html/body/div[1]/div[2]/div/div[1]/form/ul/li/div/div[7]/button"));
			login.click();
		
}
}
