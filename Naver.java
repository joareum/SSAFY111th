package selenium_test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naver{

public static void main(String[] args) throws InterruptedException {
    //드라이버 생성
            WebDriver driver = new ChromeDriver();

    //페이지 띄우기
    driver.get("https://www.naver.com/");
            
            
    
    //식당 검색
    WebElement searchBox = driver.findElement(
            By.xpath(
                    "/html/body/div[2]/div[1]/div/div[3]/div[2]/div/form/fieldset/div/input"));
    searchBox.sendKeys("애슐리퀸즈 NC대전유성점");
    searchBox.sendKeys(Keys.ENTER);
    // 예약 버튼 클릭 후 대기
    WebDriverWait wait = new WebDriverWait(driver, 10); // 10초 대기
    WebElement resButton =
    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div[2]/div[3]/div/section/div/div[5]/div/ul/li[1]/a/div[2]/div[1]/div/span")));
    resButton.click();
    
    //화면 넘기기
    WebDriverWait wait1 = new WebDriverWait(driver, 10); 
    WebElement nextButton = 
            wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/main/section[2]/div/div[2]/div/div/ul/li[12]/button")));
    nextButton.click();
    
    //인원 선택
    Thread.sleep(2000); // 2초 대기
    WebElement peopleBox = driver.findElement(
            By.xpath(
                    "/html/body/div[1]/main/section[2]/div/div[2]/div/div/ul/li[21]/div/input"));
    peopleBox.sendKeys("26");
    peopleBox.click();
    
    // 적용 버튼 선택
    Thread.sleep(2000); // 2초 대기
    WebElement goBox = driver.findElement(
            By.xpath(
                    "/html/body/div[1]/main/section[2]/div/div[2]/div/div/ul/li[21]/div/button[2]"));
    goBox.click();
    
    // 적용 버튼 선택
    Thread.sleep(2000); // 2초 대기
    WebElement nextweekBox = driver.findElement(
            By.xpath(
                    "/html/body/div[1]/main/section[2]/div/div[3]/div[1]/div/table/tbody/tr[4]/td[6]/button"));
    nextweekBox.click();
    
    //시간 선택 
    Thread.sleep(2000); // 2초 대기
    WebElement timeBox = driver.findElement(
            By.xpath(
                    "/html/body/div[1]/main/section[2]/div/div[3]/div[2]/div/ul/li[1]/button"));
    timeBox.click();
    
    WebElement plusButton = driver.findElement(
            By.xpath(
                    "/html/body/div[1]/main/section[3]/div/div/ul/li[1]/div/div[2]/div/button[2]"));
    
    for(int i=0;i<26;i++) {
        plusButton.click();
    }
    Thread.sleep(2000); // 2초 대기
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