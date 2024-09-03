package apybs.pertem.pages;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tanimlamalar_Ekle {
    public Tanimlamalar_Ekle() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title='Tanımlamalar Ekle']")
    public WebElement tanimlamalarEklePanelBasligi;

    @FindBy(xpath = "(//*[text()='Hepsi'])[2]")
    public WebElement paneldekiTablo;

    @FindBy(xpath = "//*[text()='Temin Tipi Tanımlama']")
    public WebElement tablodakiTeminTipiTanimlama;

    @FindBy(xpath = "//*[text()='Ehliyet Tanımlama']")
    public WebElement tablodakiEhliyetTanimlama;


    @FindBy(xpath = "(//*[@id='code'])[3]")
    public WebElement kod;

    @FindBy(xpath = "//*[text()='Kaydet']")
    public WebElement kaydetButonu;

    @FindBy(xpath = "//*[text()='Başarılı']")
    public WebElement basariliPopUp;


}
