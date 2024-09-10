package apybs.ekö.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralDefinition {
    public GeneralDefinition() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1")
    public WebElement genelTanimlamalarBasligi;

    @FindBy(xpath = "//*[@id='HRM_PER_A_EKO_GENELTANIMISLEM_001_add']")
    public WebElement ekleButonu;

    @FindBy(xpath = "//*[@id='HRM_PER_A_EKO_GENELTANIMISLEM_001_edit']")
    public WebElement duzenleButonu;

    @FindBy(xpath = "(//tr)[2]")
    public WebElement listeyeEnSonEklenenSatir;


}
