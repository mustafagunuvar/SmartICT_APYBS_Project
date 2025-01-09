package apybs.recruitment.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenelTanimlamalar {
    public GenelTanimlamalar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1")
    public WebElement genelTanimlamalarBasligi;

    @FindBy(xpath = "//*[text()='Ekle']")
    public WebElement ekleButonu;

    @FindBy(xpath = "//*[@id='HRM_PER_A_EKO_GENELTANIMISLEM_001_edit']")
    public WebElement guncelleButonu;

    @FindBy(xpath = "//*[text()='Sil']")
    public WebElement silButonu;

    @FindBy(xpath = "(//tr)[2]")
    public WebElement listeyeSonEklenenSatir;

    @FindBy(xpath = "(//*[@id='code'])[1]")
    public WebElement aramaAlanindakiKod;

    @FindBy(xpath = "(//*[@id='shortText'])[1]")
    public WebElement shortTextInSearchField;

    @FindBy(xpath = "//*[text()='Sorgula']")
    public WebElement aramaButonu;

    @FindBy(xpath = "//*[text()='Temizle']")
    public WebElement temizleButonu;

    @FindBy(xpath = "//*[@role='alertdialog']")
    public WebElement alertDialog;

    @FindBy(xpath = "(//*[text()='Sil'])[2]")
    public WebElement deleteInAlertDialog;

    @FindBy(xpath = "//*[text()='Başarılı']")
    public WebElement basariliPopUpForDelete;








}
