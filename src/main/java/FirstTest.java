import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {

@Test

    public void checkMinPaymentSum(){
// 1. Добавили системную переменную для драйвера Chrome  - для создания образа браузера
    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
    // 2. Создаем объект driver и добавляем свойства от ChromeDriver
    WebDriver driver = new ChromeDriver();
    // Создание ожидания элемента перед тем, как над ним воздействовать
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    // Непосредственно логика теста:
    // 1. Перейти на страницу
    driver.get("https://next.privat24.ua/mobile");

    // 2. Опистаь элменты интерфейса
    By phoneNumber = By.xpath("//input [@data-qa-node='phone-number']");
    By amount = By.xpath("//input [@data-qa-node='amount']");
    By cardNumber = By.xpath("//input [@data-qa-node='numberdebitSource']");
    By expDate = By.xpath("//input [@data-qa-node='expiredebitSource']");
    By cvv = By.xpath("//input [@data-qa-node='cvvdebitSource']");
    By firstName = By.xpath("//input [@data-qa-node='firstNamedebitSource']");
    By lastName = By.xpath("//input [@data-qa-node='lastNamedebitSource']");
    By submitBtn = By.xpath("//button [@data-qa-node='submit']");


    // 3. Действия над элементами интерфейса
    driver.findElement(phoneNumber).sendKeys("509401084");
    driver.findElement(amount).sendKeys("1");
    driver.findElement(cardNumber).sendKeys("4731142256436666");
    driver.findElement(expDate).sendKeys("0225");
    driver.findElement(cvv).sendKeys("111");
    driver.findElement(firstName).sendKeys("Taras");
    driver.findElement(lastName).sendKeys("Shevchenko");
    // так как у нас это форма (тег <form></form>, если не форма - использовать click();
    driver.findElement(submitBtn).submit();
    //driver.close();
}
}
