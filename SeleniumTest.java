package selenium_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		// 1. 크롬 드라이버를 사용할 준비를 한다.
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naver.com/");
		
		WebElement financeButton = driver.findElement(
				By.xpath(
						"/html/body/div[2]/div[1]/div/div[5]/ul/li[6]/a/span[1]"));
		
		//증권 메뉴에 클릭하기
		financeButton.click();
		
		//증권페이지에서 시작하기
		driver.get("https://finance.naver.com/");
		
		String mainPage = driver.getWindowHandle();
		driver.switchTo().window(mainPage);
		
		WebElement searchBox = driver.findElement(
				By.xpath(
						"/html/body/div[2]/div[1]/div/div[2]/div[1]/form/input[1]"));
		searchBox.sendKeys("삼성전자");
	
		// Enter 버튼 입력시키기
		searchBox.sendKeys(Keys.ENTER);
		
		//뉴스 가져오기
		List<WebElement> newsTitleList = 
				driver.findElements(By.xpath(
						"/html/body/div[3]/div[3]/div[1]/div[1]/div[1]/div[1]/div/ul/li"));
		
		//데이터 크롤링
		for(WebElement webElement : newsTitleList){
		System.out.println(webElement.getText());
		
		
	}

}
}
