package apybs.recruitment.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefinitionsUpdate {
    public DefinitionsUpdate() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title='Tanımlamalar Düzenle']")
    public WebElement tanimlamalarDuzenleBasligi;

    @FindBy(xpath = "(//*[@id='longText'])[3]")
    public WebElement uzunMetin;

    @FindBy(xpath = "(//*[@id='shortText'])[3]")
    public WebElement kisaMetin;

    @FindBy(xpath = "(//*[@id='precedence'])[3]")
    public WebElement oncelikSirasi;

        @FindBy(xpath = "//*[text()='Kaydet']")
    public WebElement kaydetButonu;

    @FindBy(xpath = "//*[text()='Başarılı']")
    public WebElement basariliPopUp;


}
