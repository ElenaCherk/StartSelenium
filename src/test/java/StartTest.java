import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartTest {

    WebDriver wd;

    @BeforeMethod // говорит о том, что это надо запустить перед КАЖДЫМ тестовым методом (BeforeSuite - запустить один раз пере всеми тестами)
    public void precondition(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");
       // wd.navigate().to("https://telranedu.web.app/home"); тоже откроет страницу, но тут есть цепочка методов и позволяет управлять
                                                              // сценарием таким образом, что мы можем переключаться между страницами.
       // wd.navigate().back();
       // wd.navigate().forward();
        // wd.navigate().refresh();
       wd.manage().window().maximize();
    }
    @Test // смотрит, есть ли что-то, что нужно реализовать до теста
    public void testMethod(){
        WebElement element = wd.findElement(By.tagName("a"));// найдет первый попавшийся элемент с тэгом "a" и
                                                             // положит ее в переменную класса WebElement element
        wd.findElement(By.cssSelector("a")); //css
        wd.findElement(By.xpath("//a")); // xpath

        List<WebElement> elements = wd.findElements(By.tagName("div")); // возвращает коллекцию WebElement (клавиши option+enter)
        System.out.println(elements.size()); // смотрим сколько у нас на странице элементов с тегом "div"

        wd.findElement(By.id("root")); //метод findElement для поиска элемента с помощью стратегии (by.id)
        wd.findElement(By.cssSelector("#root"));
        wd.findElement(By.xpath("//*[@id='root']"));

        wd.findElement(By.className("container"));// найди мне элемент у которого атрибут className имеет значение "container"

        wd.findElement(By.cssSelector(".container")); // . - класс
        wd.findElement(By.xpath("//*[@class='container']"));

        wd.findElement(By.linkText("HOME"));// стратегия ищет элементы по содержимому (редко используется, очень громоздкая)
        //через css нельзя - не видит контент
        wd.findElement(By.xpath("//*[text()='HOME']"));
        wd.findElement(By.xpath("//*[.='HOME']")); // то же самое что и в 50-й строке

        wd.findElement(By.partialLinkText("OM"));//ищет по части содержимого (редко исплоьзуется, очень громоздкая)
    }
        // System.out.println(e1);
    @Test
    public void testMethod1(){
        wd.findElement(By.cssSelector("[href='/login']"));
        wd.findElement(By.xpath("//*[@href='/login']"));

        wd.findElement(By.cssSelector("[href*='og']")); // содержит текст (часть текста)
        wd.findElement(By.xpath("//*[contains(@href*='og')]")); // содержит текст (часть текста)

        wd.findElement(By.cssSelector("[href^='log']")); // начинается с текста
        wd.findElement(By.xpath("//*[starts-with(@href^='log')]")); // начинается с текста

        wd.findElement(By.cssSelector("[href$='gin']")); // заказнчивается с текстом (нет в xpath)
    }

    @AfterMethod
    public void postcondition(){
    //    wd.close(); // закрывает вкладку, на которой селениум был на момень вызова метода close()
    //    wd.quit(); // закрывть все активные окна и вкладки
    }
}

//тесты нужно писать так, чтобы иметь возможность запускать эти тесты автономно (не ставить их в зависимость друг от друга),
// их можно будет группировать независимо друг от друга
// любой из тестов у нас начинается с домашней страницы приложения
// чтобы привести систему в исходное состояние - postcondition -