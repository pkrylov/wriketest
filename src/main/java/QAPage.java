import org.openqa.selenium.By;

class QAPage extends BasePage {

    By firstQ = By.xpath("//div[@data-code=\"interest_in_solution\"]/label[1]/button");
    By secondQ = By.xpath("//div[@data-code=\"team_members\"]/label[1]/button");
    By thirdQ = By.xpath("//div[@data-code=\"primary_business\"]/label[1]/button");
    By submitButton = By.xpath("//button[@class=\"submit wg-btn wg-btn--navy js-survey-submit\"]");
    By successSubmit = By.xpath("//div[@class=\"survey-success\"]");
    By surveyForm = By.xpath("//form[@class=\"survey-form\"]");
    By twitterUrl = By.xpath("//li[@class=\"wg-footer__social-item\"][1]//a");
    By twitterIcon = By.xpath("//li[@class=\"wg-footer__social-item\"][1]//*[local-name() = \"use\"]");

}
