import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork {
    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void classwork2(){

        WebElement loginButton = wd.findElement(By.cssSelector("[name='login']"));
        String text = loginButton.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("**************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("**************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        String textBr = br.getText();
        System.out.println("**************");
        System.out.println("text br ---> " + textBr);




        wd.quit();
    }


    @Test
    public void classwork(){

        //parent

        WebElement el = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement el2 = wd.findElement(By.xpath("//h1/.."));

        //ancestor

        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*")); // all
        List<WebElement> list4 = wd.findElements(By.xpath("//h1/ancestor::*"));

        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div")); // two options
        List<WebElement> list5 = wd.findElements(By.xpath("//h1/ancestor::div"));

        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]")); // one option

        //ancestor-or-self

        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*")); // all + h1
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling

        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::*"));
        List<WebElement> list2 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling

        WebElement  el7 = wd.findElement(By.xpath("//a[last()]/preceding-sibling::a[2]"));
        List<WebElement> list6 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));

        wd.quit();


    }


    @Test
    public void homework1(){


        //by tag name
        WebElement el = wd.findElement(By.tagName("body"));
        WebElement el1 = wd.findElement(By.cssSelector("body"));
        WebElement el55 = wd.findElement(By.xpath("//body"));

        WebElement el2 = wd.findElement((By.tagName("div")));
        WebElement el3 = wd.findElement((By.cssSelector("div")));
        WebElement el35 = wd.findElement(By.xpath("//div"));

        WebElement el4 = wd.findElement((By.tagName("h1")));
        WebElement el5 = wd.findElement((By.cssSelector("h1")));
        WebElement el36 = wd.findElement(By.xpath("//h1"));

        WebElement el6 = wd.findElement((By.tagName("a")));
        WebElement el7 = wd.findElement((By.cssSelector("a")));
        WebElement el37 = wd.findElement(By.xpath("//a"));

        WebElement el8 = wd.findElement((By.tagName("form")));
        WebElement el9 = wd.findElement((By.cssSelector("form")));
        WebElement el38 = wd.findElement(By.xpath("//form"));

        WebElement el10 = wd.findElement((By.tagName("input")));
        WebElement el11 = wd.findElement((By.cssSelector("input")));
        WebElement el39 = wd.findElement(By.xpath("//input"));

        WebElement el12 = wd.findElement((By.tagName("button")));
        WebElement el13 = wd.findElement((By.cssSelector("button")));
        WebElement el30 = wd.findElement(By.xpath("//button"));


        //by class

        WebElement el14 = wd.findElement(By.className("container"));
        WebElement el15 = wd.findElement(By.cssSelector(".container"));
        WebElement el31 = wd.findElement(By.xpath("//*[@class='container']"));


        WebElement el16 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el17 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el32 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));

        WebElement el18 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el19 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el33 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));


        WebElement el20 = wd.findElement(By.className("active"));
        WebElement el21 = wd.findElement(By.cssSelector(".active"));

        //by id

        WebElement el22 = wd.findElement(By.id("root"));
        WebElement el23 = wd.findElement(By.cssSelector("#root"));
        WebElement el34 = wd.findElement((By.xpath("//*[@id='root']")));

        //by attribute

        WebElement el24 = wd.findElement(By.cssSelector("[href='/home']"));

        WebElement el25 = wd.findElement(By.cssSelector("[name='email']"));

        WebElement el26 = wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement el40 = wd.findElement(By.xpath("//*[@placeholder='Email']"));


        WebElement el27 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement el41 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));

        WebElement el28 = wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement el43 = wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        WebElement el29 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement el42 = wd.findElement(By.xpath("//*[contains(@placeholder,'ma')]"));


        //password
        WebElement el45 = wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pas')]"));
       

        WebElement el46 = wd.findElement(By.xpath("//*[contains(@placeholder,'wor')]"));


        WebElement el47 = wd.findElement(By.xpath("//*[contains(@placeholder,'ord')]"));







        wd.quit();

    }
}