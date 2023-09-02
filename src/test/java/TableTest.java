import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


    public class TableTest {

        WebDriver wd;

        @BeforeMethod

        public void precondition() {
            wd = new ChromeDriver();
            wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        }

        @Test
        public void testCSS(){
            String text = wd.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child")).getText();// нам надо взять элемент
                                                                        // посмотреть его текст и положить его в переменную
            Assert.assertEquals(text,"Canada"); //в том месте, которое мы указали локатаром находится элемент с текстом "Canada"
            Assert.assertTrue(text.contains("Can")); // элемент содержит данную последовательность букв
        }
        @Test
        public void homeWork(){ //посчитать кол-во строк в таблице (элементы tr в коллекцию и меряем size этой коллекции)
            System.out.println(
                    wd.findElements(
                            By.xpath("//*[@id ='customers']//tr")).size());

            System.out.println( //кол-во заголовков таблицы (th)
                    wd.findElements(
                            By.xpath("//*[@id ='customers']//th")).size());

            // ищем локатор на строку 3 (из всех tr нам нужна третья) делаем через cssSelector (для повторения)
            System.out.println(
                 wd.findElement(
                 By.cssSelector("#customers tr:nth-child(3)")).getText());

            // локатор на последнюю колонку (нужен самый последний столбец, без заголовка
            System.out.println(
                    wd.findElement(
                            By.cssSelector("#customers td:last-child")).getText());
        }
    }