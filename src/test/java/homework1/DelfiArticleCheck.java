package homework1;

import Pages.BaseFunc;
import Pages.HomePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class DelfiArticleCheck {

    private BaseFunc baseFunc = new BaseFunc();
    private static final Logger LOGGER = LogManager.getLogger(DelfiArticleCheck.class);

    @Test
    public void getArticle(){


        // Open main page on Web version
        LOGGER.info("We are opening www.delfi.lv");
        baseFunc.getToUrl(HomePage.MAIN_PAGE_WEB_URL);

        HomePage homePage = new HomePage(baseFunc);


        // Finding all article titles and setting them to a list
        LOGGER.info("We are finding all article titles and creating a list");
        List<WebElement> articleTitles = homePage.getAllTitles();

        //Go through a list and get text from web element
        LOGGER.info("We are going through a list with articleTitle web element");
        boolean isTitlePresent = false;
        for (WebElement articleTitle : articleTitles) {

            //Compare every string element in TITLE variable
            LOGGER.info("We are comparing our article title variable with string elements in the list");
            if (articleTitle.getText().equals(HomePage.TITLE)) {

                LOGGER.info("Message will be created if we find our article title in the list");
                isTitlePresent = true;
                System.out.println("Article title is found");
                //Exit loop in case if TITLE present
                break;
            }

        }

        //If we don't find matches for TITLE variable create message "Element not found"
        LOGGER.info("If we do not find our article than message will be created");
        assertTrue("No article found", isTitlePresent);
        //Close browser window
        baseFunc.driver.quit();
        LOGGER.info("Closing our browser");



    }




}
