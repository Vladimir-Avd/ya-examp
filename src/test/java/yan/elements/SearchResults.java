package yan.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

import java.util.List;

public class SearchResults extends HtmlElement{

    @SuppressWarnings("unused")
    @FindBy(xpath = ".//li[contains(@class, 'serp-item')]")
    private List<WebElement> searchItems;

    public List<WebElement> getSearchItems() {
        return searchItems;
    }
}
