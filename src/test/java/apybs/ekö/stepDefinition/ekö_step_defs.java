package apybs.ekö.stepDefinition;

import apybs.ekö.pages.AnaSayfa;
import apybs.ekö.pages.Genel_Tanimlamalar;
import apybs.ekö.pages.Tanimlamalar;
import apybs.ekö.pages.Tanimlamalar_Ekle;
import apybs.utilities.ConfigReader;
import apybs.utilities.Driver;
import apybs.utilities.PublicPage;
import apybs.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ekö_step_defs {

    PublicPage publicPage = new PublicPage();
    AnaSayfa homePage = new AnaSayfa();
    Tanimlamalar tanimlamalar = new Tanimlamalar();         //EKÖ Panelindeki 4 ana ekrandan bir tanesi
    Genel_Tanimlamalar genelTanimlamalar = new Genel_Tanimlamalar();
    Tanimlamalar_Ekle tanimlamalarEkle = new Tanimlamalar_Ekle();
    Actions actions = new Actions(Driver.getDriver());


    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String str) {
        Driver.getDriver().get(ConfigReader.getProperty("eköUrl"));
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

    @Then("profil secilir")
    public void profilSecilir() {
        ReusableMethods.click(publicPage.profilSecme);
        ReusableMethods.visibleWait(publicPage.ekoAdminProfili, 5);
        ReusableMethods.click(publicPage.ekoAdminProfili);
        ReusableMethods.bekle(2);
        ReusableMethods.click(publicPage.devamEt);
    }

    @Then("ana paneldeki emniyet kaza önleme butonuna tiklanir")
    public void anaPaneldekiEmniyetKazaÖnlemeButonunaTiklanir() {
        ReusableMethods.visibleWait(homePage.paneldekiGenelEko, 5);
        ReusableMethods.click(homePage.paneldekiGenelEko);
    }

    @Then("Emniyet Kaza Önleme panelindeki Tanımlamalar Menüsü içerisinde bulunan Genel Tanımlamalar butonu üzerine tıklanır")
    public void emniyetKazaÖnlemePanelindekiTanımlamalarMenüsüIçerisindeBulunanGenelTanımlamalarButonuÜzerineTıklanır() {
        ReusableMethods.click(homePage.tanimlamalar);
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalar.genelTanimlamalar);
    }

    @Then("Genel Tanimlamalar ekraninin acildigi görülür")
    public void genelTanimlamalarEkranininAcildigiGörülür() {
        ReusableMethods.visibleWait(genelTanimlamalar.genelTanimlamalarBasligi, 5);
        Assert.assertTrue(genelTanimlamalar.genelTanimlamalarBasligi.isDisplayed());
    }

    @Then("Tanımlamalar Listesi alanında bulunan Ekle butonu üzerine tıklanır")
    public void tanımlamalarListesiAlanındaBulunanEkleButonuÜzerineTıklanır() {
        ReusableMethods.click(genelTanimlamalar.ekleButonu);
    }

    @Then("Tanımlamalar Ekle panelinin açıldığı görülür")
    public void tanımlamalarEklePanelininAçıldığıGörülür() {
        Assert.assertTrue(tanimlamalarEkle.panelBasligi.isDisplayed());
    }

    @Then("Tanımlamalar Ekle panelinde Tablo alanından Kaza Türü Grubu seçilir ve Kod, Öncelik Sırası, Kısa Metin ve Uzun Metin Alanları doldurulur ardından Kaydet butonuna tıklanır")
    public void tanımlamalarEklePanelindeTabloAlanındanKazaTürüGrubuSeçilirVeKodÖncelikSırasıKısaMetinVeUzunMetinAlanlarıDoldurulurArdındanKaydetButonunaTıklanır() {
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
        ReusableMethods.visibleWait(tanimlamalarEkle.tabloAlanindakiKazaTurGrubu, 5);
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("kod"), Keys.TAB, ConfigReader.getProperty("öncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("kisaMetin"), Keys.TAB, ConfigReader.getProperty("uzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Başarılı pop-up’ının geldiği ve Tanımlamalar Listesinde eklenen Kaza Türü Grubunun yer aldığı görülür")
    public void başarılıPopUpInınGeldiğiVeTanımlamalarListesindeEklenenKazaTürüGrubununYerAldığıGörülür() {
        ReusableMethods.visibleWait(tanimlamalarEkle.basariliPopUp, 5);
        Assert.assertTrue(tanimlamalarEkle.basariliPopUp.isDisplayed());
        Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
    }

    @Then("Eklenen Kaza Türü Grubu üzerine tıklanır ve düzenle butonuna basılır")
    public void eklenenKazaTürüGrubuÜzerineTıklanırVeDüzenleButonunaBasılır() {
        ReusableMethods.click(genelTanimlamalar.listeyeEnSonEklenenSatir);
        ReusableMethods.visibleWait(genelTanimlamalar.duzenleButonu, 5);
        ReusableMethods.click(genelTanimlamalar.duzenleButonu);
        ReusableMethods.bekle(2);

    }
}
