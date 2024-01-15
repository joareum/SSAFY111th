package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class seleniumSRT {

	public static void main(String[] args) {
		//드라이버 생성
		WebDriver driver = new ChromeDriver();
		
		//SRT 페이지를 띄우기
		driver.get("https://etk.srail.kr/main.do");
		
		// 출발역
		Select departure = new Select(driver.findElement(By.name("dptRsStnCd")));
		
		//이름으로 검색
		departure.selectByVisibleText("동탄");
		
		// 도착역
		Select arrival = new Select(driver.findElement(By.name("arvRsStnCd")));
		
		//value값
		arrival.selectByValue("0507");
		
	}

}
