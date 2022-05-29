import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {

@Test

    public void checkMinPaymentSum(){
// 1. �������� ��������� ���������� ��� �������� Chrome  - ��� �������� ������ ��������
    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    // 2. ������� ������ driver � ��������� �������� �� ChromeDriver
    WebDriver driver = new ChromeDriver();
    // �������� �������� �������� ����� ���, ��� ��� ��� ��������������
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    // ��������������� ������ �����:
    // 1. ������� �� ��������
    driver.get("https://next.privat24.ua/mobile");

    // 2. ������� ������� ����������
    By phoneNumber = By.xpath("//input [@data-qa-node='phone-number']");
    By amount = By.xpath("//input [@data-qa-node='amount']");
    By cardNumber = By.xpath("//input [@data-qa-node='numberdebitSource']");
    By expDate = By.xpath("//input [@data-qa-node='expiredebitSource']");
    By cvv = By.xpath("//input [@data-qa-node='cvvdebitSource']");
    By firstName = By.xpath("//input [@data-qa-node='firstNamedebitSource']");
    By lastName = By.xpath("//input [@data-qa-node='lastNamedebitSource']");
    By submitBtn = By.xpath("//button [@data-qa-node='submit']");


    // 3. �������� ��� ���������� ����������
    driver.findElement(phoneNumber).sendKeys("509401084");
    driver.findElement(amount).sendKeys("1");
    driver.findElement(cardNumber).sendKeys("4731142256436666");
    driver.findElement(expDate).sendKeys("0225");
    driver.findElement(cvv).sendKeys("111");
    driver.findElement(firstName).sendKeys("Taras");
    driver.findElement(lastName).sendKeys("Shevchenko");
    // ��� ��� � ��� ��� ����� (��� <form></form>, ���� �� ����� - ������������ click();
    driver.findElement(submitBtn).submit();
    //driver.close();
}
}
