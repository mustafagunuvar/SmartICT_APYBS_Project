package apybs.pertem.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Genel_Tanimlamalar {
    public Genel_Tanimlamalar() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1")
    public WebElement genelTanimlamalarBasligi;

    @FindBy(xpath = "//*[text()='Ekle']")
    public WebElement ekleButonu;

    @FindBy(xpath = "//*[@id='HRM_PER_A_EKO_GENELTANIMISLEM_001_edit']")
    public WebElement duzenleButonu;

    @FindBy(xpath = "//*[text()='Sil']")
    public WebElement silButonu;

    @FindBy(xpath = "(//tr/td)[1]")
    public WebElement listeyeEnSonEklenenSatir;

    @FindBy(xpath = "(//*[@id='code'])[1]")
    public WebElement aramaAlanindakiKod;

    @FindBy(xpath = "(//*[@id='shortText'])[1]")
    public WebElement aramaAlanindakiKisaMetin;

    @FindBy(xpath = "//*[text()='Sorgula']")
    public WebElement sorgulaButonu;

    @FindBy(xpath = "//*[text()='Temizle']")
    public WebElement temizleButonu;

    @FindBy(xpath = "//*[@role='alertdialog']")
    public WebElement alertDialog;

    @FindBy(xpath = "(//*[text()='Sil'])[2]")
    public WebElement alertDialogIcindekiSil;






}
