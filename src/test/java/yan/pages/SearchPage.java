package yan.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementDecorator;
import ru.yandex.qatools.htmlelements.loader.decorator.HtmlElementLocatorFactory;
import yan.elements.SearchArrow;
import yan.elements.SearchResults;

public class SearchPage {

    private WebDriver driver;

    @FindBy(xpath = ".//ul[contains(@class, 'serp-list serp-list_left_yes')]")
    private SearchResults searchResults;

//    @FindBy(className = "col.col_home-arrow")
    @FindBy(xpath = ".//div[@class='col col_home-arrow']")

    private SearchArrow searchArrow;

    public SearchPage(WebDriver driver) {
//        PageFactory.initElements(new HtmlElementDecorator(driver), this);
        PageFactory.initElements(new HtmlElementDecorator(new HtmlElementLocatorFactory(driver)), this);

        this.driver = driver;
    }

    public SearchPage searchFor(String request) {
        this.searchArrow.searchFor(request);
        return this;
    }

    public SearchResults getSearchResults() {
        return this.searchResults;
    }
}
