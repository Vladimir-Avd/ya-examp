package yan;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import yan.pages.MainPage;
import yan.pages.SearchPage;
//import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
//import static org.testng.Assert
//import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.exists;


public class SearchingByRequestTest {
    private final int DEFAULT_RESULTS_COUNT;

    public WebDriver driver = new ChromeDriver();
//    public WebDriver driver = new FirefoxDriver();

    public SearchingByRequestTest() {
        DEFAULT_RESULTS_COUNT = 10;
    }

    @BeforeTest
    public void loadStartPage() {
        driver.get("http://www.yandex.ru");
    }

    @Test
    public void afterSearchingUserShouldSeSearchResults() {
        MainPage mainPage = new MainPage(driver);
        SearchPage page = mainPage.searchFor("Yandex");
//        assertThat(page.getSearchResults(), exists());
//        assertThat(page.getSearchResults().getSearchItems(), hasSize(DEFAULT_RESULTS_COUNT));
    }

    @AfterTest
    public void killWebDriver() {
        driver.quit();
    }
}
