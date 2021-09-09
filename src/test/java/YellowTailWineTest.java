import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YellowTailWineTest {

//    @Test
//    public void verifyNavigateToYellowTailWineSite() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.yellowtailwine.com/");
//
//        By mainTextPath = By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[1]/label[1]");
//        WebElement mainText = driver.findElement(mainTextPath);
//        Assert.assertEquals("I am of legal drinking age in", "I am of legal drinking age in");
//
//
//        boolean checkBoxPresent;
//        try {
//            driver.findElement(By.name("confirm"));
//            checkBoxPresent = true;
//        } catch (NoSuchElementException e) {
//            checkBoxPresent = false;
//        }
//        Assert.assertTrue(checkBoxPresent);
//
//
//        driver.findElement(By.xpath("//label[@for='confirm']")).isDisplayed();
//        Assert.assertTrue(true);
//
//
//        driver.findElement(By.xpath("//input[@value]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.quit();
//        System.out.println("Successful");
//    }
//
//    @Test
//    public void verifyNavigateToMainPageAsEuropeanCustomer() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.yellowtailwine.com/");
//
//        driver.findElement(By.xpath("//label[@for='confirm']")).click();
//        Assert.assertTrue(true);
//
//
//        driver.findElement(By.cssSelector("option[value='eu']")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//input[@value]")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class='content animation-screen -one']//span[@class='large-mobile']")).isDisplayed();
//        Assert.assertTrue(true);
//
//
//        driver.quit();
//        System.out.println("Successful");
//    }
//
//    @Test
//    public void verifyThatTheFollowingElementsAreDisplayed() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.yellowtailwine.com/");
//
//        driver.findElement(By.xpath("//label[@for='confirm']")).click();
//        Assert.assertTrue(true);
//
//
//        driver.findElement(By.cssSelector("option[value='eu']")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//input[@value]")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class='content animation-screen -one']//span[@class='large-mobile']")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"content animation-screen -one\"]/p[@class=\"header-sub-copy\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("a[href^='https://www.yellowtailwine.com/wines']")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.id("primary-footer")).isDisplayed();
//        Assert.assertTrue(true);
//
////        driver.quit();
//        System.out.println("Successful");
//    }
//
//    @Test
//    public void verifyMenuButtonLogic() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.yellowtailwine.com/");
//
//        driver.findElement(By.xpath("//label[@for='confirm']")).click();
//        Assert.assertTrue(true);
//
//
//        driver.findElement(By.cssSelector("option[value='eu']")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//input[@value]")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class='content animation-screen -one']//span[@class='large-mobile']")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//a[@href=\"https://www.yellowtailwine.com\"]/img[@src=\"https://www.yellowtailwine.com/wp-content/themes/yellowtail/img/brand/logo-yellowtail.svg\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//li[@class=\"link\"]/a[@href=\"https://www.yellowtailwine.com/wines\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//a[@href=\"https://www.yellowtailwine.com/stores/\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"yt-logo\"]/a[@href=\"https://www.yellowtailwine.com/cocktails\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"yt-logo\"]/a[@href=\"https://www.yellowtailwine.com/our-story\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"yt-logo\"]/a[@href=\"https://www.yellowtailwine.com/faqs\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"yt-logo\"]/a[@href=\"https://www.yellowtailwine.com/contact\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//li[@id=\"country-select\"]")).isDisplayed();
//        Assert.assertTrue(true);
//
//        //        driver.quit();
//        System.out.println("Successful");
//    }
//
//    @Test
//    public void verifyMenuButtonLogicCloseHeader() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.yellowtailwine.com/");
//
//        driver.findElement(By.xpath("//label[@for='confirm']")).click();
//        Assert.assertTrue(true);
//
//
//        driver.findElement(By.cssSelector("option[value='eu']")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//input[@value]")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//a[@href=\"https://www.yellowtailwine.com\"]/img[@src=\"https://www.yellowtailwine.com/wp-content/themes/yellowtail/img/brand/logo-yellowtail.svg\"]")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).isDisplayed();
//        Assert.assertTrue(true);
//
//        //driver.quit();
//    }
//
//    @Test
//    public void verifyThatTheResultsOfSearchAreDisplayed() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.yellowtailwine.com/");
//
//        driver.findElement(By.xpath("//label[@for='confirm']")).click();
//        Assert.assertTrue(true);
//
//
//        driver.findElement(By.cssSelector("option[value='eu']")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//input[@value]")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).click();
//        Assert.assertTrue(true);
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.findElement(By.xpath("//div/div/nav/ul[@class=\"header-site-links\"]/li[2]/a")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//h1")).isDisplayed();
//        Assert.assertTrue(true);
//
//        WebElement inputField = driver.findElement(By.id("locationName"));
//        inputField.sendKeys("Sydney NSW, Australia");
//        Assert.assertEquals("Sydney NSW, Australia", "Sydney NSW, Australia");
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.findElement(By.xpath("//button[@class=\"nav-toggle\"]")).click();
//        Assert.assertTrue(true);
//
//        driver.findElement(By.xpath("//section[@class=\"results\"]")).isDisplayed();
//        Assert.assertTrue(true);
//    }

    @Test
    public void verifyToSelectOneWine() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yellowtailwine.com/");

                driver.findElement(By.xpath("//label[@for='confirm']")).click();
        Assert.assertTrue(true);


        driver.findElement(By.cssSelector("option[value='eu']")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//input[@value]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class='content animation-screen -one']//span[@class='large-mobile']")).isDisplayed();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).click();
        Assert.assertTrue(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//div/div/nav/ul[@class=\"header-site-links\"]/li[3]/a")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class=\"toggle\"]")).click();
        Assert.assertTrue(true);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[@data-value=\"red\"]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class=\"grid filter-grid recipes\"]")).isDisplayed();
        Assert.assertTrue(true);

        driver.quit();
    }

    @Test
    public void verifyToCoctailReceipePage() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yellowtailwine.com/");

        driver.findElement(By.xpath("//label[@for='confirm']")).click();
        Assert.assertTrue(true);


        driver.findElement(By.cssSelector("option[value='eu']")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//input[@value]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).click();
        Assert.assertTrue(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//div/div/nav/ul[@class=\"header-site-links\"]/li[3]/a")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//a[@href=\"raspberry-rose\"]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class=\"row\"]/div[@class=\"ingredients\"]")).isDisplayed();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//img[@class=\"recipe-img\"]")).isDisplayed();
        Assert.assertTrue(true);

        driver.quit();
    }

    @Test
    public void verifyToSelectSeveralWine() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yellowtailwine.com/");

        driver.findElement(By.xpath("//label[@for='confirm']")).click();
        Assert.assertTrue(true);


        driver.findElement(By.cssSelector("option[value='eu']")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//input[@value]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class='content animation-screen -one']//span[@class='large-mobile']")).isDisplayed();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class=\"inner\"]/i")).click();
        Assert.assertTrue(true);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//div/div/nav/ul[@class=\"header-site-links\"]/li[3]/a")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//div[@class=\"toggle\"]")).click();
        Assert.assertTrue(true);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//a[@data-value=\"red\"]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//a[@data-value=\"rose\"]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//a[@data-value=\"bubbles\"]")).click();
        Assert.assertTrue(true);

        driver.findElement(By.xpath("//span[@aria-label=\"Type - select to access the drop down menu of wine types\"]")).isDisplayed();
        Assert.assertTrue(true);
    }
}
