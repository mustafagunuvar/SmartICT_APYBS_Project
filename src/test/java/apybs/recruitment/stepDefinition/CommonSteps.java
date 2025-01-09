package apybs.recruitment.stepDefinition;

import apybs.recruitment.pages.Homepage;
import apybs.utilities.ConfigReader;
import apybs.utilities.Driver;
import apybs.utilities.PublicPage;
import apybs.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

public class CommonSteps {
    PublicPage publicPage = new PublicPage();
    Homepage homepage = new Homepage();


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
}
