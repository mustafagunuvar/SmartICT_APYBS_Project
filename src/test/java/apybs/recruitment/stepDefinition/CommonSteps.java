package apybs.recruitment.stepDefinition;

import apybs.recruitment.pages.Anasayfa;
import apybs.recruitment.pages.GenelTanimlamalar;
import apybs.recruitment.pages.TanimlamalarDuzenle;
import apybs.recruitment.pages.TanimlamalarEkle;
import apybs.recruitment.pages.surecyeri.SurecYeriTanimlamalar;
import apybs.utilities.ConfigReader;
import apybs.utilities.Driver;
import apybs.utilities.PublicPage;
import apybs.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class CommonSteps {
    PublicPage publicPage = new PublicPage();
    Anasayfa homepage = new Anasayfa();
    TanimlamalarEkle tanimlamalarEkle = new TanimlamalarEkle();
    GenelTanimlamalar genelTanimlamalar = new GenelTanimlamalar();
    TanimlamalarDuzenle tanimlamalarDuzenle = new TanimlamalarDuzenle();
    SurecYeriTanimlamalar surecYeriTanimlamalar = new SurecYeriTanimlamalar();


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String str) {
        Driver.getDriver().get(ConfigReader.getProperty(str));
        ReusableMethods.bekle(2);
    }

    @Then("{string} ve {string} girilir")
    public void veGirilir(String kullaniciAd, String parola) {
        publicPage.kullaniciAdi.sendKeys(kullaniciAd, Keys.TAB, parola);
        ReusableMethods.bekle(2);
    }

    @Then("portala giris yapilir")
    public void portalaGirisYapilir() {
        ReusableMethods.click(publicPage.girisYap);
    }

    @Then("personel temin profili secilir")
    public void personelTeminProfiliSecilir() {
        ReusableMethods.visibleWait(publicPage.profilSecme, 4);
        ReusableMethods.click(publicPage.profilSecme);
        ReusableMethods.visibleWait(publicPage.pertemProfili, 9);
        ReusableMethods.click(publicPage.pertemProfili);
        ReusableMethods.bekle(2);
        ReusableMethods.click(publicPage.devamEt);
    }


    @Then("ana paneldeki personel temin butonuna tiklanir")
    public void anaPaneldekiPersonelTeminButonunaTiklanir() {
        ReusableMethods.visibleWait(homepage.leftPanelPertemButton, 5);
        ReusableMethods.click(homepage.leftPanelPertemButton);
    }

    @Then("Basarili pop-up’ının geldigi ve listede eklenen kaydin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeListedeEklenenKaydinYerAldigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarEkle.basariliPopUp, 5);
        Assert.assertTrue(tanimlamalarEkle.basariliPopUp.isDisplayed());
        ReusableMethods.visibleWait(genelTanimlamalar.listeyeSonEklenenSatir, 2);
        Assert.assertTrue(genelTanimlamalar.listeyeSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Basarili pop-up’ının geldigi ve listede duzenlenen kaydin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeListedeDuzenlenenKaydinYerAldigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarDuzenle.basariliPopUp, 10);
        Assert.assertTrue(tanimlamalarDuzenle.basariliPopUp.isDisplayed());
        ReusableMethods.visibleWait(genelTanimlamalar.listeyeSonEklenenSatir, 10);
        Assert.assertTrue(genelTanimlamalar.listeyeSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }
}
