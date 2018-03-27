package yan.elements;

import org.openqa.selenium.support.FindBy;
import ru.yandex.qatools.htmlelements.element.Button;
import ru.yandex.qatools.htmlelements.element.TextInput;
import ru.yandex.qatools.htmlelements.element.HtmlElement;

public class SearchArrow extends HtmlElement {
    @FindBy(xpath = ".//input[@class='input__control input__input']")
    public TextInput requestInput;

    @FindBy(xpath = ".//div[@class = 'search2__button']")
    public Button searchButton;

    public void searchFor(String request) {
        requestInput.clear();
        requestInput.sendKeys(request);
        searchButton.click();
    }


}
