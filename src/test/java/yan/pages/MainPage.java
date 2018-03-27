package yan.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
import yan.elements.SearchArrow;

public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = ".//div[@class='col col_home-arrow']")
    private SearchArrow searchArrow;

    public MainPage(final WebDriver driver) {
        //PageFactory.initElements(new HtmlElementDecorator(driver), this);
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);
        this.driver = driver;
    }

    public SearchPage searchFor(String request) {
        this.searchArrow.searchFor(request);
        return new SearchPage(driver);
    }

}
