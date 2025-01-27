package apybs.recruitment.pages.surecyeri;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurecYeriTanimlamalar {
    public SurecYeriTanimlamalar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Süreç Yeri Tanımlamalar']")
    public WebElement surecYeriTanimlamalarBasligi;

    @FindBy(xpath = "(//tr)[2]")
    public WebElement listeyeSonEklenenSatir;


}
