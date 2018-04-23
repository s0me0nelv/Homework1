package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    public static final String TITLE = "VID par LSD marku kontrabandu aiztur 12. klases skolnieku";

    private static final By ARTICLE_TITLE = By.xpath("//a[@class='top2012-title']");

    public static final String MAIN_PAGE_WEB_URL = "http://www.delfi.lv";

    BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public List<WebElement> getAllTitles() {

        //Find all titles and add them to a list!
        return baseFunc.getElements(ARTICLE_TITLE);
    }

}
