package apybs.recruitment.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TanimlamalarEkle {
    public TanimlamalarEkle() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title='Tanımlamalar Ekle']")
    public WebElement tanimlamalarEklePaneli;

    @FindBy(xpath = "(//*[text()='Hepsi'])[2]")
    public WebElement paneldekiTabloAlani;

    @FindBy(xpath = "//*[text()='Temin Tipi Tanımlama']")
    public WebElement tableSupplyTypeDefinition;

    @FindBy(xpath = "//*[text()='Ehliyet Tanımlama']")
    public WebElement tablodakiEhliyetTanimlama;

    @FindBy(xpath = "//*[text()='Devlet Sınavı Tanımlama']")
    public WebElement tablodakiDevletSinaviTanimlama;

    @FindBy(xpath = "//*[text()='Belge Tipi Tanımlama']")
    public WebElement tablodakiBelgeTipiTanimlama;

    @FindBy(xpath = "//*[text()='Süreç Tipi Tanımlama']")
    public WebElement tablodakiSurecTipiTanimlama;

    @FindBy(xpath = "//*[text()='Komisyon Üye Tipi Tanımlama']")
    public WebElement tablodakiKomisyonUyeTipiTanimlama;

    @FindBy(xpath = "//*[text()='Soru Grubu Tanımlama']")
    public WebElement tablodakiSoruGrubuTanimlama;

    @FindBy(xpath = "//*[text()='Soru Zorluk Derecesi Tanımlama']")
    public WebElement tablodakiSoruZorlukDerecesiTanimlama;

    @FindBy(xpath = "(//*[@id='code'])[3]")
    public WebElement kod;

    @FindBy(xpath = "//*[text()='Kaydet']")
    public WebElement kaydetButonu;

    @FindBy(xpath = "//*[text()='Başarılı']")
    public WebElement basariliPopUp;


}
