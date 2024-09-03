package apybs.pertem.stepDefinition;

import apybs.pertem.pages.*;
import apybs.utilities.ConfigReader;
import apybs.utilities.Driver;
import apybs.utilities.PublicPage;
import apybs.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class stepDefs {

    PublicPage publicPage = new PublicPage();
    Anasayfa anasayfa = new Anasayfa();
    Tanimlamalar tanimlamalar = new Tanimlamalar();
    Genel_Tanimlamalar genelTanimlamalar = new Genel_Tanimlamalar();
    Tanimlamalar_Ekle tanimlamalarEkle = new Tanimlamalar_Ekle();
    Tanimlamalar_Duzenle tanimlamalarDuzenle = new Tanimlamalar_Duzenle();
    Actions actions = new Actions(Driver.getDriver());


    @Then("personel temin profili secilir")
    public void personelTeminProfiliSecilir() {
        ReusableMethods.click(publicPage.profilSecme);
        ReusableMethods.visibleWait(publicPage.pertemProfili, 5);
        ReusableMethods.click(publicPage.pertemProfili);
        ReusableMethods.bekle(2);
        ReusableMethods.click(publicPage.devamEt);
    }

    @Then("ana paneldeki personel temin butonuna tiklanir")
    public void anaPaneldekiPersonelTeminButonunaTiklanir() {
        ReusableMethods.visibleWait(anasayfa.paneldekiPertem, 5);
        ReusableMethods.click(anasayfa.paneldekiPertem);
    }

    @Then("Personel Temin islemleri panelindeki Tanimlamalar Menüsü icerisinde bulunan Genel Tanimlamalar butonu uzerine tiklanir")
    public void personelTeminIslemleriPanelindekiTanimlamalarMenüsüIcerisindeBulunanGenelTanimlamalarButonuUzerineTiklanir() {
        ReusableMethods.bekle(1);
        ReusableMethods.click(anasayfa.tanimlamalar);
        ReusableMethods.visibleWait(tanimlamalar.genelTanimlamalar, 5);
        ReusableMethods.click(tanimlamalar.genelTanimlamalar);
    }

    @Then("Genel Tanımlamalar ekraninin acildıgi gorulur")
    public void genelTanımlamalarEkranininAcildıgiGorulur() {
        ReusableMethods.visibleWait(genelTanimlamalar.genelTanimlamalarBasligi, 5);
        Assert.assertTrue(genelTanimlamalar.genelTanimlamalarBasligi.isDisplayed());
    }

    @Then("Tanimlamalar Listesi alaninda bulunan Ekle butonu uzerine tiklanir")
    public void tanimlamalarListesiAlanindaBulunanEkleButonuUzerineTiklanir() {
        ReusableMethods.click(genelTanimlamalar.ekleButonu);

    }

    @Then("Tanimlamalar Ekle panelinin acildigi gorulur")
    public void tanimlamalarEklePanelininAcildigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarEkle.tanimlamalarEklePanelBasligi, 5);
        Assert.assertTrue(tanimlamalarEkle.tanimlamalarEklePanelBasligi.isDisplayed());
    }

    @Then("Tanimlamalar Ekle panelinde Tablo alanindan Temin Tipi Tanimlama secilir ve Kod,Öncelik Sirasi,Kisa Metin ve Uzun Metin Alanlari doldurulur ardindan Kaydet butonuna tiklanir")
    public void tanimlamalarEklePanelindeTabloAlanindanTeminTipiTanimlamaSecilirVeKodÖncelikSirasiKisaMetinVeUzunMetinAlanlariDoldurulurArdindanKaydetButonunaTiklanir() {
        ReusableMethods.visibleWait(tanimlamalarEkle.paneldekiTablo, 5);
        ReusableMethods.click(tanimlamalarEkle.paneldekiTablo);
        ReusableMethods.visibleWait(tanimlamalarEkle.tablodakiTeminTipiTanimlama, 2);
        ReusableMethods.click(tanimlamalarEkle.tablodakiTeminTipiTanimlama);
        tanimlamalarEkle.kod.sendKeys(ConfigReader.getProperty("kod"), Keys.TAB, ConfigReader.getProperty("öncelikSirasi"),
                Keys.TAB, ConfigReader.getProperty("kisaMetin"), Keys.TAB, ConfigReader.getProperty("uzunMetin"));
        ReusableMethods.bekle(1);
        ReusableMethods.click(tanimlamalarEkle.kaydetButonu);
    }

    @Then("Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde eklenen Temin Tipinin yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeTanimlamalarListesindeEklenenTeminTipininYerAldigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarEkle.basariliPopUp, 5);
        Assert.assertTrue(tanimlamalarEkle.basariliPopUp.isDisplayed());
        Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Eklenen Temin Tipinin uzerine tiklanir ve duzenle butonuna basilir")
    public void eklenenTeminTipininUzerineTiklanirVeDuzenleButonunaBasilir() {
        ReusableMethods.click(genelTanimlamalar.listeyeEnSonEklenenSatir);
        ReusableMethods.visibleWait(genelTanimlamalar.duzenleButonu, 5);
        ReusableMethods.click(genelTanimlamalar.duzenleButonu);
    }

    @Then("Tanimlamalar Duzenle ekraninin acildigi gorulur")
    public void tanimlamalarDuzenleEkranininAcildigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarDuzenle.tanimlamalarDuzenleBasligi, 5);
        Assert.assertTrue(tanimlamalarDuzenle.tanimlamalarDuzenleBasligi.isDisplayed());
    }

    @Then("Uzun Metin alanina ‘Uzman Yardimcisi - Duzenlendi’ girilir ve ardindan Kaydet butonuna tiklanir")
    public void uzunMetinAlaninaUzmanYardimcisiDuzenlendiGirilirVeArdindanKaydetButonunaTiklanir() {
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalarDuzenle.uzunMetin);
        tanimlamalarDuzenle.uzunMetin.sendKeys(Keys.CONTROL + "A", Keys.BACK_SPACE);
        ReusableMethods.bekle(2);
        tanimlamalarDuzenle.uzunMetin.sendKeys("Uzman Yardimcisi - Duzenlendi");
        ReusableMethods.bekle(2);
        ReusableMethods.click(tanimlamalarDuzenle.kaydetButonu);
    }

    @Then("Basarili pop-up’ının geldigi ve Tanimlamalar Listesinde duzenlenen Kaza Türü Grubunun yer aldigi gorulur")
    public void basariliPopUpInınGeldigiVeTanimlamalarListesindeDuzenlenenKazaTürüGrubununYerAldigiGorulur() {
        ReusableMethods.visibleWait(tanimlamalarDuzenle.basariliPopUp, 5);
        Assert.assertTrue(tanimlamalarDuzenle.basariliPopUp.isDisplayed());
        ReusableMethods.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 5);
        Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @Then("Arama alanindaki Kod alanina UZMYRD{int} girilir ve Sorgula butonuna tiklanir")
    public void aramaAlanindakiKodAlaninaUZMYRDGirilirVeSorgulaButonunaTiklanir(int kod) {
        genelTanimlamalar.aramaAlanindakiKod.sendKeys("UZMYRD1");
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.sorgulaButonu);

    }

    @Then("Tanimlamalar Listesinde aratilan kodun yer aldigi gorulur")
    public void tanimlamalarListesindeAratilanKodunYerAldigiGorulur() {
        //.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 10);
        //Assert.assertTrue(genelTanimlamalar.listeyeEnSonEklenenSatir.isDisplayed());
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.temizleButonu);
    }

    @Then("Aratilan Temin Tipi uzerine tiklanir ve sil butonuna basilir")
    public void aratilanTeminTipiUzerineTiklanirVeSilButonunaBasilir() {
        //ReusableMethods.visibleWait(genelTanimlamalar.listeyeEnSonEklenenSatir, 10);
        ReusableMethods.click(genelTanimlamalar.listeyeEnSonEklenenSatir);
        ReusableMethods.bekle(2);
        ReusableMethods.click(genelTanimlamalar.silButonu);
    }

    @Then("Silme Onay pop-up inin acildigi ve onay uyari metninin yer aldigi gorulur")
    public void silmeOnayPopUpIninAcildigiVeOnayUyariMetnininYerAldigiGorulur() {
        ReusableMethods.visibleWait(genelTanimlamalar.alertDialog, 5);
        Assert.assertTrue(genelTanimlamalar.alertDialog.isDisplayed());
        ReusableMethods.bekle(2);
    }

    @And("Silme Onay pop-undaki Sil butonuna tiklanir")
    public void silmeOnayPopUndakiSilButonunaTiklanir() {
        ReusableMethods.click(genelTanimlamalar.alertDialogIcindekiSil);
    }
}
