package apybs.recruitment.pages.surecyeri;

import apybs.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurecYeriEkleDuzenle {
    public SurecYeriEkleDuzenle() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@title='Süreç Yeri Ekle']")
    public WebElement surecYeriEklePanelBasligi;

    @FindBy(xpath = "//*[@title='Süreç Yeri Düzenle']")
    public WebElement surecYeriDuzenlePanelBasligi;

    @FindBy(xpath = "(//*[@id='name'])[3]")
    public WebElement paneldekiSurecYeriAdi;

    @FindBy(xpath = " (//*[@id='capacity'])[3]")
    public WebElement paneldekiKapasite;

    @FindBy(xpath = "(//*[@class='p-checkbox p-component'])[2]")
    public WebElement paneldekiAktifCheckBox;

    @FindBy(xpath = "//*[@type='submit']")
    public WebElement paneldekiKaydetButonu;

    @FindBy(xpath = "//*[@name='selectedCityName']")
    public WebElement paneldekiSehir;

    @FindBy(xpath = "(//*[@id='description'])[3]")
    public WebElement aciklama;




}
